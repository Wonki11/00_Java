package com.kh.oop.method.ex;

public class HamburgerStore {

	//필드 햄버거 이름 가격
	private String name;
	private int price;
	
	//setter
	//getter
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public HamburgerStore() {
		
	}
	
	public HamburgerStore(String name , int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {		
		System.out.println("햄버거 이름 : " + name);
		System.out.println("가 격 : " + price);
		System.out.println("=============");
	}
	
	public static void main(String[] args) {
		HamburgerStore ham1 = new HamburgerStore();
		ham1.setName("불고기버거");
		ham1.setPrice(2000);
		
		ham1.info();
		
		HamburgerStore ham2 = new HamburgerStore("치즈버거" , 3000);
		ham2.info();
		
	}
}
