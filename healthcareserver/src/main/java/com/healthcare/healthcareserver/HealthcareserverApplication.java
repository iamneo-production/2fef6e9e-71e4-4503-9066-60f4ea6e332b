package com.healthcare.healthcareserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class HealthcareserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcareserverApplication.class, args);
	}

}
