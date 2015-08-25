package assignmentOOP_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 * 
 
 * Description: This class adds menu items to the menu and displays them
 *
 */
public class Menu {
	
	static List<String> items = new ArrayList<>();

	static private Scanner scan  = new Scanner(System.in);
	
	
	/**
	 * This will add the items of menu to the items list
	 * @param item: item of menu
	 */
	public void addMenuItem(String item)
	{

		items.add(item);

	}

	
	
	/**
	 * This will display the menu items to the console
	 */
	public int displayMenu(TrainReservationSystem trainReservationSystem) 
	{
		
		   System.out.println("\n\nTrain reservation System(select your choice)\n");
			for (String i : items) 
			{

				System.out.println(i);

			}

			int choice = scan.nextInt();
			Action ac=new Action();
			int i=ac.perform(choice,trainReservationSystem);
			return i;
		
		}

}

