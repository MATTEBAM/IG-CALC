package uk.gov.dwp.controller;

import java.text.ParseException;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import uk.gov.dwp.common.Constants;
import uk.gov.dwp.model.CustomerDetails;
import uk.gov.dwp.model.InheritedDetails;
import uk.gov.dwp.model.PartnerDetails;

/**
 * Handles requests for ESP calculations
 * 
 * @author samba.mitra
 *
 */
@Controller
@SessionAttributes({ Constants.INHERITED_DETAILS, Constants.CUSTOMER_DETAILS })
public class InheritedController {

    private static final Logger LOGGER = LoggerFactory.getLogger(InheritedController.class);

    private static final String CUTOFF_DATE = "06/04/2016";

    @ModelAttribute(Constants.INHERITED_DETAILS)
    public InheritedDetails populateInheritedDetails() {
        return new InheritedDetails();
    }

    @RequestMapping(value = "/admin/inherited_calculation", method = RequestMethod.GET)
    public String showInheritedCalculation(
            @ModelAttribute(Constants.INHERITED_DETAILS) InheritedDetails inheritedDetails,
            @ModelAttribute(Constants.CUSTOMER_DETAILS) CustomerDetails customerDetails, HttpSession session) {
        LOGGER.info("Displaying the Inherited Calculation page...");

        PartnerDetails partnerDetails = (session.getAttribute(Constants.PARTNER_DETAILS)) != null
                ? (PartnerDetails) session.getAttribute(Constants.PARTNER_DETAILS) : new PartnerDetails();

        // Populate Inherited model
        inheritedDetails.setCustomerSpaDateRule(getSpaRule(customerDetails.getSpaDate()));
        inheritedDetails.setPartnerSpaDateRule(getSpaRule(partnerDetails.getSpaDate()));
        inheritedDetails.setDateOfMarriageRule(getSpaRule(customerDetails.getDateOfMarriage()));

        return "inherited_calculation";
    }

    @RequestMapping(value = "/admin/select_calculation_inherited", method = RequestMethod.POST)
    public String submitInheritedDetails(
            @ModelAttribute(Constants.INHERITED_DETAILS) InheritedDetails inheritedDetails) {
        LOGGER.info("Inherited Details captured : " + inheritedDetails);
        return "redirect:/admin/select_calculation";
    }

    private static String getSpaRule(String dateStr) {
        Date cutOffDate = null;
        Date date = null;
        try {
            cutOffDate = DateUtils.parseDateStrictly(CUTOFF_DATE, Constants.DATE_FORMAT);
            if (StringUtils.isNotBlank(dateStr)) {
                date = DateUtils.parseDateStrictly(dateStr, Constants.DATE_FORMAT);
            }
        } catch (ParseException e) {
            LOGGER.error("Exception while parsing date : " + dateStr + " as per format : " + Constants.DATE_FORMAT);
        }

        if (cutOffDate == null || date == null) {
            return "";
        }

        if (date.after(cutOffDate)) {
            return Constants.POST_2016;
        } else {
            return Constants.PRE_2016;
        }
    }

}
