package com.github.javabaz;

public class Calculator36 {
	 public int add(int a, int b) {
	        // TODO
	    	return a+b;
	    }

	    public int subtract(int a, int b) {
	    	// TODO
	    	return a-b;
	    }

	    public int multiply(int a, int b) {
	        // TODO
	    	return a*b;
	    }

	    public int divide(int a, int b) {
	        // TODO
	    	try {
	    		return a/b;
	    	}catch(ArithmeticException e) {
	    		// Exception handler
	    		throw new ArithmeticException("Cannot divide by zero");
	    	}
	    }
}
