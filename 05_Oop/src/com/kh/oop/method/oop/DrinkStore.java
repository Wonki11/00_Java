package com.kh.oop.method.oop;

public class DrinkStore {
//필드
	private DrinkMaker maker;
	private String location;
	private String name;
	private boolean takeout;
	
	
	public DrinkMaker getMaker() {
		return maker;
	}
	public String getLocation() {
		return location;
	}
	public String getName() {
		return name;
	}
	public boolean isTakeout() {
		return takeout;
	}
	public void setMaker(DrinkMaker maker) {
		this.maker = maker;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTakeout(boolean takeout) {
		this.takeout = takeout;
	}
	
	public DrinkStore() {
		
	}
	
	public DrinkStore(DrinkMaker maker , String location , String name , boolean takeout) {
		this.maker = maker;
		this.location = location;
		this.name = name;
		this.takeout = takeout;
	}
	
	public void orderDrink() {
		System.out.println(location + "지역에서 주문한 " + name + " 입니다");
		if(takeout) {
			System.out.println("테이크아웃");
		}else {
			System.out.println("매장내 섭취");
		}
	}
	
	
	
	
	
	
	
	
}
