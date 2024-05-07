package com.kh.oop.method.ex;

public class Person {

	// 필드 이름 나이
	private String name;
	private int age;

	public Person() {

	}

	// 필드 대신 값을 저장하고 내보내는 setter getter 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 메인 메서드
	// 단축키 main 컨트롤 + space
	public static void main(String[] args) {
		Person ps1 = new Person();

		ps1.setName("홍길동");
		ps1.setAge(20);

		System.out.println("이름 : " + ps1.name);
		System.out.println("나이 : " + ps1.age);
	}
}
