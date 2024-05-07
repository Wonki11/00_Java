package com.kh.QuequeEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePre {
	public static void main(String[] args) {
		Queue<Integer> 큐 = new LinkedList<>();
		
		큐.offer(80);
		큐.offer(60);
		큐.offer(30);
		큐.offer(20);
		
		int 폴 = 큐.poll();
		System.out.println(폴);
		
		int 피크 = 큐.peek();
		System.out.println(피크);
		
		boolean 엠티 = 큐.isEmpty();
		System.out.println(엠티);
	}
}
