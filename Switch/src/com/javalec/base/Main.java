package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		
		int num1 = 10;
		
//		if(num1 %2 ==0) {
//			System.out.println("Even");
//		}else {
//			System.out.println("Odd");
//		}

		switch(num1 % 2) {
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		default:
			break;
		}
		
		
	}

}
