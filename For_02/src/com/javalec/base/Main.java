package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 사용자가 입력한 숫자로 구구단을 구성.
//		int input = 0; // 입력변수 
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("몇단을 입력하겠습니까? : ");
//		input = scanner.nextInt();
//		
//		// 구구단 실행
//		for(int i=1; i<=9; i++) {
//			System.out.println(input + " X " + i + " = " + input * i);
//		}

		// 구구단 전체 출력 (2단~9단, 숫자는 9까지)
//		for (int dan = 2; dan <= 9; dan++) {
//			System.out.println("-------" + dan + "단 -------");
//			for (int num = 1; num <= 9; num++) {
//				System.out.println(dan + " X " + num + " = " + (dan * num));
//			}
//		}


		// 구구단 가로로 출력하기
//		for (int dan = 1; dan <= 9; dan++) {
//			for (int num = 2; num <= 9; num++) {
//				System.out.print(num + " X " + dan + " = " + (dan * num) + "	");
//			}
//			System.out.println();
//		}

//		for (int dan = 1; dan <= 9; dan++) {
//				System.out.print("2 X " + dan + " = " + (2*dan) + "\t");
//				System.out.print("3 X " + dan + " = " + (3*dan) + "\t");
//				System.out.print("4 X " + dan + " = " + (4*dan) + "\t");
//				System.out.print("5 X " + dan + " = " + (5*dan) + "\t");
//				System.out.print("6 X " + dan + " = " + (6*dan) + "\t");
//				System.out.print("7 X " + dan + " = " + (7*dan) + "\t");
//				System.out.print("8 X " + dan + " = " + (8*dan) + "\t");
//				System.out.println("9 X " + dan + " = " + (9*dan) + "\t");
//					
//			}
//		for (int dan = 1; dan <= 4; dan++) {
//			for (int num = 2; num <= 9; num++) {
//				System.out.print(num + " X " +(dan * 2) + " = " + ((dan * 2) * num) + "	");
//
//			}
//			System.out.println();
//		}
//		for (int dan = 1; dan <= 9; dan++) {
//			for (int num = 2; num <= 9; num++) {
//				if (dan % 2 == 1) {
//					System.out.print(num + " X " + "*" + " = " + String.format("%2s",dan * num) + "	"); // 문자열 정렬
//				} else {
//					System.out.print(num + " X " + dan + " = " + String.format("%2s",dan * num) + "	");
//				}		
//			}
//			System.out.println();
//		}

		for (int dan = 1; dan <= 9; dan++) {
			for (int num = 2; num <= 9; num++) {
				if ((num % 2 == 0) || (dan % 2 == 0)) {
					System.out.print(num + " X " + dan + " = " + String.format("%2s", dan * num) +"\t");
				}else {
				System.out.print("\t\t");
			}
			
		}
			System.out.println();	
		}
		
	}
}
