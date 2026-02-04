package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Company;
import com.model.Employee;

//include the required annotation to make EmployeeRestController as RestController
@RestController
public class EmployeeRestController {
		@Autowired
		private Company company;
	
		@GetMapping("/employees")
	 	public  List<Employee> getAllEmployees() 
	    {
	        //Include the required business logic to return the list of employees
			
	        return company.getEmpList();
	         
	     }
	     
}
