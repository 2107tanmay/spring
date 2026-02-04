package com.validate;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.model.RegistrationBean;

@Component
public class CustomValidator implements Validator{
	
	private static final String EMAIL_REGEX ="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	
	@Override
	public void validate(Object arg0, Errors arg1) {
		
		 RegistrationBean bean = (RegistrationBean) arg0;
		 
		 if(bean.getUserName() == null || bean.getUserName().trim().isEmpty()) arg1.rejectValue("userName","", "User Name cannot be blank");
		 
		 String contact = String.valueOf(bean.getContactNumber());
		 if(bean.getContactNumber() ==0 ) {
			 arg1.rejectValue("contactNumber","", "Contact Number should not be blank" );
		 }
		 else if(contact.length()!=10) {
			 arg1.rejectValue("contactNumber", "", "Contact Number should be of 10 digits");
		 }
		
		 if(bean.getEmailId() == null || bean.getEmailId().trim().isEmpty()) arg1.rejectValue("emailId", "", "Email ID cannot be blank");
		 else if(!Pattern.matches(EMAIL_REGEX, bean.getEmailId())) {
			 arg1.rejectValue("emailId", "", "Should be a proper email ID format");
		 }
		 
		 if(bean.getConfirmEmailId() == null || bean.getConfirmEmailId().trim().isEmpty()) {
			 arg1.rejectValue("confirmEmailId", "", "Confirm Email ID cannot be blank");
		 }
		 else if(!Pattern.matches(EMAIL_REGEX, bean.getConfirmEmailId())) {
			 arg1.rejectValue("confirmEmailId", "", "Should be a proper email ID format");
		 }
		 else if(!bean.getEmailId().equals(bean.getConfirmEmailId())) {
			 arg1.rejectValue("confirmEmailId", "", "Email and Confirm Email should be same");
		 }
		 
		 if(!bean.isStatus()) {
			 arg1.rejectValue("status", "", "please agree to the terms and conditions");
		 }
	}

	public boolean supports(Class<?> arg0) {
		return RegistrationBean.class.equals(arg0);
	}
	

}
