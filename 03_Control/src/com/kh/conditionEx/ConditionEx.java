package com.kh.conditionEx;

import java.util.Scanner;

// 패키지 : 작성한 파일의 폴더 위치

//조건문 기능용 클래스
public class ConditionEx {
	/*
	 if 와 else class
	 
	 
	 if 주어진 조건이 참일 때 실행되는 코드 블록
	 else 조건이 거짓일 때 실행되는 코드 블록(필수가 아님)
	 
	 사용방법
	 if (조건문) {
	 	조건이 참일 경우 실행할 코드 작성
	 	만약에 조건문의 조건이 참이 아닐 경우 
	 	자동으로 실행 종료
	 }
	
	 */
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("고객님의 나이를 입력하세요 : " );
		int age = sc.nextInt();
		// 만약에 고객의 나이가 19세 이상이라면
		if (age >= 19) {
		// age의 값이 19 이상이면 성인입니다 출력되게 하기
			System.out.println("성인입니다.");
		} else {
		// 만약에 age 값이 성인이 아니라면 성인이 아닙니다. 출력하게 하기
			System.out.println("성인이 아닙니다.");
		}
		
	}
	
	public static void method2() {
		int num = 3;
		
		// 만약에 num 이 짝수일 경우  짝수입니다. 출력하기
		// 짝수 2 % 0
		if (num % 2 == 0) {
			System.out.println("짝수입니다!!!");
		} else {
			System.out.println("홀수입니다.");
		}
		// num 이 홀수일 경우 홀수입니다 출력하기
		
		
	}
	
	public static void method3() {
		int age = 20;
			//    true        true
		if (age > 0   && age < 14) {
			//어린이라고 표기하기
			System.out.println("어린입니다.");
		} else {
			System.out.println("어린이가 아닙니다.");
		}		
	}
	
	// Scanner 활용해서 진행하기
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		
		int age = sc.nextInt();
		
		if (age >= 10 && age < 20) {
			System.out.println("10대입니다.");
		} else {
			System.out.println("10대가 아닙니다.");
		}
	}
	public static void practice2() {
		int age = 88;
		if ( age >= 80) {
			System.out.println("80세 이상입니다.");
		}
	}

	
	
	
	// 최종 메서드
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		practice1();
		practice2();
	}
}