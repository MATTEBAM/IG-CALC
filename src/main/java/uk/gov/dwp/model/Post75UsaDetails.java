package uk.gov.dwp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.FactoryUtils;
import org.apache.commons.collections4.list.LazyList;

/**
 * Represents the data for Post 75 USA Pro-Rata
 * 
 * @author samba.mitra
 *
 */
public class Post75UsaDetails implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 5251249111377889490L;
    private String fromPost75;
    private String toPost75;
    private List<Post75UsaInsuranceRecord> listOfInsuranceRecords;
    private String totalQualWeeksUk;
    private String totalQualWeeksForeign;

    public Post75UsaDetails() {
        Factory<Post75UsaInsuranceRecord> factory = FactoryUtils.instantiateFactory(Post75UsaInsuranceRecord.class);
        listOfInsuranceRecords = LazyList.lazyList(new ArrayList<Post75UsaInsuranceRecord>(), factory);
    }

    public String getFromPost75() {
        return fromPost75;
    }

    public void setFromPost75(String fromPost75) {
        this.fromPost75 = fromPost75;
    }

    public String getToPost75() {
        return toPost75;
    }

    public void setToPost75(String toPost75) {
        this.toPost75 = toPost75;
    }

    public List<Post75UsaInsuranceRecord> getListOfInsuranceRecords() {
        return listOfInsuranceRecords;
    }

    public void setListOfInsuranceRecords(List<Post75UsaInsuranceRecord> listOfInsuranceRecords) {
        this.listOfInsuranceRecords = listOfInsuranceRecords;
    }

    public String getTotalQualWeeksUk() {
        return totalQualWeeksUk;
    }

    public void setTotalQualWeeksUk(String totalQualWeeksUk) {
        this.totalQualWeeksUk = totalQualWeeksUk;
    }

    public String getTotalQualWeeksForeign() {
        return totalQualWeeksForeign;
    }

    public void setTotalQualWeeksForeign(String totalQualWeeksForeign) {
        this.totalQualWeeksForeign = totalQualWeeksForeign;
    }

    @Override
    public String toString() {
        return "Post75EuRaDetails [fromPost75=" + fromPost75 + ", toPost75=" + toPost75 + ", listOfInsuranceRecords="
                + listOfInsuranceRecords + ", totalQualWeeksUk=" + totalQualWeeksUk + ", totalQualWeeksForeign="
                + totalQualWeeksForeign + "]";
    }

}
