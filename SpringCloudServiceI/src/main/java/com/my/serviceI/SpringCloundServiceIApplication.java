package com.my.serviceI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloundServiceIApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloundServiceIApplication.class, args);
	}
}
