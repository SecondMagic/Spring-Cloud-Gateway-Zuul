package com.service.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloundServiceCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloundServiceCenterApplication.class, args);
	}
}
