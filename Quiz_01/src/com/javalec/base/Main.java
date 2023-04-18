package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		// ***** 입력한 숫자 만큼 별 모양이 증가하면서 출력하다가 다시 감소하면서 출력하기 *****
//
//		Scanner scanner = new Scanner(System.in);
//
//		int input = 0; // 입력변수
//
//		// 입력받기
//		System.out.print("Input your decimal no. : ");
//		input = scanner.nextInt();
//
//		//증가
//		for (int i = 1; i <= input; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
//		//감소
//		for (int i = input; i >= 1 ; i--) {
//			for (int j = i-1; j >= 1; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		// ***** 입력한 수의 팩토리얼 구하기 *****
//		Scanner scanner = new Scanner(System.in);
//
//		int num = 0; // 입력 변수
//		int result = 1; // 결과 변수 곱해질 값이라서 1
//
//		// 입력하기
//		System.out.print("Input your decimal no. : ");
//		num = scanner.nextInt();
//
//		// 팩토리얼 구하기
//		while (true) {
//			result *= num;
//			if (num > 1) {
//				num--;
//				continue;
//			}
//			System.out.println(num + "'s factorial value = " + "\t" + result);
//			break;
//		}
//
//		for(int i=num; i>0; i--) {
//			result *= i; // 감소하는 값을 곱함
//		}
//		 //출력
//		 System.out.println(num + "'s factorial value = " + "\t" + result);
//
//		// ***** 숫자 삼각형에 프로그램 작성 *****
//
//		Scanner scanner = new Scanner(System.in);
//
//		int input = 0; // 입력변수
//		int sum = 1;
//
//		// 입력
//		System.out.print("몇 단계의 피라미드로 구성할까 ? : ");
//		input = scanner.nextInt();
//
//		for (int i = 1; i <= input; i++) {
//			for (int j = 1; j <= i; j++) {
//				
//				System.out.print(String.format("%-2d", sum++));
//			}
//
//			System.out.println();
//		}
//
//		// ***** 더하기 할 숫자들의 개수를 정한 후 숫자를 입력 받아서 *****
//		// 입력한 숫자의 합을 구하는 프로그램 작성
//
//		Scanner scanner = new Scanner(System.in);
//
//		int input = 0;// 입력변수
//		int input1 = 0;
//		int numArray[] = new int[input];
//		int sum = 0;
//
//		// 입력받기
//		System.out.print("몇개의 숫자를 더할까요 ? : ");
//		input = scanner.nextInt();
//		System.out.println(input + "의 숫자를 입력하세요");
//		for (int i = 0; i <= input; i++) {
//			input1 = scanner.nextInt();
//		}
//
//		// 숫자 넣기
//		for (int i = 1; i < numArray.length; i++) {
//			sum += numArray[i];
//		}
//		System.out.println("입력한 숫자의 합은 " + sum + "입니다.");
//
//		// ***** 몇 개의 숫자를 입력할지 결정한 후 숫자를 입력하고 이중 최대값의 위치와 최대값을 구하라 *****
//		// 배열사용
//		Scanner scanner = new Scanner(System.in);
//
//		int input = 0; // 입력변수
//		int maxNum = 0; // 최대값
//		int num = 0; // 순서
//
//		// 입력받기
//		System.out.print("입력할 숫자의 갯수 ? (100개 미만) : ");
//		input = scanner.nextInt();
//		if (input > 100) {
//			System.out.println("범위초과");
//		} else {
//			int[] numArray = new int[input];
//			System.out.println(input + "개의 숫자를 입력하세요!");
//			// 최대값
//			for (int i = 0; i < numArray.length; i++) {
//				numArray[i] = scanner.nextInt();
//				if (maxNum <= numArray[i]) {
//					maxNum = numArray[i];
//					num = i + 1;
//				}
//			}
//			System.out.println("입력한 숫자중 최대값은 " + maxNum + "이고 " + num + "번째 값 입니다.");
//		}
//
//		// 배열 x
//		Scanner scanner = new Scanner(System.in);
//
//		int input = 0; // 입력변수
//		int maxNum = 0; // 최대값
//		int num = 0; // 순서
//
//		// 입력받기
//		System.out.print("입력할 숫자의 갯수 ? (100개 미만) : ");
//		input = scanner.nextInt();
//		if (input > 100) {
//			System.out.println("범위초과");
//		} else {
//			System.out.println(input + "개의 숫자를 입력하세요!");
//			// 최대값
//			for (int i = 0; i < input; i++) {
//				input = scanner.nextInt();
//				if (maxNum <= input) {
//					maxNum = input;
//					num = i + 1;
//				}
//			}
//			System.out.println("입력한 숫자중 최대값은 " + maxNum + "이고 " + num + "번째 값 입니다.");
//		}
//
//		// ***** 입력한 한 자릿수 정수의 합을 구하는 프로그램을 작성하라. *****
//
//		Scanner scanner = new Scanner(System.in);
//
//		int input = 0; 		// 입력변수
//		int calcvalue = 0;
//		int remainder = 0; 	// 나머지 값
//		int sum = 0;		// 합계
//
//		System.out.print("Enter on integer(0 ~ 9) : ");
//		input = scanner.nextInt();
//		
//		calcvalue = input;
//		// input % 10 == 0
//		
//		while(calcvalue !=0) {
//			remainder = calcvalue % 10;
//			sum += remainder;
//			calcvalue = calcvalue / 10;
//		}
//		
//		System.out.println("Sum of digits = " + sum);		
//

		// ***** 학생수가 4명이고 과목이 3과목일 경우의 점수 합계와 평균 구하기 기능 추가 *****
		Scanner scanner = new Scanner(System.in);

		int[] koreanScore = new int[4];
		int[] englishScore = new int[4];
		int[] mathmaticsScore = new int[4];
		int[] total = new int[4];
		double[] avg = new double[4];

		// 성적입력
		System.out.println("Korean의 성적을 입력 : ");
		for (int i = 0; i < koreanScore.length; i++) {
			System.out.print("No" + (i + 1) + "의 성적은 :");
			koreanScore[i] = scanner.nextInt();
			total[i] += koreanScore[i];

		}
		System.out.println("English의 성적을 입력 : ");
		for (int i = 0; i < englishScore.length; i++) {
			System.out.print("No" + (i + 1) + "의 성적은 :");
			englishScore[i] = scanner.nextInt();
			total[i] += englishScore[i];
		}
		System.out.println("Mathmatics의 성적을 입력 : ");
		for (int i = 0; i < mathmaticsScore.length; i++) {
			System.out.print("No" + (i + 1) + "의 성적은 :");
			mathmaticsScore[i] = scanner.nextInt();
			total[i] += mathmaticsScore[i];
			avg[i] = total[i] / 3.0;
		}

		// 출력
		System.out.println(
				"\t" + "Korean" + "\t" + "English" + "\t" + "mathmaticsScore" + "\t" + "Total" + "\t" + "Average");
		for (int i = 0; i < 4; i++) {
			for (int j = i; j < i + 1; j++) {

				System.out.print("No" + (j + 1) + "\t" + koreanScore[j] + "\t" + englishScore[j] + "\t"+ mathmaticsScore[j] + "\t\t" + total[j] + "\t" + avg[j]);
			}
			System.out.println();
		}

	}

}
