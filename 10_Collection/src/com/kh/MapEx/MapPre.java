package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

public class MapPre {
	//기본생성자 컨트롤 스페이스 엔터
	public MapPre() {
		
	}
	//void 메서드 생성
	public void practice1() {
		Map<Integer,String> map = new HashMap<>();
		map.put(2, "에그마요");
		map.put(3, "로티세리바베큐");
		map.put(1, "스파이시쉬림프");
		System.out.println(map);
	}
	
	public void practice2() {
		//								<>자료형을 넣어도되고 안넣어도됨
		Map<String,String> map = new HashMap<>();
		//map.put을 활용해서 학원-서울시강남구 등산-서울시 관악구 롯데타워 서울시 송파구
		map.put("학원", "서울시 강남구");
		map.put("등산", "서울시 관악구");
		map.put("롯데타워", "서울시 송파구");
		
		//전체출력 sysout;
		System.out.println(map);
		
		//get을 이용해서 롯데타워가 어디 있는지 출력
		System.out.println("롯데타워는 어디에 있나요? : " + map.get("롯데타워"));
		
		//remove 활용해서 등산 삭제하기
		map.remove("등산");
		
		//for-each keySet()을 활용해서 전체 목록 출력
		for(String 단어 : map.keySet()) {
			String 맵 = map.get(단어);
			System.out.println(단어 + " 은(는) " + 맵);
		}
	}
	
	public void practice3() {

		
		//특정 값이 존재하는지 확인
		//String Integer 과일 - 가격
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 100);
		map.put("바나나", 200);
		map.put("체리", 300);
		
		//200원 짜리 과일이 존재하는가?
		System.out.println("200원 과일이 존재하는가? : " + map.containsValue(200));
		//containsValue true false 값이 보여짐
		
		//체리 과일이 존재하는가?
		System.out.println("체리과일이 존재하는가? : " + map.containsKey("체리"));
		
		//크기 조회
		System.out.println("현재 map의 크기 : " + map.size());
	}

	public void practice4() {
		//변수명은 map
		Map<Integer,String> map = new HashMap<>();
		
		//put을 이용해서 1-에그마요 2-로티세리바베큐 3-스테이크앤치즈 4- 스파이시쉬림프
		map.put(1, "에그마요");
		map.put(2, "로티세리바베큐");
		map.put(3, "스테이크앤치즈");
		map.put(4, "스파이시쉬림프");
		
		//get을 이용해서 3번에ㅔ 뭐가 들어있는지 확인
		System.out.println("3번엔 뭐가 들어있는가? : " + map.get(3));
		
		//size를 이용해서 총 메뉴가 몇개인지 확인
		System.out.println("총 메뉴 : " + map.size());
		
		//remove활용해서 4번을 지워줌
		map.remove(4);
		
		//isEmpty map이 비어있는지 확인
		System.out.println("map이 비어있는가? : " + map.isEmpty());
		
		//keySet을 이용해서 for-each 모두보기
		for(int num : map.keySet()) {
			String 메뉴이름 = map.get(num);
			System.out.println(메뉴이름);
		}
		//map.entry키 -값을 동시에 가져오는 방법
		for(Map.Entry<Integer,String> e : map.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
			
		}
		//clear 최종삭제
		map.clear();
		
	}
	
	public static void main(String[] args) {
		MapPre mp = new MapPre();
		//mp.practice1();
		//mp.practice2();
		//mp.practice3();
		mp.practice4();
	}
}
