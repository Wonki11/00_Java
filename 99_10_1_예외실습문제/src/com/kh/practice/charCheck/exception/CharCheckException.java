package com.kh.practice.charCheck.exception;
					//	Exception을 상속받아 개발자가 원하는 예외 상황을 만들 수 있음
public class CharCheckException extends Exception{
	
	
//기본 생성자
	public CharCheckException() {
		//super();
	}
//생성자 : 필수 어떤 문자가 들어오면 Exception 참조해서 처리하겠다	
	public CharCheckException(String msg) {
		super(msg);
	}
}
