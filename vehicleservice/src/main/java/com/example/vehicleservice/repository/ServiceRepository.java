package com.example.vehicleservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vehicleservice.entity.ServiceRecord;

public interface ServiceRepository extends JpaRepository<ServiceRecord, Long>{
	
	List<ServiceRecord>findByVehicleVehicleId(Long vehicleId);
	

}
