package com.javalec.base;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * 국어 점수를 입력하세요 : 90 영어 점수를 입력하세요 : 80 수학 점수를 입력하세요 : 70
		 * 
		 * 평균점수 : 80 국어 점수는 평균보다 낮습니다. 영어 점수는 평균 입니다. 수학 점수는 평균보다 높습니다.
		 */
		Scanner scanner = new Scanner(System.in);
		int Korean, English, Math = 0;
		String message = "";
		String scoreInput = "를 입력하세요 : ";
		String Korean_score = "국어 점수";
		String English_score = "영어 점수";
		String Math_score = "수학 점수";

		System.out.print(Korean_score + scoreInput);
		Korean = scanner.nextInt();
		System.out.print(English_score + scoreInput);
		English = scanner.nextInt();
		System.out.print(Math_score + scoreInput);
		Math = scanner.nextInt();

		int avg = ((Korean + English + Math) / 3);
		System.out.println("평균점수 : " + avg);

		if (Korean < avg) {
			message = "평균보다 낮습니다.";
		} else if (Korean > avg) {
			message = "평균보다 높습니다.";
		} else {
			message = "평균과 같습니다.";
		}
		System.out.println(Korean_score + "는" + message);

		if (English < avg) {
			message = "평균보다 낮습니다.";
		} else if (English > avg) {
			message = "평균보다 높습니다.";
		} else {
			message = "평균과 같습니다.";
		}
		System.out.println(English_score + "는" + message);

		if (Math < avg) {
			message = "평균보다 낮습니다.";
		} else if (Math > avg) {
			message = "평균보다 높습니다.";
		} else {
			message = "평균과 같습니다.";
		}
		System.out.println(Math_score + "는" + message);

	}

}
