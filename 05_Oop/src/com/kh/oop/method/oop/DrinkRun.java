package com.kh.oop.method.oop;

public class DrinkRun {

	public static void main(String[] args) {
		DrinkMaker one = new DrinkMaker("허브티",1, 5);
		DrinkMaker one1 = new DrinkMaker("아메리카노",3,1);
		one.makeDrink();
		one1.makeDrink();
		
		DrinkStore two = new DrinkStore(one, "경기","맥아커피",false);
		DrinkStore two1 = new DrinkStore(one1,"서초구","빠나쁘레소", true);
		two.orderDrink();
		two1.orderDrink();

	}

}
