package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 배열의 평균 구하기 1228
		int[] intNum = {1, 5, 8, 12, 200, 1002};
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<intNum.length; i++) {
			sum += intNum[i];
			
		}
		avg = sum/intNum.length;
		System.out.println(avg);
		

	}

}
