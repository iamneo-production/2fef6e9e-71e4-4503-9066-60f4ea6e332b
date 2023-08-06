package com.healthcare.registration.registrationservice.feignclient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;

import com.healthcare.registration.registrationservice.controller.Patient;

@FeignClient("RECORD-SERVICE")
public interface RSInf {

	@GetMapping("/r/insert")
    public ResponseEntity<Patient> insertproxy (Patient p) ;

}
