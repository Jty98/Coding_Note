package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1에서 10까지를 출력
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
//			  	시작	   끝	증가
//		for(int i=1; i<=10; i++) { // i = index약자, 지역변수
//			System.out.println(i);
//		}
		
		// 구구단

//		for(int i=2; i<=9; i+=2) {
//			System.out.println("2 X " + i + " = " + (2*i));
//		}

		// 1부터 10까지의 합계

//		int sum = 0; // 누적변수 = 초기값을 주고 for문 밖에서 시작
//		
//		for(int i=1; i<=10; i++) {
//			//sum = sum + i;
//			sum += i;
//		}
//		System.out.println("1~10까지의 합계 : " + sum);

		// 범위의 합계 구하기

//		int sum = 0; 
//		int startMum = 1;
//		int endNum = 10;
//		
//		for(int i=startMum; i<=endNum; i++) {
//			//sum = sum + i;
//			sum += i;
//		}
//		System.out.println(startMum + "~" + endNum + "합계 : " + sum);

		// 범위의 합

//		int sum = 0; 
//		int startMum = 0;
//		int endNum = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("첫 번째 숫자를 입력하세요 : ");
//		startMum = scanner.nextInt();
//		
//		System.out.print("두 번째 숫자를 입력하세요 : ");
//		endNum= scanner.nextInt();
//		
//		for(int i=startMum; i<=endNum; i++) {
//			//sum = sum + i;
//			sum += i;
//		}
//		System.out.println(startMum + "~" + endNum + "합계 : " + sum);

		// 1부터 100까지의 짝수의 합계 구하기

//		int evenSum = 0;
//		int oddSum = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				evenSum += i;
//			} else if (i % 1 == 0) {
//				oddSum += i;
//			}
//		}
//		System.out.println("1부터 100까지의 짝수의 합은 " + evenSum + "입니다.");
//		System.out.println("1부터 100까지의 홀수의 합은 " + oddSum + "입니다.");

		// 1부터 100까지의 수중 3의 배수와 5의 배수 합
//		int Sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			if ((i % 3 == 0) || (i % 5 == 0)) {
//				Sum += i;
//			}
//		}
//		System.out.println("1부터 100까지의 수중 3의 배수와 5의 배수 합은 " + Sum + "입니다.");

		// 범위의 합계
		/*
		 * // case#1 첫번째 숫자를 입력하세요 : 1 두번째 숫자를 입력하세요 : 100 두수의 합계는 5050입니다.
		 * 
		 * // case#2 첫번째 숫자를 입력하세요 : 1 두번째 숫자를 입력하세요 : 100 두수의 합계는 5050입니다.
		 */

//		int sum = 0;
//		int startMum = 0;
//		int endNum = 0;
//		String result = "두 수의 합계는 ";
//
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("첫 번째 숫자를 입력하세요 : ");
//		startMum = scanner.nextInt();
//
//		System.out.print("두 번째 숫자를 입력하세요 : ");
//		endNum = scanner.nextInt();
//
//		if (startMum < endNum) {
//			for (int i = startMum; i <= endNum; i++) {
//				sum += i;
//			}
//		}
//
//		else {
//			for (int i = startMum; i >= endNum; i--) {
//				sum += i;
//			}
//
//		}
//
//		System.out.println(result + sum + "입니다.");

		Scanner scanner = new Scanner(System.in);
		int tempStart = 0; // 입력받은 첫 번째 숫자
		int tempEnd = 0; // 입력받은 두 번째 숫자
		int startNum = 0; // 범위 계산 첫 번째 숫자
		int endNum = 0; // 범위 계산 두 번째 숫자
		int sum = 0; // 범위의 합계 결과
		int even = 0; // 짝수출력 숫자
		int odd = 0; // 홀수출력 숫자
		double avg = 0; // 합계의 평균
		double avgEven = 0; // 짝수 평균
		double avgOdd = 0; // 홀수 평균
		int oddCount = 0; // 홀수의 개수
		int evenCount = 0; // 짝수의 개수

		// 숫자 입력받기
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		tempStart = scanner.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		tempEnd = scanner.nextInt();

		// 시작 숫자와 끝 숫자를 비교해서 작은 수가 첫 번째 수로 큰 수가 두 번째 수로 정리
		if (tempStart > tempEnd) {
			startNum = tempEnd;
			endNum = tempStart;
		} else {
			startNum = tempStart;
			endNum = tempEnd;
		}

		// 범위 합계 구하기
		for (int i = startNum; i <= endNum; i++) {
			sum += i;

			if (i % 2 == 1) {
				odd += i;
				oddCount++;

				System.out.println("짝수 " + even);
			} else {
				even += i;
				evenCount++;
			}
		}

		// 평균 구하기
		avg = (double) sum / (endNum - startNum + 1);
		avgOdd = ((double)odd / oddCount);
		avgEven = ((double)even / evenCount);


		// 출력하기
		System.out.println("두 수의 합계는 " + sum + "입니다.");
		// 홀수의 합계 (홀수 변수, 합계 변수)
		System.out.println("홀수의 합계는 " + odd + "입니다.");
		// 짝수의 합계 (짝수 변수, 합계 변수)
		System.out.println("짝수의 합계는 " + even + "입니다.");
		// 합계의 평균 (평균 변수)
		System.out.println("합계의 평균은 " + avg + "입니다.");
		// 홀수 합계의 평균
		System.out.println("홀수 합계의 평균은 " + avgOdd + "입니다.");
		// 짝수 합계의 평균
		System.out.println("짝수 합계의 평균은 " + avgEven + "입니다.");

	}

}
