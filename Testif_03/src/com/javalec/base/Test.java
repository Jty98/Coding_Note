package com.javalec.base;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String score ="";
		double num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		num = scanner.nextDouble();
		
		if((num < 0) || (num > 100)) {
			System.out.println("0에서 100사이만 입력하세요");
		}else {
		if(num >= 90) {
			score = "A";
		}else if (num >= 80) {
			score = "B";
		}else if (num >= 70) {
			score = "C";
		}else if (num >= 60) {
			score = "D";
		}else {
			score = "F";
		}
		// output
		System.out.println("점수가 " + num + "여서 " + score + "학점 입니다.");
		}

	}

}
