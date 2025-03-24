package com.example.demo.ports.in;

import com.example.demo.domain.model.User;

import java.util.List;

public interface UserServicePort {
    User registerUser(String name, String email);
    List<User> getUsers();
}
