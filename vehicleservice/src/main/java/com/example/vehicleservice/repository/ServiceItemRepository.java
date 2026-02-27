package com.example.vehicleservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vehicleservice.entity.ServiceItem;

public interface ServiceItemRepository extends JpaRepository<ServiceItem ,Long> {
	
	List<ServiceItem>findByServiceCenterCenterId(Long CenterId);

}
