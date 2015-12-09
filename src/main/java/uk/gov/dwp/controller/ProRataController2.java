package uk.gov.dwp.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import uk.gov.dwp.model.InsuranceRecord;
import uk.gov.dwp.model.Post75EuRaDetails;
import uk.gov.dwp.model.Post75UsaDetails;
import uk.gov.dwp.model.Pre75Details;
import uk.gov.dwp.service.CountryService;

/**
 * Handles requests for the ProRata calculations
 * 
 * @author samba.mitra
 */
// @Controller
@SessionAttributes({ "pre75EuDetails", "post75EuDetails", "post16EuDetails", "pre75RaDetails", "post75RaDetails",
        "post16RaDetails", "pre75UsaDetails", "post75UsaDetails", "post16UsaDetails" })
public class ProRataController2 {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProRataController2.class);

    @Autowired
    private CountryService countryService;

    @ModelAttribute("countriesWithoutFrozenRate")
    private Map<String, String> populateCountriesWithoutFrozenRate() {
        return countryService.populateCountriesWithoutFrozenRate();
    }

    @ModelAttribute("countriesUsa")
    private Map<String, String> populateCountriesUsa() {
        return countryService.populateUsa();
    }

    // For EU

    @ModelAttribute("pre75EuDetails")
    public Pre75Details createProRataForPre75Eu() {
        return new Pre75Details();
    }

    @ModelAttribute("post75EuDetails")
    public Post75EuRaDetails createProRataForPost75Eu() {
        Post75EuRaDetails post75EuDetails = new Post75EuRaDetails();
        post75EuDetails.setToPost75("05/04/2016");
        return post75EuDetails;
    }

    @ModelAttribute("post16EuDetails")
    public Post75EuRaDetails createProRataForPost16Eu() {
        Post75EuRaDetails post16EuDetails = new Post75EuRaDetails();
        post16EuDetails.setFromPost75("06/04/2016");
        return post16EuDetails;
    }

    @RequestMapping(value = "/admin/prorata_eu_calculation_pre75", method = RequestMethod.GET)
    public String selectProRataEuCalculationPre75(@ModelAttribute("pre75EuDetails") Pre75Details pre75EuDetails) {
        return "prorata_eu_calculation_pre75";
    }

    @RequestMapping(value = "/admin/prorata_eu_calculation_post75", method = RequestMethod.POST)
    public String submitProRataEuPre75Details(@ModelAttribute("pre75EuDetails") Pre75Details pre75EuDetails) {
        shrinkCollection(pre75EuDetails.getListOfInsuranceRecords());
        LOGGER.info("Pre 75 Eu Details captured : " + pre75EuDetails);
        return "redirect:/admin/prorata_eu_calculation_post75";
    }

    @RequestMapping(value = "/admin/prorata_eu_calculation_post75", method = RequestMethod.GET)
    public String selectProRataEuCalculationPost75(
            @ModelAttribute("post75EuDetails") Post75EuRaDetails post75EuDetails) {
        return "prorata_eu_calculation_post75";
    }

    @RequestMapping(value = "/admin/prorata_eu_calculation_post16", method = RequestMethod.POST)
    public String submitProRataEuPost75Details(@ModelAttribute("post75EuDetails") Post75EuRaDetails post75EuDetails) {
        shrinkCollection(post75EuDetails.getListOfInsuranceRecords());
        LOGGER.info("Post 75 Eu Details captured : " + post75EuDetails);
        return "redirect:/admin/prorata_eu_calculation_post16";
    }

    @RequestMapping(value = "/admin/prorata_eu_calculation_post16", method = RequestMethod.GET)
    public String selectProRataEuCalculationPost16(
            @ModelAttribute("post16EuDetails") Post75EuRaDetails post16EuDetails) {
        return "prorata_eu_calculation_post16";
    }

    @RequestMapping(value = "/admin/select_calculation_prorata_eu", method = RequestMethod.POST)
    public String submitProRataEuPost16Details(@ModelAttribute("post16EuDetails") Post75EuRaDetails post16EuDetails) {
        shrinkCollection(post16EuDetails.getListOfInsuranceRecords());
        LOGGER.info("Post 16 Eu Details captured : " + post16EuDetails);
        return "redirect:/admin/select_calculation";
    }

    // For RA

    @ModelAttribute("pre75RaDetails")
    public Pre75Details createProRataForPre75Ra() {
        return new Pre75Details();
    }

    @ModelAttribute("post75RaDetails")
    public Post75EuRaDetails createProRataForPost75Ra() {
        Post75EuRaDetails post75RaDetails = new Post75EuRaDetails();
        post75RaDetails.setToPost75("05/04/2016");
        return post75RaDetails;
    }

    @ModelAttribute("post16RaDetails")
    public Post75EuRaDetails createProRataForPost16Ra() {
        Post75EuRaDetails post16RaDetails = new Post75EuRaDetails();
        post16RaDetails.setFromPost75("06/04/2016");
        return post16RaDetails;
    }

    @RequestMapping(value = "/admin/prorata_ra_calculation_pre75", method = RequestMethod.GET)
    public String selectProRataRaCalculationPre75(@ModelAttribute("pre75RaDetails") Pre75Details pre75RaDetails) {
        return "prorata_ra_calculation_pre75";
    }

    @RequestMapping(value = "/admin/prorata_ra_calculation_post75", method = RequestMethod.POST)
    public String submitProRataRaPre75Details(@ModelAttribute("pre75RaDetails") Pre75Details pre75RaDetails) {
        shrinkCollection(pre75RaDetails.getListOfInsuranceRecords());
        LOGGER.info("Pre 75 RA Details captured : " + pre75RaDetails);
        return "redirect:/admin/prorata_ra_calculation_post75";
    }

    @RequestMapping(value = "/admin/prorata_ra_calculation_post75", method = RequestMethod.GET)
    public String selectProRataRaCalculationPost75(
            @ModelAttribute("post75RaDetails") Post75EuRaDetails post75RaDetails) {
        return "prorata_ra_calculation_post75";
    }

    @RequestMapping(value = "/admin/prorata_ra_calculation_post16", method = RequestMethod.POST)
    public String submitProRataRaPost75Details(@ModelAttribute("post75RaDetails") Post75EuRaDetails post75RaDetails) {
        shrinkCollection(post75RaDetails.getListOfInsuranceRecords());
        LOGGER.info("Post 75 RA Details captured : " + post75RaDetails);
        return "redirect:/admin/prorata_ra_calculation_post16";
    }

    @RequestMapping(value = "/admin/prorata_ra_calculation_post16", method = RequestMethod.GET)
    public String selectProRataRaCalculationPost16(
            @ModelAttribute("post16RaDetails") Post75EuRaDetails post16RaDetails) {
        return "prorata_ra_calculation_post16";
    }

    @RequestMapping(value = "/admin/select_calculation_prorata_ra", method = RequestMethod.POST)
    public String submitProRataRaPost16Details(@ModelAttribute("post16RaDetails") Post75EuRaDetails post16RaDetails) {
        shrinkCollection(post16RaDetails.getListOfInsuranceRecords());
        LOGGER.info("Post 16 RA Details captured : " + post16RaDetails);
        return "redirect:/admin/select_calculation";
    }

    // For USA

    @ModelAttribute("pre75UsaDetails")
    public Pre75Details createProRataForPre75Usa() {
        return new Pre75Details();
    }

    @ModelAttribute("post75UsaDetails")
    public Post75UsaDetails createProRataForPost75Usa() {
        Post75UsaDetails post75UsaDetails = new Post75UsaDetails();
        post75UsaDetails.setFromPost75("07/04/1975");
        post75UsaDetails.setToPost75("05/04/2016");
        return post75UsaDetails;
    }

    @ModelAttribute("post16UsaDetails")
    public Post75UsaDetails createProRataForPost16Usa() {
        Post75UsaDetails post16UsaDetails = new Post75UsaDetails();
        post16UsaDetails.setFromPost75("06/04/2016");
        return post16UsaDetails;
    }

    @RequestMapping(value = "/admin/prorata_usa_calculation_pre75", method = RequestMethod.GET)
    public String selectProRataUsaCalculationPre75(@ModelAttribute("pre75UsaDetails") Pre75Details pre75UsaDetails) {
        return "prorata_usa_calculation_pre75";
    }

    @RequestMapping(value = "/admin/prorata_usa_calculation_post75", method = RequestMethod.POST)
    public String submitProRataUsaPre75Details(@ModelAttribute("pre75UsaDetails") Pre75Details pre75UsaDetails) {
        shrinkCollection(pre75UsaDetails.getListOfInsuranceRecords());
        LOGGER.info("Pre 75 USA Details captured : " + pre75UsaDetails);
        return "redirect:/admin/prorata_usa_calculation_post75";
    }

    @RequestMapping(value = "/admin/prorata_usa_calculation_post75", method = RequestMethod.GET)
    public String selectProRataUsaCalculationPost75(
            @ModelAttribute("post75UsaDetails") Post75UsaDetails post75UsaDetails) {
        return "prorata_usa_calculation_post75";
    }

    @RequestMapping(value = "/admin/prorata_usa_calculation_post16", method = RequestMethod.POST)
    public String submitProRataUsaPost75Details(@ModelAttribute("post75UsaDetails") Post75UsaDetails post75UsaDetails) {
        shrinkCollection(post75UsaDetails.getListOfInsuranceRecords());
        LOGGER.info("Post 75 USA Details captured : " + post75UsaDetails);
        return "redirect:/admin/prorata_usa_calculation_post16";
    }

    @RequestMapping(value = "/admin/prorata_usa_calculation_post16", method = RequestMethod.GET)
    public String selectProRataUsaCalculationPost16(
            @ModelAttribute("post16UsaDetails") Post75UsaDetails post75UsaDetails) {
        return "prorata_usa_calculation_post16";
    }

    @RequestMapping(value = "/admin/select_calculation_prorata_usa", method = RequestMethod.POST)
    public String submitProRataUsaPost16Details(@ModelAttribute("post16UsaDetails") Post75UsaDetails post16UsaDetails) {
        shrinkCollection(post16UsaDetails.getListOfInsuranceRecords());
        LOGGER.info("Post 16 USA Details captured : " + post16UsaDetails);
        return "redirect:/admin/select_calculation";
    }

    /**
     * Shrinks a lazylist collection when a record is removed from the
     * front-end.
     * 
     * @param listOfInsuranceRecords
     */
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
