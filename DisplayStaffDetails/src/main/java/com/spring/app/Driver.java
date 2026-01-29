package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static Department loadStaffDetails()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		return (Department) context.getBean("departmentObj");
	}

	public static void main(String[] args) {
		Department dept = loadStaffDetails();
		dept.displayStaffDetails();
		
	}

}
