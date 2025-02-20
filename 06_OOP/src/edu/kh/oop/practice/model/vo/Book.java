package edu.kh.oop.practice.model.vo;

public class Book {
	// 필드

	private String title; // 도서명
	private int price; // 가격
	private double discountRate; // 할인율
	private String author; // 저자명
	
	
	public Book() { // 기본생성자
		
	}
	// 매개변수 생성자
	public Book(String title, int price, double discountRate, String author) {
		System.out.println("수정된 결과 확인");
		this.title = "자바의 정석";
		this.price = 30000;
		this.discountRate = 0.2;
		this.author = "남궁성";
		
	}
	// getter / setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return  title + " / " + price + " / " +  discountRate + " / " +  author;
	}

	
	
	
	
	
}
