package question3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LinkedListOperation {
	private Node start ;
	Node createList() throws IOException {
		BufferedReader bufferedReaderObject = new BufferedReader(new InputStreamReader(System.in));
		Scanner scannerObject = new Scanner(System.in);
		Node newNode = new Node();
		Node current = new Node();
		Node start = null;
		int data;
		String choice = null;
		
		do {
			current = start;
			System.out.print("Enter value of node");
			data = scannerObject.nextInt();
			newNode = new Node(data);
			current= newNode;
			newNode.setNextNode(null);
			System.out.print("Do you want to add more nodes:(Y/N) ");
			choice = bufferedReaderObject.readLine();
			
		}while(choice.equalsIgnoreCase("y"));
		return start;
	}
	/*end of Create list function */
	
	/*start of isEmpty function */
	 public boolean isEmpty() {		//function will check if list is empty
	        return start == null;
	 }
	 /*End of isEmpty function*/
	 
	/*Starting of printList function*/ 
	void printList(Node start) {			//Function will print complete Linked List 
//		Node start = start;
		if(start == null) {
			System.out.println("List is Empty");
			return;
		}
		System.out.println("List is :");
		while(start.getNextNode() != null) {
			System.out.println(start.getData());
			start = start.getNextNode();
		}
		System.out.println();
	}
	/* End of printList function */
	
	/* Start of addElement function */
	public void addElement(int element ) {
		Node newNode = new Node(element) ;
		Node current = new Node();
		
		if(start == null) {
			start = newNode;
		} else {
			current = start;
			while(current.getNextNode() != null) {
				current = current.getNextNode();
			}
			current.setNextNode(newNode);
		}
	}

	/* End of addElement function */
	
	/* Start of insertInBetween function */
	public void insertInBetween(int position, int value) {
		Node newNode = new Node();
		Node current = new Node();
		int count = 1;
		current = start ;
		if( position == 1 ) {
			newNode.setNextNode(current);
			start = newNode ;
		} else {
			count = 2;
			while(current != null) {
				if(count == position) {
					newNode.setNextNode(newNode); 
					current.setNextNode(newNode);
				}
				count ++;
				current= current.getNextNode();
			}
		}
	}
	/* End of insertInBetween function */
	
	/* Starting of insertAtEnd function */
	void insertAtEnd(int value) {
		Node current = new Node();
		Node newNode = new Node(value);
		while(current.getNextNode() != null) {
			current = current.getNextNode() ;
		}
		current.setNextNode(newNode);
		newNode.setNextNode(null);
	}
	/* End of insertAtEnd function */
	
//	/* Start of deleteByValue function */
//	void deleteByValue(int element) {
//		Node current = start;
//		boolean flag = false;
//		if(current == null) {
//			System.out.println("List is empty");
//		}
//		
//		while(current.nextAddress.data != element) {
////			if(current.data == element) {
////				start = current.nextAddress;
////			}
////			else if( current.nextAddress != null) {
////				
////			}
////			flag = true ;
////			break;
//			current = current.nextAddress ;
//		}
//		current.nextAddress = current.nextAddress.nextAddress;
//	}
	
	/* Start of getElement function */
	int getElement(int index) {		//function will return value on particular index
		int count = 0;
		Node current = start ;
		while( count != index) {
			current = current.getNextNode();
			count++;
		}
		return current.getData();
	}
	/* End of getElement function */
	
	/* Starting of reverseLlist function */
	void reverseList() {
		Node current = start ;
		if(start == null)
			System.out.println("Empty List");
		while(current.getNextNode() != null) {
			
			
		}
	}
	/* End of reverseList function */
}
