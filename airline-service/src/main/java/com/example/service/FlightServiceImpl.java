package com.example.service;

import java.util.List;


import com.example.customer.FlightDetails;
import com.example.repository.FlightRepository;

public interface FlightServiceImpl extends IFlightService {

	public static final FlightRepository repository = null;
	
	@Override
	public default List<FlightDetails> getAllFlights(){
		return repository.findAll();
		}
	
	@Override 
	public default void addFlight(FlightDetails flight, Integer id) {
		flight.setId(id);
		repository.save(flight);
	}
	
	@Override
	public default void deleteFlight(Integer id) {
		repository.deleteById(id);
	}
	
}
