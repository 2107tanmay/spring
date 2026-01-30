package com.spring.app;

import java.util.*;
import org.apache.log4j.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class BankAspect {
	final static Logger logger = Logger.getLogger(BankAspect.class);

	@Around("execution(* com.spring.app.Bank.withDraw(..))") //each full stop signifies a variable
	public Object logTransactionStatus(ProceedingJoinPoint pjp) throws Throwable {
		
		try {
			logger.info(new Date()+" Before Method Called"); //works before
			Object result = pjp.proceed();
			logger.info("status"+result); //works after
			return result;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

	
}