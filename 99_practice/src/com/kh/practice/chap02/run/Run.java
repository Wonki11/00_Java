package com.kh.practice.chap02.run;
import java.util.Scanner;

import com.kh.loop.ex.LoopForEx;
//import = 가져오다    폴더 위치에서               폴더 안에있는 파일명;
import            com.kh.practice.chap02.loop.LoopPractice;

public class Run {

	public static void main(String[] args) {
		//기능 제공 클래스에서 최종으로 실행할 메소드 이름만 작성
		//특정 기능을 실행할 수 있도록 기능을 작성한 공간
		
		//LoopPractice 에 있는 Greeting 을 가져와서 출력하고 싶음
		//Scanner를 사용했던 것처럼
		//LoopPractice을 new로 가지고 와서
		//LoopPractice 밑에 있는 greeting을 소환할 것
		Scanner sc = new Scanner(System.in);
		LoopPractice LP = new LoopPractice();
		//LP.greeting();
		//LP.greeting2();
		//LP.practice2();
		//LP.practice3();
		//LP.practice1();
		//LP.pracitce13();
		//LP.practice14();
		LP.practice15();
		
	}

}
