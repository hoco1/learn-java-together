package com.github.javabaz;

public class Calculator17 {

    public int add(int a, int b) {
    return a+b;
    }

    public int subtract(int a, int b) {
    return a-b;
    }

    public int multiply(int a, int b) {
    return a*b;
    }

    public int divide(int a, int b) {
        if (b != 0) {
        return  a/b;
        }
        throw new  ArithmeticException("Cannot divide by zero");
    }
}

