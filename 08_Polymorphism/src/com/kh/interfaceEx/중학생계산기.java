package com.kh.interfaceEx;

public class 중학생계산기 implements 계산기,기계{
	
	@Override
	public void 전원켜기() {
		System.out.println("전원을 킵니다.");
	}
	@Override
	public void 전원끄기() {
		System.out.println("전원을 끕니다.");
	}
	/*     계산기.java 인터페이스에서 가져온 합 차 곱 몫 나머지     */
	@Override
	public int 합(int a, int b) {
		return a+b;
	}
	@Override
	public int 차(int a, int b) {
		return a-b;
	}
	@Override
	public int 곱(int a, int b) {
		return a*b;
	}
	@Override
	public double 몫(int a, int b) {
		return a/b;
	}
	@Override
	public int 나머지(int a, int b) {
		return a%b;
	}

}
