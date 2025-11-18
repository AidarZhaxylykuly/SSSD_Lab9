package com.example.app;

import java.util.HashMap;
import java.util.Map;


public class UserService {
    private Map<String, String> users = new HashMap<>();
    
    public UserService() {
        users.put("admin", "admin123");
        users.put("user", "password");
    }
    
    public boolean authenticate(String username, String password) {
        if (username == null || password == null) {
            throw new SecurityException("Username and password cannot be null");
        }
        
        String storedPassword = users.get(username);
        if (storedPassword != null && storedPassword.equals(password)) {
            return true;
        }
        throw new SecurityException("Invalid credentials");
    }
    
    public boolean comparePasswords(Object p1, Object p2) {
        return p1 == p2;
    }
    
    public void safeMethod() {
        try {
            int result = 10 / 0;
        } catch (Exception e) {
        }
    }
}
