package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 배열(Array)
		// 문자열 배열 데이터 7개를 생성
//		String[] str = new String[7]; // 메모리에 새로 저장할때는 new
//		int[] num = new int[10];
//		
//		str[0] = "일요일";
//		str[1] = "월요일";
//		str[2] = "화요일";
//		str[3] = "수요일";
//		str[4] = "목요일";
//		str[5] = "금요일";
//		str[6] = "토요일";

//		C Create
//		R Read
//		U Update
//		D Delete
//		CRUD기반 언어 = SQL

//		String[] str = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
//
//		// 배열의 갯수 확인하기
//		System.out.println(str.length);
//
//		// 일요일 <- Sunday
//		str[0] = "Sunday";
//
//		for (int i = 0; i < str.length; i++) {
//			System.out.print(str[i] + "\t");
//
//		}

		// 정수 배열 intArray 1부터 10까지 등록하는 문장을 구성하고 출력해보기
		// Data가 짝수인 합계 구하기
		int sum = 0;
		int[] intArray = new int[10];

		// Creation
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
		}
		// Read
		for (int i = 0; i < intArray.length; i++) {
			//if (intArray[i] % 2 == 0) {
				intArray[i]++;
				System.out.println(intArray[i]);
			}
		//}
		
		System.out.println("짝수 데이터의 합 : " + sum);

	}
}
