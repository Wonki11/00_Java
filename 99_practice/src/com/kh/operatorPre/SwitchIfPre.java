package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchIfPre {
	
	public static void practice8 () {
		// 주민번호를 이용해서 남자인지 여자인지 구분해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 - 포함해서 입력하세요");
		String idNumber = sc.next();
		// charAt 7번째 자리에 있는 값을 가지고 와서 여자인지 남자인지 구분해서 출력
		// 01234567
		// 990101-1234567 000101 - 3456789
		// 990101-2345678 000101 - 4567890
		// 주민번호 뒷자리의 첫 번째 숫자를 가지고 옵니다.
		
		char gendercode = idNumber.charAt(7);
		// 주민번호 뒷자리 첫번째숫자로 남녀 판별
		
		String gender; 
		// 만약에 1이나 3이 들어온다면 남자
		// 2나 4가 들어온다면 여자
		if(gendercode == '1' || gendercode == '3') {
			gender = "남자";
			System.out.println("남자");
		} else if (gendercode == '2' || gendercode == '4') {
			gender = "여자";
		} else {
			System.out.println("올바른 주민번호가 아닙니다.");
			//1. gender = "올바른 주민번호가 아닙니다.
			//2. else에서 돌려보내는 return
			return;
		}
		//여자인지 남자인지에 대한 결과
		System.out.println("입력한 주민번호는 " + gender + "입니다");
		
		
		
		
	}
	
	public static void castingPractice1() {
		
		// 카멜 케이스(camerCase) - 중간 글자만 대문자로 시작해서 표현하는 방식
		// 표기법  - 코드를 작성할 때 개발자 사이에 코드를 보기 편하게 하기 위해서 작성하는 표기법
		// 스네이크 케이스(snake_case) - 변수명에 언더바(_)가 들어있는 표현 방식을 뱀처럼 생겼다해서 붙여진이름
		// 파스칼 케이스(PascalCase) - 첫 글자와 중간 글자들이 대문자로 사용하는 표현방식
		// 케밥표기법(kebab-case) - 중간에 대시(-)로 구분해서 변수명을 작성해주는 표기 방법
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		char inputChar = sc.next().charAt(0);
		
		// 유니코드 출력
		// 전 세계의 모든 글자나 문자를 컴퓨터에서 일관되게 표현하기 위한 방식
		// 글자에 숫자를 붙여서 컴퓨터가 읽을 수 있도록 해주는 방식
		int unicode = inputChar; //char 2byte int 4byte
		System.out.println("입력한 문자 " + inputChar + " 의 유니코드는 " + unicode + " 입니다.");
	}

	public static void castingPractice3() {
		//주어진 코드에서 빈칸을 채우고 출력 결과가 나오도록 만든 것
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f; // 기본값이 double 이기때문에 float으로 변경해주는 f 붙여줌
		double dNum = 2.5;
		char ch = 'A';
		System.out.println(iNum1 / iNum2); //2몫 2로 떨어진다면?
		System.out.println((int) dNum); //2 
		// double 실수로 되어있는 것을 정수로 변경	
		// double 8byte int 4byte 강제 형변환을 (int) 변경하겠따는 표시를 작성 후 시켜줄 것
		System.out.println((double)iNum2  * dNum); // 10.0
		//작은 값과 큰 값이 만나면 자동으로 큰 값으로 변경되기 때문에 (double)은 필수가 아님
		System.out.println((double) iNum1); //10.0
		System.out.println((double) iNum1 / iNum2); // 2.5 // 정수 -> 실수형
		System.out.println(dNum); // 2.5
		
		System.out.println((int)fNum); //3 실수를 -> 정수형
		System.out.println((int) (iNum1 / fNum) ); // 3 //나누기를 해서 몫이 3
		// int와 float 은 같은 크기의 byte 정수인지 실수인지 표기
		System.out.println((double) iNum1 / fNum); //3.333333
		//float 소수점 이하 6자리 까지만 보여줌
		
		System.out.println((double)iNum1 / fNum); //3.33333333333335
		System.out.println(ch); //'A'
		System.out.println((int)ch); // 65
		System.out.println((int)ch + iNum1); // 75
		// 'A' 값이 (int)ch를 통해 65
		// 큰 byte와 작은 byte가 만나면 자동으로 큰 byte 담겨짐
		// 65 + (int iNum1 = 10) = 75
		System.out.println( (char)(ch + iNum1)); //'K'
	}

	public static void controlPractice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		// 메뉴 번호 입력 받기
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menuNumber = sc.nextInt();
		
		switch(menuNumber) {
		case 1 : 
			System.out.println("입력 메뉴 입니다.");
			break;
		case 2 : 
			System.out.println("수정 메뉴 입니다.");
			break;
		case 3 :
			System.out.println("조회 메뉴 입니다.");
			break;
		case 4 : 
			System.out.println("삭제 메뉴 입니다.");
			break;
		case 7 :
			System.out.println("프로그램이 종료됩니다.");
			break;
		default : {
			System.out.println("잘못된 번호입니다.");
		}
	}
	}

	public static void controlPractice10() {
		Scanner sc = new Scanner(System.in);
		// sysout 출력내용이 길어져서 
		// \n 줄 바꿈으로 글을 작성하고 싶다면 \n 이용해서 줄바꿈해서 출력
		// \ = 달러 표기로 출력
		// \n = 세로로 줄바꿈해서 출력
		// \r = 키보드 입력하는 위치를 현재 줄의 처음으로 이동
		System.out.println("실행할 기능을 선택하세요");
		int num = sc.nextInt();
		
		switch (num) {
		case 1 : 
			System.out.println("메뉴 출력");
			break;
		case 2 :
			System.out.println("짝수/홀수");
			break;
		case 3 : 
			System.out.println("합격/불합격");
			break;
		case 4 : 
			System.out.println("계절");
			break;
		case 5 :
			System.out.println("로그인");
			break;
		case 6 : 
			System.out.println("권한 확인");
			break;
		case 7 :
			System.out.println("BMI");
			break;
		case 8 : 
			System.out.println("계산기");
			break;
		case 9 : 
			System.out.println("P/F");
			break;
		default :
			System.out.println("잘못된 입력입니다.");
		}
		
	}
	
	public static void controlPractice5() {
		Scanner sc = new Scanner(System.in);
		String userid = "myId";
		String userpw = "myPassword12";
		System.out.println("아이디를 입력하세요");
		String id = sc.next();
		System.out.println("비밀번호를 입력하세요");
		String pw = sc.next();
		
		
		if (id.equals(userid) && pw.equals(userpw)) {
			System.out.println("로그인 성공");
			
			/*
			 ! - 특정 조건을 부정하는데 사용
			 !(pw.equals(userpw)) : 둘이 일치하지 않음
			 						!가 붙으면 아이디가 틀렸을 때 참이 된다.
			 
			 * */
		} else if (pw.equals(userpw)) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if (id.equals(userid)) {
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("잘못 입력된 값 입니다.");
		}
	}
	
	public static void controlPractice6() {
		// 사용자로부터 회원 등급 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급");
		//권한이나 규칙을 설정할 때 자주 사용하는 변수명 : Role
		String userRole = sc.next();
		
		//권한 출력
		System.out.println("해당 회원 등급의 권한 : ");
		
		switch(userRole) {
		case "관리자" :
			System.out.println("-회원관리 \n"
					+ "-게시글관리 \n"
					+ "-게시글작성 \n"
					+ "-게시글조회 \n"
					+ "-댓글작성");
			break;
		case "회원" :
			System.out.println("-게시글 작성 \n"
					+ "-게시글 조회 \n"
					+ "-댓글 작성");
			break;
		case "비회원" :
			System.out.println("-게시글 조회");
			break;
		default : 
			System.out.println("잘못된 회원입니다.");
		
		}
		
	}
	
	public static void controlPractice8() {
		/*
		 키보드로 두 개의 정수와 연산 기호를 입력받아 연산 기호에 맞춰
		 연산 결과 출력
		 (두 개의 정수 모두 양수일때만 작동하며 없는 연산 기호를 입력했을 경우
		 "잘못 입력했습니다." 출력)
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1을 입력하세요");
		int a = sc.nextInt();
		System.out.println("정수2를 입력하세요");
		int s = sc.nextInt();
		System.out.println("연산자를 입력하세요 (+,-,*,/,%)");
		String q = sc.next();
		
		double result;
		switch (q) {
		case "+" :
			result = a + s;
			break;
		case "-" :
			result = a - s;
			break;
		case "*" :
			result = a * s;
			break;
		case "/" :
			if(s == 0) {
				System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다");
				return;
			}
			result = (double) a / s;
			break;
		case "%" :
			if(s == 0) {
				System.out.println("0으로 나눌 수 없습니다 프로그램을 종료합니다.");
				return;
			}
			result = a % s;
			break;
		default :
			System.out.println("잘못 입력하셨습니다 프로그램을 종료합니다");
			return;
		}
		System.out.println(a + " " + q + " " + s + " = " + result);
   }
	
	public static void main(String[] args) {
		//practice8();
		//castingPractice1();
		//castingPractice3();
		//controlPractice1();
		//controlPractice10();
		//controlPractice5();
		//controlPractice6();
		controlPractice8();
	}

}
