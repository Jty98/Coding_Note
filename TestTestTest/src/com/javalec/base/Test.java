package com.javalec.base;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		// 피라미드
//		for(int i=0;i<4;i++){
//			for(int j=0;j<3-i;j++){
//				System.out.print(" "); 
//			}
//			for(int j=0;j<2*i+1;j++){
//				System.out.print("*"); 
//			}
//			System.out.println("");
//		}

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] gbb = {"가위", "바위", "보"};
		String insert = "";
		
		System.out.print("가위 바위 보! ");
		insert = scanner.next();
		
		for (int i = 0; i <= gbb.length; i++) {
			gbb[i] = random.nextInt();
			System.out.println(j + 1);

		}
	}

}
