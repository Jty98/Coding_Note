package com.javalec.function;

public class SumEvenOdd {
	
	// Field, Property
	
	// Constructor
	public SumEvenOdd() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	// 합계를 구한다.
	public int sumCalc(int startNum, int endNum) {		// 메인으로 넘겨주기
		int sum = 0;
		for(int i=startNum; i<=endNum; i++) {
			sum += i;
		}
		return sum;
		
	}
	
	// 짝수 홀수 판단.
	

}
