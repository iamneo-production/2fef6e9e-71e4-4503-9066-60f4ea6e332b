package com.healthcare.registration.registrationservice.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@RequestMapping("/admin")

public class PatientController {
    @Autowired

    private PatientService patientService;




    @GetMapping

    public String greet(){

        return "Good morning";

    }




    @PostMapping

    public ResponseEntity<Patient> addProduct(@RequestBody Patient patient){

       Patient patient1 = patientService.saveProduct(patient);

       return ResponseEntity.status(HttpStatus.CREATED).body(patient1);

    }

}
    

