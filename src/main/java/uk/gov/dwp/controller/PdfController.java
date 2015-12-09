package uk.gov.dwp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.gov.dwp.common.Constants;
import uk.gov.dwp.model.Post75EuRaDetails;
import uk.gov.dwp.model.Post75UsaDetails;
import uk.gov.dwp.model.Pre75Details;

/**
 * Generates Pdf
 * 
 * @author samba.mitra
 *
 */
@Controller
public class PdfController {

    @RequestMapping(value = "/admin/generatePdf", method = RequestMethod.GET)
    public String generatePDF(Model model, HttpSession session) {

        // Retrieve data from session
        Pre75Details pre75EuDetails = session.getAttribute(Constants.PRE_75_EU_DETAILS) != null
                ? (Pre75Details) session.getAttribute(Constants.PRE_75_EU_DETAILS) : new Pre75Details();
        Post75EuRaDetails post75EuDetails = session.getAttribute(Constants.POST_75_EU_DETAILS) != null
                ? (Post75EuRaDetails) session.getAttribute(Constants.POST_75_EU_DETAILS) : new Post75EuRaDetails();
        Post75EuRaDetails post16EuDetails = session.getAttribute(Constants.POST_16_EU_DETAILS) != null
                ? (Post75EuRaDetails) session.getAttribute(Constants.POST_16_EU_DETAILS) : new Post75EuRaDetails();
        Pre75Details pre75RaDetails = session.getAttribute(Constants.PRE_75_RA_DETAILS) != null
                ? (Pre75Details) session.getAttribute(Constants.PRE_75_RA_DETAILS) : new Pre75Details();
        Post75EuRaDetails post75RaDetails = session.getAttribute(Constants.POST_75_RA_DETAILS) != null
                ? (Post75EuRaDetails) session.getAttribute(Constants.POST_75_RA_DETAILS) : new Post75EuRaDetails();
        Post75EuRaDetails post16RaDetails = session.getAttribute(Constants.POST_16_RA_DETAILS) != null
                ? (Post75EuRaDetails) session.getAttribute(Constants.POST_16_RA_DETAILS) : new Post75EuRaDetails();
        Pre75Details pre75UsaDetails = session.getAttribute(Constants.PRE_75_USA_DETAILS) != null
                ? (Pre75Details) session.getAttribute(Constants.PRE_75_USA_DETAILS) : new Pre75Details();
        Post75UsaDetails post75UsaDetails = session.getAttribute(Constants.POST_75_USA_DETAILS) != null
                ? (Post75UsaDetails) session.getAttribute(Constants.POST_75_USA_DETAILS) : new Post75UsaDetails();
        Post75UsaDetails post16UsaDetails = session.getAttribute(Constants.POST_16_USA_DETAILS) != null
                ? (Post75UsaDetails) session.getAttribute(Constants.POST_16_USA_DETAILS) : new Post75UsaDetails();

        // Add all the details to model for Pdf generation
        model.addAttribute(Constants.PRE_75_EU_DETAILS, pre75EuDetails);
        model.addAttribute(Constants.POST_75_EU_DETAILS, post75EuDetails);
        model.addAttribute(Constants.POST_16_EU_DETAILS, post16EuDetails);
        model.addAttribute(Constants.PRE_75_RA_DETAILS, pre75RaDetails);
        model.addAttribute(Constants.POST_75_RA_DETAILS, post75RaDetails);
        model.addAttribute(Constants.POST_16_RA_DETAILS, post16RaDetails);
        model.addAttribute(Constants.PRE_75_USA_DETAILS, pre75UsaDetails);
        model.addAttribute(Constants.POST_75_USA_DETAILS, post75UsaDetails);
        model.addAttribute(Constants.POST_16_USA_DETAILS, post16UsaDetails);

        return "pdfView";
    }
}
