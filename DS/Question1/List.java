package Com.AdvanceDS.Question1;

import java.lang.reflect.Constructor;
import java.util.*;
/**
 * @author Ankur
 * @purpose this class use to generate a general purpose list which can hold nested list values
 * {@link Constructor} list create list of user string
 */
public class List {
	ListNode first;
	private int max;
	private int sum;
	private int size;
	private int index;
	private String  input;
	private char currentChar = 0 ;
	@SuppressWarnings("unused")
	private ArrayList<Integer> elements = new ArrayList<Integer>();
	public List() {
		first = null;
	}
	public List(String input) {

		max = Integer.MIN_VALUE;
		sum = 0;
		index = 1;
		size = 0;
		this.input = input;
		first = createList();
		System.out.println(first);

	}
	/**
	 * this method use to check validity of given string input
	 * @param input user input
	 * @return it return boolean value either true or false 
	 */
	public static boolean isInputValid(String input) {
		char presentChar = 0;
		int countOpen = 0;
		int countClose = 0;
		int countNumber =0 ;
		int countComma = 0;
		int otherChar = 0;
		int count = 0;
		while( count < input.length()) {
			presentChar = input.charAt(count);
			switch(presentChar) {
			case '(':
				count++;
				if(count < input.length()) {
					presentChar = input.charAt(count);
				}
				countOpen++;
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
				count++;
				if(count < input.length()) {
					presentChar = input.charAt(count);
				}
				while( presentChar >= '0' && presentChar <= '9' ) {					
					count++;	
					presentChar = input.charAt(count);
				}
				countNumber++;
				break;
			case ')':
				count++;
				if(count < input.length()) {
					presentChar = input.charAt(count);
				}
				countClose++;
				break;
			case ',':
				count++;
				if(count < input.length()) {
					presentChar = input.charAt(count);
				}
				countComma++;
				break;
			default :
				count++;
				if(count < input.length()) {
					presentChar = input.charAt(count);
				}
				otherChar++;
				break;
			}
		}
		if(countClose != countOpen) {
			return false;
		} else if((countNumber-1) != countComma) {
			return false;
		} else if(otherChar != 0) {
			return false;
		}
		return true; 

	}
	/**
	 * this method create list 
	 * @return this return created list
	 */
	private ListNode createList( ) {
		//System.out.println("create list");
		ListNode list = null;
		ListNode prev = null;

		int flag = 1;
		if(index < input.length()) {
			currentChar = input.charAt(index);
		}

		do{
			switch (currentChar) {
			case '(':
				index++;
				//System.out.println(list);
				ListNode newNode = new ListNode();
				newNode.setFlag(1);
				newNode.setData(createList());
				newNode.setNext(null);


				if(list == null) {
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

				while( currentChar >= '0' && currentChar <= '9' ) {

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
				if(list == null) {
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
			case ')' :
				flag = 0;
				index++;
				if(index < input.length()) {
					currentChar = input.charAt(index);
				}
				//System.out.println(list);
				return list;
			default:
				flag = 0;
				break;
			}

		} while( flag != 0 || index < input.length());
		return list;

	}
	/**
	 * this method is used to traverse list and show all data field 
	 * @param first this is the first node of whole list
	 */
	public void traverse(ListNode first) {
		while(first != null ) {
			if(first.getFlag() == 0){
				System.out.println(first.getData() + ", ");
				sum += (Integer)first.getData();
				if(max<(Integer)first.getData()) {
					max =(Integer)first.getData();
				}
				first = first.getNext();
			} else {
				ListNode first1 = (ListNode)first.getData();
				traverse(first1);
				first = first.getNext();
			}
		}

	}
	/**
	 * this method display maximum value from the list
	 * @return this return max of list
	 */
	int max() {
		if(size ==0 ) {
			System.out.println("There is no element in List");
		}
		return max;		
	}
	/**
	 * this return sum of all elements of list
	 * @return return sum
	 */
	int sum() {
		if(size ==0 ) {
			System.out.println("There is no element in List");
		}
		return sum;
	}
	/**
	 * this chech either given element present in list or not
	 * if not then print false else print true
	 * @param searchingElement user input element to search
	 * @return true or false is element find or not
	 */
	public boolean find(int searchingElement) {
		if(size ==0 ) {
			System.out.println("There is no element in List");
			return false;
		} 

		return findTemp(first, searchingElement);
	}
	private boolean findTemp(ListNode first,int searchingElement) {
		boolean isFound = false;
		while(first != null ) {
			if(first.getFlag() == 0){

				if(searchingElement == (Integer)first.getData()) {
					isFound = true;
				}
				first = first.getNext();
			} else {
				ListNode first1 = (ListNode)first.getData();
				isFound = (findTemp(first1, searchingElement) || isFound);
				first = first.getNext();
			}
		}
		return isFound;
	}

	int size() {
		return size;
	}

}

