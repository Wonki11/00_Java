package com.kr.InOut;
/*
클래스 안에 이름이 다른 클래스를 선언

 * */
public class InnerClassOutClass {
	private int 숫자 = 10;
	
	public static void main(String[] args) {
		InnerClassOutClass 인아웃 = new InnerClassOutClass();
		InnerClassOutClass.InnerClass 인 = 인아웃.new InnerClass();
		인.밖에서보여주기();
	}
	
	//기본생성자
	public InnerClassOutClass() {
		
		
		}
	
	//내부클래스 만들기
	class InnerClass{
		void 밖에서보여주기() {
			System.out.println("숫자보기 : " + 숫자);
		}
		
	}
}
