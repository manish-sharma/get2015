package com.metacube.assignment2;

/**
 * Name: Test
 * @author Gaurav Saini
 * Since: 22 October,2015
 * Description: Extends the abstract method of game
 **/
public class Test extends Game 
{
	// Overrides abstract method endPlay
	@Override
	void endPlay()
	{
		System.out.println("Team B was not able to chase the run so match was Drawn");
		System.out.println("Cricket Game Finished!");
	}
	// Overrides abstract method StartPlay
	@Override
	void startPlay()
	{
		System.out.println("Test Match To continue");
		System.out.println("Toss performed. Team A won the toss.");
		System.out.println("Team A elected to bat first");
		System.out.println("Game is now starting.");
	}
}