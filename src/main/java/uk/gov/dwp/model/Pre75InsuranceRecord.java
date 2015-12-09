package uk.gov.dwp.model;

import java.io.Serializable;

/**
 * Represents each record of Pre 75 EU/RA/USA Pro-Rata
 * 
 * @author samba.mitra
 *
 */
public class Pre75InsuranceRecord extends InsuranceRecord implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -2232066110904345154L;
    private String countryProRata;
    private String fromProRata;
    private String toProRata;
    private String noOfWeeks;

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

    public String getNoOfWeeks() {
        return noOfWeeks;
    }

    public void setNoOfWeeks(String noOfWeeks) {
        this.noOfWeeks = noOfWeeks;
    }

    @Override
    public String toString() {
        return "InsuranceRecord [countryProRata=" + countryProRata + ", fromProRata=" + fromProRata + ", toProRata="
                + toProRata + ", noOfWeeks=" + noOfWeeks + "]";
    }

    @Override
    public boolean isEmpty() {
        return countryProRata == null && fromProRata == null && toProRata == null && noOfWeeks == null;
    }

}
