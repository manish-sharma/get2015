package Question2;

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
	public void takeAction ( int choice, MergeArrayList objMergeArrayList1, MergeArrayList objMergeArrayList2 ) 
	{
		Object item;
		Scanner sc = new Scanner (System.in);
		
		switch (choice)
		{
			case 1 : System.out.println("\nEnter item to add in list 1 : ");
					 item = sc.nextInt();
					 objMergeArrayList1.addValueInList(item);
					 break;
		
			case 2 : System.out.println("\nEnter item to add in list 2 : ");
					 item = sc.nextInt();
					 objMergeArrayList2.addValueInList(item);
					 break;
					 
			case 3 : System.out.println("List 1 after merging list 2 to it : ");
					 objMergeArrayList1.mergeArrayLists(objMergeArrayList2);
					 break;
					 
			case 4 : System.exit(0);
					 break;
			
			default : System.out.println("Please enter correct choice");
			 		  break;

		}
	}
}
