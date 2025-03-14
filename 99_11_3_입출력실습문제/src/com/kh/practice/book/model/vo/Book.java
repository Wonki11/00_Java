package com.kh.practice.book.model.vo;

import java.util.Calendar;

public class Book {

	private String title;
	private String author;
	private int price;
	private Calendar date;
	private double discount;
//setter
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
//getter
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public Calendar getDate() {
		return date;
	}

	public double getDiscount() {
		return discount;
	}

	public Book() {
	
	}

	public Book(String title, String author, int price, Calendar date, double discount) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discount = discount;
	}
	@Override
	public String toString() {
	return  "제목 : " + title + "작가 : " + author + "가격 : " + price + "날짜 : " + date + "할인율 : " + discount;
	}
	
}
