package com.kh.oop.basic;

public class Student {
	// 필드 String name int age int grade
	//학생인데 학생의 이름과    나이와 		학년
	public String name;
	public int age;
	public int grade;
	
	//생성자 메서드 (필수로 작성해야하는 생성자 메서드 만들기)
	public Student(String  z, int  x, int c) {
		this.name = z;
		this.age = x;
		this.grade = c;
		
	}
	//필수로 넣어야하는것 이름 나이 학년
	
	//출력 메서드 정보 출력 메서드
	public void Info () {
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 나이 : " + age);
		System.out.println("학생 학년 : " + grade);
		
	}
	//public void info() {
	//sysout 이름 나이 학년 출력
	
	
	//최종 메인 메서드
	public static void main(String[] args) {
		Student a = new Student("김철수" , 18 ,3);
		a.Info();
		System.out.println("==============");
		Student b = new Student("김영희" , 20 ,2);
		b.Info();
		
	}
	// 학생 객체 생성하기  김철수 18 3 박영희 20 2
	// Student student1
	// Student student2
	
	
	// 학생1과 학생2 정보 출력하기
	
	
	
	
}
