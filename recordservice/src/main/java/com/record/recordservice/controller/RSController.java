package com.record.recordservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.regex.Pattern;
import com.record.recordservice.controller.RSRepo;
// import com.record.recordservice.controller.PatientEntity;  

@RestController
@RequestMapping("/r")
public class RSController {
    @Autowired
    RSRepo r;
    
    @PostMapping("/insert")
    public ResponseEntity<PatientEntity> insert(@RequestBody PatientEntity details) {
        // Optional<Patient> existingPatient = r.findById(patient.getId());
        //      if (existingPatient.isPresent()) {
        //          return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(patient);
        //      } else {
                  PatientEntity savedPatient = r.save(details);
                  return ResponseEntity.status(HttpStatus.CREATED).body(savedPatient);
             //}
    }

}
