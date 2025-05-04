package com.github.javabaz;

public class Calculator22 {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0){
            throw new ArithmeticException("each number divide by zero equal ∞ ");
        }
        return a / b;
    }
}

