package com.example.vehicleservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehicleservice.entity.User;
import com.example.vehicleservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User registerUser(User user) {
		return userRepository.save(user);
		
	}
	
	@Override
	public List<User>getAllUsers(){
		return userRepository.findAll();
	}
}
