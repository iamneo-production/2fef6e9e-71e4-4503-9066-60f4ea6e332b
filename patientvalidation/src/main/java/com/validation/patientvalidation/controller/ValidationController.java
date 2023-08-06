package com.validation.patientvalidation.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/v")
public class ValidationController {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
    private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=])[A-Za-z\\d@#$%^&+=]{8,}$";
    private static final String NAME_REGX ="^[A-Za-z ]+$";
    private static final String WEIGHT_REGEX = "^(\\d{1,3}(\\.\\d{1,2})?|1000(\\.0{1,2})?)$";
    private static final String AGE_REGEX = "^(?:[1-9][0-9]?|1[01][0-9]|120)$";

    @PostMapping("/validation")
    public String validatePatientRegistration(@RequestBody PatientPojo registrationData) {
        System.out.println("Started");
        if (isValid(registrationData)) {
            return "Registration data is valid";
        } else {
            return "Invalid registration data";
        }
    }

    private boolean isValid(PatientPojo registrationData) {
        return isValidField(registrationData.getMail(), EMAIL_REGEX)
                && isValidField(registrationData.getPassword(), PASSWORD_REGEX)
                && isValidField(String.valueOf(registrationData.getAge()), AGE_REGEX)
                && isValidField(String.valueOf(registrationData.getWeight()), WEIGHT_REGEX)
                && isValidField(registrationData.getName(),NAME_REGX)
                && isValidAddress(registrationData.getAddress());
    }
    private boolean isValidField(String fieldValue, String regexPattern) {
        System.out.println("Started field");
        return fieldValue != null && Pattern.matches(regexPattern, fieldValue);
    }
    private boolean isValidAddress(String ad) {
        return ad != null && !ad.isEmpty();
    }

}
