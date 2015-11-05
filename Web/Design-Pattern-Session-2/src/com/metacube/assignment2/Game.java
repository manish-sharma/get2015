package com.metacube.assignment2;

/**
 * Name: Game
 * @author Gaurav Saini
 * Since: 22 October,2015
 * Description: abstract Game 
 **/
public abstract class Game
{
	/**
	 * Name: initialize
	 * @param noOfTeams
	 * @param noOfPlayers
	 * @return
	 * Description: initializes the Team
	 **/
	boolean initialize(int noOfTeams, int noOfPlayers) 
	{
		// Flag to check the Validation
		boolean flag = false;
		// No of teams 
		if (noOfTeams != 2) 
		{
			System.out.println("not sufficient teams.");
		}
		// No of Players
		if (noOfPlayers != 11) 
		{
			System.out.println("not sufficient members in the team.");
		} 
		// Checking the True Condition
		else if ((noOfTeams == 2) && (noOfPlayers == 11)) 
		{
			System.out.println("game is ready to start.");
			flag = true;
		}
		return flag;
	}
	// Abstract function to start Play
	abstract void startPlay();
	// Abstract function to end Play
	abstract void endPlay();

	/**
	 * Name: play
	 * @param noOfTeams
	 * @param noOfPlayers
	 * Description: Template
	 **/
	public final void play(int noOfTeams, int noOfPlayers)
	{
		// initialize the game
		if (initialize(noOfTeams, noOfPlayers))
		{
			// start game
			startPlay();
			// end game
			endPlay();
		}
	}
}
