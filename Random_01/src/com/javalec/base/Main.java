package com.javalec.base;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
//		System.out.println(random.nextInt(10));
		for(int j=1; j<=6; j++) {
			int i = random.nextInt(45);
			System.out.println(i+1);				// 0부터 시작해서 +1
			
		}

	}

}
