package com.kh.oop.constructor;

public class Cafe {
	// 필드 선언
		//카페 이름,지역,테이블수
	public String name;
	public String location;
	public int tableNum;
	
	
	public Cafe() {
		
	}
	
	public Cafe(String name , String location , int tableNum) {
		this.name = name;
		this.location = location;
		this.tableNum = tableNum;
	}
	
	public void info() {
		System.out.println("카페 이름 : " + name);
		System.out.println("카페 지역 : " + location);
		System.out.println("테이블 수 : " + tableNum);
		System.out.println("-----------------------");
	}
	

	public static void main(String[] args) {
		System.out.println("안녕하세요 kh민족입니다.");
		System.out.println("=== 카페 조회하기 ===");
		
		//Cafe 객체를 사용해서
		//1. 기본생성자로 cafe1 만들기
		// 이름 테이블 작성하고 출력하기
		Cafe cafe1 = new Cafe();
		cafe1.name = "cafe1";
		cafe1.tableNum = 5;
		cafe1.info();
		
		Cafe cafe2 = new Cafe();
		cafe2.location = "서울";
		cafe2.tableNum = 10;
		cafe2.info();
		
		Cafe cafe3 = new Cafe("카페3","부산",15);
		cafe3.info();

	}

}
