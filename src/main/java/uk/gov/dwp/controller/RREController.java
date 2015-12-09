package uk.gov.dwp.controller;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import uk.gov.dwp.common.Constants;
import uk.gov.dwp.model.CustomerDetails;
import uk.gov.dwp.model.NSPDetails;
import uk.gov.dwp.model.RREDetails;

/**
 * Handles requests for RRE calculations *
 * 
 * @author samba.mitra
 *
 */
@Controller
@SessionAttributes({ Constants.RRE_DETAILS, Constants.CUSTOMER_DETAILS })
public class RREController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RREController.class);

    @ModelAttribute(Constants.RRE_DETAILS)
    public RREDetails populateRreDetails() {
        return new RREDetails();
    }

    @RequestMapping(value = "/admin/rre_calculation", method = RequestMethod.GET)
    public String showRreCalculation(@ModelAttribute(Constants.RRE_DETAILS) RREDetails rreDetails,
            @ModelAttribute(Constants.CUSTOMER_DETAILS) CustomerDetails customerDetails, HttpSession session) {
        LOGGER.info("Displaying the RRE Calculation page...");

        NSPDetails nspDetails = session.getAttribute(Constants.NSP_DETAILS) != null
                ? (NSPDetails) session.getAttribute(Constants.NSP_DETAILS) : new NSPDetails();

        // Populate RRE model
        rreDetails.setRreRate(getRreRate(customerDetails.getMaritalStatus()));
        double rreAmount = Constants.RRE_AMOUNT_2016_17.get(rreDetails.getRreRate());
        rreDetails.setRreAmount(String.valueOf(rreAmount));
        rreDetails.setNspStarting(nspDetails.getNewStatePensionRevised());
        rreDetails.setProtectedPaymentStarting(nspDetails.getProtectedPaymentRevised());

        double nspTotal = 0d;
        try {
            if (StringUtils.isNotBlank(nspDetails.getNewStatePensionRevised())
                    && StringUtils.isNotBlank(nspDetails.getProtectedPaymentRevised())) {
                nspTotal = Double.parseDouble(nspDetails.getNewStatePensionRevised())
                        + Double.parseDouble(nspDetails.getProtectedPaymentRevised());
                rreDetails.setNspTotalNspEntitlement(String.valueOf(nspTotal));
            }
        } catch (NumberFormatException nfe) {
            LOGGER.error("Error while parsing nSP/PP revised values");
        }

        return "rre_calculation";
    }

    @RequestMapping(value = "/admin/select_calculation_rre", method = RequestMethod.POST)
    public String submitRreDetails(@ModelAttribute(Constants.RRE_DETAILS) RREDetails rreDetails) {
        LOGGER.info("RRE Details captured : " + rreDetails);
        return "redirect:/admin/select_calculation";
    }

    private String getRreRate(String maritalStatus) {
        String rreRate;
        switch (maritalStatus) {
        case Constants.MARITAL_STATUS_WIDOW:
            rreRate = Constants.RRE_HIGHER;
            break;
        case Constants.MARITAL_STATUS_DIVORCED:
            rreRate = Constants.RRE_HIGHER;
            break;
        case Constants.MARITAL_STATUS_WIDOWER:
            rreRate = Constants.RRE_HIGHER;
            break;
        default:
            rreRate = Constants.RRE_LOWER;
            break;
        }

        return rreRate;
    }
}
