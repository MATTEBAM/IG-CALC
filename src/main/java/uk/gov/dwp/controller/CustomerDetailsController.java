package uk.gov.dwp.controller;

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
import uk.gov.dwp.model.CustomerDetails;
import uk.gov.dwp.model.PartnerDetails;
import uk.gov.dwp.service.CountryService;

/**
 * Handles requests for the customer/partner details
 * 
 * @author samba.mitra
 */
@Controller
public class CustomerDetailsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerDetailsController.class);

    @Autowired
    private CountryService countryService;

    // Customer and Partner screens

    @ModelAttribute(Constants.COUNTRIES)
    public Map<String, String> populateCountries() {
        return countryService.populateAllCountries();
    }

    @ModelAttribute(Constants.CUSTOMER_DETAILS)
    public CustomerDetails populateCustomerDetails() {
        return new CustomerDetails();
    }

    @ModelAttribute(Constants.PARTNER_DETAILS)
    public PartnerDetails populatePartnerDetails() {
        return new PartnerDetails();
    }

    @RequestMapping(value = "/admin/customer_details", method = RequestMethod.GET)
    public String showCustomerDetails(Model model,
            @ModelAttribute(Constants.CUSTOMER_DETAILS) CustomerDetails customerDetails, HttpSession session) {
        if (session.getAttribute(Constants.CUSTOMER_DETAILS) != null) {
            customerDetails = (CustomerDetails) session.getAttribute(Constants.CUSTOMER_DETAILS);
        }
        model.addAttribute(Constants.CUSTOMER_DETAILS, customerDetails);
        return "customer_details";
    }

    @RequestMapping(value = "/admin/customer_details", method = RequestMethod.POST)
    public String showCustomerDetailsForNewCalcutaion(Model model,
            @ModelAttribute(Constants.CUSTOMER_DETAILS) CustomerDetails customerDetails, HttpSession session) {
        // Remove the session attributes
        session.removeAttribute(Constants.CUSTOMER_DETAILS);
        session.removeAttribute(Constants.PARTNER_DETAILS);
        session.removeAttribute("pre75EuDetails");
        session.removeAttribute("post75EuDetails");
        session.removeAttribute("post16EuDetails");
        session.removeAttribute("pre75RaDetails");
        session.removeAttribute("post75RaDetails");
        session.removeAttribute("post16RaDetails");
        session.removeAttribute("pre75UsaDetails");
        session.removeAttribute("post75UsaDetails");
        session.removeAttribute("post16UsaDetails");
        session.removeAttribute("nspDetails");
        session.removeAttribute("espDetails");
        session.removeAttribute("rreDetails");
        session.removeAttribute("inheritedDetails");
        LOGGER.info("Removed the custom session attributes");
        model.addAttribute(Constants.CUSTOMER_DETAILS, customerDetails);
        return "customer_details";
    }

    @RequestMapping(value = "/admin/partner_details", method = RequestMethod.GET)
    public String showPartnerDetails(Model model,
            @ModelAttribute(Constants.PARTNER_DETAILS) PartnerDetails partnerDetails, HttpSession session) {
        if (session.getAttribute(Constants.PARTNER_DETAILS) != null) {
            partnerDetails = (PartnerDetails) session.getAttribute(Constants.PARTNER_DETAILS);
        }
        model.addAttribute(Constants.PARTNER_DETAILS, partnerDetails);
        return "partner_details";
    }

    @RequestMapping(value = "/admin/partner_details", method = RequestMethod.POST)
    public String submitCustomerDetailsGoToPartner(
            @ModelAttribute(Constants.CUSTOMER_DETAILS) CustomerDetails customerDetails, HttpSession session) {
        // Save customer data to session
        session.setAttribute(Constants.CUSTOMER_DETAILS, customerDetails);
        LOGGER.info("Customer Details captured : " + customerDetails);
        return "redirect:/admin/partner_details";
    }

    @RequestMapping(value = "/admin/select_calculation_customer", method = RequestMethod.POST)
    public String submitCustomerDetailsGoToSelectCalculation(
            @ModelAttribute(Constants.CUSTOMER_DETAILS) CustomerDetails customerDetails, HttpSession session) {
        LOGGER.info("Customer Details captured : " + customerDetails);
        session.setAttribute(Constants.CUSTOMER_DETAILS, customerDetails);
        // Remove partner details from session
        session.removeAttribute(Constants.PARTNER_DETAILS);
        return "redirect:/admin/select_calculation";
    }

    @RequestMapping(value = "/admin/select_calculation_partner", method = RequestMethod.POST)
    public String submitPartnerDetailsGoToSelectCalculation(
            @ModelAttribute(Constants.PARTNER_DETAILS) PartnerDetails partnerDetails, HttpSession session) {
        LOGGER.info("Partner Details captured : " + partnerDetails);
        session.setAttribute(Constants.PARTNER_DETAILS, partnerDetails);
        return "redirect:/admin/select_calculation";
    }

}
