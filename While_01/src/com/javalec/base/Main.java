package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 1부터 100까지의 합계 구하기
		
		int tot = 0; // 메모리에 아무것도 없으면 계산시 오류나기 때문에 초기값 설정
		
		for(int i=1; i<=100; i++) {
			tot += i;
		}
		System.out.println("tot : " + tot);
		
		// -------------
		tot = 0;
		
		int i = 1;
		
		while(i <= 100) {
			tot += i;
			i++;
		}
		System.out.println("tot : " + tot);
		
		// ------------ 키오스크 응용
		tot = 0;
		i = 1;
		while(true) {
			tot += i;
			i++;
			if(i>100) {
				break;
			}
		}
		System.out.println("tot : " + tot);
		
		// ------------ break -------------- 반복문 종료
		for(int j=1; j<1000000; j++) {
			if(j == 10) {
				System.out.println("Find");
				break;
			}
		}
		
		// ------------ coutinue ---------------
		for(int j=1; j<=10; j++) {
			if(j==10) {
				continue;
			}
			System.out.println(j);
		}
		
		
		
		
		
		
		
		
		
	}

}
