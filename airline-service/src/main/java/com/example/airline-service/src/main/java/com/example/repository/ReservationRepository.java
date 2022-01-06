package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.customer.ReservationDetails;

public interface ReservationRepository extends JpaRepository<ReservationDetails, Integer> {

}
