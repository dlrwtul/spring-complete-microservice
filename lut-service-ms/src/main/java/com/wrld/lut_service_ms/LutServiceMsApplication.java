package com.wrld.lut_service_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LutServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LutServiceMsApplication.class, args);
	}

}
