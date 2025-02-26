package com.hw2.model.service;

import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem {

	private Prisoner[] prisoners = new Prisoner[10];	// 전체 수용자 저장용 배열
	
	private int PrisonerCount;	// 수용자수
	
	public Prison(int size) {}

	@Override
	public void addPerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayAllPersons() {
		// TODO Auto-generated method stub
		
	}

	public Prisoner[] getPrisoners() {
		return prisoners;
	}

	public void setPrisoners(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}

	public int getPrisonerCount() {
		return PrisonerCount;
	}

	public void setPrisonerCount(int prisonerCount) {
		PrisonerCount = prisonerCount;
	}
	
	
	
}
