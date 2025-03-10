package com.kh.SetEx;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPre {
	public static void main(String[] args) {
		//과일들 String "키위 복숭아 참외 수박 딸기"
								//Set.of() < 한번에넣는 방법
		TreeSet<String> ts = new TreeSet<>(Set.of("키위", "복숭아", "참외", "수박", "딸기"));
		//String[] 과일들 = {"키위","복숭아","참외","수박","딸기"};
		
		
		System.out.println(ts);
		//복숭아 제거
		ts.remove("복숭아");
		System.out.println(ts);
		
		// 수박이 포함되어있는지 확인
		System.out.println(ts.contains("수박"));
		
		// 과일들 이 비어있는지 확인
		System.out.println(ts.isEmpty());
		
		// 과일들 개수
		System.out.println(ts.size());
		
		//가장 작은 값
		System.out.println(ts.first());
		
		//가장 큰 값
		System.out.println(ts.last());
		
		//모든 값 제거
		ts.clear();
		
		//모든값 제거 되었는지 확인
		System.out.println("모두보기 : " + ts);
	}

}
