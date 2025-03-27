package com.github.javabaz;

public class Calculator50 {

    // A basic calculator with four main operations


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
        if (b != 0) {
            return a / b;
        } else throw new ArithmeticException("Cannot divide by zero");
    }
}

