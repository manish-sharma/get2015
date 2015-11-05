package com.metacube.assignment2;

/**
 * Name: TwentyTwenty
 * @author Gaurav Saini
 * Since: 22 October,2015
 * Description: Extends the abstract method of game
 **/
public class TwentyTwenty extends Game
{
	// Overrides abstract method endPlay
	@Override
	void endPlay()
	{
		System.out.println("Team B chased the Required  runs and won the Match");
		System.out.println("Cricket Game Finished!");
	}
	// Overrides abstract method startPlay
	@Override
	void startPlay()
	{
		System.out.println("Twenty Twenty Match to be Started");
		System.out.println("Toss performed. Team A won the toss.");
		System.out.println("Team A elected to bat first");
		System.out.println("Game is now starting.");
	}
}