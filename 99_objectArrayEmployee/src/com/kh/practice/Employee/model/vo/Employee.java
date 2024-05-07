package com.kh.practice.Employee.model.vo;

public class Employee {
//필드
	
	private String name;
	private String subject;
	private int score;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	
	public Employee() {
		
	}
	
	public Employee(String name,String subject,int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	public String inform() {
		return "이름 : " + name + ", 과목 : " + subject + " , 점수 : " + score;
	}
}
