package com.kh.MapEx;

import java.util.TreeMap;

public class TreeMapPre {
public static void main(String[] args) {
	/*
	 String,String 으로
	 
	 "apple",사과
	 banana 바나나
	 orange 오렌지
	 grape 포도
	 watermelon 수박
	 
	 [] for 문을 활용해서 추가
	 
	 전체출력
	 get 사용해서 banana에 해당하는 값 가져오기
	 size 확인
	 isEmpty 비어있는지 확인
	 containskey 키가 존재하는지 확인 grape
	 containsvalue 값이 존재하는지 확인 포도
	 ketSet 모든키 출력
	 values 모든값 출력
	 firstkey 첫번째 키
	 laskkey 마지막키 출력
	 
	 */
	TreeMap<String,String> tm = new TreeMap<>();
	String[] keys = {"apple","banana","orange","grape","watermelon"};
	String[] values = {"사과","바나나","오렌지","포도","수박"};
	
	for(int i = 0; i < keys.length; i++) {
		tm.put(keys[i],values[i]);
	}
	
	System.out.println(tm);
	
	System.out.println(tm.get("banana"));
	
	System.out.println(tm.size());
	
	System.out.println(tm.isEmpty());
	
	System.out.println(tm.containsKey("grape"));
	
	System.out.println(tm.containsValue("포도"));
	
	System.out.println(tm.keySet());
	
	System.out.println(tm.values());
	
	System.out.println(tm.firstKey());
	
	System.out.println(tm.lastKey());
}
}
