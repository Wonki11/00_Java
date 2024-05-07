package com.kh.op;

import java.util.Scanner;

public class OperatorPre {
	//메인 메서드 호출
	public static void main(String[] args) {
		method1();
	}
	//최종으로 출력하는 메서드는 아님
	//내가 필요할 때 꺼내서 사용하는 메서드
	//메서드 : 특정 상태나 기능을 정리해놓은 집합
	//static : 고정된 이라는 뜻을 가지고 있음
	// static 이 붙는 것은 자료형이나 변수에 담아서 쓰는게 아니라
	// 단독으로 고정적으로 메모리에서 사용할 수 있음을 나타내는 표현
	
	
	public static void method1() {
		// 1. int num1 = 10 int num2 = 3
		// 더하기 빼기 곱하기 나누기 결과를 출력하기
		
		//int num1 = 10;
		//int num2 = 3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값을 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("b의 값을 입력하세요");
	    int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		System.out.println("더하기 결과 : " +sum);
		
		int dif = num1 - num2;
		System.out.println("빼기 결과 : " +dif);
		
		int sum3 = num1 * num2;
		System.out.println("곱하기 결과 : " +sum3);
		
		int sum4 = num1 / num2; 
		System.out.println("나누기 결과 : " + sum4);
		
		
		// 2. double num3 = 2.5 double num4 = 3.5
		// 더하기 빼기 곱하기 나누기 결과 출력하기
		
		//double a = 2.5;
		//double b = 3.5;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("a의 값을 입력하세요");
		double a = sc1.nextDouble();
		System.out.println("b의 값을 입력하세요");
	    double b = sc1.nextDouble();
		
		double sun = a + b;
		System.out.println("덧셈 결과 : " +sun);
		
		double sun2 = a - b;
		System.out.println("뺄셈 결과 : " +sun2);
		
		double sun3 = a * b;
		System.out.println("곱셈 결과 : " +sun3);
		
		double sun4 = a / b;
		System.out.println("나눗셈 결과 : " +sun4);
		
		//******************************************
	
	    
		
		
				
		
		

	}

}
