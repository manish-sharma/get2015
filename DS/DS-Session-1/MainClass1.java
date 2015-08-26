/*MainClass 
 * this class has 5 fn addItemsInList1(),getItemsFromList1(),addItemsInList2(),
 * getItemsFromList2(),concatnateTwoList()
 */
package com.add.array.list;

import java.util.Scanner;

import com.array.list.ArrayList;

public class MainClass {
	static AddTwoArrayList arrayList1 = new AddTwoArrayList();
	static AddTwoArrayList arrayList2 = new AddTwoArrayList();
	static AddTwoArrayList arrayList = new AddTwoArrayList();

	public static void main(String args[]) {
		MainClass mainClass = new MainClass();
		mainClass.addItemsInList1();
		mainClass.getItemsFromList1();
		mainClass.addItemsInList2();
		mainClass.getItemsFromList2();
		mainClass.concatnateTwoList();
		mainClass.getItemsFromConcatnatedList();
	}

	/*
	 * this fn will furhter call to add fn in AddTwoArrayList Class and then add
	 * the items in array list1
	 */
	private void addItemsInList1() {

		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many values you want to add in a list1");
		n = scanner.nextInt();
		System.out.println("Enter values");
		for (int i = 0; i < n; i++) {
			Object value = scanner.nextInt();// Integer type values
			arrayList1.add(value);
		}
	}

	/*
	 * this fn will further call get fn in AddTwoArrayList class and display the
	 * elements of list1
	 */
	private void getItemsFromList1() {

		int flag = 1;
		System.out.println("List1 elements are :");
		flag = (int) arrayList1.get(0);
		if (flag == -1) {
			System.out.println("list1 is empty");
		} else {
			for (int i = 0; i < arrayList1.size(); i++) {

				System.out.println(arrayList1.get(i));
			}
		}
	}

	/*
	 * this fn will furhter call to add fn in AddTwoArrayList Class and then add
	 * the items in array list2
	 */

	private void addItemsInList2() {

		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many values you want to add in a list2");
		n = scanner.nextInt();
		System.out.println("Enter values");
		for (int i = 0; i < n; i++) {
			Object value = scanner.nextInt();// Integer type values
			arrayList2.add(value);
		}
	}

	/*
	 * this fn will further call get fn in AddTwoArrayList class and display the
	 * elements of list2
	 */
	private void getItemsFromList2() {

		int flag = 1;
		System.out.println("List2 elements are :");
		flag = (int) arrayList2.get(0);
		if (flag == -1) {
			System.out.println("list2 is empty");
		} else {
			for (int i = 0; i < arrayList2.size(); i++) {

				System.out.println(arrayList2.get(i));
			}
		}
	}

	/*
	 * this fn will further call to concatnate fn in AddTwoArrayList class and
	 * then concatnate list1 and list2
	 */
	private void concatnateTwoList() {

		arrayList = arrayList.concatnate(arrayList1, arrayList2);
	}

	private void getItemsFromConcatnatedList() {

		int flag = 1;
		System.out.println("Concated List elements are :");
		flag = (int) arrayList.get(0);
		if (flag == -1) {
			System.out.println("Concated list is empty");
		} else {
			for (int i = 0; i < arrayList.size(); i++) {

				System.out.println(arrayList.get(i));
			}
		}
	}
}
