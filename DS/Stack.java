class Node {
	Node next;
	int data;
}
/**
 * stack
 * @author Ravika
 *@since 8/26/2015
 */
public class Stack {
	Node top;
	public Stack() {
		// TODO Auto-generated constructor stub
		top=null;
	}
	/**
	 * purpose : to add item in Queue
	 * @param item = to insert
	 */
	public void push(int item) {
		Node newNode = new Node();
		newNode.data = item;
		if(top == null) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
	}
	

	/**
	 * purpose to print the item of Queue
	 */
	public void printStack() {
		Node top1 = top;
		while(top1 != null) {
			System.out.println(top1.data);
			top1 = top1.next;
		}
	}
	/**
	 * purpose : to remove the an item from top
	 */
	public void pop() {
		if(top == null ) {
			System.out.println("stack UnderFlow");
		} else {
			top = top.next;
		}
		
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		for(int count =0 ; count <  5; count++) {
			stack.push(count);
		}
		stack.push(6);
		stack.pop();
		stack.printStack();
	}
}
