package com.hpyryde.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HpyrydeDispatchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HpyrydeDispatchServiceApplication.class, args);
	}

}
