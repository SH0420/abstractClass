package com.java.star;

public class AirUnit extends Unit{

	AirUnit(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
	@Override
	public String toString() {
		return "Dropship";
	}
		
	

}
