package com.javalec.base;

import com.javalec.function.SumEvenOdd;

public class Main {

	public static void main(String[] args) {
		// 1~10까지의 합계를 구하고 그 합이 짝수인지 홀수인지 판별(class 활용)
		
		SumEvenOdd sumEvenOdd = new SumEvenOdd();
		int result = sumEvenOdd.sumCalc(1, 10);
		System.out.println("1부터 10까지의 합계는 " + result);
		result = sumEvenOdd.sumCalc(10, 1000);
		System.out.println("100부터 1000까지의 합계는 " + result);
	}

}
