package com.gameflix.auth.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void registerNewUser_ShouldReturnTrue() {
        boolean result = userService.register("john123", "password123");
        Assertions.assertTrue(result);
    }

    @Test
    void registerDuplicateUser_ShouldReturnFalse() {
        userService.register("duplicateUser", "password123");

        boolean result = userService.register("duplicateUser", "password123");

        Assertions.assertFalse(result);
    }

    @Test
    void loginWithCorrectPassword_ShouldReturnTrue() {
        userService.register("loginUser", "mypassword");

        boolean result = userService.login("loginUser", "mypassword");

        Assertions.assertTrue(result);
    }

    @Test
    void loginWithWrongPassword_ShouldReturnFalse() {
        userService.register("user1", "password123");

        boolean result = userService.login("user1", "wrongpassword");

        Assertions.assertFalse(result);
    }
}