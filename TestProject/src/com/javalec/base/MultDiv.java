package com.javalec.base;

public class MultDiv {

	// Field
	int startNum = 0;
	int endNum = 0;
	int calc = 0;
	
	// Construct
	public MultDiv() {
		// TODO Auto-generated constructor stub.
		
		
	}
	
	// Method
	public int multiply(int startNum, int endNum) {
		calc = startNum * endNum;
		return calc;
	}
	
	public int divide(int startNum, int endNum) {
		calc = startNum / endNum;
		return calc;
	}
	
}
