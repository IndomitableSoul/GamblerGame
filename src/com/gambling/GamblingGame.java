package com.gambling;

public class GamblingGame {
       static final int LOSE = 0;
       static final int WIN = 1;
	public static void main(String[] args) {
		
		Gambler gambler1 = new Gambler();
		int trialCount=0;
		double loseStake = Gambler.DAILY_STAKE - (0.5*Gambler.DAILY_STAKE);
		double winStake = Gambler.DAILY_STAKE - (0.5*Gambler.DAILY_STAKE);
		
		while(gambler1.stake!=loseStake && gambler1.stake!=winStake) {
			System.out.println("Trial "+ ++trialCount);
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
		System.out.println(gambler1.stake);
		}
	}

}
