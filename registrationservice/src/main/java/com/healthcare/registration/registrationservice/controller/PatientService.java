package com.healthcare.registration.registrationservice.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service

public class PatientService {
    @Autowired

    private PatientRepo patientRepo;
    public Patient saveProduct(Patient patient){

        Patient p=patientRepo.save(patient);

        return p;

    }
}
