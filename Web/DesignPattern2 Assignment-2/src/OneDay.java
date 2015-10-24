/**
 * oneday class extends Game class
 * @author Ankur
 * @since 23-10-2015
 */
public class OneDay extends Game
{
	@Override
	void endPlay() 
	{
		System.out.println("Team B chased the Required  runs and won the Match");
		System.out.println("Cricket Game Finished!");
	}



	@Override
	void startPlay() {
		System.out.println("Toss performed. Team A won the toss.");
		System.out.println("Team A elected to bat first");
		System.out.println("Game is now starting.");
	}
}