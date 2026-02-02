package com.springcore.core_spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//when u want to make ur life a helll you do this :)

public class CoreSpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml"); 
		//xml is a extensible markup language
		Car car = (Car) context.getBean("car");
		car.drive();	
		
	}

}
