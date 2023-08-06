package com.record.recordservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RecordserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecordserviceApplication.class, args);
	}

}
