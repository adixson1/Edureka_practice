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

import com.example.customer.ReservationDetails;
import com.example.service.IReservationService;

public class ReservationController {

	   @Autowired
	    IReservationService reservationService;
	   
	   @PostMapping("/reservation")
	   @ResponseStatus(code=HttpStatus.CREATED)
	   Integer createReservation(@Valid @RequestBody ReservationDetails reservation) throws Exception {
		   reservationService.save(reservation);
		   return reservation.getId();
	   }
	   
	   @DeleteMapping("/reservation/{id}")
	   void deleteReservation(@PathVariable Integer id) {
		   reservationService.deleteReservation(id);
	   }
	   
	   @PutMapping("/reservation/{id}")
	   void updateReservation(@RequestBody ReservationDetails reservation, @PathVariable Integer id) {
		   reservationService.updateReservation(reservation, id);
	   }
	   
	   @GetMapping("/reservation")
	   List<ReservationDetails> getAllReservations(){
		   return reservationService.getAllReservations();
	   }
}
