package com.kh.array.List.pre;
//메서드
public class Book {
//필드	
	//책이름
	private String bookName;
	//저자
	private String author;
	//Getter
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	
	//Setter
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	//생성자 : 기본
	public Book() {
		
	}
	//생성자 : 필수
	public Book(String bookName,String author) {
		this.bookName = bookName;
		this.author = author;
	}
	//void
	public void showBook() {
		System.out.println(bookName + " , " + author);
	}
	
	
	
	
	
	
}
