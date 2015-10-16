
package com.metacube.menu;
import java.util.*;
/**
 * 
 * @author Sumitra
 *
 */
public class Menu  {
	List<MenuItem> items = new ArrayList<>();
	private Scanner scan  = new Scanner(System.in);
	
	
	public void addMenuItem(MenuItem item){
		items.add(item);
	}

	public void display() {
		try
		{
			while (true) {
		
			
			for (MenuItem i: items )
			{
			i.display();
			}
			System.out.println("Enter your choice:");
			while(!scan.hasNextInt()){
				System.out.println("Enter integer value only");
				scan.next();
			}
			int choice = scan.nextInt();
			if(choice <= 4 && choice >0){
			MenuItem a = items.get(choice - 1) ;
			
			a.takeAction(choice);
			}
			else
				System.out.println("Enter valid option");
		}}catch(IndexOutOfBoundsException ae)
		{
			
			return;
		}
	
	}
}



