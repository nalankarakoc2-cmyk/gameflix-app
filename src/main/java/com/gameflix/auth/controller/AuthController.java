package com.gameflix.auth.controller;

import com.gameflix.auth.dto.AuthRequest;
import com.gameflix.auth.dto.AuthResponse;
import com.gameflix.auth.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@Valid @RequestBody AuthRequest request) {
        boolean registered = userService.register(request.getUsername(), request.getPassword());

        if (!registered) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(new AuthResponse("Username already exists"));
        }

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new AuthResponse("User registered successfully"));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@Valid @RequestBody AuthRequest request) {
        boolean loggedIn = userService.login(request.getUsername(), request.getPassword());

        if (!loggedIn) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(new AuthResponse("Invalid username or password"));
        }

        return ResponseEntity.ok(new AuthResponse("Login successful"));
    }
}
