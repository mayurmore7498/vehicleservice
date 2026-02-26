package com.example.vehicleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.vehicleservice.config.JwtUtil;
import com.example.vehicleservice.dto.LoginRequest;
import com.example.vehicleservice.entity.User;
import com.example.vehicleservice.repository.UserRepository;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        User user = userRepository.findByEmail(request.getEmail());

        if (user != null && user.getPassword().equals(request.getPassword())) {
            return jwtUtil.generateToken(user.getEmail());
        } else {
            return "Invalid credentials";
        }
    }
}