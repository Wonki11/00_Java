package com.kr.ThreadEx;

//Thread 클래스 가져오는 작업 진행
public class ThreadEx2 extends Thread {
//필드
	int 초;
	
//메서드
	//생성자 : 필수
	public ThreadEx2(int 초) {
		this.초 = 초;
	}
	
	//void run
	public void run() {
		System.out.println(this.초 + "스레드 시작중");
		
		try {
			Thread.sleep(1000); //1초 대기이긴 하지만 대기하는 사이에 문제가 발생할수 있기 때문에 try catch 사용
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(this.초 + "스레드 종료중");
	}
}
