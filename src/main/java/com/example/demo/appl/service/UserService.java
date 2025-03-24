package com.example.demo.appl.service;

import com.example.demo.domain.model.User;
import com.example.demo.ports.in.UserServicePort;
import com.example.demo.ports.out.UserRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServicePort {
    private final UserRepositoryPort userRepository;

    public UserService(UserRepositoryPort userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(String name, String email) {
        return userRepository.save(new User(null, name, email));
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
