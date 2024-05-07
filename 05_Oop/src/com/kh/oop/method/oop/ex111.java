package com.kh.oop.method.oop;

import com.kh.oop.basic.Main;

public class ex111 {
//필드 카페
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getKind() {
		return kind;
	}
	public String getName() {
		return name;
	}
	public String getFlavor() {
		return flavor;
	}
	public int getNumOf() {
		return numOf;
	}
	public int getPrice() {
		return price;
	}
	
	public ex111() {
		
	}
	
	public ex111(String kind, String name, String flavor,int numOf,int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	public void info() {
		System.out.println("종류 : " + kind);
		System.out.println("이름 : " + name);
		System.out.println("맛 : " + flavor);
		System.out.println("개수 : " + numOf);
		System.out.println("가격 : " + price);
		
		
	}
	public static void main(String[] args) {
		ex111 ex = new ex111();
		ex.setKind("감자칩");
		ex.setName("스윙칩");
		ex.setFlavor("칠리맛");
		ex.setNumOf(3);
		ex.setPrice(2000);
		System.out.println("=======");
		ex.info();
	}
	
	
	
	
	
	
	
	
	
	
	
}
