package com.kh.practice.Audition.controller;

import com.kh.practice.Audition.model.vo.Audition;

public class AuditionController {

	Audition[] sArr = new Audition[5];
	
	public static final int Cut_Line = 60;
	
	public AuditionController() {
		sArr[0] = new Audition("김영희" , "발라드" , 100);
		sArr[1] = new Audition("박영희" , "힙합" , 50);
		sArr[2] = new Audition("이연이" , "뮤지컬" , 85);
		sArr[3] = new Audition("정영희" , "댄스" , 60);
		sArr[4] = new Audition("홍영희" , "팝" , 20);
	}
	
	public Audition[] printAudition() {
		return sArr;
	}
	
	public int sumScore() {
		int sum = 0;
		for(Audition 오디션 : sArr ) {
			sum += 오디션.getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore();
		avgArr[1] = avgArr[0] / sArr.length;
		return avgArr;
	}
	
	public void printPass() {
		
	}
	
	
}
