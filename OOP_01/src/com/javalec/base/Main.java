package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.SumEvenOdd;

public class Main {

	public static void main(String[] args) {

		// ----------------
		// 사용자로 부터 숫자 2개를 입력받아 범위의 합계를 구하고 짝수 홀수 판단.
		// ----------------
		Scanner scanner = new Scanner(System.in);
		int startNum = 0;
		int endNum = 0;
		int total = 0; // 합계
		String totalEvenOdd = ""; // total의 짝홀수 판별
		
		System.out.print("첫번째 숫자를 입력 하세요");
		startNum = scanner.nextInt();
		System.out.print("두번째 숫자를 입력 하세요");
		endNum = scanner.nextInt();

		SumEvenOdd sumEvenOdd = new SumEvenOdd();
		total = sumEvenOdd.sumCalc(startNum, endNum); // return 받는곳
		System.out.println("1부터 10까지의 합계는 " + total);
//		total = sumEvenOdd.sumCalc(10, 1000);
//		System.out.println("100부터 1000까지의 합계는 " + total);

		totalEvenOdd = sumEvenOdd.evenOdd(total);
		System.out.println("1부터 10까지의 합계는 " + totalEvenOdd);

	}

}
