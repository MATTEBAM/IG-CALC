package uk.gov.dwp.model;

import java.io.Serializable;

/**
 * Represents the RRE details
 * 
 * @author samba.mitra
 *
 */
public class RREDetails implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 586851811464616667L;
    private String rreFlagHeld;
    private String rreRate;
    private String rreAmount;
    private String ap;
    private String grb;
    private String nspStarting;
    private String protectedPaymentStarting;
    private String upratingYearNspEntitlement;
    private String nspNspEntitlement;
    private String protectedPaymentNspEntitlement;
    private String nspTotalNspEntitlement;
    private String upratingYearRreEntitlement;
    private String rreRreEntitlement;
    private String apRreEntitlement;
    private String grbRreEntitlement;
    private String rreTotalRreEntitlement;

    public String getRreFlagHeld() {
        return rreFlagHeld;
    }

    public void setRreFlagHeld(String rreFlagHeld) {
        this.rreFlagHeld = rreFlagHeld;
    }

    public String getRreRate() {
        return rreRate;
    }

    public void setRreRate(String rreRate) {
        this.rreRate = rreRate;
    }

    public String getRreAmount() {
        return rreAmount;
    }

    public void setRreAmount(String rreAmount) {
        this.rreAmount = rreAmount;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getGrb() {
        return grb;
    }

    public void setGrb(String grb) {
        this.grb = grb;
    }

    public String getNspStarting() {
        return nspStarting;
    }

    public void setNspStarting(String nspStarting) {
        this.nspStarting = nspStarting;
    }

    public String getProtectedPaymentStarting() {
        return protectedPaymentStarting;
    }

    public void setProtectedPaymentStarting(String protectedPaymentStarting) {
        this.protectedPaymentStarting = protectedPaymentStarting;
    }

    public String getUpratingYearNspEntitlement() {
        return upratingYearNspEntitlement;
    }

    public void setUpratingYearNspEntitlement(String upratingYearNspEntitlement) {
        this.upratingYearNspEntitlement = upratingYearNspEntitlement;
    }

    public String getNspNspEntitlement() {
        return nspNspEntitlement;
    }

    public void setNspNspEntitlement(String nspNspEntitlement) {
        this.nspNspEntitlement = nspNspEntitlement;
    }

    public String getProtectedPaymentNspEntitlement() {
        return protectedPaymentNspEntitlement;
    }

    public void setProtectedPaymentNspEntitlement(String protectedPaymentNspEntitlement) {
        this.protectedPaymentNspEntitlement = protectedPaymentNspEntitlement;
    }

    public String getNspTotalNspEntitlement() {
        return nspTotalNspEntitlement;
    }

    public void setNspTotalNspEntitlement(String nspTotalNspEntitlement) {
        this.nspTotalNspEntitlement = nspTotalNspEntitlement;
    }

    public String getUpratingYearRreEntitlement() {
        return upratingYearRreEntitlement;
    }

    public void setUpratingYearRreEntitlement(String upratingYearRreEntitlement) {
        this.upratingYearRreEntitlement = upratingYearRreEntitlement;
    }

    public String getRreRreEntitlement() {
        return rreRreEntitlement;
    }

    public void setRreRreEntitlement(String rreRreEntitlement) {
        this.rreRreEntitlement = rreRreEntitlement;
    }

    public String getApRreEntitlement() {
        return apRreEntitlement;
    }

    public void setApRreEntitlement(String apRreEntitlement) {
        this.apRreEntitlement = apRreEntitlement;
    }

    public String getGrbRreEntitlement() {
        return grbRreEntitlement;
    }

    public void setGrbRreEntitlement(String grbRreEntitlement) {
        this.grbRreEntitlement = grbRreEntitlement;
    }

    public String getRreTotalRreEntitlement() {
        return rreTotalRreEntitlement;
    }

    public void setRreTotalRreEntitlement(String rreTotalRreEntitlement) {
        this.rreTotalRreEntitlement = rreTotalRreEntitlement;
    }

    @Override
    public String toString() {
        return "RREDetails [rreFlagHeld=" + rreFlagHeld + ", rreRate=" + rreRate + ", rreAmount=" + rreAmount + ", ap="
                + ap + ", grb=" + grb + ", nspStarting=" + nspStarting + ", protectedPaymentStarting="
                + protectedPaymentStarting + ", upratingYearNspEntitlement=" + upratingYearNspEntitlement
                + ", nspNspEntitlement=" + nspNspEntitlement + ", protectedPaymentNspEntitlement="
                + protectedPaymentNspEntitlement + ", nspTotalNspEntitlement=" + nspTotalNspEntitlement
                + ", upratingYearRreEntitlement=" + upratingYearRreEntitlement + ", rreRreEntitlement="
                + rreRreEntitlement + ", apRreEntitlement=" + apRreEntitlement + ", grbRreEntitlement="
                + grbRreEntitlement + ", rreTotalRreEntitlement=" + rreTotalRreEntitlement + "]";
    }

}
