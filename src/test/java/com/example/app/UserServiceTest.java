package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    
    private UserService userService = new UserService();
    
    @Test
    public void testSuccessfulAuthentication() {
        assertTrue(userService.authenticate("admin", "admin123"));
    }
    
    @Test
    public void testFailedAuthentication() {
        assertThrows(SecurityException.class, () -> {
            userService.authenticate("admin", "wrongpassword");
        });
    }
    
    @Test
    public void testNullCredentials() {
        assertThrows(SecurityException.class, () -> {
            userService.authenticate(null, "password");
        });
    }
}
