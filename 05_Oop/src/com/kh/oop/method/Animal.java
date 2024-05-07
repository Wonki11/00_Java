package com.kh.oop.method;

public class Animal {
//필드
	public String name;
	public int age;
	
	//메서드
	//생성자
	public Animal() {
		
	}
	//필수생성자
	public Animal(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	//return
	public String getName() {
		return name;
	}
	
	//return으로 나이받기
	public int getAge() {
		return age;
	}
	
	public void info() {
		System.out.println("동물이름 : " + name);
		System.out.println("동물나이 : " + age);
	}
	
	public static void main(String[] args) {
		Animal dog = new Animal("강아지",1);
		Animal cat = new Animal("고양이",1);
		
		dog.info();
		cat.info();
	}

}
