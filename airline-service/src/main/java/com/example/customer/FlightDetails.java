package com.example.customer;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class FlightDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	
	private Integer flightNumber;
    private String operatingAirlines;
    private String departureCity;
    private String arrivalCity;
    private Date dateOfDeparture;
    private Integer estimatedDepartureTime;
    private Integer estimatedArrivalTime;
    private String flightType;
    
    public Integer getId() {
		return id;
	}
	public Integer getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(Integer flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperatingAirlines() {
		return operatingAirlines;
	}
	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
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
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public Integer getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}
	public void setEstimatedDepartureTime(Integer estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
	public Integer getEstimatedArrivalTime() {
		return estimatedArrivalTime;
	}
	public void setEstimatedArrivalTime(Integer estimatedArrivalTime) {
		this.estimatedArrivalTime = estimatedArrivalTime;
	}
	public String getFlightType() {
		return flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}
}
