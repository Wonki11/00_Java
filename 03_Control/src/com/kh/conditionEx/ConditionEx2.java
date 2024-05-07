package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionEx2 {
	/*
	 if - else if - else
	 사용방법
	 if (조건1) {
	 	조건이 참일 경우 실행할 코드 작성
	 } else if (조건2) {
	 		조건1이 거짓일 경우 실행할 코드 작성
	 } else{
	 		조건1과 조건2가 모두 거짓일 경우 실행할 코드 작성
	 }
	 */
	
	
	// 만약에 돈이 2000원 이상 있을 경우 택시를탄다
	// 만약에 돈이 1500~1900 이하 있을 경우 대중교통을 이용한다.
	// 만약에 돈이 없을경우 걸어간다.
	public static void main(String[] args) {
		//ex1();
		//ex2();
		//ex3();
		//ex4();
		//ex5();
		//method1();
		//ex6();
		ex7();
		
	}
	public static void ex1() {
		/*
		 나이를 입력받아
		 13세 이하면 "어린이"
		 13세 초과 18세 이하 "청소년"
		 18세 초과 "성인"
		 * */
		Scanner se = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int num = se.nextInt();
		
		if (num <= 13) {
			System.out.println("어린이 입니다.");
		} else if (num <= 18) {
			System.out.println("청소년");
		} else {
			System.out.println("성인");
		}
		
	}
	public static void ex2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("짝수");
		}else if (num % 2 == 1) {
			System.out.println("홀수");
		}else {
			System.out.println("양수");
		}
	}
	public static void ex3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하세요");
		int num = sc.nextInt();
		
		if (num >= 2 && num <= 5) {
			System.out.println("봄");
		}else if (num >= 6 && num <= 8) {
			System.out.println("여름");
		}else if (num >= 9 && num <= 11){
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
	}
	public static void ex4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 : ");
		double a = sc.nextDouble();
		
		System.out.println("영어 점수 : ");
		double b = sc.nextDouble();
		
		System.out.println("수학 점수 : ");
		double c = sc.nextDouble();
		
		double plus = (a+b+c);
		System.out.println("3과목 합계 : " + plus);
		double plus1 = plus / 3;
		System.out.println("3과목 평균 : " +plus1);
		String result;
		
		if (a >= 60 && b >= 60 && c >= 60) {
			result = "축하합니다 합격입니다";
		} else {
			result = "불합격입니다";
		}	
		System.out.println(result);
	}
	public static void ex5() {
		//13세 이하 어린이 14 ~ 18세 청소년 19세 성인
		
		int age = 16;
		// 변수의 기능을 활용해서 마지막에 나이에 따른 표기를 출력
		String result;
		if(age <= 13) {
			result = "어린이";
		} else if (age >= 14 && age <= 18) {
			result = "청소년";
		} else {
			result = "성인";
		}
		System.out.println(result + "입니다.");
	}
		
	
	
	/*
	 나이를 입력받아
	 13세 이하면 "어린이"
	 13세 초과 18세 이하 "청소년"
	 18세 초과 "성인"
	 * */
	
	/*
	 달 을 입력받아 해당하는 계절 출력하기
	 봄 : 3,4,5
	 여름 : 6,7,8,
	 가을 : 9,10,11
	 겨울 : 12,1,2
	 * */
	
	
	
	
	
	
	
	
	public static void method1() {
		
		// 만약에 돈이 2000원 이상 있을 경우 택시를탄다
		// 만약에 돈이 1500~1900 이하 있을 경우 대중교통을 이용한다.
		// 만약에 돈이 없을경우 걸어간다.
		
		int money = 1400; // 내가 현재 가지고 있는 돈
		String result;
		
		if(money >= 2000) {
			result = "택시";
		} else if (money >= 1500 && money <= 1900) {
			result = "버스";
			//1400원 이하 있을 경우 걸어간다.
		} else {
			result = "워킹";
		
			
		}
		
		System.out.println(result);
	}
	public static void ex6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("키 : ");
		double a = sc.nextDouble();
		
		System.out.println("몸무게 : ");
		double b = sc.nextDouble();
		
		double c = b / (a * a);
		String result;
		
		System.out.println("bmi : " + c);
		
		if (c < 18.5) {
			result = "저체중";
		} else if (c >= 18.5 && c < 23) {
			result = "정상";
		} else if (c >= 23 && c < 25) {
			result = "과체중";
		} else if (c >=25 && c <30) {
			result = "비만";
		} else {
			result = "고도 비만";
		}
		System.out.println(result);
	}
	public static void ex7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("중간고사 점수");
		double q = sc.nextDouble();
		
		System.out.println("기말 점수");
		double w = sc.nextDouble();
		
		System.out.println("과제 점수");
		double e = sc.nextDouble();
		
		System.out.println("출석 횟수");
		double r = sc.nextDouble();
		String result;
		
		if ( r <= 10) {
			result = "출석 부족";
		}  
			
		
	}

}
