package com.github.javabaz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Calculator36Test {
    // Unit Test Specifications for Calculator36
	
    private Calculator36 calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator36();
    }
    
    @Test
    void testPow() {
    	assertEquals(9,calculator.pow(3,2),"3^2 should be 9");
    	assertEquals(512,calculator.pow(2,3,2),"2^(3^2) should be 512");
    	assertEquals(0,calculator.pow(0,2),"2^0 should be 0");
    }
    
    @Test
    void testSqrt() {
    	assertEquals(3,calculator.sqrt(9),"sqrt(9) should be 3");
    	assertEquals(8,calculator.sqrt(64),"sqrt(64) should be 8");
    	assertEquals(2.23606797749979,calculator.sqrt(5),"sqrt(5) should be 2.23606797749979");
    }
    
    @Test
    void testMod() {
    	assertEquals(2,calculator.mod(20,6),"20%6 should be 2");
    	assertEquals(0,calculator.mod(0,6),"0%6 should be 0");
    	assertEquals(2,calculator.mod(20,6,4),"(20%6)%4=2%4 should be 2");
    }
    
    @Test
    void testSqrtByNegative() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.sqrt(-5));
        assertEquals("Cannot calculate the square root of a negative number.", exception.getMessage());
    }
    
    @Test
    void testModuloByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.mod(5, 0));
        assertEquals("Cannot modulus by zero.", exception.getMessage());
    }
    
    @Test
    void testDefaultMinArgs() {
    	Exception exception = assertThrows(IllegalArgumentException.class,() -> calculator.execute("add",1));
    	assertEquals("Insufficient operands. Minimum required: " + calculator.getMinArgs(), exception.getMessage());
    }
    
    @Test
    void testSqrtMinArgs() {
    	Exception exception = assertThrows(IllegalArgumentException.class,() -> calculator.execute("sqrt",7,8));
    	assertEquals("Maximum number of required operands: 1", exception.getMessage());
    }
    
    @Test
    void testMethodNotFound() {
    	String operation = "fsdf";
    	Exception exception = assertThrows(UnsupportedOperationException.class,() -> calculator.execute(operation,7,8));
    	assertEquals("Operation not supported: " + operation, exception.getMessage());
    }
    
    @Test
    void testExecute() {
    	assertEquals(8, calculator.execute("add",5,3), "5 + 3 should be 8");
    	assertEquals(2, calculator.execute("subtract",5, 3), "5 - 3 should be 2");
    	assertEquals(15, calculator.execute("multiply",5, 3), "5 * 3 should be 15");
    	assertEquals(2, calculator.execute("divide",6, 3), "6 / 3 should be 2");
    	assertEquals(9,calculator.execute("pow",3,2),"3^2 should be 9");
    	assertEquals(3,calculator.execute("sqrt",9),"sqrt(9) should be 3");
    	assertEquals(2,calculator.execute("mod",20,6),"20%6 should be 2");
    }
}
