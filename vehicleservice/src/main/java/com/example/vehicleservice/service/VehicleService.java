package com.example.vehicleservice.service;

import java.util.List;

import com.example.vehicleservice.entity.Vehicle;

public interface VehicleService {
	
	Vehicle  addVehicle(Vehicle vehicle);
	List<Vehicle>getVehiclesByUser(Long userID);

}
