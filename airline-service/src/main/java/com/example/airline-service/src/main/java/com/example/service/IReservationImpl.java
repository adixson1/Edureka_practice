package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.customer.ReservationDetails;
import com.example.repository.ReservationRepository;

public class IReservationImpl implements IReservationService {

	@Autowired
	ReservationRepository repository;
	
	@Override
	public String save(ReservationDetails reservation) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReservationDetails> getAllReservations() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void updateReservation(ReservationDetails reservation, Integer id) {
		reservation.setId(id);
		repository.save(reservation);
	}

	@Override
	public void deleteReservation(Integer id) {
		repository.deleteById(id);

	}

}
