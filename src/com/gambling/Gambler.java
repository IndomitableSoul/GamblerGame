package com.gambling;

public class Gambler {
	   static final int DAILY_STAKE = 100;
	   static final int DAILY_BET = 1;
	   static final double LOSE_STAKE = DAILY_STAKE - (0.5*DAILY_STAKE);
	   static final double WIN_STAKE = DAILY_STAKE + (0.5*DAILY_STAKE);
	   int stake;
	   public Gambler() {
		this.stake = DAILY_STAKE;
	 }
	}

