package ninenine;

import java.util.Scanner;

public class NineDan {
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int input = sc.nextInt();
		
		System.out.print("또 입력 : ");
		int input2 = sc.nextInt();
		
		
		
		for(int i = 1; i <= 9; i++) {
			System.out.println();
			
			
			 for(int dan = 1; dan <= input; dan++) {
				System.out.printf("%d X %d = %2d   ", dan, i, dan*i);
					
					
			 }	
			 				
		}	
		
	
	}
}
