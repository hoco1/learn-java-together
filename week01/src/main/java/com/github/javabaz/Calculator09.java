package com.github.javabaz;

/**
 * Calculator09 is a basic arithmetic calculator that supports addition, subtraction,
 * multiplication, and division operations. It handles integer values and provides methods
 * for basic arithmetic calculations.
 *
 * <p>
 * This class includes basic operations with error handling for division by zero.
 * It throws an {@link ArithmeticException} if division by zero is attempted.
 * </p>
 *
 * <h3>Usage Example:</h3>
 * <pre>
 * Calculator09 calculator = new Calculator09();
 * int sum = calculator.add(5, 3);           // sum = 8
 * int difference = calculator.subtract(5, 3); // difference = 2
 * int product = calculator.multiply(5, 3);   // product = 15
 * int quotient = calculator.divide(6, 2);    // quotient = 3
 * </pre>
 */
public class Calculator09 {

    /**
     * Calculates the sum of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of the two integers
     * @example <pre>
     * int result = calculator.add(2, 3);  // result = 5
     * </pre>
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts one integer from another.
     *
     * @param a the first integer (minuend)
     * @param b the second integer (subtrahend)
     * @return the result of subtracting b from a
     * @example <pre>
     * int result = calculator.subtract(5, 3);  // result = 2
     * </pre>
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a the first integer (multiplicand)
     * @param b the second integer (multiplier)
     * @return the product of the two integers
     * @example <pre>
     * int result = calculator.multiply(4, 2);  // result = 8
     * </pre>
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides one integer by another.
     *
     * @param a the dividend (numerator)
     * @param b the divisor (denominator)
     * @return the quotient of a divided by b
     * @throws ArithmeticException if b is zero, since division by zero is undefined
     * @example <pre>
     * int result = calculator.divide(6, 2);  // result = 3
     * </pre>
     */
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
