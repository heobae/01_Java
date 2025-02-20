package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	public void practice() {
		
		Book b1 = new Book();
		
		System.out.println(b1);
		
		b1.setTitle("자바의 정석");
		b1.setPrice(30000);
		b1.setDiscountRate(0.2);
		b1.setAuthor("남궁성");
		
		System.out.println(b1);
		
		
		System.out.println("======================================");
		
		Book b2 = new Book();
		
		System.out.println("수정된 결과 확인");
		b2.setTitle("C언어");
		b2.setPrice(30000);
		b2.setDiscountRate(0.1);
		b2.setAuthor("홍길동");
		
		
		
		System.out.printf("%s / %d / %.1f / %s\n", b2.getTitle(), b2.getPrice(), b2.getDiscountRate(), b2.getAuthor());
		
		System.out.println("======================================");
		
		int totalPrice1 = (int)((b1.getPrice()) - (b1.getPrice() * b1.getDiscountRate()));
		int totalPrice2 = (int)((b2.getPrice()) - (b2.getPrice() * b2.getDiscountRate()));
		
		System.out.println("도서명 = " + b2.getTitle());
		System.out.println("할인된 가격 = " + totalPrice2);
		System.out.println("도서명 = " + b1.getTitle());
		System.out.println("할인된 가격 = " + totalPrice1);
		
		
		
	
	}

}
