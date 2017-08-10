package com.designpattern.assignment3;
/**This class extends the cricket class and implements its method for the test cricket format 
 * 
 * @author Shishir
 *Date 23rd October 2015
 */
public class TestCricket extends Cricket {
	@Override
	void intializeGameType() {
		System.out.println("Welcome the Test Match between India and South Africa ");
	}

	@Override
	void startGame() {
		// TODO Auto-generated method stub
		System.out.println("Game will start at on 9:30 am  1st November 2015 according to according to Indian Standard Time");
	}

	@Override
	void getGameDetails() {
		// TODO Auto-generated method stub
		System.out.println("Teams: India Vs South Africa");
		System.out.println("Timings:9:30 To 17:30 and will go on till 5th November 2015");
		System.out.println("Overs:Depends upon the day till match goes on");
		System.out.println("Indian Players:11 players with captain as MS Dhoni");
		System.out.println("South Africa:11 players with captain as Justin Ontong");
		System.out.println("No change in both the sides");
		
	}

	@Override
	void endGame() {
		// TODO Auto-generated method stub
		System.out.println("South Africa Won the match with innings wickets");
	}

}
