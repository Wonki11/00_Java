package com.kh.oop.basic;

public class Ex {

	public String memberId;
	public String memberPwd;
	public String memberName;
	public int age;
	public char gender;
	public String phone;
	public String email;
	public String changeName;
	public String printName;
	
	public Ex() {
		
	}
	
	public Ex(String q, String w, String e,int r, char a, String s, String d , String f , String g ) {
		this.memberId = q;
		this.memberPwd = w;
		this.memberName = e;
		this.age = r;
		this.gender = a;
		this.phone = s;
		this.email = d;
		this.changeName = f;
		this.printName = g;
	}
	
	
	public void changeName(String name) {
		this.memberName = name;
		System.out.println("변경된 이름 : " + name);
		
	}
	
	
	public void printName() {
		System.out.println("이름 : " + memberName);
	}
	public static void main(String[] args) {
		Ex member1 = new Ex();
		
		//이름 변경 
		member1.changeName("동그라미");
		//변경된 이름 출력
		member1.printName();
		
				
		
	}
}
