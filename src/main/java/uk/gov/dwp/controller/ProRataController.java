package uk.gov.dwp.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.gov.dwp.common.Constants;
import uk.gov.dwp.model.InsuranceRecord;
import uk.gov.dwp.model.Post75EuRaDetails;
import uk.gov.dwp.model.Post75UsaDetails;
import uk.gov.dwp.model.Pre75Details;
import uk.gov.dwp.service.CountryService;

/**
 * Handles requests for the ProRata calculation
 * 
 * @author samba.mitra
 */
@Controller
public class ProRataController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProRataController.class);

    @Autowired
    private CountryService countryService;

    @ModelAttribute(Constants.COUNTRIES_WITHOUT_FROZEN_RATE)
    public Map<String, String> populateCountriesWithoutFrozenRate1() {
        return countryService.populateCountriesWithoutFrozenRate();
    }

    @ModelAttribute(Constants.COUNTRIES_USA)
    public Map<String, String> populateCountriesUsa() {
        return countryService.populateUsa();
    }

    // Pro Rata screens

    // For EU

    @ModelAttribute(Constants.PRE_75_EU_DETAILS)
    public Pre75Details createProRataForPre75Eu() {
        return new Pre75Details();
    }

    @ModelAttribute(Constants.POST_75_EU_DETAILS)
    public Post75EuRaDetails createProRataForPost75Eu() {
        Post75EuRaDetails post75EuDetails = new Post75EuRaDetails();
        post75EuDetails.setToPost75("05/04/2016");
        return post75EuDetails;
    }

    @ModelAttribute(Constants.POST_16_EU_DETAILS)
    public Post75EuRaDetails createProRataForPost16Eu() {
        Post75EuRaDetails post16EuDetails = new Post75EuRaDetails();
        post16EuDetails.setFromPost75("06/04/2016");
        return post16EuDetails;
    }

    @RequestMapping(value = "/admin/prorata_eu_calculation_pre75", method = RequestMethod.GET)
    public String selectProRataEuCalculationPre75(Model model,
            @ModelAttribute(Constants.PRE_75_EU_DETAILS) Pre75Details pre75EuDetails, HttpSession session) {
        if (session.getAttribute(Constants.PRE_75_EU_DETAILS) != null) {
            pre75EuDetails = (Pre75Details) session.getAttribute(Constants.PRE_75_EU_DETAILS);
        }
        model.addAttribute(Constants.PRE_75_EU_DETAILS, pre75EuDetails);
        return "prorata_eu_calculation_pre75";
    }

    @RequestMapping(value = "/admin/prorata_eu_calculation_post75", method = RequestMethod.POST)
    public String submitProRataEuPre75Details(@ModelAttribute(Constants.PRE_75_EU_DETAILS) Pre75Details pre75EuDetails,
            HttpSession session) {
        // Save Pre 75 Eu data to session
        shrinkCollection(pre75EuDetails.getListOfInsuranceRecords());
        session.setAttribute(Constants.PRE_75_EU_DETAILS, pre75EuDetails);
        LOGGER.info("Pre 75 Eu Details captured : " + pre75EuDetails);
        return "redirect:/admin/prorata_eu_calculation_post75";
    }

    @RequestMapping(value = "/admin/prorata_eu_calculation_post75", method = RequestMethod.GET)
    public String selectProRataEuCalculationPost75(Model model,
            @ModelAttribute(Constants.POST_75_EU_DETAILS) Post75EuRaDetails post75EuDetails, HttpSession session) {
        if (session.getAttribute(Constants.POST_75_EU_DETAILS) != null) {
            post75EuDetails = (Post75EuRaDetails) session.getAttribute(Constants.POST_75_EU_DETAILS);
        }
        model.addAttribute(Constants.POST_75_EU_DETAILS, post75EuDetails);
        return "prorata_eu_calculation_post75";
    }

    @RequestMapping(value = "/admin/prorata_eu_calculation_post16", method = RequestMethod.POST)
    public String submitProRataEuPost75Details(
            @ModelAttribute(Constants.POST_75_EU_DETAILS) Post75EuRaDetails post75EuDetails, HttpSession session) {
        // Save Post 75 Eu data to session
        shrinkCollection(post75EuDetails.getListOfInsuranceRecords());
        session.setAttribute(Constants.POST_75_EU_DETAILS, post75EuDetails);
        LOGGER.info("Post 75 Eu Details captured : " + post75EuDetails);
        return "redirect:/admin/prorata_eu_calculation_post16";
    }

    @RequestMapping(value = "/admin/prorata_eu_calculation_post16", method = RequestMethod.GET)
    public String selectProRataEuCalculationPost16(Model model,
            @ModelAttribute(Constants.POST_16_EU_DETAILS) Post75EuRaDetails post16EuDetails, HttpSession session) {
        if (session.getAttribute(Constants.POST_16_EU_DETAILS) != null) {
            post16EuDetails = (Post75EuRaDetails) session.getAttribute(Constants.POST_16_EU_DETAILS);
        }
        model.addAttribute(Constants.POST_16_EU_DETAILS, post16EuDetails);
        return "prorata_eu_calculation_post16";
    }

    @RequestMapping(value = "/admin/select_calculation_prorata_eu", method = RequestMethod.POST)
    public String submitProRataEuPost16DetailsGoToSelectCalculation(
            @ModelAttribute(Constants.POST_16_EU_DETAILS) Post75EuRaDetails post16EuDetails, HttpSession session) {
        // Save Post 16 Eu data to session
        shrinkCollection(post16EuDetails.getListOfInsuranceRecords());
        session.setAttribute(Constants.POST_16_EU_DETAILS, post16EuDetails);
        LOGGER.info("Post 16 Eu Details captured : " + post16EuDetails);
        return "redirect:/admin/select_calculation";
    }

    // For RA

    @ModelAttribute(Constants.PRE_75_RA_DETAILS)
    public Pre75Details createProRataForPre75Ra() {
        return new Pre75Details();
    }

    @ModelAttribute(Constants.POST_75_RA_DETAILS)
    public Post75EuRaDetails createProRataForPost75Ra() {
        Post75EuRaDetails post75RaDetails = new Post75EuRaDetails();
        post75RaDetails.setToPost75("05/04/2016");
        return post75RaDetails;
    }

    @ModelAttribute(Constants.POST_16_RA_DETAILS)
    public Post75EuRaDetails createProRataForPost16Ra() {
        Post75EuRaDetails post16RaDetails = new Post75EuRaDetails();
        post16RaDetails.setFromPost75("06/04/2016");
        return post16RaDetails;
    }

    @RequestMapping(value = "/admin/prorata_ra_calculation_pre75", method = RequestMethod.GET)
    public String selectProRataRaCalculationPre75(Model model,
            @ModelAttribute(Constants.PRE_75_RA_DETAILS) Pre75Details pre75RaDetails, HttpSession session) {
        if (session.getAttribute(Constants.PRE_75_RA_DETAILS) != null) {
            pre75RaDetails = (Pre75Details) session.getAttribute(Constants.PRE_75_RA_DETAILS);
        }
        model.addAttribute(Constants.PRE_75_RA_DETAILS, pre75RaDetails);
        return "prorata_ra_calculation_pre75";
    }

    @RequestMapping(value = "/admin/prorata_ra_calculation_post75", method = RequestMethod.POST)
    public String submitProRataRaPre75Details(@ModelAttribute(Constants.PRE_75_RA_DETAILS) Pre75Details pre75RaDetails,
            HttpSession session) {
        // Save Pre 75 RA data to session
        shrinkCollection(pre75RaDetails.getListOfInsuranceRecords());
        session.setAttribute(Constants.PRE_75_RA_DETAILS, pre75RaDetails);
        LOGGER.info("Pre 75 RA Details captured : " + pre75RaDetails);
        return "redirect:/admin/prorata_ra_calculation_post75";
    }

    @RequestMapping(value = "/admin/prorata_ra_calculation_post75", method = RequestMethod.GET)
    public String selectProRataRaCalculationPost75(Model model,
            @ModelAttribute(Constants.POST_75_RA_DETAILS) Post75EuRaDetails post75RaDetails, HttpSession session) {
        if (session.getAttribute(Constants.POST_75_RA_DETAILS) != null) {
            post75RaDetails = (Post75EuRaDetails) session.getAttribute(Constants.POST_75_RA_DETAILS);
        }
        model.addAttribute(Constants.POST_75_RA_DETAILS, post75RaDetails);
        return "prorata_ra_calculation_post75";
    }

    @RequestMapping(value = "/admin/prorata_ra_calculation_post16", method = RequestMethod.POST)
    public String submitProRataRaPost75Details(
            @ModelAttribute(Constants.POST_75_RA_DETAILS) Post75EuRaDetails post75RaDetails, HttpSession session) {
        // Save Post 75 RA data to session
        shrinkCollection(post75RaDetails.getListOfInsuranceRecords());
        session.setAttribute(Constants.POST_75_RA_DETAILS, post75RaDetails);
        LOGGER.info("Post 75 RA Details captured : " + post75RaDetails);
        return "redirect:/admin/prorata_ra_calculation_post16";
    }

    @RequestMapping(value = "/admin/prorata_ra_calculation_post16", method = RequestMethod.GET)
    public String selectProRataRaCalculationPost16(Model model,
            @ModelAttribute(Constants.POST_16_RA_DETAILS) Post75EuRaDetails post16RaDetails, HttpSession session) {
        if (session.getAttribute(Constants.POST_16_RA_DETAILS) != null) {
            post16RaDetails = (Post75EuRaDetails) session.getAttribute(Constants.POST_16_RA_DETAILS);
        }
        model.addAttribute(Constants.POST_16_RA_DETAILS, post16RaDetails);
        return "prorata_ra_calculation_post16";
    }

    @RequestMapping(value = "/admin/select_calculation_prorata_ra", method = RequestMethod.POST)
    public String submitProRataRaPost16DetailsGoToSelectCalculation(
            @ModelAttribute(Constants.POST_16_RA_DETAILS) Post75EuRaDetails post16RaDetails, HttpSession session) {
        // Save Post 16 RA data to session
        shrinkCollection(post16RaDetails.getListOfInsuranceRecords());
        session.setAttribute(Constants.POST_16_RA_DETAILS, post16RaDetails);
        LOGGER.info("Post 16 RA Details captured : " + post16RaDetails);
        return "redirect:/admin/select_calculation";
    }

    // For USA

    @ModelAttribute(Constants.PRE_75_USA_DETAILS)
    public Pre75Details createProRataForPre75Usa() {
        return new Pre75Details();
    }

    @ModelAttribute(Constants.POST_75_USA_DETAILS)
    public Post75UsaDetails createProRataForPost75Usa() {
        Post75UsaDetails post75UsaDetails = new Post75UsaDetails();
        post75UsaDetails.setFromPost75("07/04/1975");
        post75UsaDetails.setToPost75("05/04/2016");
        return post75UsaDetails;
    }

    @ModelAttribute(Constants.POST_16_USA_DETAILS)
    public Post75UsaDetails createProRataForPost16Usa() {
        Post75UsaDetails post16UsaDetails = new Post75UsaDetails();
        post16UsaDetails.setFromPost75("06/04/2016");
        return post16UsaDetails;
    }

    @RequestMapping(value = "/admin/prorata_usa_calculation_pre75", method = RequestMethod.GET)
    public String selectProRataUsaCalculationPre75(Model model,
            @ModelAttribute(Constants.PRE_75_USA_DETAILS) Pre75Details pre75UsaDetails, HttpSession session) {
        if (session.getAttribute(Constants.PRE_75_USA_DETAILS) != null) {
            pre75UsaDetails = (Pre75Details) session.getAttribute(Constants.PRE_75_USA_DETAILS);
        }
        model.addAttribute(Constants.PRE_75_USA_DETAILS, pre75UsaDetails);
        return "prorata_usa_calculation_pre75";
    }

    @RequestMapping(value = "/admin/prorata_usa_calculation_post75", method = RequestMethod.POST)
    public String submitProRataUsaPre75Details(
            @ModelAttribute(Constants.PRE_75_USA_DETAILS) Pre75Details pre75UsaDetails, HttpSession session) {
        // Save Pre 75 USA data to session
        shrinkCollection(pre75UsaDetails.getListOfInsuranceRecords());
        session.setAttribute(Constants.PRE_75_USA_DETAILS, pre75UsaDetails);
        LOGGER.info("Pre 75 USA Details captured : " + pre75UsaDetails);
        return "redirect:/admin/prorata_usa_calculation_post75";
    }

    @RequestMapping(value = "/admin/prorata_usa_calculation_post75", method = RequestMethod.GET)
    public String selectProRataUsaCalculationPost75(Model model,
            @ModelAttribute(Constants.POST_75_USA_DETAILS) Post75UsaDetails post75UsaDetails, HttpSession session) {
        if (session.getAttribute(Constants.POST_75_USA_DETAILS) != null) {
            post75UsaDetails = (Post75UsaDetails) session.getAttribute(Constants.POST_75_USA_DETAILS);
        }
        model.addAttribute(Constants.POST_75_USA_DETAILS, post75UsaDetails);
        return "prorata_usa_calculation_post75";
    }

    @RequestMapping(value = "/admin/prorata_usa_calculation_post16", method = RequestMethod.POST)
    public String submitProRataUsaPost75Details(
            @ModelAttribute(Constants.POST_75_USA_DETAILS) Post75UsaDetails post75UsaDetails, HttpSession session) {
        // Save Post 75 USA data to session
        shrinkCollection(post75UsaDetails.getListOfInsuranceRecords());
        session.setAttribute(Constants.POST_75_USA_DETAILS, post75UsaDetails);
        LOGGER.info("Post 75 USA Details captured : " + post75UsaDetails);
        return "redirect:/admin/prorata_usa_calculation_post16";
    }

    @RequestMapping(value = "/admin/prorata_usa_calculation_post16", method = RequestMethod.GET)
    public String selectProRataUsaCalculationPost16(Model model,
            @ModelAttribute(Constants.POST_16_USA_DETAILS) Post75UsaDetails post16UsaDetails, HttpSession session) {
        if (session.getAttribute(Constants.POST_16_USA_DETAILS) != null) {
            post16UsaDetails = (Post75UsaDetails) session.getAttribute(Constants.POST_16_USA_DETAILS);
        }
        model.addAttribute(Constants.POST_16_USA_DETAILS, post16UsaDetails);
        return "prorata_usa_calculation_post16";
    }

    @RequestMapping(value = "/admin/select_calculation_prorata_usa", method = RequestMethod.POST)
    public String submitProRataUsaPost16DetailsGoToSelectCalculation(
            @ModelAttribute(Constants.POST_16_USA_DETAILS) Post75UsaDetails post16UsaDetails, HttpSession session) {
        // Save Post 16 USA data to session
        shrinkCollection(post16UsaDetails.getListOfInsuranceRecords());
        session.setAttribute(Constants.POST_16_USA_DETAILS, post16UsaDetails);
        LOGGER.info("Post 16 USA Details captured : " + post16UsaDetails);
        return "redirect:/admin/select_calculation";
    }

    private void shrinkCollection(List<? extends InsuranceRecord> listOfInsuranceRecords) {
        Iterator<? extends InsuranceRecord> iter = listOfInsuranceRecords.iterator();
        while (iter.hasNext()) {
            InsuranceRecord rec = iter.next();
            if (rec.isEmpty()) {
                iter.remove();
            }
        }
    }

}
