package com.kh.SetEx;

import java.util.HashSet;

public class SetPre {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("새우깡");
		set.add("고래밥");
		set.add("꽃게랑");
		set.add("꽃게랑");
		set.add("꽃게랑");
		set.add("맛동산");
		set.add("오징어땅콩");
		set.add("알새우칩");
		System.out.println(set);
		System.out.println(set.size());
		System.out.println("맛동산 존재유무? : " + set.contains("맛동산"));
		set.remove("고래밥");
		System.out.println("데이터 모두 제거되었는지? : " + set.isEmpty());
		
		
	}

}
