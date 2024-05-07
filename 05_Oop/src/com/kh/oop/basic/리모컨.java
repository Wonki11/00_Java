package com.kh.oop.basic;

public class 리모컨 {

	
	//1. 필드
	public boolean powerOn; 
	public int volume;
	
	//2. 생성자 (공간 생성자, 필수 생성자)
	//public 리모컨(int vol) 
	// this.volume = vol;
	public 리모컨() { // <- 필수생성자
		
	}
	
	public 리모컨(int vol) {
		this.volume = vol;
	}
	
	//3. 메서드
	//public void 상태
	// sysout("음량 : " + volume)
	public void Info () {
		System.out.println("음량 정보");
		System.out.println("volume : " + volume);
	}
	
	public static void main(String[] args) {
		리모컨 a = new 리모컨();
		a.powerOn = true;
		a.volume = 200;
		System.out.println("리모컨의 전원은  " + a.powerOn + " 이고,"
							+ " 볼륨은 " + a.volume + " 입니다.");
	
	
	리모컨 orderRmc = new 리모컨(200); //리모컨 음량 필수여서 200넣기 <-객체 생성
	orderRmc.Info();
	}
	// 최종 출력할 메인 메서드를 만들어서
	// 리모컨 음량을 200으로 만들어서 음량이 200이 맞는지 확인하기
	
}
