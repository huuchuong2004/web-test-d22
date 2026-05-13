package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.payload.UserCreateRequest;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User addUsers(@RequestBody UserCreateRequest users) {
        return userService.userAdd(users);
    }


}
