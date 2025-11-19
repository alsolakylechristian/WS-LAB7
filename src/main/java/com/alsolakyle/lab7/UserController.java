package com.alsolakyle.lab7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Indicates this class handles REST requests [cite: 177]
@RequestMapping("/api/v1/users") // Sets the base URL endpoint [cite: 182]
public class UserController {

    @GetMapping // Maps HTTP GET requests to this method [cite: 185]
    public User getUser() {
        // Build and return a static user for testing
        return User.builder()
                .username("blueJava")
                .password("thisIsAPassword!")
                .enabled(false)
                .UID(0)
                .build();
    }
}