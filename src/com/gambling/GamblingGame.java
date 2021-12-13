package com.gambling;

public class GamblingGame {
       static final int LOSE = 0;
       static final int WIN = 1;
        
       public static void gambling(Gambler gambler1) {
    	   
   			
   	        int trial = (int)Math.floor(Math.random()*10)%2;
   	   
   	    
   		switch (trial) {
   		case LOSE:{
   			gambler1.stake = gambler1.stake - 1;
   			break;
   		}
   		case WIN:{
   			gambler1.stake = gambler1.stake + 1;
   			break;
   		}
   		}
   		
   		
   		
       }
	public static void main(String[] args) {
		
		Gambler gambler1 = new Gambler();
		
		while(gambler1.stake!=Gambler.LOSE_STAKE && gambler1.stake!=Gambler.WIN_STAKE) {
			gambling(gambler1);
			System.out.println("________________");
		}
		
		System.out.println("Final Stake: "+gambler1.stake+ " so Resigning");
		
	}

}
