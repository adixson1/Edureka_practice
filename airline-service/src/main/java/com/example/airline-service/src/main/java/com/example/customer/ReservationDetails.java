package com.example.customer;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ReservationDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Integer checkedInTime;
    private Integer numberOfBags;
    private String airline;
    private String departureCity;
    private String arrivalCity;
    private Date departureDate;
    private Date arrivalDate;
    
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCheckedInTime() {
		return checkedInTime;
	}
	public void setCheckedInTime(Integer checkedInTime) {
		this.checkedInTime = checkedInTime;
	}
	public Integer getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(Integer numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
   
    
}
