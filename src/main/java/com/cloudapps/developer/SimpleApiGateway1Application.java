package com.cloudapps.developer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SimpleApiGateway1Application {

	public static void main(String[] args) {
		SpringApplication.run(SimpleApiGateway1Application.class, args);
	}

}
