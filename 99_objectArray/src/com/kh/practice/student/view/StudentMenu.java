package com.kh.practice.student.view;

import com.kh.hw.member.model.vo.Student;
import com.kh.practice.student.controller.StudentController;

//사용자의 입장에서 바라보는 컴퓨터
public class StudentMenu {
	private StudentController ssm = new StudentController();
	//메서드
	public StudentMenu() {
		
	}
	//void 학생정보와 성적 결과 출력하는 메서드
	public void printStudentMenu() {
		System.out.println("학생 이름\t과목\t점수");
		System.out.println("---------------");
		//for - each
		//String 으로 했다면 학생의 이름 or 과목 or 점수
		//Student 이름과 과목과 점수를 모두 가지고 오겠다는 의미
		/*         [   ,  ,  ]     김 박 이 정 홍길동                       */
		for(Student student : ssm.printStudent()) {
			System.out.println(student.inform());
		}
		System.out.println("------------");
		System.out.println("총점 : " + ssm.sumScore());
		System.out.printf("평균 : %.2f \n" , ssm.avgScore()[1]);
		//           프린트f          소수점 2번재자리까지
		System.out.println("합격여부 : " + (ssm.avgScore()[1] >= StudentController.Cut_Line));
		
		ssm.printPass();
	}
	/*
	boolean을 써서 true인지 false 인지를 한적이 없는데
	true와 false 보여집니까?
			학생들의 평균 >=	합격 커트라인
	ssm.avgScore()[1] >= StudentController.Cut_Line
	         80            60
         값이 같거나 크거나 작다는 것을 표현하는 부등호 true false 구분만 하기 위한 존재
         	a > 5 b < 5
	
	
	
	
	
	
	
	*/
	
	
	
	
	
	
	
	
	
	

}
