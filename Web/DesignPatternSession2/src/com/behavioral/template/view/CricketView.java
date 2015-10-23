package com.behavioral.template.view;


import java.util.Scanner;

import com.behavioral.template.controller.CricketFormateController;
import com.behavioral.template.model.CricketMentor;
import com.behavioral.template.model.GameType;

/**
 * @name CricketView
 * @author Sumitra
 * @description this is view class provides UI
 */
public class CricketView {
	public static void view() {
		GameType gameType;//creating object of enum GameType
		int choice;
		do {
			System.out.println("Enter game type::");
			System.out.println("\n1:20-20\n2:One Day\n3:Test\n0:Exit");
			Scanner scanner =new Scanner(System.in);
			while (!scanner.hasNextInt()) {
				System.out.println("Please Enter only Integer!");
				scanner.next();
			}
			choice = scanner.nextInt();
			if(choice == 1) {
				gameType = GameType._20__20;
				CricketFormateController typeOfCricket = new CricketFormateController();//Object of Factory class TypeOfCricket
				CricketMentor cricket = typeOfCricket.getCricketType(gameType);//now taking object of _20_20 class in cricket object
				cricket.play();//calling of play method of _20_20 class
			}
			else if(choice == 2) {
				gameType = GameType.OneDay;
				CricketFormateController typeOfCricket = new CricketFormateController();
				CricketMentor cricket = typeOfCricket.getCricketType(gameType);
				cricket.play();
			}
			else if(choice == 3) {
				gameType = GameType.Test;
				CricketFormateController typeOfCricket = new CricketFormateController();
				CricketMentor cricket = typeOfCricket.getCricketType(gameType);
				cricket.play();
			}
			else if(choice == 0) {
				System.out.println("Exit::");
				System.exit(0);
			}
			else {
				System.out.println("Please Enter Correct Choise");
			}
		}while(choice != 0);
	}
}
