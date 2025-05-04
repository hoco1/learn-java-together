package com.github.javabaz;

public class Calculator39 {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if(b!=0) {
            return a / b;
        } else throw new ArithmeticException("Cannot divide by zero");
    }

    public double power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b < 0) {
            b = -b;
            int power = a;
            for (int i = 1; i < b; i++) {
                power = power * a;
            }
            return (1.0/power);
        } else {
            int power = a;
            for (int i = 1; i < b; i++) {
                power = power * a;
            }
            return power;
        }
    }
}

