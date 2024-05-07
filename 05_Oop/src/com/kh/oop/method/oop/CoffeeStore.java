package com.kh.oop.method.oop;

public class CoffeeStore {
	
	private CoffeeMaker maker;
	private String storeName; //가게이름
	private String location; //가게위치
	
	public void setMaker(CoffeeMaker maker) {
		this.maker = maker;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public CoffeeMaker getMaker() {
		return maker;
	}
	public String getStoreName() {
		return storeName;
	}
	public String getLocation() {
		return location;
	}
	
	public CoffeeStore() {
		
	}
	
	public CoffeeStore(CoffeeMaker maker , String storeName , String location) {
		this.maker = maker;
		this.storeName = storeName;
		this.location = location;
	}
	
	public void info() {
		System.out.println("지역 : " + location);
		System.out.println(storeName + "에 주문한 커피 정보" );
		maker.makeCoffee();
	}
	public void orderCoffee() {
		
		
	}
	
	
	}

