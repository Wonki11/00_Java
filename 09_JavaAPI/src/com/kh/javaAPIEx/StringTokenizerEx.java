package com.kh.javaAPIEx;

import java.util.StringTokenizer;

/*
StringTokenizer
Token = 동전 최소 단위 정보를 가진 물리적 가상적 물체

 * */
public class StringTokenizerEx {
	public static void main(String[] args) {
		//							소괄호안에 ""로 무언갈 적어야함
		//							기본으로 띄어쓰기 기준으로 구분
		StringTokenizer 토큰 = new StringTokenizer("자바 는 즐 거워");
		//hasMoreTokens 만약에 토큰글자 안에 글자가 조금이라도 들어있다면 true
		while(토큰.hasMoreTokens()) {
			//nextToken 다음 토큰 보여줘
			
			System.out.println(토큰.nextToken());
		}
		
		//구분자를 , 넣은 토크나이저를 볼 것
												//오렌지사과포도를    "," 기준으로 나눔
		StringTokenizer 토큰2번 = new StringTokenizer("오렌지,사과,포도", ","  ); 
		while (토큰2번.hasMoreElements()) {
			System.out.println(토큰2번.nextToken());
			
		}
	}
}
