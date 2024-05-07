package com.kh.oop.method.ex;


public class CoffeeMaker {
	//필드
	
	private String coffeeType; // 커피종류
	private int sugar; //설탕양
	private boolean milk; //우유 유무
	//메서드
	
	//setter
	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}
	public void setSuger(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	//getter - boolean 같은 경우 get 이 아니라 is로 표기
	public String getCoffeeType() {
		
		return coffeeType;
	}
	public int getSuger() {
		return sugar;
	}
	public boolean isMilk() {
		return milk;
	}
	
	
	//생성자 : 기본
	public CoffeeMaker( ) {
		
	}
	//생성자 : 필수
	public CoffeeMaker(String coffeeType, int sugar, boolean milk) {
		this.coffeeType = coffeeType;
		this.sugar = sugar;
		this.milk = milk;
	}
	//void info
	public void makeCoffee() {
		System.out.println("커피를 제조합니다.");
		System.out.println("종류 : " + coffeeType);
		System.out.println("설탕 : " + sugar + "g");
		//만약에 우유가 추가됐다면
		if(milk) {
			System.out.println("우유 추가");
		}else {//우유 없음
			System.out.println("우유 미추가");
		}
		System.out.println("커피가 준비되었습니다.");
	}
	
	public static void main(String[] args) {
		//커피 메이커 객체 생성
		CoffeeMaker coffee1 = new CoffeeMaker();
		coffee1.setCoffeeType("아메리카노");
		coffee1.setSuger(1);
		coffee1.setMilk(false); 
		coffee1.makeCoffee();
		System.out.println("-----------");
		
		CoffeeMaker coffee2 = new CoffeeMaker("디카페인아메리카노",2,true);
		coffee2.makeCoffee();
	}
}
