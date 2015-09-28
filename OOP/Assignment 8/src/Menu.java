
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Name: Menu
 * @author Shishir Pareek
 * Since: 20 August,2015
 * Description: Adds the items to the list
 */
public class Menu
{
	// List of menu
	List<MenuItem> items = new ArrayList<>();
	private Scanner scan  = new Scanner(System.in);
	/**
	 * Name: addMenuItem
	 * @param item
	 * Description: Adds elements to list
	 */
	public void addMenuItem(MenuItem item)
	{
	items.add(item);
	}
	/**
	 * Name: display
	 * Description: Display the menu item 
	 */
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