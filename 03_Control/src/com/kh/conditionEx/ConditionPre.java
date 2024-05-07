package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPre {

	 public static void method1() {
		// if 문 활용 숫자 값 2개를 받아서 숫자 두개가 일치하는지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 값을 입력하세요.");
		int num1 = sc.nextInt();
		System.out.print("num2 값을 입력하세요.");
		int num2 = sc.nextInt();
		if (num1 == num2) {
			System.out.println(num1 + " 과 " + num2 + " 의 값이 같습니다.");
		} else {
			System.out.println(num1 + " 과 " + num2 + " 의 값은 같지 않습니다.");
		}
	 }
	public static void method2() {
	// if 문 활용 문자 값 2개를 받아서 문자 두개가 일치하는지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("str1 값을 입력하세요.");
		String str1 = sc.nextLine();
		System.out.print("str2 값을 입력하세요.");
		String str2 = sc.nextLine();
		if(str1.equals(str2)) {
			System.out.println(str1 + " 과 " + str2 + " 는 같습니다.");
		} else {
			System.out.println(str1 + " 과 " + str2 + " 는 같지 않습니다.");
		}
		
	}
	//method3 double 로 실수 2개 값 받아서 실수 두개가 일치하는지 확인 ==
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("double1 값을 입력하세요.");
		double double1 = sc.nextDouble();
		System.out.print("double2 값을 입력하세요.");
		double double2 = sc.nextDouble();
		
		if (double1 == double2) { 
			System.out.println(double1 + " 과 " + double2 + " 는 일치합니다.");
		} else {
			System.out.println(double1 + " 과 " + double2 + " 는 일치하지 않습니다.");
		}
	}
	
	
	
	//최종으로 실행할 메인 메서드
	public static void main(String[] args) {
		method1();
		method2();
		method3();

	}

}