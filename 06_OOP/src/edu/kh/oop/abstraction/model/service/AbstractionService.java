package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// Service : 특정 기능(비즈니스 로직)을 제공하는 패키지
// (비밀번호 -> 암호화 / 파일 -> 유효한 파일 걸러내는 작업)
public class AbstractionService {
	
	// 속성
	
	// 기능
	public void ex1() {
		// People 클래스를 이용해서 국민 개체 만들기
		People p1 = new People();
//	    People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1(== 참조변수)
//		new People() : 새로운 People 객체를 Heap 영역에 생성

//		* 클래스 이름이 자료형처럼 사용된다 *
//		== 그래서 클래스를 "사용자 정의 자료형" 이라고 부른다!
		
// 메서드 안에서 생성된 변수
		
		
		// 직접 접근 (캡슐화를 어긴 코드)
/*		p1.name = "홍길동";
		p1.gender = '남';
		p1.pNum = "123456-1234567";
		p1.address = "서울시 중구 남대문로 120";
		p1.phone = "010-1234-1234";
		p1.age = 20;
		
		p1.tax();
		p1.vote();
		
		System.out.println("p1의 name : " + p1.name);
		System.out.println("p1의 gender : " + p1.gender);
//		System.out.println("p1의 gender : " + (int)p1.gender);
		// char타입 jvm 기본값은 0
		// 유니코드 문자체계에서 0은 공백을 나타냄
		// 공백이 나오는걸 int형으로 강제 형변환하면 0확인 가능
		
		System.out.println("p1의 pNum : " + p1.pNum);
		System.out.println("p1의 address : " + p1.address);
		System.out.println("p1의 phone : " + p1.phone);
		System.out.println("p1의 age : " + p1.age);
*/
		
		             //┌ 전달하는 값(인자) : 전달인자
		p1.setName("홍길동");
		System.out.println(p1.getName());
		
		p1.setGender('남');
		System.out.println(p1.getGender());
		
		p1.setpNum("123456-1234567");
		System.out.println(p1.getpNum());
		
		p1.setAddress("서울시 중구 남대문로 120");
		System.out.println(p1.getAddress());
		
		p1.setPhone("010-1234-1234");
		System.out.println(p1.getPhone());
		
		p1.setAge(20);
		System.out.println(p1.getAge());
		
		// 본인 객체
		// people 클래스 이용하여 본인 이름 객체 생성하기
		// 본인의 정보 setter 값 대입
		// getter 이용해서 콘솔창 출력까지
		
		 
	}
	
	public void ex2() {
		
		People heo = new People();
		
		heo.setName("허배령");
		heo.setGender('남');
		heo.setpNum("940901-1******");
		heo.setAddress("의정부시 용현로 143");
		heo.setPhone("010-8983-5148");
		heo.setAge(32);
		
		System.out.println(heo.getName());
		System.out.println(heo.getGender());
		System.out.println(heo.getpNum());
		System.out.println(heo.getAddress());
		System.out.println(heo.getPhone());
		System.out.println(heo.getAge());
		
	}
}
