package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.FlightDAO;
import com.spring.model.Flight;


@Service
public class FlightService {
	
	@Autowired
	FlightDAO flightDAO;
	
	public int bookFlight(Integer flightId,Integer bookId,int noOfBookedSeats)
	{
		return flightDAO.bookFlight(flightId, bookId, noOfBookedSeats);
	}
}
