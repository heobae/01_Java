package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	

	public void practice1() {
/*
메소드 명 : public void practice1(){}
사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
단, 입력한 수는 1보다 크거나 같아야 합니다.
만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

ex.
1이상의 숫자를 입력하세요 : 4 
1 2 3 4

1이상의 숫자를 입력하세요 : 0
1 이상의 숫자를 입력해주세요.

*/
// 1. 내가 입력한 값(input)이 조건에 맞는지 파악하기
// 2. -> 조건문을 이용해야 한다! -> if / switch

		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
         
		if( input >= 1) { // 조건 O
			
			// 1부터 input까지 1씩 증가 반폭 출력
			
			for(int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
			
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
			
	}

	
	public void practice2() {
/*
메소드 명 : public void practice2(){}
사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
단, 입력한 수는 1보다 크거나 같아야 합니다.

ex.
1이상의 숫자를 입력하세요 : 4 
4 3 2 1

1이상의 숫자를 입력하세요 : 0
1 이상의 숫자를 입력해주세요.
*/
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if( input >= 1) { // 조건 O
			// input = 5
			// 5 4 3 2 1
			// 시작 5부터, 끝1, 1씩 감소하면서
			for(int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
			} else { // 조건 X
				System.out.println("1 이상의 숫자만 입력해라");
			
		}
	}		
	
	public void practice3() {
/*
메소드 명 : public void practice3(){}
1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.

ex.
정수를 하나 입력하세요 : 8
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36		
*/
	/*	int sum = 0;
        String result;
		 
		 System.out.print("정수를 하나 입력하세요 : ");
		 int input = sc.nextInt();
		 for(int i = 1; i <= input; i++) {
			System.out.print(i + " + ");
			 
			sum += input;
		}
		 System.out.print(input);
		*/ //내가 한거

		System.out.print("정수를 하나 입력하세요 :");
		int input = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= input; i++) {
			sum += i;
			
			// 마지막 숫자인 경우 "+" 출력하지 않음 ex) 8 =
			if(i == input) { // 마지막 턴
				System.out.print(i + " = " + sum);
				
			} else { // 이전 턴
				System.out.print(i + " + ");
			}
		}
			
		 
	}
	
	public void practice4() {
/*
메소드 명 : public void practice4(){}
사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

ex)
첫 번째 숫자 : 8	첫 번째 숫자 : 4	첫 번째 숫자 : 9
두 번째 숫자 : 4	두 번째 숫자 : 8	두 번째 숫자 : 0
4 5 6 7 8			4 5 6 7 8 			1 이상의\\ 숫자를 입력해 주세요
*/
	/*	System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();
		
		String result;
		
		if(input1 < 1 || input2 < 1) {
			System.out.println("1 이상의 숫자를 입력해 주세요");
		} else { */ // 내가 한거
			
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) { // 1 미만의 숫자가 입력된 경우
			System.out.println("1이상의 숫자를 입력해 주세요");
		
		} else { // 정상인 경우
			
			// 일단 start에 첫 번째 숫자, end에 두 번째 숫자 대입
			int start = num1;
			int end = num2;
			
			// 만약 첫 번째 숫자가 크다면 start, end의 값 바꾸기
			if(num1 > num2) {
				start = num2;
				end = num1;
			}
			
			for(int i = start; i <= end; i++) {
				System.out.print(i + " ");
			}
			
			
		}
			
		
 }
	public void practice5() {

/*
메소드 명 : public void practice5(){}
사용자로부터 입력 받은 숫자의 단을 출력하세요.

ex.
숫자 : 4
===== 4단 =====
4 * 1 = 4
4 * 2 = 8
4 * 3 = 12
4 * 4 = 16
4 * 5 = 20
4 * 6 = 24
4 * 7 = 28
4 * 8 = 32
4 * 9 = 36
*/
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		System.out.println("===== " +dan+"단 =====");
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
	
	public void practice6() {
/*
메소드 명 : public void practice6(){}
사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.

숫자 : 4                         숫자 : 10
===== 4단 =====                  2~9 사이 숫자만 입력해주세요.
===== 5단 =====
===== 6단 =====
===== 7단 =====
===== 8단 =====
===== 9단 =====
(해당 단의 내용들은 길이 상 생략)	
*/

/*		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if( 2 <= dan && dan <= 9) {
			
			for(int i2 = dan;  i2 <= 9;  i2++) {
				System.out.println("===== " + i2 +"단 =====");
				
				for(int i = 1; i <= 9; i++) {
					System.out.printf("%d X %d = %d\n", i2, i, i2*i);
				}
				
			}
		} else {
			System.out.println("2~9 사이 숫자만 입력해 주세요");
		} */ //내가한거
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if(input < 2 || input > 9) { // 2~9 벗어난 경우
			System.out.println("2~9 숫자만 입력하세요");
		
		} else { // 정산범위
			
			// 입력받은 숫자의 단부터 9단까지 단 증가하면서 반복 출력
			for(int dan = input; dan <= 9; dan++) {
				System.out.println("===== " + dan +"단 =====");
				
				//곱해지는 수 1~9까지 반복
				for(int i = 1; i <= 9; i++) {
					System.out.printf("%d X %d = %d\n", dan, i, dan*i);
					
				}
			}
		}
		
	}
	
	public void practice7() {
/*
메소드 명 : public void practice7(){}
다음과 같은 실행 예제를 구현하세요.

ex.
정수 입력 : 4
*
**
***
****
		
*/
	/*	System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		String result = "*";
		
		for(int i = 1; i <= input; i++) {
			System.out.println(result);
			result = result ;
			} */ //내가 한거
		
		// 행(row)은 입력한 input만큼 증가
		// 열(col)은 현재행(row)만큼 반복
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) { //1~4까지 4번 반복
			
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			} 
			System.out.println(); // 한 행의 모든 열 출력이 끝나면 줄바꿈
		}
		
		
		
		
		
		
		
	}
	
	
		
	
		
	
	
	public void practice8() {
/*
ex.
정수 입력 : 4
****
***
**
*		

*/
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		
		for (int row = input; row >= 1; row--) {
			
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}System.out.println();
		}  
		
		
	}
	
	public void practice9() {
		
/*
메소드 명 : public void practice9(){}
다음과 같은 실행 예제를 구현하세요.

ex.
정수 입력 : 4
   *
  **
 ***
****

*/
		
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) {
			
			for(int col = 1; col <= input - row; col++) {
				System.out.print(" ");
			}
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			} System.out.println();
		} 
	}
	
	public void practice10() {
		
/*		ex.
		정수 입력 : 3
		*
		**
		***
		**
		*
*/
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			} System.out.println();
		}
		
		for(int row = input -1; row >= 1; row--) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			} System.out.println();
			
		}
		
	
	}
	public void practice11() {
		
/*
정수 입력 : 4
   *
  ***
 *****
*******	
	
*/
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) {
			for(int col = 1; col <= input - row; col++) {
				System.out.print(" ");
			}  for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}  System.out.println();
		}
	} //미완성

	public void practice12() {
		
/*
정수 입력 : 5
*****
*   *
*   *
*   *
*****	
	
*/
	System.out.print("정수 입력 : ");
	int input = sc.nextInt();
	
	for(int i = 1; i <= input; i++) {
		System.out.print("*");
	} System.out.println();
	
	for(int row = 1; row <= input - 2; row++) {
		System.out.print("*");
	  for(int col = 1; col <= input -2; col++ ) {
		System.out.print(" ");
	} System.out.println("*");
	}
	for(int i = 1; i <= input; i++) {
		System.out.print("*");
	} System.out.println();
}
	
	public void practice13() {
/*1
부터 사용자에게 입력 받은 수까지 중에서

1) 2와 3의 배수를 모두 출력하고
2) 2와 3의 공배수의 개수를 출력하세요.

* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
모두 나머지가 0이 나오는 수

ex.
자연수 하나를 입력하세요 : 15
2 3 4 6 8 9 10 12 14 15
count : 2		
*/
		System.out.print("자연수 하나를 입력하세요 :");
		int input = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= input; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			} if(i % 2 == 0 && i % 3 == 0) {
				count++;
			}
			
		} System.out.println();
		System.out.print("count : " + count);
	}
}
