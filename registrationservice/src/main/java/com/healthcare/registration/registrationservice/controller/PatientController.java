package com.healthcare.registration.registrationservice.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import com.healthcare.registration.registrationservice.feignclient.ValidationInf;
import com.healthcare.registration.registrationservice.feignclient.RSInf;
@RestController
@RequestMapping("/admin")

public class PatientController {

    @Autowired
	ValidationInf v;

    @Autowired
	RSInf r;

<<<<<<< HEAD
    // @GetMapping("/greet")
    // public String greet(){
    //     return "Good morning";
    // }
=======
    @GetMapping("/greet")
    public String greet(){
        return "Good morning";
    }
>>>>>>> aa0b1a1ceea161499d6b4a5fa0e5d187a0f4cd7a

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Patient patient) 
    {
        String response = v.feignmethod(patient);
        if (response.equals("Registration data is valid")) {

            ResponseEntity<Patient> result =r.insertproxy(patient);
            return result;
            
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid registration data. Please enter correct details.");
    }
}


}
    

