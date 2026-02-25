package com.example.vehicleservice.service;

import java.util.List;
import com.example.vehicleservice.entity.User;

public interface UserService {

    User registerUser(User user);
    List<User> getAllUsers();
}