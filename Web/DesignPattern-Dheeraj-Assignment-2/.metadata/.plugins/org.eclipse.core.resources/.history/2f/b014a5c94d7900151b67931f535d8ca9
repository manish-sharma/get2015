package Model;

import java.util.Scanner;
/**
 * Main class
 * @author Amit
 * Date Created : 22/10/2015
 */
public class Main {

	/** Main Funcion */
	public static void main(String args[]) {
		/* choice will hold user's chocie */
		int choice;
		boolean flag;
		Scanner sc = new Scanner(System.in);
		do {
			flag = false;
			System.out.println("Enter Choice\n1. One Day\n2. Test\n3. 20-20\n4. Exit");
			
			/*Inputting user's choice */
			while(!sc.hasNextInt()) {
				System.out.println("Enter Valid Integer");
				sc.next();
			}
			choice = sc.nextInt();
			
			/* creating reference of Game class */
			Game gameObj = null;
			switch(choice) {
				/* If choice is 1, then create object of OneDay */ 	
				case 1:
					gameObj = new OneDay();
					break;
				
				/* If choice is 2, then create object of OneDay */
				case 2:
					gameObj = new Test();
					break;
				
				/* If choice is 3, then create object of OneDay */
				case 3:
					gameObj = new TwentyTwenty();
					break;
				
				/* If choice is 4, then Exit from the System */
				case 4: 
					System.exit(0);
					break;
				default : 
					System.out.println("Enter Correct Choice");
					flag = true;
			}
			if(flag) {
				continue;
			}
			
			/* Invocation of play method */
			gameObj.play();
		}while(true);
	}
}
