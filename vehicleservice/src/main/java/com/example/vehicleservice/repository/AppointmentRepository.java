package com.example.vehicleservice.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.vehicleservice.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findByUserUserId(Long userId);
    List<Appointment> findByVehicleVehicleId(Long vehicleId);
}