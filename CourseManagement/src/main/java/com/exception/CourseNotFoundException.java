package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//include the appropriate annotation to change the status
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CourseNotFoundException extends Exception
{
	//include a one argument constructor of type String and write the code 
	//to pass the message to the super class
	public CourseNotFoundException(String message) {
		super(message);
	}
}
