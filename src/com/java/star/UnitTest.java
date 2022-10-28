package com.java.star;

public class UnitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank t = new Tank(150);
		Dropship d = new Dropship(125);
		SCV scv = new SCV(60);
		
		Marine mr = new Marine(50);
		Medic md = new Medic(30);
		scv.repair(t);
		scv.repair(d);
		//scv.repair(mr);
		Medic.repair(mr);

	}

}
