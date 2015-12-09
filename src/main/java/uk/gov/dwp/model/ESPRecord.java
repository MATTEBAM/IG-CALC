package uk.gov.dwp.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Represents each ESP record
 * 
 * @author samba.mitra
 *
 */
public class ESPRecord extends InsuranceRecord implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 361896229652468932L;
    private String countryOfResidence;
    private String status;
    private String upratingPayable;
    private String startDate;
    private String endDate;
    private String upratingYear;
    private String combinedAmount;
    @NotEmpty
    private String nspEspAmount;

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUpratingPayable() {
        return upratingPayable;
    }

    public void setUpratingPayable(String upratingPayable) {
        this.upratingPayable = upratingPayable;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getUpratingYear() {
        return upratingYear;
    }

    public void setUpratingYear(String upratingYear) {
        this.upratingYear = upratingYear;
    }

    public String getCombinedAmount() {
        return combinedAmount;
    }

    public void setCombinedAmount(String combinedAmount) {
        this.combinedAmount = combinedAmount;
    }

    public String getNspEspAmount() {
        return nspEspAmount;
    }

    public void setNspEspAmount(String nspEspAmount) {
        this.nspEspAmount = nspEspAmount;
    }

    @Override
    public String toString() {
        return "ESPRecord [countryOfResidence=" + countryOfResidence + ", status=" + status + ", upratingPayable="
                + upratingPayable + ", startDate=" + startDate + ", endDate=" + endDate + ", upratingYear="
                + upratingYear + ", combinedAmount=" + combinedAmount + ", nspEspAmount=" + nspEspAmount + "]";
    }

    @Override
    public boolean isEmpty() {
        return countryOfResidence == null && status == null && upratingPayable == null && startDate == null
                && endDate == null && upratingYear == null && combinedAmount == null && nspEspAmount == null;
    }
}
