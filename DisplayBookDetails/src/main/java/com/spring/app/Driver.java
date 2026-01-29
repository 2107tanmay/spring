package com.spring.app;

import java.beans.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static Order loadBookDetails() {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		return context.getBean(Order.class);
	}

	public static void main(String[] args) {
		//fill the code
		Order obj =loadBookDetails();
		obj.displayOrderDetails();
	}

}
