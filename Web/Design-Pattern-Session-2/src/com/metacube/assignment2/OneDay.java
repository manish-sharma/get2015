package com.metacube.assignment2;

/**
 * Name: OneDay
 * @author Gaurav Saini
 * Since: 22 October,2015
 * Description: Extends the abstract method of game
 **/
public class OneDay extends Game
{
	// Overrides end play method
	@Override
	void endPlay() 
	{
		System.out.println("Team B chased the Required  runs and won the Match");
		System.out.println("Cricket Game Finished!");
	}
	// Overrides the start play
	@Override
	void startPlay() 
	{
		System.out.println("One Day Match To continue");
		System.out.println("Toss performed. Team A won the toss.");
		System.out.println("Team A elected to bat first");
		System.out.println("Game is now starting.");
	}
}