package com.kh.oop.method.ex;

public class IceCreamRun {

	public static void main(String[] args) {
		IceCream ice1 = new IceCream();
		ice1.setName("우유바");
		ice1.setSuger(10);
		ice1.setMilk(true);
		ice1.makeIceCream();
		
		IceCream ice2 = new IceCream("누가바" , 5 , false);
		ice2.makeIceCream();
			
		

	}

}
