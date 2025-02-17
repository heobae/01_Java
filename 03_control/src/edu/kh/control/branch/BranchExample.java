package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample { // 기능 제공용 클래스

	public void ex1() {
		// 1부터 10까지 1씩 증가하며 출력하는 반복문 작성 (한계가 있는->for문)
		// 단, 5를 출력하면 반복문 종료
		// 1 2 3 4 5
		
		for(int i = 1; 1<= 10; i++) {
			
			System.out.print(i + " "); // break문 아래에 있으면 4까지만 표기
										// 위에 있어야 5까지 표기되고 break문에서 끝남
			
			if(i == 5) {
				break;
			}
		}
		
	}
	
	public void ex2() {
		// 입력 받은 모든 문자열을 누적
		// 단, "exit@" 입력시 문자열 누적을 종료하고 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";  // 빈 문자열
		
		while(true) {
			
			System.out.print("문자열 입력(exit@ 입력 시 종료) : ");
			String input = sc.nextLine();
			
			// next()     : 다음 한 단어 (공백 포함 X)
			// nextLine() : 다음 한 줄  (공백 포함 O)
			
			// 자바에서 문자열(String) 비교는 == 연산자 사용 불가!
			// 비교연산자 (==)는 보통 기본자료형끼리의 연산에서만 사용 가능
			// String은 기본자료형이 아닌 참조자료형
			
			// equals() 메서드
			// 문자열1.equals(문자열2)
			// -> 문자열1과 문자열2가 같으면 true / 다르면 false 반환
			if(input.equals("exit@")) {
				break;
			}
			
			str += input + "\n"; // 얘가 break문 위에 있으면 exit@도 누적을해버려서
			                     // 출력하면 exit@가 나옴
			
			
			
		}
		System.out.println("=================");
		System.out.println(str);
		
		
	}
	
	public void ex3() {
		// continue : 다음 반복으로 넘어감
		
		// 1 ~ 10까지 1씩 증가하며 출력 (횟수가 정해짐 for문)
		// 단, 3의 배수 제외
		
		// 1 2 4 5 7 8 10
		
		for(int i = 1; 1 <= 10; i++) {
			
			if(i % 3 ==0) {   // continue가 여기 있어야 3의 배수를 거름
				continue;
			}
			
			System.out.print(i + " ");
			
			}
		}
	
	public void ex4() {
		// 1 ~ 100 까지 1씩 증가하며 출력하는 반복문
		// 단, 5의 배수는 건너뛰고
		// 증가하는 값이 40이 되었을 때 반복 멈춤
		
		// 1 2 3 4 6 7 8 9 11 12 ... 39
	}
		
	
}
