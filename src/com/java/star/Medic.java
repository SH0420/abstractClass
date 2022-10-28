package com.java.star;

public class Medic extends GroundUnit{
	
     Medic(int hp) {
		super(hp);
		hitPoint = MAX_HP;
    }

	static void repair(Marine r) {
		Marine mr= (Marine)r;
		while(mr.hitPoint!= mr.MAX_HP) {
			mr.hitPoint++;
		}
		System.out.println(mr.toString()+ "의 수리완료");
	}
     
     
     
     
     
     
     @Override
	public String toString() {
		
		return "Medic";
	}
     
   
		
    	 
     }
     
     