package com.kh.op;

import java.util.Scanner;

public class OperatorPre3 {

	public static void main(String[] args) {
		//method1();
		//method2();
		ex1();

	}
	//public static void method1() 을 만들어서
	// Scanner 를 이용해 num1 num2 의 값을 입력받고
	// < > 를 사용해서 입력 받은 값이 < > 중 어떤 값에서 true 가 나오는지 확인하기
	// boolean result1 = num1 > num2;
	// boolean result2 = num1 >= num2;
	// boolean result3 = num1 < num2;
	// boolean result4 = num1 <= num2;
	
	//응용편
	//public static void method2() num1 num2 num3 를 받고
	//&& || 사용해서 크고 작은 값 확인하기
	// boolean result = (num1 < num2) && (num2 == num3) 참이 되는가?
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("num1 의 값 : ");
		int num1 = sc.nextInt();
		System.out.println("num2 의 값 : ");
		int num2 = sc.nextInt();
		boolean result1 = num1 < num2;
		boolean result2 = num1 > num2;
		System.out.println("num1과 num2의 관계 : " + result1);
		System.out.println("num1과 num2의 관계 : " + result2);
		
	}
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수 : ");
		int q = sc.nextInt();
		System.out.println("두번째 수 : ");
		int w = sc.nextInt();
		System.out.println("세번째 수 : ");
		int e = sc.nextInt();
		boolean result = (q < w) && (w == e);
		System.out.println("result : " + result);
		// && if while 조건을 체크할 때 
		//      두 개의 조건이 모두 만족하는 경우 사용
		//  &   비트 단위 연산 특정 비트 패턴을 판단할 때 사용
	}
	public static void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1수 : ");
		int qq = sc.nextInt();
		System.out.println("2수 : ");
		int ww = sc.nextInt();
		System.out.println("3수 : ");
		int ee = sc.nextInt();
		boolean rr = (qq < ww) && (qq > ee) && (ww > ee);
				System.out.println("rr은 트루인가 참인가 : " + rr);
				
	}
}
