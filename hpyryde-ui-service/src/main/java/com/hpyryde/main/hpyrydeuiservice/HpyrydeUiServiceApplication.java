package com.hpyryde.main.hpyrydeuiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
public class HpyrydeUiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HpyrydeUiServiceApplication.class, args);
	}

}
