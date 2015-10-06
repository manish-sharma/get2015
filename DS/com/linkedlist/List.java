/**
 * @author Pooja Khandelwal
 * @created date 10/06/2015
 * @name List
 * @description it will create a generalized linked list and have function max() to find max,sum() to find sum of list elements,find() to search an element in a list
 */
package com.linkedlist;

import com.validate.ListValidation;

public class List {
	ListNode start;
	private int max;
	private int sum;
	private int size;
	private int index;
	private String input;
	private char currentChar = 0;

	/**
	 * @name List()
	 * @description This is a no argument constructor.It creates an empty
	 *              generlized list.
	 * @param
	 */
	public List() {
		start = null;
	}

	/**
	 * @name List()
	 * @description This is a parameterized constructor.It creates a generalized
	 *              list; if input is valid by further calling a createList().
	 * @param input
	 *            (list elements as a string)
	 */
	public List(String input) {
		max = Integer.MIN_VALUE;
		sum = 0;
		index = 1;
		size = 0;
		this.input = input;
		if (ListValidation.isInputValid(input)) {
			start = createList();
		} else {
			System.out.println("Input is not valid ");
		}
	}

	/**
	 * @name createList()
	 * @description this method creates a generalized list using linked list and
	 *              display the list each time after addition of a new node
	 * @param
	 * @return list(generalized list after addition of new node)
	 */
	private ListNode createList() {
		ListNode list = null;
		ListNode prev = null;
		int flag = 1;
		if (index < input.length()) {
			currentChar = input.charAt(index);
		}
		do {
			switch (currentChar) {
			case '(':
				index++;
				System.out.println(list);
				ListNode newNode = new ListNode();
				newNode.setFlag(1);
				newNode.setData(createList());
				newNode.setNext(null);
				if (list == null) {
					list = newNode;
					prev = newNode;
				} else {
					prev.setNext(newNode);
					prev = newNode;
				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				String number = Character.toString(currentChar);
				index++;
				currentChar = input.charAt(index);
				while (currentChar >= '0' && currentChar <= '9') {
					number += currentChar;
					index++;
					currentChar = input.charAt(index);
				}
				int data = Integer.parseInt(number);
				size++;
				ListNode newNode1 = new ListNode();
				newNode1.setFlag(0);
				newNode1.setData(data);
				newNode1.setNext(null);
				if (list == null) {
					list = newNode1;
					prev = newNode1;
				} else {
					prev.setNext(newNode1);
					prev = newNode1;
				}
				break;
			case ',':
				index++;
				currentChar = input.charAt(index);
				break;
			case ')':
				flag = 0;
				index++;
				if (index < input.length()) {
					currentChar = input.charAt(index);
				}
				System.out.println(list);
				return list;
			default:
				flag = 0;
				break;
			}

		} while (flag != 0 || index < input.length());
		return list;
	}

	/**
	 * @name traverse()
	 * @description it will check whether generalized list is empty or not and
	 *              then display the generalized list elements if list is no
	 *              empty by further calling the function traverseList()
	 * @param
	 * @return
	 */
	public void traverse() {
		if (ListValidation.isEmpty(size)) {
			System.out.println("The list is empty");
			return;
		}
		traverseList(start);
	}

	/**
	 * @name traverseList()
	 * @description it will display the generalized list elements
	 * @param start
	 *            (start node of a generalized list)
	 * @return
	 */
	public void traverseList(ListNode start) {
		while (start != null) {
			if (start.getFlag() == 0) {
				System.out.print(start.getData() + ", ");
				sum += (Integer) start.getData();
				if (max < (Integer) start.getData()) {
					max = (Integer) start.getData();
				}
				start = start.getNext();
			} else {
				ListNode start1 = (ListNode) start.getData();
				traverseList(start1);
				start = start.getNext();
			}
		}
	}

	/**
	 * @name findElement()
	 * @description it will search an element from a generalized list
	 * @param start
	 *            (start node of a generalized list),searchingElement(element to
	 *            be searched from a generalized list)
	 * @return return false if element is not present in the generalized list
	 *         ,otherwise return true
	 */
	private boolean findElement(ListNode first, int searchingElement) {
		boolean isFound = false;
		while (first != null) {
			if (first.getFlag() == 0) {

				if (searchingElement == (Integer) first.getData()) {
					isFound = true;
				}
				first = first.getNext();
			} else {
				ListNode first1 = (ListNode) first.getData();
				isFound = (findElement(first1, searchingElement) || isFound);
				first = first.getNext();
			}
		}
		return isFound;
	}

	/**
	 * @name max()
	 * @description it will find the max from all elements of generalized list
	 * @param
	 * @return max(max from all elements of generalized list)
	 */
	public int max() {
		if (size == 0) {
			System.out.println("There is no element in List");
		}
		return max;
	}

	/**
	 * @name sum()
	 * @description it will find the sum of all list elements
	 * @param
	 * @return sum(sum of all elements of generalized list)
	 */
	public int sum() {
		if (size == 0) {
			System.out.println("There is no element in List");
		}
		return sum;
	}

	/**
	 * @name find()
	 * @description it will search an element from a generalized list
	 * @param searchingElement
	 * @return return false if element is not present in the generalized list
	 *         ,otherwise return true
	 */
	public boolean find(int searchingElement) {
		if (size == 0) {
			System.out.println("There is no element in List");
			return false;
		}
		boolean isFound = false;
		isFound = findElement(start, searchingElement);

		return isFound;
	}

	/**
	 * @name size() description this method will return the size of the
	 *       generalized list
	 * @param
	 * @return size(size of generalized list)
	 */
	private int size() {
		return size;
	}
}
