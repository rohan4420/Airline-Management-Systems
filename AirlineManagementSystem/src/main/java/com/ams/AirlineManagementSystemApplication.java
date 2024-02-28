package com.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirlineManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlineManagementSystemApplication.class, args);
		int a=2;
		int b=3;
		System.out.println("Testing: c"+a+b);
	}

}
