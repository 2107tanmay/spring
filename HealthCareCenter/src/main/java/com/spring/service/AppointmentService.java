package com.spring.service;


import org.springframework.stereotype.Service;

import com.spring.model.Appointment;

//use appropriate annotation to configure ContestantService as a Service
@Service
public class AppointmentService {
	
	
	//Return the consultation charge
	public int bookAppointment(Appointment appointment)  {			
		//fill the code
		String consultation = appointment.getConsultationFor();
		switch(consultation) {
		case "Optometry":
            return 500;
        case "Psychology":
            return 350;
        case "Pediatrist":
            return 750;
        case "Physical therapy":
            return 400;
        case "Dentistry":
            return 450;
        default:
            return 0;
		}
	}

}
