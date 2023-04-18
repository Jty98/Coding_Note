package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// String
		String str1 = "a";
		
		long startTime1 = System.currentTimeMillis();		// 시작하는 시작
		for(int i=1; i<=500000; i++) {
			str1 = str1 + "a";
		}
		long endTime1 = System.currentTimeMillis();			// 끝나는 시간		

		System.out.println("Term1 :" + (endTime1 - startTime1));
		
		// ------
		// StringBuilder
		StringBuilder stringBuilder = new StringBuilder("a");
		
		long startTime2 = System.currentTimeMillis();		// 시작하는 시작
		for(int i=1; i<=500000; i++) {
			stringBuilder.append("a");
		}
		long endTime2 = System.currentTimeMillis();			// 끝나는 시간		

		System.out.println("Term1 :" + (endTime2 - startTime2));
		
	}

}
