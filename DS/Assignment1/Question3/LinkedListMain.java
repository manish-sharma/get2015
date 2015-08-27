package Question3;

import java.util.Scanner;

import Question1.ActionableMenuItem;

public class LinkedListMain
{
	public static void main(String[] args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		int location;
		Object item;
		LinkedList objLinkedList = new LinkedList ();
		
		
		while (true)
		{	
			System.out.println("\n\nMenu : ");
			System.out.println("1). Creation of linked list");
			System.out.println("2). Add the particular item in the linked list at the particular location");
			System.out.println("3). Removal of an item based on its value ");
			System.out.println("4). Removal of an item based on its index");
			System.out.println("5). Retrieval of an item of particular index");
			System.out.println("6). Reversal of linked list");
			System.out.println("7). Sorting of linked list");
			System.out.println("8). Traverse linked list");
			System.out.println("9). Exit");
			System.out.println("\nEnter choice");
			choice = sc.nextInt();
			
			switch (choice)
			{
				case 1 : System.out.println("\nEnter item to add in list : ");
					 item = sc.nextInt();
					 objLinkedList.addValueInList(item);
					 break;
						
				case 2 : System.out.println("\nEnter item to add in list : ");
					 item = sc.nextInt();
					 System.out.println("\nEnter location of item to be inserted in list : ");
					 location = sc.nextInt();
					 objLinkedList.addValueAtGivenLocation(item,location-1);
					 break;
						 
				case 3 : System.out.println("\nEnter the item to remove : ");
					 item = sc.nextInt();
					 objLinkedList.removeItemBasedOnvalue(item);
					 break;
						 
				case 4 : System.out.println("\nEnter location of item to be deleted : ");
					 location = sc.nextInt();
					 objLinkedList.removeItemBasedOnLocation( location-1 );
					 break;
						 
				case 5 : System.out.println("\nEnter location of item to be found : ");
					 location = sc.nextInt();
					 objLinkedList.retrieveItemAtGivenLocation(location-1);
					 break;
						 
				case 6 : objLinkedList.reverseLinkedList();
					 break;
						 
				case 7 : objLinkedList.sortLinkedList();
					 break;
						 
				case 8 : objLinkedList.traverseList();
					 break;
						 
				case 9 : System.exit(0);
				 	 break;
				
				default : System.out.println("Please enter correct choice");
				  	  break;
			}
		}
	}
}
