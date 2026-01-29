package com.spring.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static GoldRateInfo loadGoldRateDetails() {
		ApplicationContext object = new ClassPathXmlApplicationContext("beans.xml");
		return (GoldRateInfo) object.getBean("rateInfoObj");
	}
	
public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	GoldRateInfo obj = loadGoldRateDetails();
	
	System.out.println("Enter the carat:");
	int carat = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter Total Grams:");
	int grams = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Total Gold Rate is Rs:"+obj.calculateGoldRate(carat, grams));
	
}

}
	 	  	    	    		        	 	
