package com.example.demo.adapters.in.web;

import com.example.demo.domain.model.User;
import com.example.demo.ports.in.UserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserServicePort userService;

    public UserController(UserServicePort userService) {
        this.userService = userService;
    }

    @PostMapping("")
    public User registerUser(@RequestParam String name, @RequestParam String email) {
        return userService.registerUser(name, email);
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
