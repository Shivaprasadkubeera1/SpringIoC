package com.SpringPatient;

public class Patient {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBedNumber() {
		return bedNumber;
	}

	public void setBedNumber(int bedNumber) {
		this.bedNumber = bedNumber;
	}

	String name;
	int bedNumber;
	
	public String add() {
		return "hey! spring is cool";
	}
}
