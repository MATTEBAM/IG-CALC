package uk.gov.dwp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.FactoryUtils;
import org.apache.commons.collections4.list.LazyList;

/**
 * Represents the data for Pre 75 EU/RA/USA Pro-Rata
 * 
 * @author samba.mitra
 *
 */
public class Pre75Details implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -8535144815133933232L;
    private String fromPre75;
    private List<Pre75InsuranceRecord> listOfInsuranceRecords;
    private String total;
    private String noOfReckonableYears;

    public Pre75Details() {
        Factory<Pre75InsuranceRecord> factory = FactoryUtils.instantiateFactory(Pre75InsuranceRecord.class);
        listOfInsuranceRecords = LazyList.lazyList(new ArrayList<Pre75InsuranceRecord>(), factory);
    }

    public String getFromPre75() {
        return fromPre75;
    }

    public void setFromPre75(String fromPre75) {
        this.fromPre75 = fromPre75;
    }

    public List<Pre75InsuranceRecord> getListOfInsuranceRecords() {
        return listOfInsuranceRecords;
    }

    public void setListOfInsuranceRecords(List<Pre75InsuranceRecord> listOfInsuranceRecords) {
        this.listOfInsuranceRecords = listOfInsuranceRecords;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getNoOfReckonableYears() {
        return noOfReckonableYears;
    }

    public void setNoOfReckonableYears(String noOfReckonableYears) {
        this.noOfReckonableYears = noOfReckonableYears;
    }

    @Override
    public String toString() {
        return "Pre75Details [fromPre75=" + fromPre75 + ", listOfInsuranceRecords=" + listOfInsuranceRecords
                + ", total=" + total + ", noOfReckonableYears=" + noOfReckonableYears + "]";
    }

}
