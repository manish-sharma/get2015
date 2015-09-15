/*
 * This class Adds the items to the list
 * @author Banwari
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu
{
	// List of menu
	List<MenuItem> items = new ArrayList<>();
	private Scanner scan  = new Scanner(System.in);
	/*
	 *Adds elements to list
	 * @param item
	 */
	public void addMenuItem(MenuItem item)
	{
	items.add(item);
	}
	// Display the menu item 
	public void display()
	{
		while (true) 
		{
	    // For printing
		for (MenuItem i : items) 
		{
			i.display();
		}
		int choice = scan.nextInt();
		MenuItem i = items.get(choice - 1) ;
		i.takeAction(choice);
		}
	}
}

