package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForRun {

	public static void main(String[] args) {
		// LoopForEx에 작성한 코드를 출력만 해줄 것
		// 대문자 소문자를 다른 글자로 구분하기 때문에 똑같이 작성해줘야함
		LoopForEx 숫자들 = new LoopForEx();
		// 숫자들.guguDan();
		// guguDan();
		// guguDan3();
		// gugudan4();
		// rdnb1();
		// randomfor2();
		// 숫자들.oddNum();
		// 숫자들.even();
		//숫자들.squareStar();
		//숫자들.fiveStar();
		숫자들.numberGame();

	}

	public void guguDan() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("종료를 원할 경우 0을 입력해주세요");
			System.out.println("숫자를 입력해주세요");
			int a = sc.nextInt();

			// 만약에 0이 들어온다면 프로그램 종료
			if (a == 0) {
				System.out.println("프로그램을 종료합니다");
				break;// for while switch 사용 가능 if 단독x
			}

			// continue 자주 사용되지 않음
			// if 1~ 9까지만 입력 가능하도록 조건
			if (a < 1 || a > 9) {
				System.out.println("1부터 9까지의 숫자를 입력하세요");
				continue; // <- 건너뛰고 계속하기
			}
			for (int q = 9; q >= 1; q--) {
				System.out.println(a + "단 * " + q + " = " + (a * q));
			}
		}
		// 구구단 입력 받아 거꾸로 출력하기
	}

	public void guguDan2() {
		// 구구단을 1단부터 9단까지 모두 출력

	}

	public static void guguDan3() {
		// int dan = 원하는 단만 지정해서 출력

		// 1단부터 9단까지 출력
		for (int dan = 1; dan <= 9; dan++) {
			// 1단에서 부터 1 ~ 9를 곱해준 값을 출력
			System.out.println("***** " + dan + " *****");
			for (int num = 1; num <= 9; num++) {

				System.out.print(dan + " * " + num + " = " + (dan * num));

			}

		}
	}

	public static void gugudan4() {
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("=== " + dan + " ===");
			for (int num = 1; num <= 9; num++) {
				System.out.println(dan + " * " + num + " = " + (dan * num));
			}

		}
	}

	public void randomNumber() {
		// Random 불러와서 내가 지정한 범위에서 숫자를 랜덤으로 출력하기
		Random 랜덤 = new Random(); // 로또 번호 생성
		// nextInt() 안에 숫자를 넣어서 어디서부터 어디사이에서 랜덤으로 숫자가 나와야하는지
		// 범위를 지정할 수 있음
		int 랜덤숫자 = 랜덤.nextInt(5);
		// 숫자를 셀 때 코드 안에서는 -1~ 정수 양수 0부터 시작
		// 랜덤으로 지정한 숫자 -1
		System.out.println("랜덤숫자 : " + 랜덤숫자);
	}

	public static void rdnb1() {
		Random 랜덤 = new Random();

		for (int num = 1; num <= 3; num++) {
			int 랜덤숫자 = 랜덤.nextInt(10) + 1;
			System.out.println("랜덤숫자 " + num + " : " + 랜덤숫자);
		}

	}

	public static void randomfor2() {
		Random 랜덤 = new Random();

		for (int num = 1; num <= 6; num++) {
			int 랜덤숫자 = 랜덤.nextInt(45) + 1;
			// if 랜덤 숫자가 같다면 번호를 제외하고 출력하기
			System.out.println("랜덤숫자 " + num + " : " + 랜덤숫자);
		}

	}
}
