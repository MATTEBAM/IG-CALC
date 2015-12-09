package uk.gov.dwp.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Constants class
 * 
 * @author samba.mitra
 *
 */
public class Constants {

    public static final Map<String, Map<String, Double>> RRE_AMOUNTS = new HashMap<>();
    public static final Map<String, Double> RRE_AMOUNT_2016_17 = new HashMap<>();

    // Yes/No
    public static final String YES = "Yes";
    public static final String NO = "No";

    // DateFormat
    public static final String DATE_FORMAT = "dd/MM/yyyy";
    public static final String POST_2016 = "Post 2016";
    public static final String PRE_2016 = "Pre 2016";

    // Countries
    public static final String COUNTRIES = "countries";
    public static final String COUNTRIES_WITHOUT_FROZEN_RATE = "countriesWithoutFrozenRate";
    public static final String COUNTRIES_USA = "countriesUsa";

    // Model/Session Attributes
    public static final String CUSTOMER_DETAILS = "customerDetails";
    public static final String PARTNER_DETAILS = "partnerDetails";
    public static final String PRE_75_EU_DETAILS = "pre75EuDetails";
    public static final String POST_75_EU_DETAILS = "post75EuDetails";
    public static final String POST_16_EU_DETAILS = "post16EuDetails";
    public static final String PRE_75_RA_DETAILS = "pre75RaDetails";
    public static final String POST_75_RA_DETAILS = "post75RaDetails";
    public static final String POST_16_RA_DETAILS = "post16RaDetails";
    public static final String PRE_75_USA_DETAILS = "pre75UsaDetails";
    public static final String POST_75_USA_DETAILS = "post75UsaDetails";
    public static final String POST_16_USA_DETAILS = "post16UsaDetails";
    public static final String NSP_DETAILS = "nspDetails";
    public static final String ESP_DETAILS = "espDetails";
    public static final String RRE_DETAILS = "rreDetails";
    public static final String INHERITED_DETAILS = "inheritedDetails";

    // Marital Status
    public static final String MARITAL_STATUS_MARRIED = "Married";
    public static final String MARITAL_STATUS_DIVORCED = "Divorced";
    public static final String MARITAL_STATUS_SINGLE = "Single";
    public static final String MARITAL_STATUS_WIDOW = "Widow";
    public static final String MARITAL_STATUS_WIDOWER = "Widower";
    public static final String MARITAL_STATUS_SURVIVINGPARTNER = "SurvivingPartner";

    // RRE Rates
    public static final String RRE_HIGHER = "Higher";
    public static final String RRE_LOWER = "Lower";

    // Uprating years
    public static final String YEAR_2016_17 = "2016/17";
    public static final String YEAR_2017_18 = "2017/18";
    public static final String YEAR_2018_19 = "2018/19";
    public static final String YEAR_2019_20 = "2019/20";

    // Populate RRE static data
    static {
        RRE_AMOUNT_2016_17.put(RRE_HIGHER, 115.95);
        RRE_AMOUNT_2016_17.put(RRE_LOWER, 69.50);
        RRE_AMOUNTS.put(YEAR_2016_17, RRE_AMOUNT_2016_17);
    }

    private Constants() {
        // private constructor to hide the implicit public one
    }

}
