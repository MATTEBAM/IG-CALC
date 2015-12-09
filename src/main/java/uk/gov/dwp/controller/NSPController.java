package uk.gov.dwp.controller;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import uk.gov.dwp.common.Constants;
import uk.gov.dwp.model.NSPDetails;
import uk.gov.dwp.model.Post75EuRaDetails;
import uk.gov.dwp.model.Post75UsaDetails;
import uk.gov.dwp.model.Pre75Details;
import uk.gov.dwp.model.RREDetails;

/**
 * Handles requests for the NSP calculations
 * 
 * @author samba.mitra
 */
@Controller
@SessionAttributes(Constants.NSP_DETAILS)
public class NSPController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NSPController.class);

    private static final int MQP_THRESHOLD = 520;
    private static final double REVISED_STARTING_AMT_FACTOR = 0.07;
    private static final double NEW_STATE_PENSION_FACTOR = 0.08;

    @ModelAttribute(Constants.NSP_DETAILS)
    public NSPDetails populateNspDetails() {
        return new NSPDetails();
    }

    @RequestMapping(value = "/admin/nsp_calculation", method = RequestMethod.GET)
    public String showNspCalculation(@ModelAttribute(Constants.NSP_DETAILS) NSPDetails nspDetails,
            HttpSession session) {

        LOGGER.info("Displaying nSP Calculation page...");

        Pre75Details pre75EuDetails = session.getAttribute(Constants.PRE_75_EU_DETAILS) != null
                ? (Pre75Details) session.getAttribute(Constants.PRE_75_EU_DETAILS) : new Pre75Details();
        Post75EuRaDetails post75EuDetails = session.getAttribute(Constants.POST_75_EU_DETAILS) != null
                ? (Post75EuRaDetails) session.getAttribute(Constants.POST_75_EU_DETAILS) : new Post75EuRaDetails();
        Post75EuRaDetails post16EuDetails = session.getAttribute(Constants.POST_16_EU_DETAILS) != null
                ? (Post75EuRaDetails) session.getAttribute(Constants.POST_16_EU_DETAILS) : new Post75EuRaDetails();
        Pre75Details pre75RaDetails = session.getAttribute(Constants.PRE_75_EU_DETAILS) != null
                ? (Pre75Details) session.getAttribute(Constants.PRE_75_RA_DETAILS) : new Pre75Details();
        Post75EuRaDetails post75RaDetails = session.getAttribute(Constants.PRE_75_RA_DETAILS) != null
                ? (Post75EuRaDetails) session.getAttribute(Constants.POST_75_RA_DETAILS) : new Post75EuRaDetails();
        Post75EuRaDetails post16RaDetails = session.getAttribute(Constants.POST_16_RA_DETAILS) != null
                ? (Post75EuRaDetails) session.getAttribute(Constants.POST_16_RA_DETAILS) : new Post75EuRaDetails();
        Pre75Details pre75UsaDetails = session.getAttribute(Constants.PRE_75_USA_DETAILS) != null
                ? (Pre75Details) session.getAttribute(Constants.PRE_75_USA_DETAILS) : new Pre75Details();
        Post75UsaDetails post75UsaDetails = session.getAttribute(Constants.POST_75_USA_DETAILS) != null
                ? (Post75UsaDetails) session.getAttribute(Constants.POST_75_USA_DETAILS) : new Post75UsaDetails();
        Post75UsaDetails post16UsaDetails = session.getAttribute(Constants.POST_16_USA_DETAILS) != null
                ? (Post75UsaDetails) session.getAttribute(Constants.POST_16_USA_DETAILS) : new Post75UsaDetails();
        RREDetails rreDetails = session.getAttribute(Constants.RRE_DETAILS) != null
                ? (RREDetails) session.getAttribute(Constants.RRE_DETAILS) : new RREDetails();

        // Populate nSP Model
        nspDetails.setPre75WeeksPre2016(getPre75WeeksPre2016(pre75EuDetails, pre75RaDetails, pre75UsaDetails));
        nspDetails.setAddUKWeeksPre2016(
                getTotalUkAdditionalWeeksPrePost16(post75EuDetails, post75RaDetails, post75UsaDetails));
        nspDetails.setAddUKWeeksPost2016(
                getTotalUkAdditionalWeeksPrePost16(post16EuDetails, post16RaDetails, post16UsaDetails));
        nspDetails.setForeignWeeksPre2016(
                getTotalForeignAdditionalWeeksPrePost16(post75EuDetails, post75RaDetails, post75UsaDetails));
        nspDetails.setForeignWeeksPost2016(
                getTotalForeignAdditionalWeeksPrePost16(post16EuDetails, post16RaDetails, post16UsaDetails));

        // MQP achieved
        populateMqp(nspDetails);

        // RRE flag
        populateRre(nspDetails, rreDetails);

        // Revised starting amount
        populateRevisedStartingAmount(nspDetails);

        return "nsp_calculation";
    }

    @RequestMapping(value = "/admin/select_calculation_nsp", method = RequestMethod.POST)
    public String submitNspDetails(@ModelAttribute(Constants.NSP_DETAILS) NSPDetails nspDetails) {
        LOGGER.info("NSP Details captured : " + nspDetails);
        return "redirect:/admin/select_calculation";
    }

    private static void populateMqp(NSPDetails nspDetails) {
        int pre2016Total = NumberUtils.toInt(nspDetails.getAddUKWeeksPre2016())
                + NumberUtils.toInt(nspDetails.getForeignWeeksPre2016())
                + NumberUtils.toInt(nspDetails.getPre75WeeksPre2016());

        int post2016Total = NumberUtils.toInt(nspDetails.getAddUKWeeksPost2016())
                + NumberUtils.toInt(nspDetails.getForeignWeeksPost2016());

        if ((pre2016Total + post2016Total) >= MQP_THRESHOLD) {
            nspDetails.setMqpAchieved(Constants.YES);
        } else {
            nspDetails.setMqpAchieved(Constants.NO);
        }
    }

    private static void populateRre(NSPDetails nspDetails, RREDetails rreDetails) {
        if (StringUtils.equals(rreDetails.getRreFlagHeld(), Constants.YES)) {
            nspDetails.setRreFlagHeld(rreDetails.getRreFlagHeld());
        } else {

        }
    }

    private static void populateRevisedStartingAmount(NSPDetails nspDetails) {
        double oldRulesAmt = NumberUtils.toDouble(nspDetails.getOldRulesAmt());
        double newRulesAmt = NumberUtils.toDouble(nspDetails.getNewRulesAmt());
        int addUkWeeks = NumberUtils.toInt(nspDetails.getAddUKWeeksPre2016());
        int foreignWeeks = NumberUtils.toInt(nspDetails.getForeignWeeksPre2016());
        int totalWeeks = addUkWeeks + foreignWeeks;
        double revisedStartingAmt = Math.max((oldRulesAmt + (totalWeeks * REVISED_STARTING_AMT_FACTOR)),
                (newRulesAmt + (totalWeeks * NEW_STATE_PENSION_FACTOR)));
        nspDetails.setRevisedStartingAmt(String.valueOf(revisedStartingAmt));
    }

    /**
     * Pre 2016 Pre-75 Weeks Calculation
     * 
     * @param pre75EuDetails
     * @param pre75RaDetails
     * @param pre75UsaDetails
     * @return
     */
    private static String getPre75WeeksPre2016(Pre75Details pre75EuDetails, Pre75Details pre75RaDetails,
            Pre75Details pre75UsaDetails) {
        int noOfEuPre75Weeks = 0;
        int noOfRaPre75Weeks = 0;
        int noOfUsaPre75Weeks = 0;

        if (pre75EuDetails != null) {
            noOfEuPre75Weeks = NumberUtils.toInt(pre75EuDetails.getTotal());
        }
        if (pre75RaDetails != null) {
            noOfRaPre75Weeks = NumberUtils.toInt(pre75RaDetails.getTotal());
        }
        if (pre75UsaDetails != null) {
            noOfUsaPre75Weeks = NumberUtils.toInt(pre75UsaDetails.getTotal());
        }

        int totalAdditionalPre75Weeks = noOfEuPre75Weeks + noOfRaPre75Weeks + noOfUsaPre75Weeks;
        return String.valueOf(totalAdditionalPre75Weeks);
    }

    /**
     * Pre/Post 2016 Additional UK Weeks Calculation
     * 
     * @param euDetails
     * @param raDetails
     * @param usaDetails
     * @return
     */
    private static String getTotalUkAdditionalWeeksPrePost16(Post75EuRaDetails euDetails, Post75EuRaDetails raDetails,
            Post75UsaDetails usaDetails) {
        int noOfEuAdditionalUkWeeks = 0;
        int noOfRaAdditionalUkWeeks = 0;
        int noOfUsaAdditionalUkWeeks = 0;

        if (euDetails != null && StringUtils.isNotBlank(euDetails.getTotalQualWeeksUk())) {
            noOfEuAdditionalUkWeeks = NumberUtils.toInt(euDetails.getTotalQualWeeksUk());
        }
        if (raDetails != null && StringUtils.isNotBlank(raDetails.getTotalQualWeeksUk())) {
            noOfRaAdditionalUkWeeks = NumberUtils.toInt(raDetails.getTotalQualWeeksUk());
        }
        if (usaDetails != null && StringUtils.isNotBlank(usaDetails.getTotalQualWeeksUk())) {
            noOfUsaAdditionalUkWeeks = NumberUtils.toInt(usaDetails.getTotalQualWeeksUk());
        }

        int totalAdditionalUkWeeks = noOfEuAdditionalUkWeeks + noOfRaAdditionalUkWeeks + noOfUsaAdditionalUkWeeks;
        return String.valueOf(totalAdditionalUkWeeks);
    }

    /**
     * Pre/Post 2016 Additional Foreign Weeks Calculation
     * 
     * @param euDetails
     * @param raDetails
     * @param usaDetails
     * @return
     */
    private static String getTotalForeignAdditionalWeeksPrePost16(Post75EuRaDetails euDetails,
            Post75EuRaDetails raDetails, Post75UsaDetails usaDetails) {
        int noOfEuAdditionalForeignWeeks = 0;
        int noOfRaAdditionalForeignWeeks = 0;
        int noOfUsaAdditionalForeignWeeks = 0;

        if (euDetails != null) {
            noOfEuAdditionalForeignWeeks = NumberUtils.toInt(euDetails.getTotalQualWeeksForeign());
        }
        if (raDetails != null) {
            noOfRaAdditionalForeignWeeks = NumberUtils.toInt(raDetails.getTotalQualWeeksForeign());
        }
        if (usaDetails != null) {
            noOfUsaAdditionalForeignWeeks = NumberUtils.toInt(usaDetails.getTotalQualWeeksForeign());
        }

        int totalAdditionalForeignWeeks = noOfEuAdditionalForeignWeeks + noOfRaAdditionalForeignWeeks
                + noOfUsaAdditionalForeignWeeks;
        return String.valueOf(totalAdditionalForeignWeeks);
    }

}
