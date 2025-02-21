package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;
import edu.kh.oop.method.model.service.MethodExample;

public class MethodRun {

	public static void main(String[] args) {

		MethodExample methodEx = new MethodExample();
		
		//methodEx.method1();
		
		 MemberService service = new  MemberService();
		 
		 service.displayMenu();
		
		// 기능용 클래스와의 흐름을 그림처럼 글로 표현
		// 바구니처럼! 맨 아래가 맨 먼저 ㅋㅋ

		
		// method2() 메서드 호출
		// method1() 메서드 호출
		// main 메서드 실행
		
	  //        stack           //
		
	// LIFO ( Last - Input - First - Out)
	// 후입선출
		
		
	}

}
