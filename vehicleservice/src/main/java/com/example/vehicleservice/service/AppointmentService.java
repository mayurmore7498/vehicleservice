package com.example.vehicleservice.service;

import java.util.List;

import com.example.vehicleservice.entity.Appointment;

public interface AppointmentService {
	
	Appointment bookAppointment(Appointment appointment);
	List<Appointment>getAppointmentByUser(Long userId);

}
