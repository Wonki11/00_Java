package com.kh.oop.method.ex;

public class Circle {
	//필드
	private double pi = 3.14;
	private int radius = 1; // <- 반지름
	
	//Setter Getter
	public void setPi(double pi) {
		this.pi = pi;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getPi() {
		return pi;
	}
	public int getRadius() {
		return radius;
	}
	
	//생성자
	public Circle() {
		
	}
	
	//메서드
	
	public void incrementRadius() { //<- 반지름 증가
		//반지름을 1씩 증가하기
		radius++;
	}
	
	public void getAreaOfcircle() {
		// 소수자리
		double area = pi * radius * radius;
		System.out.println("원의 넓이 : " + area);
	}
	
	public void getSizeOfcircle() { //size 둘레
		//3.14 소수자리
		double size = 2 * pi * radius;
		System.out.println("원의 둘레 : " + size);
	}
	public static void main(String[] args) {
		//원 객체 생성 원
		Circle 원 = new Circle();
		
		//1씩 증가하기 전에 원의 둘레와 넓이 출력하기
		System.out.println(" 원의 초기 둘레와 넓이 ");
		원.getSizeOfcircle();
		원.getAreaOfcircle();
		
		//반지름 원이 1씩 증가한다면 ?!
		원.incrementRadius(); // 1씩 원의 크기를 증가시킨다
		
		//증가된 반지름의 원의 둘레 및 넓이 출력
		System.out.println("반지름 1 증가 후 원의 둘레와 넓이");
		원.getSizeOfcircle();
		원.getAreaOfcircle();
	
	}
		
	}

