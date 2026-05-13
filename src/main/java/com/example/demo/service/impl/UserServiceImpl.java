package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.payload.UserCreateRequest;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User userAdd(UserCreateRequest users) {
        User userAdd = new User();

        if (users.getName()==null) {
            throw new IllegalArgumentException("Name cannot be null");
        }

        if (users.getPhone()==0) {
            throw new IllegalArgumentException("Phone cannot be zero");
        }
        userAdd.setName(users.getName());
        userAdd.setPhone(users.getPhone());
        return userRepository.save(userAdd);
    }
}
