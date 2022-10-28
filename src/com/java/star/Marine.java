package com.java.star;

public class Marine extends GroundUnit{

	Marine(int hp) {
		super(hp);
		hitPoint = MAX_HP;
		
	}
	@Override
	public String toString() {
		return "Marine";
	
   }

	
}