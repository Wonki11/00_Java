package com.kh.array;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// for문을 활용한 배열 출력하기
		/*int numbers[] = new int[5];
		
		//1 부터 4 까지 배열에 숫자를 넣기
		//index 0부터 시작하기 때문에 i = 0
		//length = 길이 
		System.out.println("최대길이 : " +numbers.length);		
		
		for(int i = 0; i <numbers.length; i++) {
			numbers[i] = i;
			System.out.println("numbers[" + i + "] = " + i);
		}*/
		
		//ex1();
		//ex2();
		//ex3();
		//ex4();
		//ex6();
		//ex9();
		//met2();
		practice17();

	}
	public static void ex1() {
		int numbers[] = new int[10]; 
		System.out.println("최대길이 : " +numbers.length);

		
		
		for(int a = 1; a <= numbers.length; a++) {
			System.out.print(a + " ") ;
		}
	}
	public static void ex2() {
		int numbers[] = new int[10];
		System.out.println("최대길이 : " + numbers.length);
		
		for(int i = 0; i<numbers.length; i++) {	
			
			System.out.println((10-i) + " ");
		}
		
		for(int a = numbers.length; a > 0; a--) {
			System.out.print(a + " ") ;
		}
	}
	public static void ex3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 : ");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		
		for(int b = 0; b < numbers.length; b++ ) {
			numbers[b] = b + 1;
			System.out.print(numbers[b]+ " ");
			
		}
		
		
	}
	public static void ex4() {
		String[] fruits = {"사과","귤","포도","복숭아","참외"};
		System.out.println(fruits[1]);
		
	}
	public static void ex5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String a = sc.next();
	}
	//index 0부터 마지막숫자-1   0 1 2 3 4
	//length 5  1부터 길이를 보여줌
	public static void ex6() {
						//length 7
						//index 0
		String[] week = {"월","화","수","목","금","토","일"};
		Scanner sc =new Scanner(System.in);
		System.out.println("0~6사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		//입력한 숫자가 0 ~ 6 사이에 있는지 확인 후 사이에 있다면 요일 출력
		if(num >= 0 && num <= 6) {
			System.out.println(week[num] + "요일");
			
		}else {
		 System.out.println("잘못 입력하셨습니다");
		}											
	}
	
	public static void ex9() {
		//길이가 7인 배열 생성
		int[] num = new int[7]; //index : 0 1 2 3 4 5 6 length : 7
					// num의 최종 길이를 알기 위해서 num.length 를 사용		
		//랜덤으로 숫자 랜덤으로 숫자 출력하기
		//랜덤으로 숫자를 출력하는 방법
		// 1. Random 객체 사용 : 조금 더 넓은 범위로 랜덤을 사용
		// 2. Math 객체에서 random() 메서드를 사용 : 위 random객체보다 작은 범위로 사용 가능
		
		for(int i = 0; i<num.length; i++  ) {
			num[i] = (int)(Math.random() * 45 + 1 );//45   0 ~ 44 -> 1~ 45
			System.out.println("num[" + i + "] = " + num[i]);
		}
	}
	public static void method1() {
		int[] num = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[3] = 30;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
				
		}
		
	
	public static void met2() {
		String str[] = {"월","화","수","목","금","토","일"};	
		for(int i = 0; i <str.length; i++) {
			
	}
		
 }
	public static void met3() {
		double dbl[] = new double[3];
		dbl[0] = 10.1;
		dbl[1] = 11.2;
		dbl[2] = 13.2;
		
		for(int i = 0; i <dbl.length; i++) {
			System.out.println(dbl[i] + " ");
		}
		
	}
	public static void met4() {
		char chr[] = {'A','B','C'};
		for(int i = 0; i < chr.length; i++) {
			System.out.println(chr[i] + " ");
		}
	}
	
	public static void practice17() {
		//입력한 값이 배열에 있는지 검색
		//있으면 치킨 배달가능 없으면 없는 치킨 입니다. 출력
		
		String[] chickenMenu = {"양념" , "후라이드" , "간장"};
		
		//사용자로부터 치킨 이름 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String input = sc.next();
		
		//배열에 사용자가 입력한 치킨이 있는지 검색
		boolean found = false;
		
		//for - each문을 사용해서 치킨이 있는지 확인하는 작업
		for(String 치킨 : chickenMenu) {
			if(치킨.equals(input)) {
				found = true;
				break;		
			}
		}
		//만약 치킨이 존재한다면 found = true ; break
		
		//만약 치킨이 존재한다면 배달가능 출력
		if(found) {
			System.out.println(input + " 배달 가능");
		} else {
			System.out.println(input + "은(는) 없는 메뉴");
		}
		//존재하지 않는다면 00치킨은 없는 메뉴입니다. 출력
	}
	
	
}
	
