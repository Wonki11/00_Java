package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {

	public static void main(String[] args) {
		// SimpleDateFormat 활용해서 날짜만들기
		
		// 1. yyyy-MM-dd
		
		// 2. HH:mm:ss
		
		// 3. yyyy-MM-dd HH:mm:ss

		
		SimpleDateFormat 날짜형식 = new SimpleDateFormat("yyyy-MM-dd");
		String 날짜표시 = 날짜형식.format(new Date());
		System.out.println(날짜표시);
		
		SimpleDateFormat 날짜형식a = new SimpleDateFormat("HH:mm:ss");
		String 날짜표시a = 날짜형식a.format(new Date());
		System.out.println(날짜표시a);
		
		SimpleDateFormat 날짜형식s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date3 = new Date();
		String 날짜표시w = 날짜형식s.format(date3);
		System.out.println(날짜표시w);
	}

}
