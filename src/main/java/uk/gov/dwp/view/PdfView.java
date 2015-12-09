package uk.gov.dwp.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import uk.gov.dwp.model.Post75EuRaDetails;
import uk.gov.dwp.model.Pre75Details;
import uk.gov.dwp.model.Pre75InsuranceRecord;

/**
 * Generates a custom Pdf view from the data
 * 
 * @author samba.mitra
 *
 */
public class PdfView extends AbstractItextPdfView {

    private static Font TIME_ROMAN = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    private static Font TIME_ROMAN_SMALL = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);

    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
            HttpServletRequest request, HttpServletResponse response) throws DocumentException {
        // get data model which is passed by the Spring container
        // NSPDetails nspDetails = (NSPDetails) model.get("nspDetails");
        Pre75Details pre75EuDetails = (Pre75Details) model.get("pre75EuDetails");
        Post75EuRaDetails post75EuDetails = (Post75EuRaDetails) model.get("post75EuDetails");
        Post75EuRaDetails post16EuDetails = (Post75EuRaDetails) model.get("post16EuDetails");

        addTitlePage(document);

        addDataPageForProRataEu(document, pre75EuDetails, post75EuDetails, post16EuDetails);

    }

    private void addDataPageForProRataEu(Document document, Pre75Details pre75EuDetails,
            Post75EuRaDetails post75EuDetails, Post75EuRaDetails post16EuDetails) throws DocumentException {
        Paragraph paragraph = new Paragraph("Pro-Rata EU");
        creteEmptyLine(paragraph, 2);
        document.add(paragraph);

        PdfPTable table = new PdfPTable(4);
        table.setWidthPercentage(100.0f);
        table.setWidths(new float[] { 3.0f, 2.0f, 2.0f, 2.0f });
        table.setSpacingBefore(10);

        PdfPCell cellCountry = new PdfPCell(new Phrase("Country"));
        PdfPCell cellFrom = new PdfPCell(new Phrase("From"));
        PdfPCell cellTo = new PdfPCell(new Phrase("To"));
        PdfPCell cellNoOfWeeks = new PdfPCell(new Phrase("No. of Weeks"));
        table.addCell(cellCountry);
        table.addCell(cellFrom);
        table.addCell(cellTo);
        table.addCell(cellNoOfWeeks);

        for (Pre75InsuranceRecord record : pre75EuDetails.getListOfInsuranceRecords()) {
            table.addCell(record.getCountryProRata());
            table.addCell(record.getFromProRata());
            table.addCell(record.getToProRata());
            table.addCell(record.getNoOfWeeks());
        }

        document.add(table);
    }

    private static void addTitlePage(Document document) throws DocumentException {
        Paragraph preface = new Paragraph();
        creteEmptyLine(preface, 1);
        preface.add(new Paragraph("PDF Report", TIME_ROMAN));

        creteEmptyLine(preface, 1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        preface.add(new Paragraph("Report created on " + simpleDateFormat.format(new Date()), TIME_ROMAN_SMALL));
        document.add(preface);
    }

    private static void creteEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }

    @Override
    protected void buildPdfMetadata(Map<String, Object> model, Document document, HttpServletRequest request) {
        document.addTitle("IG Calculator");
        document.addAuthor("Samba Mitra");
    }
}
