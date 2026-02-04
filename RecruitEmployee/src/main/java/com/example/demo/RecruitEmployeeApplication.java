package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@ComponentScan(basePackages = "com")
//use appropriate annotation
public class RecruitEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecruitEmployeeApplication.class, args);

	}

}
