/**
 * Game class used to initialize and play the game
 * @author Ankur
 * @since 23-10-2015
 */
public abstract class Game
{
	boolean initialize(int noOfTeams, int noOfPlayers) 
	{
		boolean flag =false;
		if (noOfTeams != 2)
		{
			System.out.println("not sufficient teams.");
		}
		if (noOfPlayers != 11)
		{
			System.out.println("not sufficient members in the team.");
		} 
		else if((noOfTeams == 2)&&(noOfPlayers == 11))
		{
			System.out.println("game is ready to start.");
			flag= true;
		}


		return flag;

	}

	abstract void startPlay();
	abstract void endPlay();

	//template method
	public final void play(int noOfTeams, int noOfPlayers)
	{

		//initialize the game
		if(initialize(noOfTeams, noOfPlayers))
		{

			//start game
			startPlay();

			//end game
			endPlay();
		}
	}
}






