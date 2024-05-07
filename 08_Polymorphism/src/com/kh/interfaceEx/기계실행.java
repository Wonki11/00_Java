package com.kh.interfaceEx;

public class 기계실행 {
	public static void main(String[] args) {
		컴퓨터 윈도우 = new 컴퓨터();
		윈도우.전원켜기();
		윈도우.전원끄기();
		
		세탁기 돌돌이 = new 세탁기();
		돌돌이.전원켜기();
		돌돌이.전원끄기();
		
		어린이용계산기 c1 = new 어린이용계산기();
		c1.전원켜기();
		c1.전원끄기();
		
		중학생계산기 c2 = new 중학생계산기();
		c2.전원켜기();
		c2.전원끄기();
		
		//계산기 테스트
		int a = 685;
		int b = 35;
		int c = 10;
		int d = 5;
		
		System.out.println(c + " + " + d + " = " + c1.합(c, d));
		System.out.println(c + " - " + d + " = " + c1.차(c, d));
		System.out.println(c + " * " + d + " = " + c1.곱(c, d));
		System.out.println(c + " / " + d + " = " + c1.몫(c, d));
		System.out.println(c + " % " + d + " = " + c1.나머지(c, d));
		System.out.println("=========================================");
		
		System.out.println(a + " + " + b + " = " + c2.합(a, b));
		System.out.println(a + " - " + b + " = " + c2.차(a, b));
		System.out.println(a + " * " + b + " = " + c2.곱(a, b));
		System.out.println(a + " / " + b + " = " + c2.몫(a, b));
		System.out.println(a + " % " + b + " = " + c2.나머지(a, b));
	}
}
