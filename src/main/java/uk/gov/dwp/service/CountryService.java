package uk.gov.dwp.service;

import java.util.Map;

/**
 * Country Service to fetch countries
 * 
 * @author samba.mitra
 *
 */
public interface CountryService {

    public Map<String, String> populateCountriesWithoutFrozenRate();

    public Map<String, String> populateUsa();

    public Map<String, String> populateAllCountries();

}
