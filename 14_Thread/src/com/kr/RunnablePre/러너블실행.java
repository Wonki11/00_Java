package com.kr.RunnablePre;

public class 러너블실행 {
	public static void main(String[] args) {
		
		for(int a = 0; a<5; a++) {
			러너블연습 r = new 러너블연습(a);
			Thread 스레드 = new Thread(r);
			스레드.start();
		}
		System.out.println("메인 메서드 종료");
	}

}
