package com.ds5.recursivelinkedlist;

import java.util.LinkedList;
import java.util.Scanner;
/**This class implements the functionality of inserting an element in a sorted link list using 
 * recursion
 * @author Shishir
 *Date 31st August 2015
 */
public class RecursiveLinkedList {

	LinkedList<Integer> list=new LinkedList<Integer>();//object of type list
	/*function to perform sorting as soon as input is given by user*/
	public void sorting(int element,int index){
		if(list.size()==index){//if size and index is same then list is already sorted
			list.add(element);//add element 
		}
		else if(element>list.get(index)){//if element is greater than index 
			sorting(element,++index);//recursive call to function
		}
		else{
			list.add(index,element);//simply add the element
				
		  }
	   }
	/**
	 * overidden function to return the element of the list as string
	 */
	public String toString()
	{
		return list.toString();
	}
	/**main function from where program execution starts and shows
	 * menu to user and takes choices from user and perform the operation 
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner sc ;
		try {
			sc = new Scanner(System.in);
			RecursiveLinkedList object = new RecursiveLinkedList();
			do {
				// display menu
				System.out.println("1. Enter elements in the list");
				System.out.println("2. Display");
				System.out.println("3. Exit");
				int choice = sc.nextInt();
				switch (choice) {
				case 1://adding a new value in list
					System.out.println("Enter value");
					int value = sc.nextInt();
					object.sorting(value, 0);
					break;

				case 2://displaying sorted linked list
					System.out.println("Sorted Linked List");
					System.out.println(object.toString());
					break;

				case 3://exiting from linked list
					System.out.println("Bye..!!");
					System.exit(0);

				default:
					System.out.println("Enter a valid choice");
				}
			} while (true);
		} catch (Exception e) {
			System.out.println(e);
		}
   }
}
