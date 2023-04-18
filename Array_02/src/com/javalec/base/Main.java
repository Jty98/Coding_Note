package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 배열의 평균 구하기 1228
		int[] intNum = {1, 5, 8, 12, 200, 1002};
		int sum = 0;		// 합계 변수
		double avg = 0;		// 평균 변수
		// 합 구하기
		for(int i=0; i<intNum.length; i++) {
			sum += intNum[i];	
		}
		// 평균 구하기
		avg = sum/intNum.length;
		
		// 출력하기
		System.out.println(avg);
		
		

	}

}
