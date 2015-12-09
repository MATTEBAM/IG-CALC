package uk.gov.dwp.model;

import java.io.Serializable;

/**
 * Represents each record of Post 75 USA Pro-Rata
 * 
 * @author samba.mitra
 *
 */
public class Post75UsaInsuranceRecord extends InsuranceRecord implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 8409419361224111346L;
    private String countryProRata;
    private String fromProRata;
    private String toProRata;
    private String totalNoOfWeeks;
    private String usQcInTaxYear;
    private String calc1;
    private String appropriateLowerEarnings;
    private String calc2;
    private String ukEarningsFactor;
    private String calc3;
    private String amountReqForQualYear;
    private String qualYears;
    private String roundedUkWeeksTotal;
    private String qualUkWeeks;
    private String qualForeignWeeks;

    public String getCountryProRata() {
        return countryProRata;
    }

    public void setCountryProRata(String countryProRata) {
        this.countryProRata = countryProRata;
    }

    public String getFromProRata() {
        return fromProRata;
    }

    public void setFromProRata(String fromProRata) {
        this.fromProRata = fromProRata;
    }

    public String getToProRata() {
        return toProRata;
    }

    public void setToProRata(String toProRata) {
        this.toProRata = toProRata;
    }

    public String getTotalNoOfWeeks() {
        return totalNoOfWeeks;
    }

    public void setTotalNoOfWeeks(String totalNoOfWeeks) {
        this.totalNoOfWeeks = totalNoOfWeeks;
    }

    public String getUsQcInTaxYear() {
        return usQcInTaxYear;
    }

    public void setUsQcInTaxYear(String usQcInTaxYear) {
        this.usQcInTaxYear = usQcInTaxYear;
    }

    public String getCalc1() {
        return calc1;
    }

    public void setCalc1(String calc1) {
        this.calc1 = calc1;
    }

    public String getAppropriateLowerEarnings() {
        return appropriateLowerEarnings;
    }

    public void setAppropriateLowerEarnings(String appropriateLowerEarnings) {
        this.appropriateLowerEarnings = appropriateLowerEarnings;
    }

    public String getCalc2() {
        return calc2;
    }

    public void setCalc2(String calc2) {
        this.calc2 = calc2;
    }

    public String getUkEarningsFactor() {
        return ukEarningsFactor;
    }

    public void setUkEarningsFactor(String ukEarningsFactor) {
        this.ukEarningsFactor = ukEarningsFactor;
    }

    public String getCalc3() {
        return calc3;
    }

    public void setCalc3(String calc3) {
        this.calc3 = calc3;
    }

    public String getAmountReqForQualYear() {
        return amountReqForQualYear;
    }

    public void setAmountReqForQualYear(String amountReqForQualYear) {
        this.amountReqForQualYear = amountReqForQualYear;
    }

    public String getQualYears() {
        return qualYears;
    }

    public void setQualYears(String qualYears) {
        this.qualYears = qualYears;
    }

    public String getRoundedUkWeeksTotal() {
        return roundedUkWeeksTotal;
    }

    public void setRoundedUkWeeksTotal(String roundedUkWeeksTotal) {
        this.roundedUkWeeksTotal = roundedUkWeeksTotal;
    }

    public String getQualUkWeeks() {
        return qualUkWeeks;
    }

    public void setQualUkWeeks(String qualUkWeeks) {
        this.qualUkWeeks = qualUkWeeks;
    }

    public String getQualForeignWeeks() {
        return qualForeignWeeks;
    }

    public void setQualForeignWeeks(String qualForeignWeeks) {
        this.qualForeignWeeks = qualForeignWeeks;
    }

    @Override
    public String toString() {
        return "Post75UsaInsuranceRecord [countryProRata=" + countryProRata + ", fromProRata=" + fromProRata
                + ", toProRata=" + toProRata + ", totalNoOfWeeks=" + totalNoOfWeeks + ", usQcInTaxYear=" + usQcInTaxYear
                + ", calc1=" + calc1 + ", appropriateLowerEarnings=" + appropriateLowerEarnings + ", calc2=" + calc2
                + ", ukEarningsFactor=" + ukEarningsFactor + ", calc3=" + calc3 + ", amountReqForQualYear="
                + amountReqForQualYear + ", qualYears=" + qualYears + ", roundedUkWeeksTotal=" + roundedUkWeeksTotal
                + ", qualUkWeeks=" + qualUkWeeks + ", qualForeignWeeks=" + qualForeignWeeks + "]";
    }

    @Override
    public boolean isEmpty() {
        return (countryProRata == null && fromProRata == null && toProRata == null && totalNoOfWeeks == null
                && usQcInTaxYear == null && calc1 == null && appropriateLowerEarnings == null && calc2 == null
                && ukEarningsFactor == null && calc3 == null && amountReqForQualYear == null && qualYears == null
                && roundedUkWeeksTotal == null && qualUkWeeks == null && qualForeignWeeks == null);
    }
}
