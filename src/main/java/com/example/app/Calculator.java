package com.example.app;


public class Calculator {
    
    public int add(Integer a, Integer b) {
        return a + b; // This may cause NPE
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }
    
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) a / b;
    }
    
    private void unusedMethod() {
        System.out.println("This method is never used");
    }
}
