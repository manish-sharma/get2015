/**
 * 
 */
package cricket;

import java.util.Scanner;

/**
 * @author Suman
 *
 */
public class MainClass {

	private static Scanner scanner;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		Cricket cricket = null;
		
		while(true)
		{
			System.out.println("Press 1 to watch Test Match"
					+ "\nPress 2 to watch One Day Match"
					+ "\nPress 3 to watch T20 Match"
					+ "\nPress 4 to exit"
					+ "\nEnter Your Choice : ");
			String choice=scanner.next();
			
			switch (choice) {
			case "1":
				//case when user wants to watch Test Match
				cricket = new TestMatch();
				cricket.play();
				System.out.println();
				break;
				
			case "2":
				//case when user wants to One Day Match
				cricket = new OneDayMatch();
				cricket.play();
				System.out.println();
				break;
				
			case "3":
				//case when user wants to watch T-20 Match
				cricket = new T20Match();
				cricket.play();
				System.out.println();
				break;
			
			case "4":
				//exit system
				System.exit(1);

			default:
				//default case
				System.out.println("Please Enter valid input!!!!!\n");
				break;
			}
		}
	}

}
