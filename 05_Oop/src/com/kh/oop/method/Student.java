package com.kh.oop.method;

public class Student {
	// 필드

	private String name;
	private int age;
	private int grade;

	public Student() {

	}

	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getGrade() {
		return grade;
	}

	public void info() {
		System.out.println("===== 학생 명단 =====");
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 나이 : " + age);
		System.out.println("학생의 학년 : " + grade);
	}

	// 메인메서드
	public static void main(String[] args) {
		Student st1 = new Student("박영수", 15, 2);
		st1.info();
		Student st2 = new Student("김영희", 17, 1);
		st2.info();
	}

}
