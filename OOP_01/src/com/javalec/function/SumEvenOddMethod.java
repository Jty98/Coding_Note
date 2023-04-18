package com.javalec.function;

import java.util.Scanner;

public class SumEvenOdd {
	
	// Field, Property
	
	// Constructor
	public SumEvenOdd() {								// new들어가는 것과 헷갈리지않기
		// TODO Auto-generated constructor stub			// empty : 비어있는 constructor
	}
	
	// Method
	// 합계를 구한다.
	public int sumCalc(int startNum, int endNum) {		// 메인으로 넘겨주기, return되는 변수 타입에 따라 int, String 다름
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		for(int i=startNum; i<=endNum; i++) {
			sum += i;
		}
		return sum;	
	}
	
	// 짝수 홀수 판단.
	public String evenOdd(int sum) {					// (파라미터)
		String result = "";
		if(sum % 2 ==0) {
			result = "짝수 입니다";
		}else {
			result = "홀수 입니다";
		}
		return result;
		
														// *떠있고 끝나면 저장하기
		
	}
	

}
