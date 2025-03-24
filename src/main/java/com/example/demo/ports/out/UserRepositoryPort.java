package com.example.demo.ports.out;

import com.example.demo.domain.model.User;

import java.util.List;

public interface UserRepositoryPort {
    User save(User user);
    List<User> findAll();
}
