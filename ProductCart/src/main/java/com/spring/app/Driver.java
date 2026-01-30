package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Cart c = (Cart) context.getBean("cartObj");
		double total = 0;
		for(Product obj: c.getProductList()) {
			total += obj.getPrice();
		}
		System.out.println("Total Price Rs:"+total);		
	}
}
