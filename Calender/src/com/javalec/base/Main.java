package com.javalec.base;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		String[] dateName = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		int year = calendar.get(calendar.YEAR);					// 년도
		int month = calendar.get(calendar.MONTH)+1;				// 달
		int day = calendar.get(calendar.DAY_OF_MONTH);			// 날짜
		int date = calendar.get(calendar.DAY_OF_WEEK);			// 요일
		
		int hour = calendar.get(calendar.HOUR);					// 시간
		int minute = calendar.get(calendar.MINUTE);				// 분
		int second = calendar.get(calendar.SECOND);				// 초
		
		System.out.println(year + "." + String.format("%02d", month) + "." + day + "." + "(" + dateName[date] + ")");
		System.out.println(hour + ":" + minute + ":" + second);
		

	}

}
