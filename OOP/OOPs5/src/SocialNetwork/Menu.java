package SocialNetwork;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	
	List<ImenuItem> menuItems = new ArrayList<>();	
	public void addMenuItem(ImenuItem item)
	{
		menuItems.add(item);
	}
		
	public void display() 
	{	
		try
		{
			for (ImenuItem obj : menuItems) 
			{
					obj.display();
			}	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}