package com.gambling;

public class GamblingGame {
       static final int LOSE = 0;
       static final int WIN = 1;
	public static void main(String[] args) {
		Gambler gambler1 = new Gambler();
		int trial = (int)Math.floor(Math.random()*10)%2;
		
		switch (trial) {
		case LOSE:
			gambler1.stake = gambler1.stake - 1;
			break;
		case WIN:
			gambler1.stake = gambler1.stake + 1;
			break;
		}
		System.out.println(gambler1.stake);

	}

}
