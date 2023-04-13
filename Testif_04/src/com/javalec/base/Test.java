package com.javalec.base;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * 실행화면) BMI 계산기 ***
		 * 
		 * 신장(cm)을 입력하세요 : 170 몸무게(kg)을 입력하세요 : 70
		 * 
		 * >>> 계산 결과 귀하는___입니다. ------------------------------------------- 유효숫자 범위체크
		 */
		// BMI공식 = 체중 / 키 * 키
		double height, weight, bmi = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("*** BMI 계산기 ***"); // 시작

		System.out.print("신장(cm)을 입력하세요 : ");
		height = scanner.nextDouble() / 100;
		System.out.print("몸무게(kg)을 입력하세요 : ");
		weight = scanner.nextDouble();

		bmi = weight / (height * height);

		if ((height <= 0) || (weight <= 0) || ((height * 100) < weight)) {
			System.out.println("잘못 입력 되었습니다.");
		} else {
			if (bmi >= 30) {
				result = "고도비만 ";
			} else if (bmi >= 25) {
				result = "비만 ";
			} else if (bmi >= 23) {
				result = "과체중 ";
			} else if (bmi >= 18.5) {
				result = "정상체중 ";
			} else {
				result = "저체중";
			}

			System.out.println("계산결과 귀하는 " + result + "입니다.");
		}

	}

}
