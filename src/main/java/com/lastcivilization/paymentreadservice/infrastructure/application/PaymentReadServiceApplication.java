package com.lastcivilization.paymentreadservice.infrastructure.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentReadServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentReadServiceApplication.class, args);
	}

}
