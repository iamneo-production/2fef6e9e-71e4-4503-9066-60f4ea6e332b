package com.healthcare.registration.registrationservice.feignclient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.healthcare.registration.registrationservice.controller.Patient;

@FeignClient("VALIDATION-SERVICE")
public interface ValidationInf {

	@GetMapping("/v/validation")
    public String feignmethod(Patient p) ;

	// @GetMapping("/client1/retry")
	// String retry();

}
