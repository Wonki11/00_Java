package com.kh.StackEx;

import java.util.Stack;

public class StackPre {
	public static void main(String[] args) {
		Stack<Integer> 스택 = new Stack<>();
		
		스택.push(10);
		스택.push(30);
		스택.push(50);
		스택.push(40);
		스택.push(20);
		System.out.println(스택);
		
		int 맨위 = 스택.pop();
		System.out.println(맨위);
		
		int 맨위값 = 스택.peek();
		System.out.println(맨위값);
		
		int 사이즈 = 스택.size();
		System.out.println(사이즈);
		
		boolean 앰티 = 스택.empty();
		System.out.println(앰티);
		
		
		
		
	}
}
