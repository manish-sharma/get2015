package Question1;

import java.util.Scanner;

public class ActionableMenuItem implements MenuItem
{
	Action action ;
	String displayText; 
	int choice;

	public ActionableMenuItem (String str)
	{
		displayText  = str;
	}
	
	public ActionableMenuItem (int choice)
	{
		this.choice  = choice;
	}
	
	@Override
	public void display() 
	{
		System.out.println(displayText);
	}

	@Override
	public void takeAction ( int choice, ArrayListUsingArray objArrayListUsingArray ) 
	{

		Scanner sc = new Scanner(System.in);
		int location;
		Object item;
		
		switch (choice)
		{
			case 1 : System.out.println("\nEnter item to add in list : ");
					 item = sc.nextInt();
					 objArrayListUsingArray.addValueInList(item);
					 break;
					
			case 2 : System.out.println("\nEnter item to add in list : ");
					 item = sc.nextInt();
					 System.out.println("\nEnter location of item to be inserted in list : ");
					 location = sc.nextInt();
					 objArrayListUsingArray.addValueAtGivenLocation(item,location-1);
					 break;
					 
			case 3 : System.out.println("\nEnter the item to find : ");
					 item = sc.next();
					 System.out.println("\nEnter current location of the item in list : ");
					 location = sc.nextInt();
					 System.out.println("First occurrence of item based on its given location = "
							+objArrayListUsingArray.firstOccurenceAfterGivenLocation(location, item));
					 break;
					 
			case 4 : System.out.println("\nEnter the item whose 1st index to be found : ");
					 item = sc.next();
					 System.out.println("\nFirst index of "+item+" = "+objArrayListUsingArray.findFirstIndexOfItem (item));
					 break;
					 
			case 5 : System.out.println("\nEnter location of item to be deleted : ");
					 location = sc.nextInt();
					 objArrayListUsingArray.removeItemFromGivenLocation(location-1);
					 break;
					 
			case 6 : System.out.println("\nEnter item to be deleted : ");
					 item = sc.next();
					 objArrayListUsingArray.removeItemFromList(item);
					 break;
					 
			case 7 : objArrayListUsingArray.reverseArrayList();
					 break;
					 
			case 8 : objArrayListUsingArray.sortArrayList();
					 break;
					 
			case 9 : objArrayListUsingArray.clearArrayList();
					 break;
					 
			case 10 : System.exit(0);
			 		  break;
			
			default : System.out.println("Please enter correct choice");
			  		  break;
		}
	}
}
