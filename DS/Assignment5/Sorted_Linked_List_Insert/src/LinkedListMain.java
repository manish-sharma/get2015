
/**
 * @author Amit
 *
 */

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListMain {

	public static void main(String args[]) {
		
		/* Initialization */
		Scanner scan = null;
		List<Integer> linkedList = null;
		Linked_List_Operations linked_List_OperationsObj = null;
		try
		{
			scan  = new Scanner(System.in);
			
			/* Creating Linked list */
			linkedList = new LinkedList<Integer>();
			
			/* Adding Elements to linked list */
			linkedList.add(3);
			linkedList.add(6);
			linkedList.add(1);
			linkedList.add(3);
			
			/* Sorting the list */
			Collections.sort(linkedList);
			int choice, number;
			System.out.println("Sorted List is: ");
			
			linked_List_OperationsObj = new Linked_List_Operations();
			
			/* Showing Sorted List */
			linked_List_OperationsObj.display(linkedList);
			do
			{
				/* Displaying Menu */
				System.out.println("Enter Choice: ");
				System.out.println("1. Insert an element");
				System.out.println("2. Display the linked list");
				System.out.println("3. Exit");
				
				/* Taking User's choice as input */
				choice = Validation.isInteger();
				 /* Switch case based on user's choice */
				switch(choice)
				{
				
					/* if Choice is 1, then number will be inserted in the sorted linked list */
					case 1:
						System.out.println("Enter Integer Number to insert :");
						number = Validation.isInteger();
						boolean result = linked_List_OperationsObj.insert(number, linkedList);
						if(result)
							System.out.println("Number added Successfully");
						else
							System.out.println("Linked List is null. First Create object");
						break;
						
					/* if choice is 2, then the linked list will be displayed */
					case 2:
						System.out.println("Linked List is: ");
						linked_List_OperationsObj.display(linkedList);
						break;
						
					/* if choice is 3, then the System will be exited */
					case 3:
						System.out.println("System Exit");
						System.exit(0);
						break;
						
					/* Default Case */
					default: 
						System.out.println("Enter Correct Choice");
				}
		
			} while(true);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			scan.close();
		}
	}
}
