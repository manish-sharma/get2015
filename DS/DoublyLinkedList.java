import java.util.Scanner;
/**
 * class for Node
 * @author Ravika
 *@since 8/25/2015
 */
class DNode {
	int data;
	DNode next;
	DNode previous;
}
/**
 *class DoublyLinkedList that have all the operation
 * @author Ravika
 *@since 8/25/2015
 */
public class DoublyLinkedList {
	DNode first;
	int size;
	public DoublyLinkedList() {
		// TODO Auto-generated constructor stub
		first = null;
		size = 0;
	}
	 /**
	  * purpose: print the data of the list
	  */
	public void printList() {
		DNode current = first;
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
		DNode newNode1 = new DNode();		
		newNode1.data = scanner.nextInt();
		first = newNode1;
		DNode currentNode = first;
		currentNode.next = null;
		currentNode.previous = null;
		size++;
		for(int count = 1; count < number; count++){
			DNode newNode = new DNode();			
			newNode.data = scanner.nextInt();
			newNode.next = null;
			currentNode.next = newNode;
			newNode.previous = currentNode;
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
		DNode newNode = new DNode();
		newNode.data = item;
		newNode.next = null;
		newNode.previous = null;
		DNode currentNode = first;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
		newNode.previous = currentNode;
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
		DNode newNode = new DNode();
		newNode.data = item;
		newNode.next = null;
		newNode.previous = null;
		DNode currentNode = first;
		if(location == 1) {
			newNode.next.previous = newNode;
			newNode.next = first;
			first = newNode;
			size++;
			return true;
		} else {
			for(int count = 0 ;count < location-1 ;count++) {
				if(currentNode.next == null) {
					System.out.println("location is greater than size");
					return false;
				}
				currentNode = currentNode.next;
			}
		}
		currentNode.next.previous = newNode;
		newNode.previous = currentNode;
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
		DNode currentNode = first;
		DNode previousNode =first;
		if(first.data == item) {
			first.next.previous = null;
			first = first.next;
			size--;
		} else {
			while(currentNode.next != null ) {
				if(currentNode.data == item) {
					currentNode.next.previous = previousNode;
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
		DNode currentNode = first;
		boolean flag = false;
		int location = 0;
		DNode previousNode =first;
		if(index == 0) {
			first.next.previous = null;
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
			currentNode.next.previous = previousNode;
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
		DNode reverse = null;
		DNode nextNode = null;
		DNode previousNode = first;
		while(previousNode != null) {
			reverse = nextNode;
			nextNode = previousNode;
			previousNode = previousNode.next;
			nextNode.next = reverse;
			nextNode.previous = previousNode;
		}
		first = nextNode;
	}
	/**
	 * purpose: sort the list
	 */
	public void sort() {
		DNode previousNode = first;
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
		DNode currentNode = first;
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
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		System.out.println("create");
		doublyLinkedList.createList();
		doublyLinkedList.printList();
		
		System.out.println("sort");
		doublyLinkedList.sort();
		doublyLinkedList.printList();
		
		System.out.println("add");
		doublyLinkedList.add(3, 7);
		doublyLinkedList.printList();
		
		System.out.println("remove");
		doublyLinkedList.remove(6);
		doublyLinkedList.printList();
		
		System.out.println("remove at");
		doublyLinkedList.removeAt(0);
		doublyLinkedList.printList();
		
		System.out.println("reverse");
		doublyLinkedList.reverse();
		doublyLinkedList.printList();
		
	}
}
