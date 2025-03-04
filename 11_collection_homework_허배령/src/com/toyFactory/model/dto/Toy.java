package com.toyFactory.model.dto;

import java.util.Objects;

public class Toy {
	
	private String name;
	private int age;
	private int price;
	private String color;
	private String made;
	private String materials;
	
	public Toy() {
		// TODO Auto-generated constructor stub
	}

	public Toy(String name, int age, int price, String color, String made, String materials) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.made = made;
		this.materials = materials;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMade() {
		return made;
	}

	public void setMade(String made) {
		this.made = made;
	}

	public String getMaterials() {
		return materials;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}

	@Override
	public String toString() {
		return  " 이름: " + name + " / " 
	+ "가격: "+ price + " / " 
				+ "색상: " + color + " / " 
	+ "사용가능연령: " + age + " / " 
				+ "제조년월일: " + made + " / " 
	+ "재료: " + materials;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, color, made, materials, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color) && Objects.equals(made, other.made)
				&& Objects.equals(materials, other.materials) && Objects.equals(name, other.name)
				&& price == other.price;
	}
	
	

}
