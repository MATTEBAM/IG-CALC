package uk.gov.dwp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.FactoryUtils;
import org.apache.commons.collections4.list.LazyList;

/**
 * Represents the ESP data
 * 
 * @author samba.mitra
 *
 */
public class ESPDetails implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -6928515492472689529L;
    private List<ESPRecord> listOfEspRecords;
    private String totalNspEspAmount;

    public ESPDetails() {
        Factory<ESPRecord> factory = FactoryUtils.instantiateFactory(ESPRecord.class);
        listOfEspRecords = LazyList.lazyList(new ArrayList<ESPRecord>(), factory);
    }

    public List<ESPRecord> getListOfEspRecords() {
        return listOfEspRecords;
    }

    public void setListOfEspRecords(List<ESPRecord> listOfEspRecords) {
        this.listOfEspRecords = listOfEspRecords;
    }

    public String getTotalNspEspAmount() {
        return totalNspEspAmount;
    }

    public void setTotalNspEspAmount(String totalNspEspAmount) {
        this.totalNspEspAmount = totalNspEspAmount;
    }

    @Override
    public String toString() {
        return "ESPDetails [listOfEspRecords=" + listOfEspRecords + ", totalNspEspAmount=" + totalNspEspAmount
                + ", getListOfEspRecords()=" + getListOfEspRecords() + ", getTotalNspEspAmount()="
                + getTotalNspEspAmount() + "]";
    }

}
