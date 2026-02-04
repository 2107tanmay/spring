package com.validate;
import com.model.Candidate;

import org.springframework.validation.Validator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
@Component
public class CustomValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Candidate.class.equals(clazz);
    }
    
    @Override
	public void validate(Object arg0,Errors arg1) {
		Candidate candidate = (Candidate) arg0;
		String name = candidate.getCandidateName();
		
		if (name != null && !name.matches("[A-Za-z ]{3,10}")) {
	            arg1.rejectValue("candidateName", "candidateName.invalid",
	                    "Name should contain only alphabets and space min 3 chars and max 10 chars");
	       }
		else if(name == null || name.trim().isEmpty()) {
			 arg1.rejectValue("candidateName", "candidateName.invalid",
	                    "Name cannot be blank");
		}
		
		String contact = candidate.getContactNumber();
        if (contact != null && !contact.matches("[6-9][0-9]{9}")) {
            arg1.rejectValue("contactNumber", "contactNumber.invalid",
                    "Contact Number should be of 10 digits/Contact Number should start with range 6 to 9");
        }
        else if(contact == null || contact.trim().isEmpty()) {
        	arg1.rejectValue("contactNumber", "contactNumber.invalid",
                    "Contact Number should not be blank");
        }
		//fill code to do validation for candidate name and contact number
 	}

}
