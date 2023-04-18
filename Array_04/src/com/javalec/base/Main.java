package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		  James의 신장을 입력하세요! 170
//		  Carhy의 신장을 입력하세요! 165
//		  Kenny의 신장을 입력하세요! 180
//		  Martin의 신장을 입력하세요! 190
//		  Crystal의 신장을 입력하세요! 165
//		  평균신장은 : 174 
//		  가장 큰 학생은 Martin 이고 그 학생의 키는 190
//		  가장 작은 학생은 Cathy 이고 그 학생의 키는 165		 

		Scanner scanner = new Scanner(System.in);
		String nameArray[] = { "James", "Carhy", "Kenny", "Martin", "Crystal" };
		int sum = 0;
		int[] height = new int[nameArray.length]; // 입력받은 키
		int maxArrayNo = 0;
		int minArrayNo = 0;
		int maxHeight;
		int minHeight;
		double avg = 0;

		// 입력받기
		for (int i = 0; i < nameArray.length; i++) {
			System.out.print(nameArray[i] + "의 신장을 입력하세요! ");
			height[i] = scanner.nextInt();
			sum += height[i];
		}
		// 평균 구하기
		avg = sum / nameArray.length;

		// 첫번째로 지정
		maxHeight = height[0];
		minHeight = height[0];

		// 최대값, 최소값 구하기
		for (int i = 0; i < height.length; i++) {
			if (maxHeight <= height[i]) {
				maxHeight = height[i];
				maxArrayNo = i;
			}
			if (minHeight >= height[i]) {
				minHeight = height[i];
				minArrayNo = i;
			}

		}
		System.out.println("평균신장은 : " + avg);
		System.out.println("가장 큰 학생은 " + nameArray[maxArrayNo] + "이고 그 학생의 키는 " + maxHeight);
		System.out.println("가장 작은 학생은 " + nameArray[minArrayNo] + "이고 그 학생의 키는 " + minHeight);

	}

}
