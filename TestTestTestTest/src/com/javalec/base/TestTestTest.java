package com.javalec.base;

import java.util.Scanner;

public class TestTestTest {

	public static void main(String[] args) {
		// 첫번째 값과 두번째 값을 받아서 합해주는 프로그
		// 몇단인지 입력하면 출력해주는 프로그램 짝수는 *로 표현
		int inputStart = 0;
		int inputEnd = 0;
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 값을 입력하세요 : ");
		inputStart = scanner.nextInt();
		System.out.print("두번째 값을 입력하세요 : ");
		inputEnd = scanner.nextInt();
		
		if(inputStart > inputEnd) {
			num1 = inputEnd;
			num2 = inputStart;
			}
		else {
			num1 = inputStart;
			num2 = inputEnd;
			
		}
		
		for(int i=num1; i<=num2; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		

	}

}
