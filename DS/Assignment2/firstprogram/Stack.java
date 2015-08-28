package firstprogram;

import java.util.Scanner;

/**
 * Generic class that represents all of the stack operations
 * 
 * @author Riddhi
 * 
 * @param <T>
 */
public class Stack<T> {

	LinkedList<Integer> linkedList;

	// Constructor
	public Stack() {
		linkedList = new LinkedList<Integer>();
	}

	// pushes element at the top
	public void push(int item) {
		linkedList.insertAtFirst(item);
	}

	// display all elements in the stack
	public void traverse() {
		linkedList.traverse();
	}

	// deletes top element in the stack
	public void pop() {
		linkedList.deleteFromFirst();
	}

	// checks if stack is empty
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}

	// returns top element in the stack
	public int peek() {

		return linkedList.topElement();
	}

	// main function
	public static void main(String args[]) {
		Stack<Integer> newStack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int y = 1;
		do {
			System.out.println("1.Push element");
			System.out.println("2.Pop element");
			System.out.println("3.Peek element");
			System.out.println("4.Traverse Stack");
			System.out.println("5. Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter element to be inserted");
				newStack.push(sc.nextInt());
				break;

			case 2:
				System.out.println("After removing element from top list is :");
				newStack.pop();
				break;

			case 3:
				System.out.println("Peek Element" + newStack.peek());
				break;

			case 4:
				System.out.println("Stack contains");
				newStack.traverse();
				break;

			case 5:
				System.out.println("Stack Status :" + newStack.isEmpty());
				break;

			case 6:
				System.exit(0);
			default:
				System.out.println("Enter a valid input");

			}
		} while (y == 1);

	}
}
