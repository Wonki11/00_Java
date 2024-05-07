package com.kh.example.practice6.run;

public class Run {
	public String title;
	public String publisher;
	public String author;
	public int price;
	public double discuntRate;

	public Run() {

	}
	
	
	public Run(String title, String publisher,String author,int price, double discuntRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discuntRate = discuntRate;
		
	}
	public Run(String title, String publisher,String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	
	public void inform () {
		System.out.println("===== 책 정보 =====");
		System.out.println("타이틀 : " + title);
		System.out.println("발행자 : " + publisher);
		System.out.println("작가 : " + author);
		System.out.println("가격 : " + price);
		System.out.println("할인율 : " + discuntRate);
	}

	public static void main(String[] args) {
		Run book1 = new Run();
		book1.title = "어린왕자";
		book1.publisher = "kh";
		book1.author = "김이박";
		book1.price = 50000;
		book1.discuntRate = 5;
		book1.inform();
		
		Run book2 = new Run("피터팬","kh","정최박",10000,10);
		book2.inform();
		
		Run book3 = new Run("피터팬","kh","정최박");
		book3.inform();
		

	}

}
