package com.github.javabaz;

/*
 * Calculator47 is a basic arithmetic calculator that provides methods for
 * performing addition, subtraction, multiplication, division, exponentiation,
 * modulus, and square root calculations.
 * */

public class Calculator47 {

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
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public int pow(int a, int b) {
        int ans = 1;
        for (int i = 0; i < b; i++) {
            ans = ans * a;

        }
        return ans;
    }

    public int mod(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        int ans = a;
        while (ans >= b) {
            ans = ans - b;
        }
        return ans;
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
