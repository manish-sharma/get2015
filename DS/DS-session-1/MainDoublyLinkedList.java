/**main class for doubly linked list operations
 * 
 * @author Gaurav Saini
 * Date : 26/08/2015 
 */

import java.util.Scanner;

public class MainDoublyLinkedList {
	
	//main method
	public static void main(String[] args) {

		Scanner sc = null;
		try {
			int choice, index, item;
			sc = new Scanner(System.in);
			DoublyLinkedList list = new DoublyLinkedList();
			
			do {
			System.out.print("\n 1. Add Element at start"			//showing operations menu
							+"\n 2. Add Element at given index"
							+"\n 3. Removal of an item by value "
							+"\n 4. Removal of an item by index"
							+"\n 5. Retrieval of an item at given index"
							+"\n 6. Reverse the linked list"
							+"\n 7. Sort the linked list"
							+"\n 8. Show linked list"
							+"\n 9. Exit");
			System.out.print("\n Enter Your choice : ");
			do {
				System.out.println("Enter Positive Number");
				while (!sc.hasNextInt()) {
					System.out.println("please enter valid input");
					sc.next();
				}
				choice = sc.nextInt();
			} while (choice <= 0);
			
			switch(choice) {

				case 1:					//add node at beginning
					System.out.print("\n Enter node value : ");
						while (!sc.hasNextInt()) {
							System.out.println("enter valid input");
							sc.next();
						}
						item = sc.nextInt();
						list.addAtFirst(item); 
						break;
						
				case 2:						//add node at given index
					System.out.print("\n Enter node value : ");
					while (!sc.hasNextInt()) {
						System.out.println("enter valid input");
						sc.next();
					}
							
					item = sc.nextInt();
					System.out.print("\n Enter index : ");
					do {
						System.out.println("Enter Positive Number");
						while (!sc.hasNextInt()) {
							System.out.println("enter valid input");
							sc.next();
						}
						index = sc.nextInt();
					} while (index < 0);
					list.addAtIndex(index, item); 
					break;
						
				case 3:								//remove a node by value
					System.out.print("\n Enter node value : ");
					while (!sc.hasNextInt()) {
						System.out.println("enter valid input");
						sc.next();
					}
							
					item = sc.nextInt();
					list.remove(item); 
					break;
						
				case 4:							//remove node by index
					System.out.print("\n Enter index : ");
					do {
						System.out.println("Enter Positive Number");
						while (!sc.hasNextInt()) {
							System.out.println("enter valid input");
							sc.next();
						}
					index = sc.nextInt();
					} while (index < 0);
					list.removeFromIndex(index); 
					break;
						
				case 5:							//get element at given index
					System.out.print("\n Enter index : ");
					do {
						System.out.println("Enter Positive Number");
						while (!sc.hasNextInt()) {
							System.out.println("enter valid input");
							sc.next();
						}
						index = sc.nextInt();
					} while (index < 0);
					list.retrieve(index); 
					break;
						
				case 6:							//reverse the linked list
					list.reverse();
					break;
					
				case 7:							//sort the linked list
					list.sort(); 
					break;
						
				case 8:							//show the linked list
					list.display(); 
					break;

				case 9:
					System.exit(0);
						
				default:
					System.out.println("Enter right choice");
				}
	
			System.out.println("Press 1 to continue and any other number to exit");
			do {
				System.out.println("Enter Positive Number");
				while (!sc.hasNextInt()) {
					System.out.println("enter valid input");
					sc.next();
				}
				choice = sc.nextInt();
			} while (choice < 0);
				
			} while(choice == 1);
			
			System.out.println("System.exited");
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}