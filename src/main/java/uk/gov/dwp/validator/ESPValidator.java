package uk.gov.dwp.validator;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import uk.gov.dwp.model.ESPDetails;
import uk.gov.dwp.model.ESPRecord;

/**
 * Custom validator for ESP data
 * 
 * @author samba.mitra
 *
 */
@Component
public class ESPValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return ESPDetails.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ESPDetails espDetails = (ESPDetails) target;

        List<ESPRecord> espRecords = espDetails.getListOfEspRecords();

        // int noOfRecs = 0;
        for (ESPRecord rec : espRecords) {
            if (StringUtils.isBlank(rec.getNspEspAmount())) {
                // errors.rejectValue("listOfEspRecords[" + noOfRecs +
                // "].nspEspAmount", "NotEmpty.espDetails.nspEspAmount");
            }
            // noOfRecs++;
        }
    }

}
