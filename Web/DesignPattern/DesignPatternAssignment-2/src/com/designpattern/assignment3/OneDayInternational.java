package com.designpattern.assignment3;
/**This class extends the cricket class and implements its method for the one day international format 
 * 
 * @author Shishir
 *Date 23rd October 2015
 */
public class OneDayInternational extends Cricket {
	@Override
	void intializeGameType() {
		System.out.println("Welcome the OneDay International Match between India and South Africa of Paytm Freedom Series ");
	}

	@Override
	void startGame() {
		// TODO Auto-generated method stub
		System.out.println("Game will start at 13:30 according to Indian Standard Time");
	}

	@Override
	void getGameDetails() {
		// TODO Auto-generated method stub
		System.out.println("Teams: India Vs South Africa");
		System.out.println("Timings:13:30 To 22:30");
		System.out.println("Overs:50 Overs in an innings Total 100 in whole match");
		System.out.println("Indian Players:11 players with captain as MS Dhoni");
		System.out.println("South Africa:11 players with captain as Justin Ontong");
		System.out.println("Harbhajan Singh will be playing instead of Akshar Patel");
		
	}

	@Override
	void endGame() {
		// TODO Auto-generated method stub
		System.out.println("India Won the match by 25 runs");
	}
}
