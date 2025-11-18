package com.example.app;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class SecurityUtils {
    
    public String weakHash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(input.getBytes());
            return bytesToHex(hash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 not available", e);
        }
    }
    
    private final String ADMIN_PASSWORD = "admin123";
    
    public boolean checkPassword(String input) {
        return input.equals(ADMIN_PASSWORD);
    }
    
    public String encrypt(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }
    
    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
    
    public void processSensitiveData() {
        String sensitive = "very-secret-info";
        System.out.println(sensitive); // Should use logger instead
    }
}
