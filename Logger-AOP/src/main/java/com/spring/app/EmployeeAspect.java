package com.spring.app;



import java.util.*;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
	private static final Logger logger = Logger.getLogger(EmployeeAspect.class);
	@AfterReturning("execution(* com.spring.app.Company.registerEmployee(..))")
	public void logRegistrationStatus(){
		logger.info(new Date() + " : Registration Successful");
	}
}