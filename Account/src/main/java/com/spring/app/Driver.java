package com.spring.app;


 import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.Account;

public class Driver {
	
	
	public static Account loadAccount()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	    return (Account) context.getBean("accountObj");
	}

	public static void main(String[] args) 
	{
		Account obj = loadAccount();
		System.out.println("Account number:"+obj.getAccNumber());
		System.out.println("Account holder name:"+obj.getAccHolderName());
		System.out.println("Balance:"+obj.getAccBalance());
		System.out.println("Loan type:"+obj.getLoanInfo().getLoanType());
		System.out.println("Loan amount:"+obj.getLoanInfo().getLoanAmount());

	}	 	  	    	    		        	 	


}
