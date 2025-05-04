package com.github.javabaz;

public class Calculator07 {

    // NOTE : Don't edit this file!;
    // copy past this file and rename new file with your own code!

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
        if (b == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public double power(int a, int b) {
        return Math.pow(a, b);
    }

    public int mod(int a, int b) {
        return a % b;
    }

    public double sqrt(int a) {
        return Math.sqrt(a);
    }

}

