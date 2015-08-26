package question3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LinkedListOperation {
	
	/*Start of createList function */
	public Node createList() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		int data;
		String choice = null;
		Node head = null;
		Node start = null;
		Node newNode = null;

		do {
			
			System.out.print("Enter value of node");
			data =readData(bufferedReader);
			newNode = new Node(data);
			if(start==null)
			{
				start=newNode;
				head=start;
			}
			else
			{
				head.setNextNode(newNode);
				head=head.getNextNode();
			}
			// System.out.println("start data is"+start.getData());
			System.out.print("Do you want to add more nodes:(Y/N) ");
			choice = bufferedReader.readLine();

		} while (choice.equalsIgnoreCase("y"));
		return start;
	}
	/*end of Create list function */
	
	/*Starting of printList function*/ 
	void printList(Node start) {			//Function will print complete Linked List 
//		Node start = start;
		if(start == null) {
			System.out.println("List is Empty");
			return;
		}
		System.out.println("List is :");
		while(start!= null) {
			System.out.println(start.getData());
			start = start.getNextNode();
		}
		System.out.println();
	}
	/* End of printList function */
	
	/* Start of addElement function */
	public void addElement(Node start, int element ) {
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
	public void insertInBetween(Node start, int position, int value) {
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
	void insertAtEnd(Node start, int value) {
		Node current = start;
		Node newNode = new Node(value);
		while(current.getNextNode() != null) {
			current = current.getNextNode() ;
		}
		current.setNextNode(newNode);
		newNode.setNextNode(null);
	}
	/* End of insertAtEnd function */
	
	/* Start of getElement function */
	int getElement(Node start, int index) {		//function will return value on particular index
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
	void reverseList(Node start) {
		Node current = start ;
		if(start == null)
			System.out.println("Empty List");
		while(current.getNextNode() != null) {
			
			
		}
	}
	/* End of reverseList function */
	public int readData(BufferedReader br)
	{
		int data=0;
		boolean isCorrect=false;
		do
		{
			try 
			{
				data =Integer.parseInt(br.readLine());
			}
			catch(NumberFormatException nf)
			{
				System.out.println("Please enter no like 1 2 ..");
				continue;
			}
			catch(IOException io)
			{
				System.out.println("Error Occured please enter again");
				continue;
			}
			isCorrect=true;
			
		}while(!isCorrect);
		return data;
	}
}
