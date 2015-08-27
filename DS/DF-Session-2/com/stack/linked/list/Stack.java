/*Stack Class
 * this class have 3 fn to push an element in stack ,
 * to pop an element in stack and to display stack elements
 */
package com.stack.linked.list;

public class Stack<T> {

	public T nodeValue;
	private Stack<T> next;
	public Stack<T> top;

	/*
	 * constructor of Stack class this will set the nodeValue,next and top
	 * pointer by null for a new node
	 */
	public Stack() {
		nodeValue = null;
		next = null;
		top = null;
	}

	/*
	 * Parameterized constructor of Stack class this will set the nodeValue,next
	 * and top pointer for a new node
	 */
	Stack(T data) {
		nodeValue = data;
		next = null;
	}

	/*
	 * this fn will add an element into stack
	 */
	public Stack<T> push(T data) {
		Stack<T> newNode = new Stack<T>(data);
		newNode.next = top;
		top = newNode;
		return top;
	}

	/*
	 * this fn will delete an element from the top of the stack
	 */
	public Stack<T> pop() {
		if (top != null) {
			System.out.println(top.nodeValue + " will be deleted");
			top = top.next;
		} else {
			System.out.println("Stack is already empty");
		}

		return top;

	}

	/*
	 * this fn will display the elements of stack
	 */
	public void display() {
		Stack<T> ptr = new Stack<T>();
		ptr = top;
		if (ptr == null) {
			System.out.println("Stack is empty");
		} else {
			while (ptr != null) {
				System.out.println(ptr.nodeValue);
				System.out.println("-v\n");
				ptr = ptr.next;
			}
		}
	}
}
