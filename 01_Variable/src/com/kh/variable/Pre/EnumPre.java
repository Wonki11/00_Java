package com.kh.variable.Pre;

public class EnumPre {
//enum 무지개 {빨강 ~ 보라};
	
	//main
		//빨~보 출력
	public enum 무지개 {
		빨간색,
		주황색,
		노란색,
		초록색,
		파란색,
		남색,
		보라색
		
	
	}
	//생성자 : 필수
	
	public enum 소비자{
		학생,직장인,연장자
	}
	
	public enum 판매자{
		소매업,도매업,중매업
	}
	
	public EnumPre() {
	
	}
	
	public void 메서드1() {

		
		//장바구니 = 배열에 담기
		무지개[] 배열 = 무지개.values(); // enum으로 작성한 값을 가지고옴
		//for -each
		for(무지개 무 : 배열) {
			System.out.println(무);
		}
		
		
		
		
		
		
		/*System.out.println("빨간색 : " + 색깔들.빨간색);
		System.out.println("주황색 : " + 색깔들.주황색);
		System.out.println("노란색 : " + 색깔들.노란색);
		System.out.println("초록색 : " + 색깔들.초록색);
		System.out.println("파란색 : " + 색깔들.파란색);
		System.out.println("남색 : " + 색깔들.남색);
		System.out.println("보라색 : " + 색깔들.보라색);*/
	}
	
	public void 메서드2() {
		System.out.println("===소비자===");
		소비자[] 소비 = 소비자.values();
		for(소비자 소 : 소비) {
			System.out.println(소);
		}
		System.out.println("===판매자===");
		판매자[] 판매 = 판매자.values();
		for (판매자 판 : 판매) {
			System.out.println(판);
		}
		
		소비자 a = 소비자.학생;
		System.out.println("학생의 등급 : " + a.ordinal());
		판매자 s = 판매자.소매업;
		System.out.println("소매업의 등급 : " + s.ordinal());
		if(a.ordinal() > s.ordinal()) {
			System.out.println("소비자의 등급이 더 높습니다.");
		}else if(a.ordinal() == s.ordinal()) {
			System.out.println("소비자와 판매자 등급이 같습니다.");
		}else {
			System.out.println("판매자의 등급이 더 높습니다.");
		}
		
	}
	
	public static void main(String[] args) {
		EnumPre ep = new EnumPre();
		ep.메서드2();
	}
}
