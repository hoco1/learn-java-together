package com.github.javabaz;
/** 
 * Calculator 36 is a boot camp exercise involving basic and 
 * advanced arithmetic operations such as addition, subtraction, multiplication, division, modulus, power, and square root.
 * The primary entry point is the `execute` method, which manages input validation and dispatches,
 * The appropriate operation is based on the provided string identifier.
 * While helper methods (e.g., add, subtract, power) are public for testing purposes,
 * They are intended to be used internally through `execute` to ensure consistent validation.
*/


public class Calculator36 {
	private final int minArgs=2;
	
	public double execute(String operation,double... operands) {
		/**
		 * Executes the specified operation with the given operands.
		 * This method acts as a centralized dispatcher, handling validation
		 * of operand counts and delegating to the appropriate computation method.
		 * 
		 * @param operation the operation to perform (e.g., "add", "subtract", "pow")
		 * @param operands the numbers to use in the operation
		 * @return the result of the operation
		 * @throws IllegalArgumentException if the number of operands is invalid
		 * @throw UnsupportedOperationException if the operation is not recognized
		 */
		switch(operation) {
		case "pow":
			if(operands.length<minArgs) {
				throw new IllegalArgumentException("Insufficient operands. Minimum required: " + minArgs);
			}
			return pow(operands);
		case "sqrt":
			if(operands.length != 1) {
				throw new IllegalArgumentException("Maximum number of required operands: 1");
			}
			return sqrt(operands[0]);
		case "add":
			if(operands.length<minArgs) {
				throw new IllegalArgumentException("Insufficient operands. Minimum required: " + minArgs);
			}
			return add(operands);
		case "subtract":
			if(operands.length<minArgs) {
				throw new IllegalArgumentException("Insufficient operands. Minimum required: " + minArgs);
			}
			return subtract(operands);
		case "multiply":
			if(operands.length<minArgs) {
				throw new IllegalArgumentException("Insufficient operands. Minimum required: " + minArgs);
			}
			return multiply(operands);
		case "divide":
			if(operands.length<minArgs) {
				throw new IllegalArgumentException("Insufficient operands. Minimum required: " + minArgs);
			}
			return divide(operands);
		case "mod":
			if(operands.length<minArgs) {
				throw new IllegalArgumentException("Insufficient operands. Minimum required: " + minArgs);
			}
			return mod(operands);
		default:
			throw new UnsupportedOperationException("Operation not supported: " + operation);
		}
	}
	
	 public double add(double... operands) {
		/**
		 * Adds all provided operands together.
		 * 
		 * @param operands the numbers to add
		 * @return the sum of all operands
		 */
		 double result=0;
		 for(double operand:operands) {
			 result+=operand;
		 }
	    	return result;
	    }

	 public double subtract(double... operands) {
		/**
		 * Subtracts each subsequent operand from the first operand.
		 * 
		 * @param operands the numbers to subtract
		 * @return the result of sequential subtraction
		 */
		 double result = operands[0];
		 for(int i=1;i<operands.length;i++) {
			 result-=operands[i];
		 }
		 return result;
	    }

	 public double multiply(double... operands) {
		/**
		 * Multiplies all provided operands.
		 * 
		 * @param operands the numbers to multiply
		 * @return the multiplies of all operands
		 */
		 double result=1;
		 for(double operand:operands) {
			 result*=operand;
		 }
		 return result;
	    }

	 public double divide(double... operands) {
		/**
		 * Divides the first operand by each of the following operands in order.
		 * Throws an exception if division by zero is attempted.
		 * 
		 * @param operands the numbers to divide
		 * @return the result of sequential division
		 * @throws ArithmeticException if division by zero occurs
		 */
		 double result=operands[0];
		 for(int i=1;i<operands.length;i++) {
			 if(operands[i]==0.0) {
				 throw new ArithmeticException("Cannot divide by zero");
			 }
			 result/=operands[i];
		 }
		 return result;
	 }
	 
	 public double mod(double... operands) {
		/**
		 * Computes the modulus of the first operand with each subsequent operand in order.
		 * Throws an exception if modulus by zero is attempted.
		 * 
		 * @param operands the numbers to apply modulus to
		 * @return the result of sequential modulus operations
		 * @throws ArithmeticException if modulus by zero occurs
		 */
		 double result = operands[0];
		 for(int i=1;i<operands.length;i++) {
			 if(operands[i]==0.0) {
				 throw new ArithmeticException("Cannot modulus by zero.");
			 }
			 result %= operands[i];
		 }
		 
		 return result;
	 }
	 
	 public double sqrt(double operand) {
		/**
		 * Computes the square root of the given operand.
		 * 
		 * @param operand the number to find the square root of
		 * @return the square root
		 * @throws ArithmeticException if the operand is negative
		 */
		 if(operand <0) {
			 throw new ArithmeticException("Cannot calculate the square root of a negative number.");
		 }
		 double result = Math.sqrt(operand);
		 return result;
	 }
	 
	 public double pow(double... operands) {
		/**
		 * Raises operands in a right-to-left power chain (e.g., a^(b^c)).
		 * 
		 * @param operands the numbers for exponentiation
		 * @return the result of right-associative exponentiation
		 */
		 double result = operands[operands.length-1];
		 for(int i=operands.length-2;i>=0;i--) {
			 result = Math.pow(operands[i],result);
		 }
		 return result;
	 }
	 
	 public int getMinArgs() {
		/**
		 * Returns the minimum number of operands required for operations like add, subtract, etc.
		 * 
		 * @return minimum required operand count
		 */
		 return this.minArgs;
	 }
}
