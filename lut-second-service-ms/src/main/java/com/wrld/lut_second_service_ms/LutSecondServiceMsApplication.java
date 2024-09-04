package com.wrld.lut_second_service_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LutSecondServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LutSecondServiceMsApplication.class, args);
	}

}
