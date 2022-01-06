package com.example.service;

import java.util.List;

import com.example.customer.ReservationDetails;

public interface IReservationService {

	String save(ReservationDetails reservation) throws Exception;
	
	List<ReservationDetails> getAllReservations();
	
	void updateReservation(ReservationDetails reservation, Integer id);
	
	void deleteReservation(Integer id);
}
