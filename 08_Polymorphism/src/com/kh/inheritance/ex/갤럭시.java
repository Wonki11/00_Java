package com.kh.inheritance.ex;

// extends 스마트폰 상속
public class 갤럭시 extends 스마트폰{
//필드
	private int 안드로이드;
//메서드
	//getter
	public int get안드로이드() {
		return 안드로이드;
	}
	//setter
	public void set안드로이드(int 안드로이드) {
		this.안드로이드 = 안드로이드;
	}
	
	//생성자 기본
	public 갤럭시() {
		
	}
	//생성자 필수
	public 갤럭시(String 화면,String 통신사,String 성능,int 안드로이드) {
		super();
		this.안드로이드 = 안드로이드;
	}
	
	
	//@oOverride toString 알트 쉬프트 s s
	@Override
	public String toString() {
		return "갤럭시 버전 : " + 안드로이드 +   super.toString() + "]";
	}
	
		
	}
