package uk.gov.dwp.model;

import java.io.Serializable;

/**
 * Represents each record of Post 75 EU/RA Pro-Rata
 * 
 * @author samba.mitra
 *
 */
public class Post75EuRaInsuranceRecord extends InsuranceRecord implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -7770871670636250724L;
    private String countryProRata;
    private String fromProRata;
    private String toProRata;
    private String totalNoOfWeeks;
    private String noOfForeignEmployed;
    private String twoThirdUpper;
    private String calc1;
    private String noOfOtherForeign;
    private String appropriateLowerEarnings;
    private String calc2;
    private String ukEarningsFactor;
    private String calc3;
    private String amountReqForQualYear;
    private String qualYears;
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

    public String getNoOfForeignEmployed() {
        return noOfForeignEmployed;
    }

    public void setNoOfForeignEmployed(String noOfForeignEmployed) {
        this.noOfForeignEmployed = noOfForeignEmployed;
    }

    public String getTwoThirdUpper() {
        return twoThirdUpper;
    }

    public void setTwoThirdUpper(String twoThirdUpper) {
        this.twoThirdUpper = twoThirdUpper;
    }

    public String getCalc1() {
        return calc1;
    }

    public void setCalc1(String calc1) {
        this.calc1 = calc1;
    }

    public String getNoOfOtherForeign() {
        return noOfOtherForeign;
    }

    public void setNoOfOtherForeign(String noOfOtherForeign) {
        this.noOfOtherForeign = noOfOtherForeign;
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
        return "Post75EuRaInsuranceRecord [countryProRata=" + countryProRata + ", fromProRata=" + fromProRata
                + ", toProRata=" + toProRata + ", totalNoOfWeeks=" + totalNoOfWeeks + ", noOfForeignEmployed="
                + noOfForeignEmployed + ", twoThirdUpper=" + twoThirdUpper + ", calc1=" + calc1 + ", noOfOtherForeign="
                + noOfOtherForeign + ", appropriateLowerEarnings=" + appropriateLowerEarnings + ", calc2=" + calc2
                + ", ukEarningsFactor=" + ukEarningsFactor + ", calc3=" + calc3 + ", amountReqForQualYear="
                + amountReqForQualYear + ", qualYears=" + qualYears + ", qualUkWeeks=" + qualUkWeeks
                + ", qualForeignWeeks=" + qualForeignWeeks + "]";
    }

    @Override
    public boolean isEmpty() {
        return countryProRata == null && fromProRata == null && toProRata == null && totalNoOfWeeks == null
                && noOfForeignEmployed == null && twoThirdUpper == null && calc1 == null && noOfOtherForeign == null
                && appropriateLowerEarnings == null && calc2 == null && ukEarningsFactor == null && calc3 == null
                && amountReqForQualYear == null && qualYears == null && qualUkWeeks == null && qualForeignWeeks == null;
    }
}
