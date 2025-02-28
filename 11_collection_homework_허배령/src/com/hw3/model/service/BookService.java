package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService extends Book {
	
	private Scanner sc = new Scanner(System.in);
	private List<Book> book = new ArrayList<>();
	
	public BookService() {
	
		book.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		book.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "데이원"));
		book.add(new Book(3333, "세이노의 가르침", "세이노", 6480, "데이원"));
		book.add(new Book(4444, "세이노의 가르침", "세이노", 6480, "데이원"));
		book.add(new Book(5555, "세이노의 가르침", "세이노", 6480, "데이원"));
	
	}
	
	public void displayMenu() {
		
		int menuNum = 0;
		
		do {
			System.out.println("=== 도서 목록 프로그램 ===");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴를 입력하세요 : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 : break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 6 : break;
			case 7 : break;
			case 8 : break;
			case 9 : break;
			default :
			}
		
		
		} while(menuNum != 0);
	}
	
	public void addbook() {
		
		System.out.print("도서 번호 : ");
		int num = sc.nextInt();
		
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("도서 출판사 : ");
		String company = sc.nextLine();
		
		
	}
}
