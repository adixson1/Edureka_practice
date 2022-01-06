package com.example.service;

import java.util.List;

import com.example.customer.FlightDetails;

public interface IFlightService {
	String save(FlightDetails flight) throws Exception;

	List<FlightDetails> getAllFlights();
	//2

	void addFlight(FlightDetails flight, Integer id);

	void deleteFlight(Integer id);
}
