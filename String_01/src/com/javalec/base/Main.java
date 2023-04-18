package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// public의 반대 private
		Scanner scanner = new Scanner(System.in);
		String  str0 	= new String("가나다라마바사");
		String  str1 = "abcdefg";
		String	str2 = "HIJKLMN";
		String	str3 = "  abc  ";
		
		System.out.println(str1.concat(str2));						// 문자열 연결
		System.out.println(str0.substring(3));						// 문자열 자르기
		System.out.println(str0.substring(3, 5));
		System.out.println(str0.length());							// 문자길이 보기
		System.out.println(str1.toUpperCase()); 					// 대문자로 출력하기
		System.out.println(str1.toUpperCase().concat(str2)); 		
		System.out.println(str2.toLowerCase());						// 소문자로 출력하기
		
		System.out.println(str1.charAt(0));							// n번째 있는 문자 출력하기
		System.out.println(str1.indexOf('a'));						// 몇번째에 있는 문자인지 보기
		System.out.println(str1.equals(str2));						// 서로 동일한지 확인하기
		
		System.out.println(str3);
		System.out.println(str3.trim());							// 앞 뒤 공백(스페이스바) 없애기
		System.out.println(str1.replace('a', 'z'));					// 앞 문자를 뒤 문자로 바꾸기(한글자)
		System.out.println(str1.replaceAll("abc", "zzzzz")); 		// 앞 문자를 뒤 문자로 바꾸기(여러글자)
		
		// 010-1212-3434 -> 010-****-****
		String str4 = "010-1212-3434";
	
		System.out.println(str4.replaceAll(str4.substring(4), "****-****"));	// 특정부분만 바꾸기
		System.out.println(str4.substring(0, 4).concat("****-****"));			// 뒤에만 바꿔서 붙이기

	}

}
