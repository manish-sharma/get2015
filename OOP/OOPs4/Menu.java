import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu
{
	// List of menu
	List<MenuItem> items = new ArrayList<>();
	private Scanner scan  = new Scanner(System.in);
	/**
	 *addMenuItem is function which is used to  Adds elments to list
	 */
	public void addMenuItem(MenuItem item)
	{
	items.add(item);
	}
	/**
	 * display is function which is used to Display the menu item 
	 */
	public void display()
	{
		int choice=0;
		while (choice!=4) 
		{
	    // For printing
		for (MenuItem i : items) 
		{
			i.display();
		}
		 choice = scan.nextInt();
		MenuItem i = items.get(choice - 1) ;
		i.takeAction(choice);
		}
	}
}

