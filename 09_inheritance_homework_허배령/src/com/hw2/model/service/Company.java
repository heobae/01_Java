package com.hw2.model.service;

import com.hw2.model.dto.Employee;

public class Company implements ManagementSystem {

	private Employee[] employee = new Employee[10];	// 전체 직원 저장용 배열
	
	private int employeeCount;	// 직원수
	
	public Company(int size) {}

	@Override
	public void addPerson() {
		
	}

	@Override
	public void removePerson() {
		
	}

	@Override
	public void displayAllPersons() {
		
	}

	public Employee[] getEmployee() {
		return employee;
	}

	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	
	
	
}
