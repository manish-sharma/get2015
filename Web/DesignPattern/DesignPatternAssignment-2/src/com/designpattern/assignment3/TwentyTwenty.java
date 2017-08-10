package com.designpattern.assignment3;
/**This class extends the cricket class and implements its method for the 20-20 international format 
 * 
 * @author Shishir
 *Date 23rd October 2015
 */
public class TwentyTwenty extends Cricket{

	@Override
	void intializeGameType() {
		System.out.println("Welcome the Twenty Twenty Match between India and South Africa ");
	}

	@Override
	void startGame() {
		// TODO Auto-generated method stub
		System.out.println("Game will start at 19:00 according to Indian Standard Time");
	}

	@Override
	void getGameDetails() {
		// TODO Auto-generated method stub
		System.out.println("Teams: India Vs South Africa");
		System.out.println("Timings:19:00 To 23:00");
		System.out.println("Overs:20 Overs in an innings Total 40 in whole match");
		System.out.println("Indian Players:11 players with captain as MS Dhoni");
		System.out.println("South Africa:11 players with captain as Justin Ontong");
		System.out.println("No chnage in both the sides");
		
	}

	@Override
	void endGame() {
		// TODO Auto-generated method stub
		System.out.println("South Africa Won the match with 6 wickets");
	}

	
}
