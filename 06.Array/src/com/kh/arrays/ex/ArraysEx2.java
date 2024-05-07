package com.kh.arrays.ex;

import java.util.Arrays;

public class ArraysEx2 {
	
	//기본 생성자
	public ArraysEx2 (){
		
	}
	
	public void method1() {
		//숫자 배열 생성하기
		int[] num = {6,4,2,3,5,7,9,};
		
		//숫자 정렬하기 Arrays.sort
		Arrays.sort(num);
		//정렬된 내용 출력 Arrays.toString
		System.out.println(Arrays.toString(num));
		
		//num배열 복사하기 abc   Arrays.copyOf(num, num.length)
		int[] abc = Arrays.copyOf(num, num.length);
		System.out.println("num 복사된 abc : " + Arrays.toString(abc));
		
		//num과 abc가 같은지 비교하기 Arrays.equals (num, abc);
		Arrays.equals(num, abc);
		System.out.println(Arrays.equals(num, abc));
		//int[] 채우기 = new int[3];
		int[] same = new int[6];
		Arrays.fill(same, 6);
		System.out.println("same : " + Arrays.toString(same));
		//Arrays.fill 을 이용해서 숫자 6으로 모두 채우기
		//채워진 채우기 변수를 출력
	}

	public static void main(String[] args) {
		ArraysEx2 ae = new ArraysEx2();
		ae.method1();
	}

}
