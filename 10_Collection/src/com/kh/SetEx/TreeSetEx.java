package com.kh.SetEx;

import java.util.TreeSet;

/*
TreeSet
중복을 허용하지 않고, 값을 자동으로 정렬하는 구조
검색 트리의 형태로 데이터를 저장하며, 자동으로 정렬된 상태를 유지

자동으로 0 ~ 9 자동 정렬 A-Z, a-z, ㄱ-ㅎ 정렬해줌

add() : 추가
remove() : 제거
contains() : 지정된 값이 있는지 확인
isEmpty() : TreeSet 이 비어있는지 확인
size () : 개수확인
first() : 가장 작은 데이터 반환
last() : 가장 큰 데이터를 반환
clear() : 모든 값 제거





 * */
public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		
		//추가
		ts.add(5);
		ts.add(2);
		ts.add(1);
		
		System.out.println("TreeSet 모두 보기 : " + ts);
		
		//Set 중복이 안되는 호주머니 같은 존재
		// 주머니같다 = 안에 순서대로 구분이 되어있지 않다는 의미
		
		ts.remove(2); // 코드 줄 이동 = 알트 + 화살표 위아래로
		//단축키 : 줄 삭제 컨트롤 d
		System.out.println("TreeSet 모두 보기 : " + ts);
		
		//값 포함이 되어있는지 확인
		System.out.println(ts.contains(5)); // 있으면 true
		
		//비어있는지 확인
		System.out.println(ts.isEmpty());//비어있으면 true
		
		//데이터 갯수
		System.out.println(ts.size());
		
		//가장 작은 값
		System.out.println(ts.first());
		
		//가장 큰 값
		System.out.println(ts.last());
		
		//모든 값 제거
		ts.clear();
		System.out.println("모두보기 : " + ts);
		
	}
}





