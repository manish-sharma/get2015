/*MainClass 
 * this class has 5 fn addItemsInList1(),getItemsFromList1(),addItemsInList2(),
 * getItemsFromList2(),concatnateTwoList()
 */
package com.array.list;

import java.util.Scanner;

public class MainClass {
	static ArrayList arrayList = new ArrayList();

	public static void main(String args[]) {
		MainClass mainClass = new MainClass();
		mainClass.addItemsInList();
		mainClass.getItemsFromList();
		mainClass.addItemInListAtParticularLocation();
		mainClass.getItemsFromList();
		mainClass.retrieveFirstOccuranceOfItemAfterGivenLocation();
		mainClass.retrieveFirstIndexOfParticularItem();
		mainClass.removeItemFromParticularPosition();
		mainClass.getItemsFromList();

		mainClass.removeParticularItem();
		mainClass.getItemsFromList();
		mainClass.reverseArrayList();
		mainClass.getItemsFromList();
		mainClass.sortArrayList();
		mainClass.getItemsFromList();
		mainClass.removeAll();
		mainClass.getItemsFromList();

	}

	private void sortArrayList() {
		arrayList.sort();
		System.out.println("ArrayList is sorted");
	}

	private void reverseArrayList() {

		arrayList.reverse();
		System.out.println("ArrayList is reversed");
	}

	private void retrieveFirstIndexOfParticularItem() {

		Object value;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value which you want to retrieve");
		value = scanner.nextInt();
		int returnValue;
		returnValue = arrayList.retrieveFirstIndexOfParticularItem(value);
		if (returnValue == -1) {
			System.out.println(value + " not found in list");
		} else {
			System.out.println(value + " found at index " + returnValue);
		}
	}

	private void retrieveFirstOccuranceOfItemAfterGivenLocation() {

		Object value;
		int index;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of item which you want to retrieve");
		value = scanner.nextInt();
		System.out
				.println("Enter index of list after which you want to retrieve the first occurance of an item");
		index = scanner.nextInt();
		int returnValue;
		returnValue = arrayList.retrieveFirstOccuranceOfItemAfterGivenLocation(
				index, value);
		if (returnValue == -1) {
			System.out.println(value + " not found after index " + index);
		} else {
			System.out.println(value + " found at index " + returnValue);
		}
	}

	private void removeAll() {

		arrayList.reremoveAll();

	}

	private void removeParticularItem() {
		Scanner scanner = new Scanner(System.in);
		Object value;
		System.out.println("Enter value which you want to delete from list");
		value = scanner.nextInt();
		arrayList.removeValue(value);

	}

	private void removeItemFromParticularPosition() {

		Scanner scanner = new Scanner(System.in);
		int index;
		System.out.println("From which position you want to remove item");
		index = scanner.nextInt();
		arrayList.remove(index);

	}

	private void addItemsInList() {

		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many values you want to add in a list");
		n = scanner.nextInt();
		System.out.println("Enter values");
		for (int i = 0; i < n; i++) {
			Object value = scanner.nextInt();// Integer type values
			arrayList.add(value);
		}

	}

	private void getItemsFromList() {

		int flag = 1;
		System.out.println("List elements are :");
		flag = (int) arrayList.get(0);
		if (flag == -1) {
			System.out.println("list is empty");
		} else {
			for (int i = 0; i < arrayList.size(); i++) {
				// System.out.println("print list");
				System.out.println(arrayList.get(i));
			}
		}
	}

	private void addItemInListAtParticularLocation() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value which you want to add in a ArrayList");
		Object value = scanner.nextInt();
		int index;
		System.out.println("Enter ArrayList Index where you want to add Items");
		index = scanner.nextInt();
		arrayList.add(index, value);
		System.out.println(value + " is added in the list at " + index);
	}

}
