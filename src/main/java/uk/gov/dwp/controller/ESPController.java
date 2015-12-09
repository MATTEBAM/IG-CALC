package uk.gov.dwp.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.gov.dwp.common.Constants;
import uk.gov.dwp.model.ESPDetails;
import uk.gov.dwp.model.InsuranceRecord;
import uk.gov.dwp.service.CountryService;
import uk.gov.dwp.validator.ESPValidator;

/**
 * Handles requests for ESP calculations
 * 
 * @author samba.mitra
 *
 */
@Controller
public class ESPController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ESPController.class);

    @Autowired
    private CountryService countryService;

    @Autowired
    private ESPValidator espValidator;

    @ModelAttribute(Constants.ESP_DETAILS)
    public ESPDetails populateEspDetails() {
        return new ESPDetails();
    }

    @ModelAttribute(Constants.COUNTRIES)
    public Map<String, String> populateCountries() {
        return countryService.populateAllCountries();
    }

    @RequestMapping(value = "/admin/esp_calculation", method = RequestMethod.GET)
    public String showEspCalculation(Model model, @ModelAttribute(Constants.ESP_DETAILS) ESPDetails espDetails,
            HttpSession session) {
        LOGGER.info("Displaying the ESP Calculation page...");
        if (session.getAttribute(Constants.ESP_DETAILS) != null) {
            espDetails = (ESPDetails) session.getAttribute(Constants.ESP_DETAILS);
        }
        model.addAttribute(Constants.ESP_DETAILS, espDetails);
        return "esp_calculation";
    }

    @RequestMapping(value = "/admin/select_calculation_esp", method = RequestMethod.POST)
    public String submitEspDetails(@Valid @ModelAttribute(Constants.ESP_DETAILS) ESPDetails espDetails,
            BindingResult result, HttpSession session) {
        shrinkCollection(espDetails.getListOfEspRecords());
        LOGGER.info("ESP Details captured : " + espDetails);
        session.setAttribute(Constants.ESP_DETAILS, espDetails);
        espValidator.validate(espDetails, result);
        if (result.hasErrors()) {
            return "esp_calculation";
        }
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
