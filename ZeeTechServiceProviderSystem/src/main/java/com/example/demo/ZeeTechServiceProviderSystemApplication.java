package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.controller com.service")
public class ZeeTechServiceProviderSystemApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ZeeTechServiceProviderSystemApplication.class, args);
	
	}
}
