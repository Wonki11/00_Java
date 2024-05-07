package com.kr.ThreadPre;
					//extends Thread
public class 스레드연습 extends Thread{
	//필드 
	int 초;
	//메서드
	//생성자 필수로 초가 들어가게 만듬

	public 스레드연습(int 초) {
		super();
		this.초 = 초;
	}
	
	public void run() {
		System.out.println(this.초 + "스레드 시작중");
		try {
			Thread.sleep(3000); //3초 대기
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.초 + "스레드 종료중");
		
	}
	

}
