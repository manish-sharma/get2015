/**
 * Class to implement Stack
 * @author Sanjay
 */

import java.util.Scanner;


public class Stack {
	LinkedList linkedListObject = new LinkedList();
	
	
	/**
	 * Method to check if the stack is empty
	 * @return
	 */
	public boolean stackIsEmpty(){
		return(linkedListObject.isEmpty());

	}
	
	/**
	 * Method to push data on top of stack
	 * @param data
	 */
	public void push(int data) {
		linkedListObject.insertTop(data);
	}
	
	/**
	 *Method to pop data from top of stack 
	 */
	public void pop() {
		linkedListObject.deleteTop();
	}
	
	/**
	 * Method to display stack
	 */
	public void displayStack() {
		System.out.println("  ");
		linkedListObject.displayList();
	}

	public static void main(String args[]){
		Stack stackObject = new Stack();
		while(true){

			System.out.println("Press 1 to add element to the stack");
			System.out.println("Press 2 to delete element from the stack");
			System.out.println("Press 3 to display stack");
			Scanner scan = new Scanner(System.in);
			int userInput = scan.nextInt();
			switch (userInput) {
			case 1:
				System.out.println("Enter the element");
				int data = scan.nextInt();
				stackObject.push(data);
				break;
			case 2:
				if(stackObject.stackIsEmpty()){
					System.out.println("Cannot delete element because the stack is empty");
				}
				else{
					stackObject.pop();
				}
			case 3:
				stackObject.displayStack();

			default:
				break;
			}
		}
	}
}

