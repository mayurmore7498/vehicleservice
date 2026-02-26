package com.example.vehicleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.vehicleservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}