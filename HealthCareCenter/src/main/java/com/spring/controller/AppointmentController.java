package com.spring.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import com.spring.model.Appointment;
import com.spring.service.AppointmentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//use appropriate annotation to configure AppointmentController as Controller
@Controller
public class AppointmentController {
	
//	Use appropriate annotation
	@Autowired
	private AppointmentService service;	  	   	      	 	
	
	@GetMapping("/showPage")
	public String showPage(@ModelAttribute("appointment") Appointment appointment) {
		return "showPage";
	}
	
	//invoke the service class - bookAppointment method.
	@PostMapping("/consultation")
	public String bookAppointment(@ModelAttribute("appointment") Appointment appointment, ModelMap model) {		
			int charges = service.bookAppointment(appointment);
			//fill the code
		 	model.addAttribute("message","Thanks for visiting. Your consultation charges is Rs. "+charges);
		return "showPage";
	}
	
	@ModelAttribute("consultationList")
	public ArrayList<String> populateConsultation(){
		ArrayList<String> consultations = new ArrayList<>();
		consultations.add("Optometry");
        consultations.add("Psychology");
        consultations.add("Pediatrist");
        consultations.add("Physical therapy");
        consultations.add("Dentistry");
        return consultations;
	}
	
}
