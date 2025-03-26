package com.github.javabaz;

public class Calculator09 {

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
        if (b == 0) {
            throw new ArithmeticException("خطا: تقسیم بر صفر مجاز نیست!");
        }
        return a / b;
    }
}

