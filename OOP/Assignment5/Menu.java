package oop5;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	
	List<MenuItem> menuItems = new ArrayList<>();	
	public void addMenuItem(MenuItem item)
	{
		menuItems.add(item);
	}
		
	public void display() 
	{	
		try
		{
			for (MenuItem obj : menuItems) 
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