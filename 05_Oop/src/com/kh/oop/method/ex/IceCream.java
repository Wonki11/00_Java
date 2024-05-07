package com.kh.oop.method.ex;

public class IceCream {
	//필드
	private String name;
	private int suger;
	private boolean milk;
public void setName(String name) {
		this.name = name;
	}
	public void setSuger(int suger) {
		this.suger = suger;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	//메서드
	//생성자 : 기본
	public String getName() {
		return name;
	}
	public int getSuger() {
		return suger;
	}
	public boolean isMilk() {
		return milk;
	}

	public IceCream() {
		
	}
	
	public IceCream(String name , int suger , boolean milk) {
		
	}
	
	public void makeIceCream() {
		System.out.println("------------");
		System.out.println("이름 : " + name);
		System.out.println("설탕 : " + suger);
		System.out.println("우유 유무 : " + milk);
		if(milk) {
			System.out.println("우유 추가");
		}else {
			System.out.println("우유 미추가");
		}
		System.out.println("아이스크림 나왔습니다");
	}
	
	/*public static void main(String[] args) {
		IceCream ice1 = new IceCream();
		ice1.setName("우유바");
		ice1.setSuger(30);
		ice1.setMilk(true);
		ice1.makeIceCream();
		
	}*/
	

}