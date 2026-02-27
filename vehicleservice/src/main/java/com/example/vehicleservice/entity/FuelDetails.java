package com.example.vehicleservice.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class FuelDetails {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long fuleid;
	
	private LocalDate fuleDate;
	private double quantity;
	private double totalCost;
	private double mileage;
	
	@ManyToOne
	@JoinColumn(name="vehicle_id")
	private Vehicle vehicle;

	public Long getFuleid() {
		return fuleid;
	}

	public void setFuleid(Long fuleid) {
		this.fuleid = fuleid;
	}

	public LocalDate getFuleDate() {
		return fuleDate;
	}

	public void setFuleDate(LocalDate fuleDate) {
		this.fuleDate = fuleDate;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	

}
