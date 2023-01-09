package com.bridgelabz.gamblingsimulation;
import java.util.*;

public class GamblingSimulation {
	
	int stake = 100;
	int day = 1;
	int win_count = 0;
	int loss_count = 0;
	int total_win = 0;
	int total_loss = 0;
	int [] array = new int [20];
	
	// Checking for winning or losing a bet
	public void betWinner() { 
		while (day <= 20) {
			int win = 0;
			int loss = 0;
			
			for (int i = 0; i <= stake; i++) {
				int bet = (int) (Math.random() *10)% 2;
				//System.out.println(" Bet: " + bet);
				if( bet == 1) {
					win ++;
				}
				else {
					loss ++;
				}
			}
			//System.out.println(" win:" +win);
			//System.out.println(" loss: " +loss);
			
			if (win >= 50) {
				System.out.println(" Resign for the day " + day + " as you win by:	" + win + " $");
				win_count ++;
				total_win = total_win + win;
			}
			else {
				System.out.println(" Resign for the day " + day + " as you loss by:	" + loss + " $" );
				loss_count ++;
				total_loss = total_loss - (-loss);
			}
			day ++;
			for ( int j = 0; j <= 10; j++) {
				array[j] = win;
				array[j]= loss;
			}
		}
		System.out.println( );
		System.out.println(" Total wining days in the month: " + win_count);
		System.out.println(" Total wining amount in month: " + total_win);
		System.out.println( );
		System.out.println(" Total loss days: " + loss_count);
		System.out.println(" Total losing amount in month: " + total_loss);
	}
	
public static void main(String[] args) {
		
		GamblingSimulation g1 = new GamblingSimulation();
		g1.betWinner();
		
	}
}

