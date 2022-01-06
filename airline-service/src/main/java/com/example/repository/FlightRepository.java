package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.customer.FlightDetails;

public interface FlightRepository extends JpaRepository<FlightDetails, Integer> {

	
}