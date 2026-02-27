package com.example.vehicleservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.vehicleservice.entity.ServiceCenter;
import com.example.vehicleservice.repository.ServiceCenterRepository;

@RestController
@RequestMapping("/api/service-centers")
@CrossOrigin
public class ServiceCenterController {
	
	@Autowired
	private ServiceCenterRepository serviceCenterRepository;
	
	@PostMapping
	public ServiceCenter addServiceCenter(@RequestBody ServiceCenter center) {
		return serviceCenterRepository.save(center);
	}
	
	@GetMapping
	public List<ServiceCenter>getAllCenters(){
		return serviceCenterRepository.findAll();
	}

}
