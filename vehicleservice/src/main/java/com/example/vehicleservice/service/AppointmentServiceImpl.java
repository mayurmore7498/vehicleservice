package com.example.vehicleservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehicleservice.entity.Appointment;
import com.example.vehicleservice.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Override
	public Appointment bookAppointment(Appointment appointment) {
	        appointment.setStatus("Pending");
	        return appointmentRepository.save(appointment);
	} 
	
	@Override
	public List<Appointment>getAppointmentByUser(Long userId)
	{
	return appointmentRepository.findByUserUserId(userId);
}
}
