package com.kh.javaAPIEx;

public class StringPre {

	public static void main(String[] args) {
		// substring 메서드를 사용해서 Today 추출
		String 문제1 = "Today is a beautiful day.";
		String 스트링1 = 문제1.substring(0,5);
		System.out.println(스트링1);
		System.out.println("=================");
		// toUpperCase 메서드를 사용해서 모두 대문자로 변환
		String 문제2 = "Programming is fun and challenging";
		String 스트링2 = 문제2.toUpperCase();
				System.out.println(스트링2);
		// toLowerCase 메서드를 사용해서 모두 소문자로 변환
		String 문제3 = "Learning new things os exciting";
		String 스트링3 = 문제3.toLowerCase();
		System.out.println(스트링3);
		// split 활용해서 문자열을 " " 로 구분하기
		String 문제4 = "A good medicine tastes bitter";
		String[] 스트링4 = 문제4.split(" ");
		for(String 스트4 : 스트링4) {
			System.out.println(스트4);
		}
		// replace 활용해서 more 을 less 로 대체
		String 문제5 = "The more, the better";
		String 스트링5 = 문제5.replace("The", "then");
		System.out.println(스트링5);
		// charAt 사용해서 6번째 글자를 가져오기
		String 문제6 = "Walls have ears";
		char 스트링6 = 문제6.charAt(6);
		System.out.println(스트링6);
		// substring 메서드를 사용해서 his부터 끝까지 추출
		String 문제7 = "Every dog has his day";
		String 스트링7 = 문제7.substring(14,21);
		System.out.println(스트링7);
		
		

	}

}
