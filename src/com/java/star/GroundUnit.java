package com.java.star;

public class GroundUnit extends Unit{

	GroundUnit(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
	@Override
	public String toString() {
		return "Tank";

    }
}