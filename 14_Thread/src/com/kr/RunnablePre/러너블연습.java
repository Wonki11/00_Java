package com.kr.RunnablePre;

public class 러너블연습 implements Runnable{
	int 초;
	
	
	public 러너블연습(int 초) {
		super();
		this.초 = 초;
	}



	@Override //Runnable 인터페이스에서 run()은 반드시 작성해줘야 하는 메서드
	public void run() {
		System.out.println(this.초 + "스레드 시작");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(this.초 + "스레드 종료");
		
	}

	
	
	
	
	
	

	
		
	}
	


		
	


