import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {
	
	List<MenuItem> items = new ArrayList<MenuItem>();
	
	private Scanner scan = new Scanner(System.in);
	
	public void addMenuItem(MenuItem item){
		
		items.add(item);
		
	}
	
	public void display()
	{
		while (true)
		{
			for(MenuItem i : items)
			{
				i.display();
			}
			
			int choice = scan.nextInt();
			MenuItem i = items.get(choice - 1);
			i.takeAction(choice);
			
		}
	}

}
