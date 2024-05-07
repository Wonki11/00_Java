package com.kh.practice.Employee.view;

import com.kh.practice.Employee.controller.EmployeeController;
import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeMenu {
	private EmployeeController ssm = new EmployeeController();
	
	public EmployeeMenu() {
		
		
	}
	
	public void printsEmployeeMenu() {
		System.out.println("직원 이름\t과목\t점수");
		System.out.println("---------------");
	
	for(Employee employee : ssm.printEmployee()) {
		System.out.println(employee.inform());
	}
	System.out.println("---------------");
	System.out.println("총점 : " + ssm.sumScore());
	System.out.printf("평균 : %.2f \n" , ssm.avgScore()[1]);
	System.out.println("합격여부 : " + (ssm.avgScore()[1] >= EmployeeController.Cut_Line));
	
}
}