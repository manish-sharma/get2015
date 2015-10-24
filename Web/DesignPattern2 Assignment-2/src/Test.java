/**
 * Test class extends Game class
 * @author Ankur
 * @since 23-10-2015
 */
public class Test  extends Game
{
	@Override
	void endPlay() 
	{
		System.out.println("Team B was not able to chase the run so match was Drawn");
		System.out.println("Cricket Game Finished!");
	}



	@Override
	void startPlay() {
		System.out.println("Toss performed. Team A won the toss.");
		System.out.println("Team A elected to bat first");
		System.out.println("Game is now starting.");
	}
}
