/**main class for singly linked list operations
 * 
 * @author Gaurav Saini
 * Date : 26/08/2015 
 */

import java.util.Scanner;

public class MainLinkedListClass 
{
	public static void main(String args[])
	{
		SinglyLinkedListNode<Integer> newNode = new SinglyLinkedListNode<Integer>();
		
		System.out.println("How many nodes you want to create in a linked list");		// To store the no of values
		
		int noOfLinkedList, data = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (!scanner.hasNextInt()) {
            System.out.println("enter valid input");
            scanner.next(); 
        }
		
		noOfLinkedList = scanner.nextInt();												// Entering the value of Node
		
		for (int i = 0; i < noOfLinkedList; i++) {
			System.out.println("Enter new node value");
			while (!scanner.hasNextInt()) {
		        System.out.println("enter valid input");
		        scanner.next();
		    }
			data = scanner.nextInt();
			newNode.addElement(data);
		}
		newNode.display();
		System.out.println("Enter position where you want to add the new node");
		
		while (!scanner.hasNextInt()) {					// Position where to add the new node
            System.out.println("enter valid input");
            scanner.next(); 
        }
		int pos = scanner.nextInt();
		
		System.out.println("Enter new node value");
		while (!scanner.hasNextInt()) {
            System.out.println("enter valid input");
            scanner.next(); 
        }
		data = scanner.nextInt();
		newNode.addAtIndex(pos, data);
		newNode.display();
		System.out.println("Enter value which you want to delete");
		while (!scanner.hasNextInt()) {
            System.out.println("enter valid input");
            scanner.next(); 
        }
		int deleteValue = scanner.nextInt();
		
		if (newNode.deleteByValue(deleteValue)) 
			System.out.println(deleteValue + " deleted from linked list");
		else
			System.out.println("no such type of number Exist");

		newNode.display();
		System.out.println("");
		System.out.println("Enter index from where you want to delete an item");
		while (!scanner.hasNextInt()) {
            System.out.println("enter valid input");
            scanner.next(); 
        }
		pos = scanner.nextInt();
		
		System.out.println("data deleted from index " + pos);
		if (newNode.deleteByIndex(pos)) {
			while (!scanner.hasNextInt()) {
	            System.out.println("enter valid input");
	            scanner.next(); 
	        }
			System.out.println("data deleted from index " + pos);
		}
		newNode.display();

		System.out.println("Enter pos from where you want to retrieve the data");
		while (!scanner.hasNextInt()) {
            System.out.println("enter valid input");
            scanner.next(); 
        }
		
		pos = scanner.nextInt();
		System.out.println(newNode.getItem(pos));
		newNode.reverseLinkedList();
		
		System.out.println("Reversed list is :");
		newNode.display();
		newNode.sortList();
		
		System.out.println("Sorted list is :");
		newNode.display();
	}
}