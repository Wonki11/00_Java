package com.kr.ThreadPre;

public class 스레드시작 {
	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			Thread a = new 스레드연습(i);
			a.start();
		}
		System.out.println("메인 끝");
	}
}
