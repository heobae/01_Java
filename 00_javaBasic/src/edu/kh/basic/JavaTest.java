package edu.kh.basic;

//한 줄 주석 : (컴파일러가 해석하지 않는 부분)

//hello world

/*
a
b
c
d
*/  //-> 범위 주석

// class : 자바 코드가 작성되는 영역
public class JavaTest {
	
	// main 작성하고 ctrl+spacebar -> 자동완성 기능
	// main 메서드 : 자바 애플리케이션(프로그램)을 실행하기 위해서
	//				 반드시 필요한 구문
	public static void main(String[] args) {
		// 실행 단축키 : ctrl + f11
		System.out.println("Hello world!");
	    System.out.println("저녁 뭐 먹을까");
	    System.out.println("12345");
	    
	    System.out.println(); // <- 메서드 (소괄호 안의 값을 콘솔창에 실행시켜 줌)
	    // syso치고 자동완성
	    
	    // ctrl + alt + 방향키(위아래) : 방향키 방향으로 해당 줄 복사
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    
	    System.out.println("1+2"); // 알아서 연산되지 않음 (문자열로 인식)
	    System.out.println(1+2); // "가 없으니 알아서 연산 됨 (숫자, 변수로 인식)
	    
	    System.out.println(50-23);
	    System.out.println(12*13);
	    System.out.println(327/3);
	    System.out.println(12%2); // 0, 나머지 값
	    
	    // "" (문자열) + 숫자를 함께 작성
	    System.out.println("14 * 19 = " + 266);
	    System.out.println("14 * 19 = " + 14 * 19); // 뒤 14*19가 계산 됨
	    
	    System.out.println("90 + 70 + 65 = " + 90 + 70 + 65); // 907065로 이어쓰기 됨
	    System.out.println("90 + 70 + 65 = " + (90 + 70 + 65)); // 괄호를 쳐야 뒤가 계산 됨
	    
	    // 자바는 사칙연산의 우선 순위를 그대로 따른다
	    // -> 우선 계산을 원하면 () 소괄호 사용
	    
	    // + 기호의 역할
	    // -> 숫자 + 숫자 = 덧셈 연산 결과
	    // -> 문자열 + 숫자 or
	    //    문자열 + 문자열 --> 이어쓰기
	    System.out.println("A" + "B");
	    
	    // git test 집에서 코드 변경해봄
	    // 학원에서 공부함
	    // 집에서 공부함
	}

}
