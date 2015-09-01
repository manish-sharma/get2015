/**class for inserting an element in a sorted linked list
 * 
 * @author Gaurav Saini
 * Date : 1/09/2015
 */

import java.util.*;

public class SortedLinkedList {
	
	static LinkedList<Integer> list = new LinkedList<Integer>();
	public static int index = 0;
	
	//main method
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		try {	
			do {
				System.out.println("enter your choice\n1. create the list" +			//showing the menu
						"\n2. enter the element into sorted list" +
						"\n3. display" +
						"\n4. exit" );
				
				choice = scan.nextInt();

				switch (choice) {
				
				case 1:																	//to create the list				
					System.out.println("how many element you want to insert?");
					int count = scan.nextInt();
					
					for (int i = 0; i < count; i++)
						list.add(scan.nextInt());
					
					list.sort(null);
					break;
			
				case 2:																	//to insert element in the sorted list
					if(list.size() == 0)
						System.out.println("list does not exists");
					else {
						System.out.println("enter the element");
						int item = scan.nextInt();
						insert(list, item);
					}
					break;
		
				case 3:																	//to print the linked list		
					if(list.size() == 0)
						System.out.println("list does not exists");
					else {
						for (int i = 0;i < list.size();i++)
							System.out.print(list.get(i) + " ");

						System.out.println();
					}
					break;	
		
				case 4:																	//exit case				
					System.exit(0);
					break;
	
				default:																	//default case
					System.out.println("choose valid option");
					break;
				}
			} while(true);
		}
		catch(InputMismatchException e) {
			System.out.println("enter only integer values");
		}
	}

	//recursive method to insert a value in sorted linked list
	public static void insert(LinkedList<Integer> list, int element) {
		
		if (index >= list.size()) {						//add at last position if element is bigger than all values in list
			list.addLast(element);
			index = 0;
		}
		else if(list.get(index) < element) {			//if current element is smaller than given element
			index++;									//then increment index and recursively call the insert method
			insert(list, element);
		}
		else {											//normal case
			list.add(index, element);
			index = 0;
		}
	}
}
