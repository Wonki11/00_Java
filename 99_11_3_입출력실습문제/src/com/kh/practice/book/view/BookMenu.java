package com.kh.practice.book.view;

import java.util.Scanner;

import com.kh.practice.book.controller.BookController;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public BookMenu() {
		System.out.println("1. 책 저장");
		System.out.println("2. 책 불러오기");
		System.out.println("3. 종료");
		System.out.println("메뉴선택 : ");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1:
			//책저장
			break;
		case 2:
			//책불러오기
			break;
		case 3:
			System.out.println("프로그램을 종료합니다");
			return;
		default :
			System.out.println("잘못된 입력입니다 다시 입력하세요");
		}
		
		
		
	}
		
	
}
