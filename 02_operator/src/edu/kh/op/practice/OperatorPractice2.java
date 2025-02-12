package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 나이는 ? : ");
		int age = sc.nextInt();
		
		int num = 20;
		
		String result = num >= 20 ? "저는 성인 입니다." : "저는 미성년 입니다.";
		System.out.println(result);
		
		System.out.print("청소년입니까 ? : ");
		System.out.println(( 13 <= num ) && ( num <= 19));
		
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
		
		
	}
}
