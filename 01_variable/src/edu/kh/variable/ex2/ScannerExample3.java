package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		
		// 문자열(String) 입력
		// 문자열을 3번 입력받아 한줄로 출력하기
		
		// ex)
		// 입력 1 : 안녕?
		// 입력 2 : 반가워
		// 입력 3 : 점심뭐먹지?
		// 안녕? 반가워 점심뭐먹지?
		
		Scanner sc = new Scanner(System.in);
		
		// sc.next()     : 다음 입력된 한 단어를 읽어옴
		//					공백(스페이스, 탭 등) 만나면 입력을 중단 -> 안녕 하세요 -> 안녕
		// sc.nextLine() : 다음 입력된 한 줄을 읽어옴
		//					공백과 함께 입력된 모든 내용을 입력받음 -> 안녕 하세요 -> 안녕 하세요
		
		System.out.print("첫번째 문자열 : ");
		String input1 = sc.nextLine();
		
		System.out.print("두번째 문자열 : ");
		String input2 = sc.nextLine();
		
		System.out.print("세번째 문자열 : ");
		String input3 = sc.nextLine();
		
		System.out.printf("%s %s %s\n", input1, input2, input3, input1 + input2 + input3);
		
		
		
	}

}
