package com.ty.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AddressMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressMicroApplication.class, args);
	}

}
