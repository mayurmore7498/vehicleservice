package com.example.vehicleservice.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class ServiceRecord {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long serviceId;
	
	private LocalDate serviceDate;
	private double totalCost;
	
	@ManyToOne
	@JoinColumn(name="vehicle_id")
	private Vehicle vehicle;
	
	@ManyToOne
	@JoinColumn(name="center_id")
	private ServiceCenter serviceCenter;
	
	@OneToMany(mappedBy = "serviceRecord", cascade = CascadeType.ALL)
	private List<ServiceDetails>serviceDetails;

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public LocalDate getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(LocalDate serviceDate) {
		this.serviceDate = serviceDate;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public ServiceCenter getServiceCenter() {
		return serviceCenter;
	}

	public void setServiceCenter(ServiceCenter serviceCenter) {
		this.serviceCenter = serviceCenter;
	}

	public List<ServiceDetails> getServiceDetails() {
		return serviceDetails;
	}

	public void setServiceDetails(List<ServiceDetails> serviceDetails) {
		this.serviceDetails = serviceDetails;
	}
	
	
}
