

import java.util.InputMismatchException;
import java.util.Scanner;

public class SingleLinkList {
	// start of the link list.
	public Node start;
	// size of link list.
	int size=0;

	/** adding a item in a link list
	 * @param value to be entered in 
	 */
	public void addItemInLinkList(String value) {
		Node newNode = new Node(value, null);
		if (start == null) {
			start = newNode;

		} else {
			Node temp = start;
			while (temp.getPointer() != null){
				temp = temp.getPointer();
			}
			temp.setPointer(newNode);

		}
		size+=1;
	}
	
	/**return the size of link list
	 * @return
	 */
	int size(){
		return size;
	}

	/**add a node at a particular node
	 * @param position position at which node is to be inserted
	 * @param value to be inserted at node
	 */
	public void addItemAtPosition(int position, String value) {
		Node newNode = new Node(value, null);
		Node temp = start;
		if(position>size)
		{	
			System.out.print("Enter vaild position");
		     return;
		}
		if (position == 0) {
			newNode.setPointer(start);
			start = newNode;
		} 
		else {
			for (int shift = 0; shift < position - 1; shift++) {
				temp = temp.getPointer();
			}
			newNode.setPointer(temp.getPointer());
			temp.setPointer(newNode);
		}
		size+=1;
	}

	/**remove a node on the basis of value
	 * @param value
	 */
	public void removeItemOntheBasedOfValue(String value) {
		Node temp = start;
		Node previous = temp;
		boolean isValueFound = false;
		if(size == 0){
			System.out.println("list is empty firstly add and then delete item");
		}
		else {
			while (temp != null) {
				if (temp.getData() == value) {
					size-=1;
					isValueFound = true;
					if (temp == start) {
						start = temp.getPointer();
						return;
					} else {
						previous.setPointer(temp.getPointer());
						return;
					}
				}
				previous = temp;
				temp = temp.getPointer();
	
			}
			if(isValueFound == false)
				System.out.println("item not found");
		}
		
	}

	/**remove a node on the basis of index
	 * @param index
	 */
	public void removeItemOntheBasedOfIndex(int index) {

		Node temp = start;
		Node previous = null;
		if(index>size)
		{ 
			System.out.print("Eneter vaild Location");
			return;
		}
		if (index == 0) {
			start = start.getPointer();
		} 
		else {
			for (int shift = 0; shift < index - 1; shift++) {
				temp = temp.getPointer();
			}
			previous = temp;
			temp = temp.getPointer();
			previous.setPointer(temp.getPointer());
		}
		size-=1;
	}

	/**return a vlaue of particular index
	 * @param index
	 * @return
	 */
	String itemRetrieval(int index) {
		String data;
		Node temp = start;
		if(index>size)
		{	
			System.out.print("Eneter vaild Location");
			return null;
		}
		for (int shift = 0; shift < index; shift++) {
			temp = temp.getPointer();
		}
		data = temp.getData();
		return data;
	}

	/**reverse the list
	 * 
	 */
	public void reverseList() {
		if(size==0){
			System.out.println("list is empty nothing to reverse");
		}
		else if(size ==1){
			System.out.println("there is only one element in list so, no effect of reverse");
		}
		else{
			Node before = null;
			Node tmp = start;
			Node next = tmp.getPointer();
			while (tmp != null) {
				
				if (next == null)
					break;

				tmp.setPointer(before);

				before = tmp;
				tmp = next;
				next = next.getPointer();
			}
			tmp.setPointer(before);
			start = tmp;
		}
	}
	/**sort a list in increasing order
	 * 
	 */
/*	void sortLinkedList() {
		if(size==0){
			System.out.println("list is empty nothing to reverse");
		}
		else if(size ==1){
			System.out.println("there is only one element in list so, no effect of reverse");
		}
		else {
			Node temp, current=start;
			int check;
			while( current != null )  // apply simple sorting to sort the elements of Linked list
			{
				temp = start;
				while( temp.getPointer() != null )
				{
					if(temp.getData() > temp.getPointer().getData())
					{
						check = temp.getData();
						temp.setData(temp.getPointer().getData()); 
						temp.getPointer().setData(check);
					}
					temp = temp.getPointer();
				}
				current = current.getPointer();
			}
		}
	}
	
	/**display the whole list
	 * 
	 */
	void printLinkList() {
		if(size == 0){
			System.out.println("nothing to print, list is empty");
		}
		else{
			Node temp = start;
			while (temp != null) {
				System.out.print(temp.getData()+",");
				temp = temp.getPointer();
			}
		}
	}
	
	/**takes input from user and check their type is integer or not
	 * @return a integer value
	 */
	private static int userInput() {
    	int number = 0;
    	Scanner sc = new Scanner(System.in);
    	try {
    		number = sc.nextInt();
    		return number;
    	}
    	catch(InputMismatchException e) {
    		System.out.println("enter only integer");
    		number = userInput();
    	}
    	return number;
    }
	
/*	public static void main(String args[]) {
		SingleLinkList linkList = new SingleLinkList();
		int ch, item, loc;
		while (true) {
			System.out.print("\n 1. Create Linked List"
					+ "\n 2. Add Element at particular Location"
					+ "\n 3. Removal of an item based on its value "
					+ "\n 4. Removal of an item based on its index"
					+ "\n 5. Retrieval of an item of particular index"
					+ "\n 6. Reversal of linked list"
					+ "\n 7. Sorting of linked list"
					+ "\n 8. Display linked list" + "\n 9. Exit");
			System.out.print("\n Enter Your choice : ");
			ch = userInput();
			switch (ch) // Apply switch case and call corresponding method
						// according to the user's choice
			{
			case 1:
				System.out.print("\n Enter node value : ");
				item = userInput();
				linkList.addItemInLinkList(item);
				break;
			case 2:
				System.out.print("\n Enter node value : ");
				item = userInput();
				System.out.print("\n Enter Location : ");
				loc = userInput();
				linkList.addItemAtPosition(loc, item);
				break;
			case 3:
				System.out.print("\n Enter node value : ");
				item = userInput();
				linkList.removeItemOntheBasedOfValue(item);
				break;
			case 4:
				System.out.print("\n Enter Location : ");
				loc = userInput();
				linkList.removeItemOntheBasedOfIndex(loc);
				break;
			case 5:
				System.out.print("\n Enter Location : ");
				loc = userInput();
				linkList.itemRetrieval(loc);
				break;
			case 6:
				linkList.reverseList();
				break;
			case 7:
				linkList.sortLinkedList();
				break;
			case 8:
				linkList.printLinkList();
				break;
			case 9:
				System.exit(0);
			default:
				 System.out.print("Enter correct Choice");
			}
		}
	}*/
}
