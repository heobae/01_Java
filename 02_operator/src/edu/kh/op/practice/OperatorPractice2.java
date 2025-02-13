package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {

	public void ex() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 나이는 ? : ");
		int age = sc.nextInt();
		
		int num = 20;
		    //(persontype)
		String result = num >= 20 ? "저는 성인 입니다." : "저는 미성년 입니다.";
		System.out.println(result);
		//String persontype = (age >= 20) ? "성인" : "미성년";
		//System.out.println("저는 " + persontype + "입니다");
		
		System.out.print("청소년입니까 ? : ");
		System.out.println(( 13 <= num ) && ( num <= 19));
		//boolean isTeenager = age >= 13 && age <= 19;
		//System.out.println("청소년입니까? " + isTeenager);
		
		System.out.print("노인이거나 어린이입니까 ? : ");
		System.out.println(( 65 <= num) || ( 12 >= num));
		
		System.out.println("------------------------------");
		
		int num2 = 13;
		
		System.out.print("당신의 나이는 ? : ");
		int age2 = sc.nextInt();
		
		String result2 = num2 >= 20 ? "저는 성인 입니다." : "저는 미성년 입니다.";
		System.out.println(result2);
		
		System.out.print("청소년입니까 ? : ");
		System.out.println(( 13 <= num2 ) && ( num2 <= 19));
		
		System.out.print("노인이거나 어린이입니까 ? : ");
		System.out.println(( 65 <= num2) || ( 12 >= num2));
		
/* 
키보드로 나이를 입력받아 
20세 이상이면 "저는 성인 입니다", 아니면 "저는 미성년 입니다" 출력.
입력받은 값이 13세 이상이면서 19세 이하면 "청소년입니까? true"출력, 아니면 false 출력
입력받은 값이 65세 이상이거나, 12세 이하면 
"노인이거나 어린이 입니까? true" 출력 아니면 false 출력
		
[실행화면]
		
당신의 나이는 ? : 20
저는 성인입니다
청소년 입니까? false
노인이거나 어린이 입니까? false
-----------------------------------------
당신의 나이는 ? : 13
저는 미성년입니다
청소년 입니까? true
노인이거나 어린이 입니까? false
*/
	}
}
