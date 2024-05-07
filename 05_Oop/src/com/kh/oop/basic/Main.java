package com.kh.oop.basic;

public class Main {
	
	//생성자 (필수로 값을 넣어야 하거나 또는 초기에 담을 공간을 생성하는 메서드)
	public Main() {
		
	}
	
	//내가 만든 파일 중에서 최종적으로 출시할 파일만 실행

	public static void main(String[] args) {
		Main main = new Main();
		main.practice2();
	}
	public void practice1() {
		
		// 쿠키 클래스의 객체 생성
		쿠키 myCookie = new 쿠키();

		
		//쿠키의 크기와 모양을 설정
		//객체의 속성 설정
		myCookie.size = "라지";
		myCookie.shape = "동그라미";
		
		// 쿠키에 대한 정보 출력
		System.out.println("쿠키의 크기 : " + myCookie.size);
		System.out.println("쿠키의 모양 : " + myCookie.shape);
		
		쿠키 카페판매용쿠키 = new 쿠키();
		카페판매용쿠키.size = "아담함";
		카페판매용쿠키.shape = "별모양";
		
		System.out.println("쿠키의 크기 : " + 카페판매용쿠키.size);
		System.out.println("쿠키의 모양 : " + 카페판매용쿠키.shape);
	}
	public void practice2() {
		
		Nation pp = new Nation();
		
		pp.name = "홍길동";
		pp.age = 55;
		pp.gender = 'F';
		pp.jumin = "550101-2345678";
		System.out.println("이름 : " + pp.name);
		System.out.println("나이 : " + pp.age);
		System.out.println("성별 : " + pp.gender);
		System.out.println("주민번호 : " + pp.jumin);
		
		pp.spko();
		pp.welfare();
		
		
		Nation 국민2 = new Nation();
		국민2.name = "신짱구";
		국민2.age = 5;
		국민2.gender = '여';
		System.out.println("이름 : " + 국민2.name);
		System.out.println("나이 : " + 국민2.age);
		System.out.println("성별 : " + 국민2.gender);
		
		
		pp.납세의의무();
		국민2.납세의의무();
		
		
				
		
	}

}
