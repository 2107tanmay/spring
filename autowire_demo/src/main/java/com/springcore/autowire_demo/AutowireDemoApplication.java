package com.springcore.autowire_demo;
import vehicle.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import vehicle.Car;

@SpringBootApplication
@ComponentScan("vehicle, engine") //we needed to do this as the packages are out of this scope
public class AutowireDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AutowireDemoApplication.class, args);
		Car car = context.getBean(Car.class);
		car.drive();
	}

}
