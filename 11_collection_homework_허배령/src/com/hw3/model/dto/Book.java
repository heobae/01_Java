package com.hw3.model.dto;

public class Book{

	private int num;
	private String title;
	private String author;
	private int price;
	private String company;
	
	public Book() {}

	public Book(int num, String title, String author, int price, String company) {
		super();
		this.num = num;
		this.title = title;
		this.author = author;
		this.price = price;
		this.company = company;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return  "[도서 번호 : " + num + " / " + "도서제목 : " + title + " / " + "도서저자 : " + author + " / " + "도서가격 : " + price+"원" + " / " + "출판사 : " + company + "]";
	}
	
	
	
}
