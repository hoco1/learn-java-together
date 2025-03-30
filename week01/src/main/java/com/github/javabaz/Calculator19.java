package com.github.javabaz;

public class Calculator19 {


    public int add(int a, int b) {
        if ((b > 0 && a > Integer.MAX_VALUE - b) || (b < 0 && a < Integer.MIN_VALUE - b)) {
            throw new MathOverflowUnderflowException("Overflow or Underflow in addition!");
        }
        return a + b;
    }

    public int subtract(int a, int b) {
        if ((b < 0 && a > Integer.MAX_VALUE + b) || (b > 0 && a < Integer.MIN_VALUE + b)) {
            throw new MathOverflowUnderflowException("Overflow or Underflow in subtraction!");
        }
        return a - b;
    }

    public int multiply(int a, int b) {
        if (a > 0 && b > 0 && a > Integer.MAX_VALUE / b) {
            throw new MathOverflowUnderflowException("Overflow in multiplication!");
        }
        if (a < 0 && b < 0 && a < Integer.MAX_VALUE / b) {
            throw new MathOverflowUnderflowException("Overflow in multiplication!");
        }
        if (a > 0 && b < 0 && b < Integer.MIN_VALUE / a) {
            throw new MathOverflowUnderflowException("Underflow in multiplication!");
        }
        if (a < 0 && b > 0 && a < Integer.MIN_VALUE / b) {
            throw new MathOverflowUnderflowException("Underflow in multiplication!");
        }
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            return a / b;
        }
    }

    public int pow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            if (a > 0 && result > Integer.MAX_VALUE / a) {
                throw new MathOverflowUnderflowException("Overflow in exponentiation!");
            }
            if (a < 0 && result < Integer.MIN_VALUE / a) {
                throw new MathOverflowUnderflowException("Underflow in exponentiation!");
            }
            result *= a;
        }
        return result;
    }

    public int mod(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot take modulus by zero");
        }
        return a % b;
    }

    public int sqrt(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number!");
        }
        int i = 1;
        while (i <= a / i) {
            i++;
        }
        return i;
    }
}

