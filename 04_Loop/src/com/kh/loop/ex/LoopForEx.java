package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEx {

	public void guguDan() {
		// 사용자로부터 숫자를 입력받고 숫자에 해당하는 구구단을 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 세계로 오신 것을 환영합니다.");

		// 구구단 0 을 입력하기 전까지 반복해서 출력하기
		// 반복하기 위해 while문 사용
		while (true) {
			System.out.println("종료를 원하면 0 입력하기");
			System.out.println("원하는 수를 입력해주세요.");
			int dan = sc.nextInt();

			// 만약에 숫자 0이 들어오면 프로그램 종료하기
			if (dan == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			// 받은 수를 for 문 이용해서 출력
			for (int a = 1; a <= 9; ++a) {
				System.out.println(dan + "단 * " + a + " = " + (dan * a));
			}
		}
	}

	// 1부터 10까지의 숫자 중에서 홀수만 출력하기
	// 홀수 = odd
	public void oddNum() {
		for (int num = 1; num <= 10; num++) {
			if (num % 2 != 0) {
				System.out.println(num);
			}
		}
	}

	public void even() {
		for (int num = 1; num <= 10; num++) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
	}

	// 정사각형 모양의 별 출력
	public void squareStar() {
		int star = 3;
		for (int i = 0; i < star; i++) { //한줄출력 0 1 2
			
			for(int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			System.out.println(); //가로로 별을 출력한다음 줄바꿈
		}
	}
	//정사각형 모양의 별 출력 가로로 5개씩 출력
	public void fiveStar() {
		int star = 5;
		for (int a = 0; a < star; a++) {
			System.out.print("* * * * *"); {

			}
			System.out.println();
		}
	}
	//숫자를 맞출 때까지 계속 문제를 풀도록 하기
	public void numberGame() {
		//숫자 맞추기 게임
		//랜덤으로 만들어진 숫자가 무엇인지 키보드로 맞추기
		Scanner sc = new Scanner(System.in);
		
		//랜덤으로 숫자 만들기
		Random random = new Random();
		
		while (true) {
			int randomNumber = random.nextInt(3) + 1; //1 ~ 3
			System.out.println("숫자를 맞춰보세요 : ");
			
			
			// 만약에 숫자를 맞췄다면 숫자를 맞췄습니다.
			for ( int attack = 1; attack <=2; attack++) {
				System.out.println("공격을 " + attack + " 회 시도합니다 (숫자적기) : ");
				int guest = sc.nextInt();
				if(guest == randomNumber) {
					System.out.println("축하합니다!");
					
				}else if (guest > randomNumber){
					System.out.println("숫자값이 정답보다 큽니다 ");
					System.out.println("정답은 " + randomNumber + "입니다");
				
				}else {
					System.out.println("틀렸습니다");
					System.out.println("정답은 " + randomNumber + "입니다");
			
				}
			
			}
			System.out.print("게임을 다시 시작하겠습니까? (1번 yes / 2번 no)");
			int playAgain =sc.nextInt();
			if(playAgain == 2) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
			
		
		
		
		
	}
//switch (playAgain) {
//case 1 : 
	//System.out.println("게임을 시작합니다");	
	

 
//case 2 : 
	//System.out.println("게임을 종료합니다");
	//break;
	
	

//default : 
	//System.out.println("잘못된 번호입니다 다시 입력하세요");
}
