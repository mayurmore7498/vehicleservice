package com.example.vehicleservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vehicleservice.entity.FuelDetails;

public interface FuelRepository extends JpaRepository<FuelDetails,Long> {
	
	List<FuelDetails> findByVehicleVehicleId(Long vehicleId);

}
