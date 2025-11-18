package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args) {
        logger.info("Starting Security Demo Application");
        
        Calculator calculator = new Calculator();
        UserService userService = new UserService();
        SecurityUtils securityUtils = new SecurityUtils();
        
        int result = calculator.add(10, 5);
        logger.info("Calculator result: {}", result);
        
        try {
            userService.authenticate("admin", "password123");
            logger.info("Authentication successful");
        } catch (SecurityException e) {
            logger.error("Authentication failed: {}", e.getMessage());
        }
        
        String encrypted = securityUtils.encrypt("sensitive data");
        logger.info("Encrypted data: {}", encrypted);
        
        logger.info("Application finished successfully");
    }
}
