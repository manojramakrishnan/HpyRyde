package com.hpyryde.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HpyrydeLocationIngestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HpyrydeLocationIngestServiceApplication.class, args);
	}

}
