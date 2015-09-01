import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * purpose : to implement sortedLinkedList
 * @author Ravika
 * @since 1/9/2015
 */
public class SortedLinkedList {
	private LinkedList<Integer> linkedList;
	int index=0;
	public SortedLinkedList() {
		// TODO Auto-generated constructor stub
		linkedList = new LinkedList<Integer>();
	}
	/**
	 * purpose : to add in linked list without sorting
	 * @param item
	 */
	void add(Integer item ) {
		linkedList.add(item);
	}
	/**
	 * 
	 * purpose : to print the list
	*/
	void printList() {
		System.out.println(linkedList);
	}
	/**
	 * purpose : to sort the list
	 */
	private void sortList() {
		Collections.sort(linkedList);
	}
	/**
	 * purpose : to insert the element in the linked list
	 * @param element = to add
	 */
	public void insert(Integer element){
		if (index >= linkedList.size() || linkedList.get(index) >= element){
			linkedList.add(index,element);
			index = 0;
		}
		else if(linkedList.get(index)<element){

			index++;
			insert( element);

		}
		else{
			linkedList.addLast(element);
			index = 0;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SortedLinkedList sortedLinkedList = new SortedLinkedList();
		int choice = 0;
		try{	
			do {
				System.out.println("enter your choice\n1. create the list" + // display menu
						"\n2. enter the element into sorted list" +
						"\n3. display" +
						"\n4. exit" );
				choice = scan.nextInt();
				switch (choice) {
				case 1:	//to create the list				
					System.out.println("how many element to insert?");
					int count = scan.nextInt();
					for (int i = 0; i < count; i++)
						sortedLinkedList.add(scan.nextInt());
					sortedLinkedList.sortList();
					break;

				case 2: //to insert the single element in the sorted list
					if(sortedLinkedList.size() == 0)
						System.out.println("first create the list");
					else{
						System.out.println("enter the element");
						int item = scan.nextInt();
						sortedLinkedList.insert( item);
					}
					break;

				case 3:	//to print the linked list		
					if(sortedLinkedList.size() == 0)
						System.out.println("first create the list");
					else{
						for (int i = 0;i < sortedLinkedList.size();i++) {
							sortedLinkedList.printList();
						}
						System.out.println();
					}
					break;	

				case 4:	// to terminate the code				
					System.exit(0);
					System.out.println("***EXIT***");
					break;

				default:
					System.out.println("choose one of the above option only.");
					break;
				}


			}while(choice!=4);
		}
		catch(InputMismatchException e){
			System.out.println("enter only integer values**EXIT**");
		}
		scan.close();
	}
	/**
	 * purpose : to get the size of list
	 * @return = size of list
	 */
	private int size() {
		// TODO Auto-generated method stub
		return linkedList.size();
	}
}
