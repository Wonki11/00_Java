package com.kr.ThreadPre;

public class 동기화연습 {
	private static int 숫자 = 0;
	public static void main(String[] args) {
	
		
		//여러개의 스레드 생성해서 실행 8 synchronized 숫자 8까지 증가
		Thread thread = new Thread();
		for(int i = 0; i < 8; i++) {
			synchronized(Thread.class) {
				숫자++;
				System.out.println("숫자들 : " + 숫자);
			}
		}
		thread.start();
	}
	
}
