package com.kh.MapEx;

import java.util.TreeMap;

/*

TreeMap 이진검색트리 : 데이터 검색 삽입 삭제 연산을 빠르게 가능
키-값(key-value) 저장하는 자료구조
키를 기준으로 정렬해서 저장 (정렬 : 0-9, ㄱ-ㅎ, A-Z,a-z)

메서드
put(key,value)		: TreeMay에 키-밸류 추가
get(key				: 저장된 키에 있는 밸류 값을 전달
containsKey(key)	: 키가 포함되있는지 확인
containsValue(value): 값이 포함되있는지 확인
remove(key)			: 지정된 키와 값을 삭제
size()				: 키-값 쌍의 개수 반환 (저장되어있는)
isEmpty()			: 비어있는지 확인
clear()				: 모두 제거


 * */
public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<>();
		
		//put 사용해서 값 추가
		tm.put(1, "one");
		tm.put(2, "Two");
		tm.put(3, "Three");
		
		//한 번에 작성하고 싶다면
		Integer[] keys = {1,2,3};
		String[] values = {"One","Two","Three"};
		
		//반복문을 사용해서 추가
		for(int i = 0; i <keys.length; i++) {
			tm.put(keys[i], values[i]);
		}
		
		//Map 또한 키 중복 x 안됨 벨류가 다를 경우 맨 밑에 작성한 벨류가 덮어씌어짐
		
		System.out.println(tm);
		
		//get 메서드를 사용해서 값 가져오기
		System.out.println(tm.get(2));
		
		//remove사용해서 키 - 값을 제거
		tm.remove(3);
		System.out.println(tm);
		
		//containsKey 메서드를 이용해서 키가 있는지 확인
		System.out.println(tm.containsKey(1));
		
		//size 사용해서 개수 확인
		System.out.println(tm.size());
		
		//isEmpty 비어있는지 확인
		System.out.println(tm.isEmpty());
		
		//clear 모두 삭제
		System.out.println(tm);
		
		
		
		
		
	}
}
