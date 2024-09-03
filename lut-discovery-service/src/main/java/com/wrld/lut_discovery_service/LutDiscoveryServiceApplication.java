package com.wrld.lut_discovery_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LutDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LutDiscoveryServiceApplication.class, args);
	}

}
