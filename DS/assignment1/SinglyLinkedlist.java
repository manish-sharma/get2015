import java.util.Scanner;
/**
 * 
 * @author Ravika
 *@since 8/25/2015
 */
class Node {
	int data;
	Node next = null;
}
/**
 *class SinglyLinkedList that have all the operation
 * @author Ravika
 *@since 8/25/2015
 */
public class SinglyLinkedlist {
	Node first;
	int size;
	public SinglyLinkedlist() {
		// TODO Auto-generated constructor stub
		first = null;
		size = 0;
	}
	 /**
	  * purpose: print the data of the list
	  */
	public void printList() {
		Node current = first;
		while(current.next!= null) {
		System.out.println(current.data);
		current = current.next;
		}
		System.out.println(current.data);
	}
	/**
	 * purpose : create list ,scan number of list,scan element of list
	 */
	public void createList() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the no.of elements");
		int number =scanner.nextInt();
		System.out.println("enter elements");
		Node newNode1 = new Node();		
		newNode1.data = scanner.nextInt();
		first = newNode1;
		Node currentNode = first;
		size++;
		for(int count = 1; count < number; count++){
			Node newNode = new Node();			
			newNode.data = scanner.nextInt();
			newNode.next = null;
			currentNode.next = newNode;
			currentNode = currentNode.next;
			size++;
		}
		scanner.close();
	}
	/**
	 * purpose : add the item in list
	 * @param item = that you want to add
	 * @return true if item is added,otherwise false
	 */
	public boolean add(int item) {
		Node currentNode = first;
		Node newNode = new Node();
		newNode.data = item;
		newNode.next = null;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
		size++;
		return true;
	}
	/**
	 * purpose : add the item in list at given position
	 * @param location = position where you want to add item
	 * @param item = that will be added
	 * @return true if item is added,otherwise false
	 */
	
	public boolean add(int location, int item) {
		Node newNode = new Node();
		newNode.data = item;
		newNode.next = null;
		Node currentNode = first;
		if(location == 1) {
			newNode.next = first;
			first = newNode;
		} else {
			for(int count = 0 ;count < location ;count++) {
				if(currentNode.next == null) {
					System.out.println("location is greater than size");
					return false;
				}
				currentNode = currentNode.next;
			}
		}
		
		newNode.next = currentNode.next;
		currentNode.next = newNode;
		size++;
		return true;
	}

/**
 * purpose: remove particular item 
 * @param item = that will be removed
 * @return true if item is removed,otherwise false
 */
	public boolean remove(int item) {
		Node currentNode = first;
		Node previousNode =first;
		if(first.data == item) {
			first = first.next;
			size--;
		} else {
			while(currentNode.next != null ) {
				if(currentNode.data == item) {
					previousNode.next = currentNode.next;
					size--;
				}
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
		}
			if(currentNode.data == item) {
				previousNode.next = null;
				size--;
			}
		
		return true;
	}
	/**
	 * purpose: remove particular index 
	 * @param index = at it item will be removed
	 * @return true if item is removed,otherwise false
	 */
	public boolean removeAt(int index) {
		Node currentNode = first;
		boolean flag = false;
		int location = 0;
		Node previousNode =first;
		if(index == 0) {
			first = first.next;
			size--;
			return true;
		} else {
			while(currentNode.next != null && location <= index) {
					if(location == index) {
						flag = true;
						break; 
					}
				previousNode = currentNode;
				currentNode = currentNode.next;
				location++;
			}
		}
		if(! flag) {
			if(location == index) {
				previousNode.next = null;
				size--;
			}
		}
		if(flag) {
			previousNode.next = currentNode.next;
			size--;
		}
		return true;
	}
	/**
	 * purpose: to get size of list
	 * @return size
	 */
	
	public int size() {
		return size;
	}
	/**
	 * purpose: reverse the list
	 */
	public void reverse() {
		Node reverse = null;
		Node nextNode = null;
		Node previousNode = first;
		while(previousNode != null) {
			reverse = nextNode;
			nextNode = previousNode;
			previousNode = previousNode.next;
			nextNode.next = reverse;
		}
		first = nextNode;
	}
	/**
	 * purpose: sort the list
	 */
	public void sort() {
		Node previousNode = first;
		int[] array = new int[size()] ;
		int count = 0;
		while(previousNode.next != null) {
			array[count] = previousNode.data;
			previousNode = previousNode.next;
			count++;
		}
		array[count] = previousNode.data;
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(array, 0, count);
		Node currentNode = first;
		for(int count2 = 0; count2 <= count; count2++) {
			currentNode.data = array[count2];
			currentNode = currentNode.next;
		}
	}
	/**
	 * purpose : to perform all the operation
	 * @param args
	 */
	public static void main(String[] args) {
		SinglyLinkedlist singlyLinkedlist = new SinglyLinkedlist();
		singlyLinkedlist.createList();
		singlyLinkedlist.printList();
		System.out.println("add");
		singlyLinkedlist.add(3, 5);
		singlyLinkedlist.printList();		
		System.out.println("remove");
		singlyLinkedlist.remove(5);
		singlyLinkedlist.printList();
		System.out.println("remove  at");
		singlyLinkedlist.removeAt(3);
		singlyLinkedlist.printList();
		System.out.println("reverse");
		singlyLinkedlist.reverse();
		singlyLinkedlist.printList();
		System.out.println("sort");
		singlyLinkedlist.sort();
		singlyLinkedlist.printList();
		System.out.println("remove  at");
		singlyLinkedlist.removeAt(3);
		singlyLinkedlist.printList();
	}
}
