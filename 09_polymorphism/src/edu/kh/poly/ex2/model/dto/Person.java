package edu.kh.poly.ex2.model.dto;

public class Person extends Animal {

// 오버라이드 강제화
// alt + shift + s -> Override/Implement Methods
	
	private String name;
	
	public Person() {}

	
	
	public Person(String type, String eatType, String name) {
		super(type, eatType);
		this.name = name;
	}
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void eat() {
		System.out.println("숟가락, 젓가락 등 도구를 이용하여 먹는다");
	}

	@Override
	public void breath() {
		System.out.println("코와 입으로 숨쉰다");
	}

	@Override
	public void move() {
		System.out.println("두 발로 걷는다");
	}
	
	@Override
	public String toString() {
		return "Person : " + super.toString() + " / " + name;
	}
	
	
}
