package com.javalec.base;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		String score = "";
		int num = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("점수를 입력하세요 : ");
		num = scanner.nextInt();

		switch (num / 10) {
		case 10:
			score = "A";
			break;
		case 9:
			score = "A";
			break;
		case 8:
			score = "B";
			break;
		case 7:
			score = "C";
			break;
		case 6:
			score = "D";
			break;
		default:
			score = "F";
			break;
		}

		System.out.println("점수는 " + score + "입니다.");

	}

}