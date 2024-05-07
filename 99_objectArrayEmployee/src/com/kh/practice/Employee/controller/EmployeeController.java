package com.kh.practice.Employee.controller;

import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeController {
	
	private Employee[] sArr = new Employee[5];
	
	public static final int Cut_Line = 60;
	
	public EmployeeController() {
		
		sArr[0] = new Employee("김길동" , "자바" , 100);
		sArr[1] = new Employee("박길동" , "디비" , 50);
		sArr[2] = new Employee("이길동" , "화면" , 60);
		sArr[3] = new Employee("정길동" , "서버" , 25);
		sArr[4] = new Employee("홍길동" , "자바" , 95);
	}
	
	public Employee[] printEmployee() {
		return sArr;
	}
	
	public int sumScore() {
		int sum = 0;
		for(Employee a : sArr) {
			sum += a.getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore();
		avgArr[1] = avgArr[0] / sArr.length;
		return avgArr;
	}
	
	
	
	
	
	
	
	
	
	
	
}
