package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	public void mainMenu() {
		System.out.println("1. 파일저장");
		System.out.println("2. 파일열기");
		System.out.println("3. 파일편집");
		System.out.println("4. 종료");
		System.out.println("메뉴선택 : ");
		
		int choice = sc.nextInt();
		sc.nextLine(); // 남아있는 엔터 지우기
		
		switch(choice) {
		case 1 :
			fileSave();
			break;
		case 2 :
			fileOpen();
			break;
		case 3 :
			fileEdit();
			break;
		case 4 : 
			System.out.println("프로그램종료");
			System.exit(0);
			//return;
		default : 
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	
	//1. 파일 저장
	public void fileSave() {
		System.out.print("파일명 입력 : ");
		String fileName = sc.nextLine();
		
		//만약에 파일이 존재한다면~
		if(fc.checkName(fileName)) {
			System.out.println("파일이 이미 존재합니다.");
		} else {
			System.out.println("작성할 내용 입력 : ");
			String content = sc.nextLine();
			fc.fileSave(fileName,new StringBuilder(content));
		}
	}
	
	//2. 파일 열기
	public void fileOpen() {
		System.out.println("열어줄 파일 이름 입력하기 : ");
		String fileName = sc.nextLine();
		StringBuilder fileContent = fc.fileOpen(fileName);
		System.out.println("파일 내용 : " + fileContent);				
	}
	
	//3. 파일 수정
	public void fileEdit() {
		System.out.println("파일명 입력 : ");
		String fileName = sc.nextLine();
		StringBuilder fileContent = fc.fileOpen(fileName);
		
		//파일이 없다면 파일이 존재하지 않습니다.
		
		System.out.println("현재 파일 내용 : " + fileContent);
		System.out.println("새로운 내용 입력 : ");
		String newContent = sc.nextLine();
		fc.fileEdit(fileName,new StringBuilder(newContent));
	}
}
