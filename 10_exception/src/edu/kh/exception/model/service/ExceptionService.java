package edu.kh.exception.model.service;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {
	
	private Scanner sc = new Scanner(System.in);
	
	// 예외(Exception) : 소스코드의 수정으로 해결 가능한 오류
	
	// 예외는 두 종류로 구분
	// 1) Unchecked Exception : 선택적으로 예외 처리 (ex. Runtime Exception)
	// 2) Checked Exception : 필수적으로 예외 처리 (ex. IOException, 나머지..)

	public void ex1() {
		// 두 정수를 입력받아 나누기한 몫을 출력
		
		System.out.print("정수 1 입력 : ");
		int input1 = sc.nextInt();	// java.util.InputMismatchException
		// int형이 아닌 다른 자료형을 대입했을 때
		
		System.out.print("정수 2 입력 : ");	// java.util.InputMismatchException
		int input2 = sc.nextInt();
		// int형이 아닌 다른 자료형을 대입했을 때
		
		
		if(input2 != 0) {
			System.out.println("결과 : " + input1 / input2); // java.lang.ArithmeticException: / by zero
			// input2에 0이 들어왔을 때 0으로 나눌 수 없다 : 산술적 예외 발생
			
		} else {
			System.out.println("infinity");
		}
		
		// ----------------------------------------------------
		
		try {
			// 예외가 발생할 것같은 코드
			System.out.println("결과 : " + input1 / input2);
			
		} catch(ArithmeticException e) {
			// try에서 던져진 예외를 catch문에 매개변수 e로 잡았다
			// e를 사용하여 예외 추적 코드 작성할 수도 있음
			System.out.println("infinity");
			e.printStackTrace();
			// 발생한 예외에 대한 메서드와 위치에 대한 모든 내용을 출력
			// 예외 발생 추적 메서드
		}
		
		// 발생하는 예외 중 일부 예외 try - catch 사용 안 해도
		// if-else 예외 상황 방지 기능
		// 일부예외 == 대부분 Unchecked Exception
		
	}
	
	public void ex2() {
		// 여러가지 예외에 대한 처리 방법
		
		try {
			System.out.print("정수 1 입력 : ");
			int input1 = sc.nextInt();	// InputMismatchException
			// int형이 아닌 다른 자료형을 대입했을 때
			
			System.out.print("정수 2 입력 : ");	// InputMismatchException
			int input2 = sc.nextInt();
			// int형이 아닌 다른 자료형을 대입했을 때
			
			System.out.println("결과 : " + input1 / input2); // ArithmeticException
			// input2에 0이 들어왔을 때 0으로 나눌 수 없다 : 산술적 예외 발생
			
			// InputMismatchException, ArithmeticException 둘다 RuntimeException의 후손
			// RuntimeException은 Exception의 후손
			// Exception
			//     ㄴ RuntimeException
			//                ㄴ InputMismatchException, ArithmeticException
			
			String str = null;
			System.out.println(str.charAt(0));
		
			
		// 조상들이 아래로 가야함
			
		} catch(InputMismatchException e) {
			System.out.println("타입에 맞는 값만 입력하세요.");
			
			
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		
		//} catch(RuntimeException e) {
			System.out.println("잡았다!!!");
			
		} catch(Exception e) {
			// Exception 클래스 : 모든 예외의 최상위 부모
			// 다형성  - 업캐스팅 : 부모타입 참조변수로 자식객체 참조
			
			// ** 상위 타입의 예외 클래스를 catch문에 작성하면
			//	  다형성 업캐스팅에 의해 모두 잡아서 처리 가능!! **
			System.out.println("뭔지 모르겠으나 예외가 발생해서 처리함..");
			e.printStackTrace();
			// 발생한 예외에 대한 메서드와 위치에 대한 모든 내용 출력
		}
	}
	
	public void ex3() {
		// try - catch - finally
		// finally : try구문에서 예외가 발생 하든말든 무조건 마지막에 수행
		
		try {
			System.out.print("정수 1 입력 : ");
			int input1 = sc.nextInt();	// InputMismatchException
			// int형이 아닌 다른 자료형을 대입했을 때
			
			System.out.print("정수 2 입력 : ");	// InputMismatchException
			int input2 = sc.nextInt();
			// int형이 아닌 다른 자료형을 대입했을 때
			
			System.out.println("결과 : " + input1 / input2); // ArithmeticException
			// input2에 0이 들어왔을 때 0으로 나눌 수 없다 : 산술적 예외 발생
			
		} catch(ArithmeticException e) {
			System.out.println("산술적 예외 처리가 됨");
			
			// 매개변수 e : 예외 관련된 정보 + 예외 관련 기능
			System.out.println(e.getClass());  // 어떤 예외 클래스인가?
			// class java.lang.ArithmeticException
			
			System.out.println(e.getMessage());  // 예외 발생시 출력된 내용
			// / by zero
			
			System.out.println(e);	// e.toString()
			// java.lang.ArithmeticException: / by zero
			
			e.printStackTrace();
			
		} catch(InputMismatchException e) {
			System.out.println("숫자만 넣어라..");
			
		} finally {
			System.out.println("무조건 수행됨");
			sc.close(); // 스캐너 통로 닫기 : 메모리 누수 방지
			
		}
		
	}
	
	public void ex4() {
		
		try {
			methodA();
			
		} catch(IOException e) {
			// IOException의 부모인 Exception도 가능
			System.out.println("methodC에서부터 발생한 예외를 ex4에서 잡아서 처리함");
		}
		
	}
	
	public void methodA() throws IOException {
		
		methodB();
	}
	
	public void methodB() throws IOException {
		
		methodC();
	}
	
	public void methodC() throws IOException {
		// throws : 호출한 메서드에게 예외를 던짐
		// -> 호출한 메서드에게 예외처리를 하라고 위임하는 행위
		
		// throw : 예외 강제 발생 구문
		throw new IOException();	// Checked Exception이라
									// 반드시 처리해야해서 빨간줄뜸
		
		
	}
	
	public void ex5() throws UserException {
		// 사용자 정의 예외 클래스인 UserException 사용하여 강제 예외 발생시키기
		throw new UserException("사용자정의 예외 발생");
		
		
		
	}
}
