package com.gameflix.auth.service;

import com.gameflix.auth.model.User;
import com.gameflix.auth.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public boolean register(String username, String password) {
        String cleanUsername = username.trim();

        if (userRepository.existsByUsername(cleanUsername)) {
            return false;
        }

        String hashedPassword = passwordEncoder.encode(password);
        User user = new User(cleanUsername, hashedPassword);
        userRepository.save(user);
        return true;
    }

    public boolean login(String username, String password) {
        String cleanUsername = username.trim();

        return userRepository.findByUsername(cleanUsername)
                .map(user -> passwordEncoder.matches(password, user.getPassword()))
                .orElse(false);
    }
}
