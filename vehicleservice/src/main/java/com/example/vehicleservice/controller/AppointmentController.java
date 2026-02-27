package com.example.vehicleservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.vehicleservice.entity.Appointment;
import com.example.vehicleservice.service.AppointmentService;

@RestController
@RequestMapping("/api/appointments")
@CrossOrigin("*")
public class AppointmentController {
	
	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping
	public Appointment bookAppointment( @RequestBody Appointment  appointment) {
		return appointmentService.bookAppointment(appointment);
	}
	
	@GetMapping("/user/{userId}")
	public List<Appointment> getAppointmentByUser(@PathVariable Long userId){
		return appointmentService.getAppointmentByUser(userId);
	}

}
