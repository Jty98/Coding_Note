package com.javalec.base;

public class Hello {

	public static void main(String[] args) {
//		코멘트 = 커멘드 + /
//		화면에 Hello 출력하기  		
		System.out.print("Hello!\n"); // 라인 띄우기
		System.out.println("\tWorld"); // 탭 띄우기

	
		double weight = 60, length = 160, bmi = 0;
		
		bmi = (weight / (length/10) * 2);
		System.out.println(bmi);
	}

}
