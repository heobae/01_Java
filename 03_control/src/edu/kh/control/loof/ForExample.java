package edu.kh.control.loof;

import java.util.Scanner;

public class ForExample { // 기능 제공용 클래스
	
	Scanner sc = new Scanner(System.in);

	public void ex1() {
		
		// 1~10까지 콘솔에 출력하기
		for(int i = 1; i <= 10; i++) { // i = index
			System.out.println(i); // 반복 수행될 코드
		}	
			// 초기식 -> 조건식 -> 코드수행 
			//-> 증감식 -> 조건식 - > 코드수행
			//-> 반복하다가 조건식이 false되면 끝.
	}
	
	public void ex2() {
		// 알파벳 A부터 Z까지 한줄로 출력
		// ABCDEFGHIJKLMNOPQRSTUVWXYZ
		// 유니코드 이용
		
		   // char -> int로 자동 형변환
		for(int i = 'A'; i <= 'Z'; i++) { // i가 숫자인채로 진행
			System.out.print((char)i); // i가 숫자 상태니까 char로 강제 형변환
		}
		
		System.out.println("\n=======================================");
		
		for(char i = 'A'; i <= 'Z'; i++) { // i가 char형태니까 강제 형변환 필요 X
			System.out.print(i);
		}
		
	}
	
	public void ex3() {
		 // 1부터 입력받은 수까지 1씩 증가하며 출력
		
		System.out.print("번호 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			System.out.println(i);
		}
	}
	
	public void ex4() {
		// 정수 5개를 입력받아서 합계 구하기 (이거 어렵다 복습꼭)
		
		// [실행화면]
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 입력 4 : 40
		// 입력 5 : 50
		// 합계 : 150
		
		int sum = 0; // 합계 저장용 변수 
					 // for문 밖에서 태어난 애는 밖에서 사용가능
					 // for문 시작 전에 배치!!
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("입력 " + i + " : ");
			int input = sc.nextInt(); // for문 안에서 태어난 변수
									  // for문 안에서 태어난 애는 밖에서 사용 불가능
			
			// sum에 입력받은 input 값 누적
			// sum = sum + input
			sum += input;
		}
		
		System.out.println("합계 : " + sum);
		
		
		
		
	}
	
	public void ex5() {
		// 1부터 20까지 1씩 증가하면서 출력         2번째
		// 단, 입력받은 수의 배수는 양쪽에 () 표시  3번째 (for 문 안에서 if문)

		// [실행화면]
		// 괄호를 표시할 배수 : 3               1번째
		// 1 2 (3) 4 5 (6) 7 8 (9) ... 20
		
		// 괄호를 표시할 배수 : 4
		// 1 2 3 (4) 5 6 7 (8) 9 ... 20
		
		System.out.print("괄호를 표시할 배수 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 20; i++) {
			
			if(i % num == 0) { //배수일 때
				System.out.print("("+i + ") ");
			} else { // 배수가 아닐때
			    System.out.print(i + " ");
			}
			
		}
	}
	
	public void ex6() {
		// [구구단 출력]
		// 2 ~ 9 사이 수를 하나 입력 받아
		// 해당 단을 출력
		// 단, 입력 받은 수가 2 ~ 9 사이 숫자가 아니라면
		// "잘못 입력하셨습니다" 출력
		
		/*
		 * 단 입력 : 5
		 * 5 X 1 = 5
		 * 5 X 2 = 10
		 * ...
		 * 5 X 9 = 45
		 * =============
		 * 단 입력 : -5
		 * 잘못 입력하셨습니다
		 */
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) { // 2 ~ 9사이일때
			
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan*i);
			}
	
		} else { // 2 ~ 9 범위 밖일 때
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	//==================================================================================		
	public void ex7() {
		// 숫자 세기 count 아이거 어렵다 복습해라
		
		// 1부터 20까지 1씩 증가하면서  (for문)
		// 입력받은 수의 배수의 총 개수 출력
		// 입력받은 수의 배수의 합계 출력
		
		// 배수 입력 : 3
		// 3 6 9 12 15 18 : 6개
		// 3의 배수 합계 : 63
		
		// 힌트
		// 필요한 변수가 뭐가 있을까?
	
		int count = 0; // n의 배수의 개수를 세기 위한 변수 (1씩 증가)
		int sum = 0;   // n의 배수의 합계를 구하기 위한 변수
		String result = "";
		
		System.out.print("배수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= 20; i++) {
			
			if(i % input == 0) { //배수일 때
				result += i + " "; // result = result + "입력한 배수" ex) "3 6 "
				count++; // 개수 세기 1(첫배수뜨면)
				sum += i; // 합계 누적 5(5배수첨으로참)
			}
				
			
			}
		System.out.printf("%s : %d개\n", result, count);
		System.out.printf("%d의 배수 합계 : %d", input, sum);
			
		}
//==================================================================================		
	public void ex8() {
		// 구구단 모두 출력하기
		// 2 X 1 = 2
		// 단을 맡을 for문(바깥쪽), 곱을 맡을 for문(안쪽)
		
		
		
		for(int dan = 2; dan <= 9; dan++) { // 2~9단까지 차례대로 증가
			
			for(int num = 1; num <= 9; num++) {
				System.out.printf("%d X %d = %2d   ", dan, num, dan*num);
			}
			System.out.println();
		} 
		
	}
	
	public void ex9() {
		
		for(int dan = 9; dan >= 2; dan--) {
			
			for(int num = 1; num <= 9; num++) {
				System.out.printf("%d X %d = %2d   ", dan, num, dan*num);
			}
			System.out.println();
		}
		
	}
}
	
	
		
	

