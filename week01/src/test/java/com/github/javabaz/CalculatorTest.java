package com.github.javabaz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    private Calculator41 calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator41();
    }

    @Test
    void testAddition() {
        assertEquals(8, calculator.add(5, 3), "5 + 3 should be 8");
        assertEquals(-2, calculator.add(-5, 3), "-5 + 3 should be -2");
        assertEquals(0, calculator.add(0, 0), "0 + 0 should be 0");
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3), "5 - 3 should be 2");
        assertEquals(-8, calculator.subtract(-5, 3), "-5 - 3 should be -8");
        assertEquals(0, calculator.subtract(3, 3), "3 - 3 should be 0");
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calculator.multiply(5, 3), "5 * 3 should be 15");
        assertEquals(-15, calculator.multiply(-5, 3), "-5 * 3 should be -15");
        assertEquals(0, calculator.multiply(0, 3), "0 * 3 should be 0");
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3), "6 / 3 should be 2");
        assertEquals(-2, calculator.divide(-6, 3), "-6 / 3 should be -2");
        assertEquals(0, calculator.divide(0, 5), "0 / 5 should be 0");
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    void testPower() {
        assertEquals(8, calculator.power(2, 3), "2 ^ 3 should be 8");
        assertEquals(5, calculator.power(5, 1), "5 ^ 1 should be 5");
        assertEquals(1, calculator.power(3, 0), "3 ^ 0 should be 1");
        assertEquals(0, calculator.power(0, 1), "0 ^ 1 should be 0");
    }

    @Test
    void testModulus() {
        assertEquals(-1, calculator.modulus(-10, 3), "-10 % 3 should be -1");
        assertEquals(3, calculator.modulus(15, 4), "15 % 4 should be 3");
        assertEquals(1, calculator.modulus(10, -3), "10 % -3 should be 1");
    }

    @Test
    void testSquareRoot() {
        assertEquals(5, calculator.squareRoot(25), "√25 should be 5");
        assertEquals(1, calculator.squareRoot(1), "√1 should be 1");
        assertEquals(2, calculator.squareRoot(4), "√4 should be 2");
        assertEquals(0, calculator.squareRoot(0), "√0 should be 0");
    }
}