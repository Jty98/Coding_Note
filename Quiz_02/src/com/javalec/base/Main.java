//package com.javalec.base;
//
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		// 10개의 점수(0점부터 99점)를 입력받아 점수의 분포를 10점 간격의 등급으로 된 히스토그램을 표시하라.
//
//		// int 배열버전
//		Scanner scanner = new Scanner(System.in);
//
//		int result = 0;
//		int[] histo = new int[10];
//
//		// 입력
//		System.out.println("Input score : ");
//		for (int i = 0; i < histo.length; i++) {
//			System.out.print((i + 1) + "의 score :");
//			histo[scanner.nextInt() / 10]++;
//		}
//		scanner.close();
//
//		// 출력
//		System.out.println("---------- Histogram ----------");
//		for (int i = (histo.length - 1); i >= 0; i--) {
//			System.out.print(String.format("%3d : ", i * 10));
//		for (int j = 1; j <= histo[j]; j++) {
//			System.out.print("#");
//		}
//		System.out.println();
//
//	}
//
//		
//		// String 배열버전
//
//		Scanner scanner = new Scanner(System.in);
//
//		int result = 0;
//		String[] histo = {"", "", "", "", "", "", "", "", "", "",};
//
//		
//		// 입력
//		System.out.println("Input score : ");
//		for (int i = 0; i < histo.length; i++) {
//			System.out.print((i + 1) + "의 score :");
//			histo[scanner.nextInt() / 10]+= "#"; 
//		}
//		scanner.close();
//
//		// 출력
//		System.out.println("---------- Histogram ----------");
//		for (int i = (histo.length - 1); i >= 0; i--) {
//			System.out.print(String.format("%3d : ", i * 10) + histo[i] + "\n");
//		
//		}
//		
//		// 몇 개의 숫자를 입력할지 결정한 후 숫자를 입력하고 이중 검색을 원하는 숫자의 위치를 파악
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		int count = 0; 		// 입력할 숫자의 갯수
//		int search = 0; 	// 검색할 숫자
//		int data = 0;		// 검색 횟수 확인
//		
//		// 입력
//		System.out.print("입력할 숫자의 갯수? :");
//		count = scanner.nextInt();
//		int[] num = new int[count];
//		System.out.println(count + "개의 숫자를 입력하세요!: ");
//		
//		// 배열에 입력할 숫자 넣기
//		for(int i=0; i<num.length; i++) {
//			System.out.print((i+1) + "의 숫자 :");
//			num[i] = scanner.nextInt();	
//		}
//		
//		// 검색
//		System.out.println("검색할 숫자는 ? :");
//		search = scanner.nextInt();
//		
//		for(data=0; data<count; data++) {
//			if(num[data] == search) {
//				System.out.println(search + "의 위치는 " + (data+1) + "번째 입니다.");
//				break;
//			}
//		}
//		
//		// 찾지 못한 경우
//		if(data == count) {
//			System.out.println(search + "는 존재하지 않습니다.");
//		}		
//
//		// 몇 개의 숫자를 입력할지 결정한 후 숫자를 입력하고 입력된 위치에 새로운 숫자를 삽입
//
//		Scanner scanner = new Scanner(System.in);
//
//		int count = 0; // 입력할 숫자의 갯수
//		int position = 0; // 삽입할 숫자의 위치
//		int insert = 0; // 삽입할 숫자
//
//		// 입력
//		System.out.print("입력할 숫자의 갯수? :");
//		count = scanner.nextInt();
//		int[] num = new int[count + 1];
//		System.out.println(count + "개의 숫자를 입력하세요!: ");
//
//		// 배열에 입력할 숫자 넣기
//		for (int i = 0; i < num.length-1; i++) {
//			System.out.print(i+1 + "의 숫자 :");
//			num[i] = scanner.nextInt();
//		}
//
//		// 삽입
//		System.out.print("숫자를 삽입하고자 하는 위치는? ? :");
//		position = scanner.nextInt();
//
//		System.out.print("삽입하고자 하는 수는 ? :");
//		insert = scanner.nextInt();
//
//		for (int i = count - 1; i >= position - 1; i--) {
//			num[i + 1] = num[i];
//		}
//		num[position - 1] = insert;
//
//		// 출력
//		System.out.println("-------- 결과 --------");
//		for (int i = 0; i < count + 1; i++) {
//			System.out.println(num[i]);
//		}
//
//		// 몇 개의 숫자를 입력한지 결정한 후 숫자를 입력하고 이중 필요없는 숫자의 위치를 정해 삭제
//
//		Scanner scanner = new Scanner(System.in);
//
//		int count = 0; // 입력할 숫자의 갯수
//		int position = 0; // 삭제할 숫자의 위치
//
//		// 입력
//		System.out.print("입력할 숫자의 갯수? :");
//		count = scanner.nextInt();
//		int[] num = new int[count];
//		System.out.println(count + "개의 숫자를 입력하세요!: ");
//
//		// 배열에 입력할 숫자 넣기
//		for (int i = 0; i < num.length; i++) {
//			System.out.print((i+1) + "의 숫자 :");
//			num[i] = scanner.nextInt();
//		}
//
//		// 삭제
//		System.out.print("몇번째의 숫자를 삭제 하시겠습니까? :");
//		position = scanner.nextInt();
//
//		for (int i = position; i < count; i++) {
//			num[i - 1] = num[i];
//		}
//
//		// 출력
//		System.out.println("-------- 결과 --------");
//		for (int i = 0; i < count-1; i++) {
//			System.out.println(num[i]);
//		}
//
//		// 고객의 입금, 출금 및 현황을 관리하는 프로그램 단, 고객번호는 12345이다.
//
//		Scanner scanner = new Scanner(System.in);
//		int selct = 0;
//		int customer = 0;			// 고객번호
//		int inOut = 0;				// 입금 출금
//		int[] arr = new int[5];
//		boolean loop = true;
//
//		while (loop) {
//			customer = 0;
//			inOut = 0;
//			System.out.println("1. 입금\n2. 출금\n3. 현황\n4. 종료");
//			System.out.print("번호를 선택하세요! ");
//			selct = scanner.nextInt();
//
//			switch (selct) {
//			case 1:
//				System.out.print("고객번호 : ");
//				customer = scanner.nextInt();
//				System.out.print("금액 : ");
//				inOut = scanner.nextInt();
//
//				arr[customer - 1] += inOut;
//				System.out.println("입금 결과 : 고객번호 :" + customer + " 잔액 : " + arr[customer - 1]);
//				break;
//			case 2:
//				System.out.print("고객번호 : ");
//				customer = scanner.nextInt();
//				System.out.print("금액 : ");
//				inOut = scanner.nextInt();
//
//				if (arr[customer - 1] >= inOut) {
//					arr[customer - 1] -= inOut;
//					System.out.println("출금결과 : 고객번호 :" + customer + " 잔액 : " + arr[customer - 1]);
//				} else {
//					System.out.println("잔액이 부족합니다.");
//				}
//				break;
//			case 3:
//				System.out.println("고객명\t" + "잔액 \n ----\t" + "---");
//				for (int i = 0; i <= arr.length; i++) {
//					System.out.println((i + 1) + "\t" + arr[i]);
//				}
//				break;
//			case 4:
//				System.out.println(">>>>>> Thank tou <<<<<<");
//				loop = false;
//				break;
//			default:
//				System.out.println("1~4번을 눌러주세요");
//			}
//		}
//
//	}
//
//}
