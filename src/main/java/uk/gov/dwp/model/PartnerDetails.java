package uk.gov.dwp.model;

import java.io.Serializable;

/**
 * Represents the partner details
 * 
 * @author samba.mitra
 *
 */
public class PartnerDetails implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -6335391912089157125L;
    private String nino;
    private String name;
    private String dob;
    private String spaDate;
    private boolean nspCustomer;
    private String dateOfDeath;

    public String getNino() {
        return nino;
    }

    public void setNino(String nino) {
        this.nino = nino;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSpaDate() {
        return spaDate;
    }

    public void setSpaDate(String spaDate) {
        this.spaDate = spaDate;
    }

    public boolean getNspCustomer() {
        return nspCustomer;
    }

    public void setNspCustomer(boolean nspCustomer) {
        this.nspCustomer = nspCustomer;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    @Override
    public String toString() {
        return "PartnerDetails [nino=" + nino + ", name=" + name + ", dob=" + dob + ", spaDate=" + spaDate
                + ", nspCustomer=" + nspCustomer + ", dateOfDeath=" + dateOfDeath + "]";
    }
}
