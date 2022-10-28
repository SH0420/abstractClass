package com.java.star;

public class SCV extends GroundUnit implements Repairable{

	SCV(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
	
    void repair(Repairable r) {  //SCV, Tank, Dropship   //여러개 있을때 다형성 사용
    	if(r instanceof Unit) {
    		Unit u =(Unit)r;
    		while(u.hitPoint != u.MAX_HP) {
    			u.hitPoint++;
    		}
    			System.out.println(u.toString() +"의 수리완료 " ); 			
    	}					
    }	
    
	@Override
	public String toString() {
		return "SCV";
	}
		

}
