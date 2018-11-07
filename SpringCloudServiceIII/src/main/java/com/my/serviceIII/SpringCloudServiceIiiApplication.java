package com.my.serviceIII;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudServiceIiiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceIiiApplication.class, args);
	}
}
