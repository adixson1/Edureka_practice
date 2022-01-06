package com.example.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.customer.FlightDetails;
import com.example.service.IFlightService;

public class FlightController {
	
	@Autowired
	IFlightService flightService;
	
	@PostMapping("/flight")
	@ResponseStatus(code=HttpStatus.CREATED)
	Integer createFlight(@Valid @RequestBody FlightDetails flight) throws Exception{
		flightService.save(flight);
		return flight.getId();
	}
	
	@DeleteMapping("/flight/{id}")
	void deleteFlight(@PathVariable Integer id) {
		flightService.deleteFlight(id);
	}
	
	@PutMapping("/flight/{id}")
	void addFlight(@RequestBody FlightDetails flight, @PathVariable Integer id) {
		flightService.addFlight(flight, id);
	}
	
	@GetMapping("/flight")
	List<FlightDetails> getAllFlights(){
		return flightService.getAllFlights();
	}
}