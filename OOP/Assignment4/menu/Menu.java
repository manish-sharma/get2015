package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu 
{
	List<MenuItem> items = new ArrayList<MenuItem>();
	
	public void addMenuItem(MenuItem item)
	{
		items.add(item);
	}
	
	public void display() 
	{
		for (MenuItem i : items) 
		{
			i.display();
		}
	}

}
