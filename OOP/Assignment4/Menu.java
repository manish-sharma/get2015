package com.metacube.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	List<MenuItem> items = new ArrayList<MenuItem>();
	private Scanner scan  = new Scanner(System.in);
	
	public void addMenuItem(MenuItem item){
		items.add(item);
	}
	public void  display()
	{
		int choice;
		while (true)
		{
			for (MenuItem menuItem : items)
			{
				menuItem.display();
			}
			choice = scan.nextInt();
			MenuItem i = items.get(choice - 1) ;
			i.takeAction();
		}
	
	}

}
