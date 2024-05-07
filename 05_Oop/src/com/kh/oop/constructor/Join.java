package com.kh.oop.constructor;
//1. 회원가입
public class Join {
	// 필드 회원번호 아이디 이름 연락처
	public int memberNo; //회원가입한 순서
	public String memberId; //회원이 작성한 아이디 nickName
	public String memberName;
	public String phonNumber;
	
	// 생성자 기본 필수
	public Join() {
		
	}
	
	public Join(int memberNo, String memberId, String memberName, String phonNumber) {
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberName = memberName;
		this.phonNumber = phonNumber;
	}
	
	
	// 메서드
	
	public void info() {
		System.out.println("=== kh 쇼핑 회원 정보 확인 ===");
		System.out.println("멤버넘버 : " + memberNo);
		System.out.println("멤버아이디 : " + memberId);
		System.out.println("멤버이름 : " + memberName);
		System.out.println("폰넘버 : " + phonNumber);
	}
	
	
	
	public static void main(String[] args) {
		Join member1 = new Join(1, "jojojo","원기","000-0000-0010");
		member1.info();
		Join member2 = new Join(2, "kikiki","기원","010-0000-0020");
		member2.info();
		// 필수가 없음
		Join member3 = new Join();
		member3.memberId = "직장인";
		member3.memberName = "동그라미";
		member3.phonNumber = "010-1111-2222";
		member3.info();
		Join member4 = new Join();
		member4.memberId = "학생휴먼";
		member4.memberName = "홍길동";
		member4.info();
		
		//회원가입 할 때 필수 작성해야하는 필수 작성이 생김
		//회원번호 아이디 이름 핸드폰번호
		Join member5 = new Join(3,"파워보이","박영희","010-3424-2342");
		member5.info();
		
		Join member6 = new Join();
		member6.memberNo = 6;
		member6.memberName = "블랙아담";
		member6.info();
		
		Join member7 = new Join(7,"슈퍼맨","딘 케인","010-1938-1932");
		member7.info();
		
			
		

	}

}
