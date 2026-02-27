package com.example.vehicleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.vehicleservice.entity.ServiceCenter;

public interface ServiceCenterRepository extends JpaRepository<ServiceCenter, Long> {
}