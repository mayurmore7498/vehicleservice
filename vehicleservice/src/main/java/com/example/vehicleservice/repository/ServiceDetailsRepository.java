package com.example.vehicleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.vehicleservice.entity.ServiceDetails;

public interface ServiceDetailsRepository extends JpaRepository<ServiceDetails, Long> {
}