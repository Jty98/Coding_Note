package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("abc");
		StringBuilder stringBuilder = new StringBuilder("abcdefg");
		stringBuilder.append("hijklmn");								// 붙이기
		System.out.println(stringBuilder);
		
		stringBuilder.insert(3, "zzz");									// 삽입
		System.out.println(stringBuilder);
		
		stringBuilder.delete(3, 6);										// 삭제
		System.out.println(stringBuilder);

		
	}

}
