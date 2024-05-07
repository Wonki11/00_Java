package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitchIf {
	
	public static void takeAtaxi() {
		// 입력받은 돈이 3000원 이상일 경우에만 택시를 탈 것인지 물어볼 것
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 보유하고 있는 금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		// if 문을 사용해서 금액이 3000원 이상일 경우에만 물어보는 코드를 작성
		if(money >= 3000) {
			System.out.println("택시를 탈까요? (예/아니오)");
			String answer = sc.next();
			
			//answer로 받은 대답에 따라 응답을 처리하기
			switch (answer) {
			case "예" :
				System.out.println("택시를 탔습니다.");
				break;
			case "아니오" :
				System.out.println("택시를 타지 않습니다.");
				break;
				default : 
					System.out.println("잘못된 입력입니다.");
			}
		}else {
			System.out.println("3000원 이하이므로 잔액이 부족합니다.");
		}
	}
	/*
	 사용자로 부터 점수를 입력받아 성적 등급을 판별하는 프로그램 작성
	 90 이상일 경우 A 학점
	 80 이상일 경우 B 학점
	 70 이상일 경우 C
	 60 이상일 경우 D
	 60 미만일 경우 F
	 F 학점일때 재수강 하시겠습니까? (YES / NO)
	  */
	
	public static void whyscore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F 재수강하시겠습니까? (예/아니오)");
			String answer = sc.next();
			switch (answer) {
			case "예" : case "y" : case "네" : case "Y" :
				System.out.println("재수강 신청되었습니다");
				break;
			case "아니오" : case "n" : case "N" : case "아니요" :
				System.out.println("재수강 신청을 하지 않았습니다");
				break;
			default :
				System.out.println("잘못된 입력입니다.");
			}
		}

	}
	
	public static void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요");
		int num = sc.nextInt();
		
		switch (num) {
		case 1 : 
			System.out.println("입력 메뉴입니다");
			break;
		case 2 : 
			System.out.println("수정 메뉴입니다");
			break;
		case 3 :
			System.out.println("조회 메뉴입니다");
			break;
		case 4 :
			System.out.println("삭제 메뉴입니다");
			break;
		case 7 : 
			System.out.println("종료 메뉴입니다");
			break;
		default :
			System.out.println("잘못된 번호입니다");
				
			
			
		}
			
	  }
	public static void ex2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("짝수입니다");
		}else if (num % 2 == 1  ) {
			System.out.println("홀수입니다");
		}else
			System.out.println("양수만 입력하세요");
			
		
	}
	public static void whatday() {
		Scanner sc = new Scanner(System.in);
		System.out.println("무슨 요일 입니까");
		String day = sc.next();
		
		String result;
		
		switch (day) {
		case "월요일" : case "수요일" : case "금요일" :
			result = "헬스가는날";
			break;
		case "화요일" : case "목요일" :
			result = "공부하는날";
			break;
		case "토요일" : case "일요일" :
			System.out.println("주말인데 집에서 쉴 예정입니까? (예 / 아니오)");
			String answer = sc.next();
			
		switch (answer) {
		case "예" : case "네" :
			//result = "푹 쉬세요";
			break;
		case "아니오" : case "아니요" :
			//System.out.println("어떤 활동을 하실건가요?");
			//String act = sc.next();
			if (answer.equals("예")) {
				result = "집에서 쉴 예정입니다.";
			}else {
				System.out.println("어떤 활동을 할 계획인가요?");
				System.out.print("1.등산 / 2.독서 / 3.수영 : ");
				int activity = sc.nextInt();
				switch (activity) {
				case 1 :
					result = "등산";
					break;
				case 2 :
					result = "독서";
					break;
				case 3 :
					result = "수영";
					break;
				default :
					result = "잘못된 입력";
					
						
				}
			}
			System.out.println( result + " 입니다");
		}
	}
	
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		//takeAtaxi();
		//whyscore();
		//ex1();
		//ex2();
		whatday();

	}

}
