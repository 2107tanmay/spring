package com.springcore.di;

import org.springframework.stereotype.Component;

@Component //managed bean
//our magic masala the @Component tells our beanfactory like okay bhai this is the classs u shall be ready to manufacture
//as bean factory is like im not stupid to create all the classes in a project 
//in such case we give this specific kind of tag to our class which needs to be handled automatically by bean factory
public class Car {
	public void drive() {
		System.out.println("driving");
	}
}
