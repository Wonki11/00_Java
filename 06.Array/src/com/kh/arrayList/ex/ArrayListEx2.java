package com.kh.arrayList.ex;

import java.util.ArrayList;

public class ArrayListEx2 {
	
	
	public ArrayListEx2 () {
		
	}
	
	public void method1() {
		// 딸기 바나나 사과
		ArrayList<String> list = new ArrayList<>();
		
		// add를 사용해서 딸기 바나나 사과 추가
		
		list.add("딸기");
		
		list.add("사과");
		
		list.add("바나나");
		
		//get 0 1 2 사용해서 각 index 자리에 값 출력
		
		System.out.println("출력확인 : " + list.get(0));
		System.out.println("출력확인 : " + list.get(1));
		System.out.println("출력확인 : " + list.get(2));
		
		//set 바나나 -> 키위 수정
		
		list.set(2, "키위");
		System.out.println("수정확인 : " + list.get(2));
		
		//size를 이용해서 크기 확인
		
		System.out.println("크기확인 : " + list.size());//size() 숫자를 넣지 않음	
		
		//remove 키위 삭제
		list.remove(2);
		//System.out.println("삭제확인 : " + list.get(2));
		
		//isEmpty() 비어있느닞 확인
		System.out.println("비어있는지 확인 : " + list.isEmpty());
		
		//장바구니에 뭐뭐 들어가 있는지 확인
		
		//앞으로 사용할 for문
		for (String 과일 : list         ) {
			System.out.println(과일);
		}
		
	}
	
	public void method2() {
		ArrayList<String> animal = new ArrayList<>();
		//단축키 - 컨트롤 알트 화살표아래 = 한줄복사
		//add 사자 호랑이 고양이 강아지
		animal.add("사자"); 
		animal.add("호랑이");
		animal.add("고양이");
		animal.add("강아지");
		
		//size() 동물이 몇마리 있는지 확인
		animal.size();
		System.out.println(animal.size());
		
		//get으로 동물확인
		System.out.println(animal.get(0));
		System.out.println(animal.get(1));
		System.out.println(animal.get(2));
		System.out.println(animal.get(3));
		
		//set 고양이 > 토끼 변경
		animal.set(2, "토끼");
		System.out.println(animal.get(2));
		
		//remove 강아지 삭제
		animal.remove("강아지");
		
		//for문을 활용해서 get 출력
		for (String 동물 : animal  ) {
			System.out.println("동물 : " + 동물);
		}
		
		//clear 사용해서 모두 삭제
		animal.clear();
		
		//isEmpty() 모두 삭제가 됐는지 확인
		animal.isEmpty();
		System.out.println("삭제확인 : " + animal.isEmpty());
	}
	
	public void method3() {
		//피자가게
		ArrayList<String> pizza = new ArrayList<>();
		//pizza 고구마 , 포테이토 ,페페로니 피자
		System.out.println("===피자메뉴===");
		pizza.add("고구마");
		pizza.add("포테이토");
		pizza.add("페페로니");
		//get을 활용해서 출력
		System.out.println(pizza.get(0));
		System.out.println(pizza.get(1));
		System.out.println(pizza.get(2));
		//set을 활용해서 페페로니 > 파인애플
		pizza.set(2, "파인애플");
		//remove 파인애플
		pizza.remove(2);
		//for문 활용해서 출력
		for(String 피자 : pizza  ) {
			System.out.println("피자" + pizza);
			System.out.println("가게가 사라질 예정입니다.");
		}
		pizza.clear();
		pizza.isEmpty();
		System.out.println("피자가게 철거 확인 : " + pizza.isEmpty());
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ArrayListEx2 ae = new ArrayListEx2();
		//ae.method1();
		//ae.method2();
		ae.method3();
	}
}
