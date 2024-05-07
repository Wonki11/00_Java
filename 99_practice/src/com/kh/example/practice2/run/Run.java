package com.kh.example.practice2.run;

public class Run {
	
	private String brand;
	private String pName;
	private int price;

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	public Run() {

	}
	
	public Run(String pName , int price , String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	public void info() {
		System.out.println("pname : " + pName );
		System.out.println("브랜드 : " + brand);
		System.out.println("가격 : " + price);
		System.out.println("==================");
	}
	public static void main(String[] args) {
		Run protype = new Run("kh" , 10000 , "kh브랜드");
		protype.info();
		Run protype2 = new Run();
		protype2.setpName("kh");
		protype2.setBrand("kh 브랜드");
		protype2.setPrice(100000);
		
		System.out.println("이름 : " + protype2.pName);
		System.out.println("브랜드 : " + protype2.brand);
		System.out.println("가격 : " + protype2.price);
		
		Run pro3 = new Run();
		System.out.println("=== get 불러오기 ===");
		System.out.println("이름 : " + protype2.getpName());
		System.out.println("가격 : " + protype2.getPrice());
		System.out.println("브랜드 : " + protype2.getBrand());
		pro3.info();
	}

}
