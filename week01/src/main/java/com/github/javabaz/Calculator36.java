package com.github.javabaz;

public class Calculator36 {
	private final int minArgs=2;
	
	public double execute(String operation,double... operands) {
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
		 double result=0;
		 for(double operand:operands) {
			 result+=operand;
		 }
	    	return result;
	    }

	 public double subtract(double... operands) {
		 double result = operands[0];
		 for(int i=1;i<operands.length;i++) {
			 result-=operands[i];
		 }
		 return result;
	    }

	 public double multiply(double... operands) {
		 double result=1;
		 for(double operand:operands) {
			 result*=operand;
		 }
		 return result;
	    }

	 public double divide(double... operands) {
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
		 if(operand <0) {
			 throw new ArithmeticException("Cannot calculate the square root of a negative number.");
		 }
		 double result = Math.sqrt(operand);
		 return result;
	 }
	 
	 public double pow(double... operands) {
		 double result = operands[operands.length-1];
		 for(int i=operands.length-2;i>=0;i--) {
			 result = Math.pow(operands[i],result);
		 }
		 return result;
	 }
	 
	 public int getMinArgs() {
		 return this.minArgs;
	 }
}
