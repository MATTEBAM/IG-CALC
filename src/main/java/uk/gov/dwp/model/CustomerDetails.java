package uk.gov.dwp.model;

import java.io.Serializable;

/**
 * Represents the customer details
 * 
 * @author samba.mitra
 *
 */
public class CustomerDetails implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 7849627570694002182L;
    private String nino;
    private String name;
    private String gender;
    private String dob;
    private String spaDate;
    private boolean nspCustomer;
    private String dateOfEntitlement;
    private String maritalStatus;
    private String dateOfMarriage;
    private String dateOfDivorce;
    private String countryOfResidence;
    private String frozenRate;
    private String dateOfPermanentDeparture;
    private String mqpAchieved;
    private String rreHeld;
    private String oldRulesAmount;
    private String newRulesAmount;
    private String startingAmount;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public boolean isNspCustomer() {
        return nspCustomer;
    }

    public void setNspCustomer(boolean nspCustomer) {
        this.nspCustomer = nspCustomer;
    }

    public String getDateOfEntitlement() {
        return dateOfEntitlement;
    }

    public void setDateOfEntitlement(String dateOfEntitlement) {
        this.dateOfEntitlement = dateOfEntitlement;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getDateOfMarriage() {
        return dateOfMarriage;
    }

    public void setDateOfMarriage(String dateOfMarriage) {
        this.dateOfMarriage = dateOfMarriage;
    }

    public String getDateOfDivorce() {
        return dateOfDivorce;
    }

    public void setDateOfDivorce(String dateOfDivorce) {
        this.dateOfDivorce = dateOfDivorce;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public String getFrozenRate() {
        return frozenRate;
    }

    public void setFrozenRate(String frozenRate) {
        this.frozenRate = frozenRate;
    }

    public String getDateOfPermanentDeparture() {
        return dateOfPermanentDeparture;
    }

    public void setDateOfPermanentDeparture(String dateOfPermanentDeparture) {
        this.dateOfPermanentDeparture = dateOfPermanentDeparture;
    }

    public String getMqpAchieved() {
        return mqpAchieved;
    }

    public void setMqpAchieved(String mqpAchieved) {
        this.mqpAchieved = mqpAchieved;
    }

    public String getRreHeld() {
        return rreHeld;
    }

    public void setRreHeld(String rreHeld) {
        this.rreHeld = rreHeld;
    }

    public String getOldRulesAmount() {
        return oldRulesAmount;
    }

    public void setOldRulesAmount(String oldRulesAmount) {
        this.oldRulesAmount = oldRulesAmount;
    }

    public String getNewRulesAmount() {
        return newRulesAmount;
    }

    public void setNewRulesAmount(String newRulesAmount) {
        this.newRulesAmount = newRulesAmount;
    }

    public String getStartingAmount() {
        return startingAmount;
    }

    public void setStartingAmount(String startingAmount) {
        this.startingAmount = startingAmount;
    }

    @Override
    public String toString() {
        return "CustomerDetails [nino=" + nino + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", spaDate="
                + spaDate + ", nspCustomer=" + nspCustomer + ", dateOfEntitlement=" + dateOfEntitlement
                + ", maritalStatus=" + maritalStatus + ", dateOfMarriage=" + dateOfMarriage + ", dateOfDivorce="
                + dateOfDivorce + ", countryOfResidence=" + countryOfResidence + ", frozenRate=" + frozenRate
                + ", dateOfPermanentDeparture=" + dateOfPermanentDeparture + ", mqpAchieved=" + mqpAchieved
                + ", rreHeld=" + rreHeld + ", oldRulesAmount=" + oldRulesAmount + ", newRulesAmount=" + newRulesAmount
                + ", startingAmount=" + startingAmount + "]";
    }
}