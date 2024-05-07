package com.kh.Inheritance.OverrideEX;

public class 토끼 extends 동물{
	
	public 토끼(String 이름) {
		super(이름);
	}
		
	@Override
	public void 소리() {
		System.out.println(이름 + "이(가) 끼잉끼잉 소리를 냅니다.");
	}
}
