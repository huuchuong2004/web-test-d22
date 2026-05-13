package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.payload.UserCreateRequest;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User userAdd(UserCreateRequest users);
}
