package Question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu 
{
	List<MenuItem> items = new ArrayList<MenuItem>();
	private Scanner scan  = new Scanner(System.in);
	
	public void addMenuItem(MenuItem item)
	{
		items.add(item);
	}
	
	public void display() 
	{
		MergeArrayList objMergeArrayList1 = new MergeArrayList();
		MergeArrayList objMergeArrayList2 = new MergeArrayList();
		
		while (true) 
		{
			for (MenuItem i : items) 
			{
				i.display();
			}
			int choice = scan.nextInt();
			MenuItem i = items.get(choice) ;
			i.takeAction ( choice, objMergeArrayList1, objMergeArrayList2 );
		}
	}

}
