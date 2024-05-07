package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhileEX {
	
	/*
	 public static void method1() {
	 Scanner sc = new Scanner(system.in);
	 1. 게임하기 2. 수영하기 .3 잠자기 4. 프로그램 종료
	 int menu
	 while(true) {
	 	sysout ~~프로그램 작성
	 	sysout 원하는 프로그램 번호입력
	 	switch(menu) {
	 	case1 :~ case4 :
	 }
	 while문을 사용해서
	 4번을 누르면 프로그램을 종료하는 코드를 작성하기
	 * */
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			//System.out.println("프로그램 작성");
			System.out.println("원하는 프로그램 번호를 입력하세요");
			
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1 :
				System.out.println("게임하기");
				break;
			case 2 :
				System.out.println("수영하기");
				break;
			case 3 :
				System.out.println("잠자기");
				break;
			case 4 : 
				System.out.println("프로그램 종료");
				return;
			default :
				System.out.println("잘못된 번호입니다.");
			}
		}
		
	}
	
	public static void kh() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {	System.out.println("kh카페에 오신걸 환영합니다. \n"
				+ "원하는 메뉴를 입력해주세요 \n"
				+ "1. 아메리카노 2. 카페라떼 3. 녹차 4. 흑당버블티 5. 주문취소");
		
		String menu = sc.next();
		
		switch (menu) {
		case "1" :
			System.out.println("아메리카노 주문 완료");
			break;
		case "2" :
			System.out.println("카페라떼 주문 완료");
			break;
		case "3" :
			System.out.println("녹차 주문 완료");
			break;
		case "4" :
			System.out.println("흑당버블티 주문 완료");
			break;
		case "5" :
			System.out.println("주문취소");
			return;
		default :
			System.out.println("다시 입력해주세요");
		}
			
		}
	
	
	}

	public static void getMoney() {
		//커피값 10잔 가진돈 300원
		int coffee = 10;
		int money = 300;
		
		//만약에 돈이 0보다 많다면 커피를 구매하고 
		//커피가 다 소진되면 판매를 중지한다.
		
		while(money > 0) {
			System.out.println("돈을 받았으니 커피를 제공");
			//커피가 10잔인데 1잔 제공했다면 -1
			coffee--;
			System.out.println("남은 커피의 양은" + coffee + " 잔 입니다.");
			//커피가 모두 소진됐다면 판매를 중지하자
			if(coffee == 0) {
				System.out.println("커피 소진 판매 중지");
				return;
			}
		}
	}
	// 1부터 5까지 숫자를 출력
	public static void allNumber() {

		int num = 1;
		while(num <= 5) {
			System.out.println(num);
			num++; // num = num + 1;
		}
    }
	
	public static void tree() {
		// 나무를 찍기 전이기 때문에 공격 0
		int hit = 0;
		
		while(hit < 10) {
			hit++; // 나무 1번 찍을 때마다 hit = hit + 1;
			System.out.println("나무를 " + hit + " 번 찍었습니다.");
			//만약에 나무를 공격한 수가 10번이 되면 나무 넘어갑니다 표현
			if(hit == 10) {
				System.out.println("나무가 넘어갑니다");
			}
		}
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0보다 큰 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		
		if (num < 1) {
			System.out.println("1이상의 숫자를 입력하세요");
		} else {
			System.out.println("1부터 " + num + " 까지의 숫자들");
			int abc = 1;
			//while문을 사용해서 숫자 abc 부터 num까지 모두 출력하기
			while( abc <= num) {
				System.out.println(abc); //1
				abc++; //abc = abc+1;
			}
		}
		
	}
	
	public static void getCoffee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("카페에 오신걸 환영합니다");
		System.out.println("현재 가진 돈을 입력해주세요");
		// 커피가격
		int coffeeprice = 100;
		// 현재 가지고 있는 금액 입력
		int money = sc.nextInt();
		
		while(money < coffeeprice) {
			System.out.println("돈이 부족합니다");
			System.out.println("현재 가진 돈을 입력해주세요");
			money = sc.nextInt();
					
		}
		System.out.println("커피를 구매했습니다. 거스름돈은 " 
		+ (money - coffeeprice) + ( " 입니다."));
		
	}
	
	public static void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("가진 돈을 입력해주세요");
		int pork = 10000;
		int money = sc.nextInt();
		
		while ( money < pork) {
			System.out.println("잔액이 부족합니다");
			System.out.println("금액을 다시 입력해주세요");
			money = sc.nextInt();
			
		}
		System.out.println("탕수육을 구매했습니다. 거스름돈은 " + (money - pork) + ( " 입니다"));
	}
	
	public static void main(String[] args) {
		//method1();
		 //kh();
		//getMoney();
		//allNumber();
		//tree();
		method2();
		//getCoffee();
		//ex1();

			
		
	}

}

