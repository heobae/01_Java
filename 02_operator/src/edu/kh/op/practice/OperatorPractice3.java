package edu.kh.op.practice;
// 기능 제공용 클래스
import java.util.Scanner;

public class OperatorPractice3 {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 10000;
		
		System.out.print("가격을 입력하세요 : ");
		int total = sc.nextInt();
		
		System.out.print("멤버십 있으세요? ");
		
		//미완성...
	}


/*
문제1) 
마트에서 고객에게 할인 혜택을 제공하려고 한다
물건의 총 가격과 회원 여부를 입력받아, 
회원이라면 10% 할인을 적용하고, 그렇지 않다면 5% 할인을 적용한 최종 가격을 출력해라

메서드 : public void practice1() {}

[실행화면]
가격을 입력 하세요 : 10000
멤버십 있으세요? (있으면 true / 없으면 false 입력) : true
할인을 포함한 최종금액 : 9000.0원


가격을 입력 하세요 : 10000
멤버십 있으세요? (있으면 true / 없으면 false 입력) : false
할인을 포함한 최종금액 : 9500.0원
*/

 	public void practice2() {
 		
 	
 		int money1 = 50000;
 		int money2 = 10000;
 		int money3 = 5000;
 		int money4 = 1000;
 		
 		System.out.print("출금할 금액 입력 : ");
 		
 		
 		
 		
 	}
/*
문제2)
ATM에서 사용자가 원하는 금액을 입력하면, 5만원, 1만원, 5천원, 1천원 단위로 최소 개수의 지폐로 돈을 인출하라
ex) 사용자가 123000원을 입력하면, 5만원 지폐 2장, 1만원 지폐 2장, 5천원 지폐 0장, 1천원 지폐 3장이 필요함

메서드 : public void practice2() {}

[실행화면]
출금할 금액 입력 : 123000
50000원: 2
10000원: 2
5000원: 0
1000원: 3


출금할 금액 입력 : 253000
50000원: 5
10000원: 0
5000원: 0
1000원: 3
*/
 	
 	public void practice3() {
 		
 		
 		
 	}
/*
문제3)
사용자로부터 두 개의 정수를 입력받아, 
첫 번째 수가 두 번째 수의 배수인지 확인하고 결과를 출력해라
만약 배수라면 "배수입니다"를 출력하고, 아니라면 "배수가 아닙니다"를 출력

메서드 : public void practice3() {}

[실행화면]
첫 번째 수 : 100
두 번째 수 : 5
배수입니다

첫 번째 수 : 200
두 번째 수 : 7
배수가 아닙니다
*/ 	
 	
}