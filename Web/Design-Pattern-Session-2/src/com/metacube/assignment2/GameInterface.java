package com.metacube.assignment2;

import java.util.Scanner;
/**
 * Name: Game Interface
 * @author Gaurav Saini
 * Since: 22 October,2015
 * Description: UserInterface
 **/
public class GameInterface 
{
	/**
	 * Name: main
	 * @param args
	 * Description: UserInterface
	 **/
	public static void main(String[] args)
	{
		// User Message
		System.out.println("Enter 50 Overs For OneDay\n Enter 20 Overs For Twenty Twenty \n Enter 450 Overs For Test");

		System.out.println("Enter Total No of Overs");
		int overs = new Scanner(System.in).nextInt();

		System.out.println("enter No of Teams");
		int noOfTeams=new Scanner(System.in).nextInt();

		System.out.println("Enter No Of players");
		int noOfPlayers=new Scanner(System.in).nextInt();

		// Checking the Overs For selecting the Match type
		if (overs == 50)
		{
			Game game = new OneDay();
			game.play(noOfTeams, noOfPlayers);
		} 
		else if (overs == 20) 
		{
			Game game = new TwentyTwenty();
			game.play(noOfTeams, noOfPlayers);
		} 
		else if (overs == 450) 
		{
			Game game = new Test();
			game.play(noOfTeams, noOfPlayers);
		}
		else
		{
			System.out.println("Enter Correct format ");
		}
	}
}