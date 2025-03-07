package edu.kh.variable.ex1;

public class VariableExample4 {

	public static void main(String[] args) {

		/* 강제 형변환
		 - 기존 자료형을 원하는 자료형으로 강제 변환 시키는 것.
		 
		 1) 값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로 변환할 때.
		 2) 출력되는 데이터의 표기법을 변환 시키고 싶을 때
		 
		 * 강제 형변환 방법
		 - 자료형을 변환시키고 싶은 값 또는 변수 앞에 (자료형) 을 작성
		 */
		
		// [double -> int 강제 형변환]
		double temp = 3.14; // double > int 이기 때문에 double -> int 못함 ==> temp앞에 괄호로 인트
		int num = (int)temp;
		
		System.out.println("temp : " + temp); // 3.14
		System.out.println("num : " + num); // 3
		// 실수형 double -> 정수형 int 변환 시 소수점 아래자리 손실 (데이터 손실)
		
		// [int -> byte 강제 형변환]
		int iNum = 290;
		byte bNum = (byte)iNum;
		System.out.println(iNum); // 290 32비트
		System.out.println(bNum); // 34  8비트
		// 같은 정수형 끼리의 변환 시에도
		// 값의 범위 차이 때문에 데이터 손실이 발생
		
		// char -> int 강제 형변환
		char ch = 'A';
		System.out.println((int)ch); // 65
		
		// int -> char 강제 형변환
		// 44085
		int i3 = 44085;
		System.out.println((char)i3); // 갵
		
		// [데이터 오버플로우] - 이 현상은 컴퓨터가 미리 예측할 수 없다!
		// -> 개발자가 미리 예측해야 함. (int의 최대값을 알고 있어야 하고, -가 나올 것도 예상해야 함)
		int i6 = 2147483647; // int의 최대값
		int result2 = i6 + 1;
		System.out.println(result2);
	}

}
