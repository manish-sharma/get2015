package com.ds8.sortingapplication;

import java.util.Scanner;

/**
 * This class implements main function which presents user for the option to
 * choose between comparison or liner sorting then the size of array and then
 * elements and then chooses to sort based of size of input
 * 
 * @author Shishir Date 4th September 2015
 */
public class SortingMain {
	// main function starts
	public static void main(String args[]) {
		try {
			SortingSystem object = new SortingSystem();
			do {// loop to display menu to user
				System.out.println("\nEnter your choice");
				System.out.println("1. Comparison Sorting");
				System.out.println("2. Linear Sorting");
				System.out.println("3. Exit");
				int choice = Utility.checkInteger();

				System.out.println("Enter a size of array");
				int size = Utility.checkInteger();
				int arr[] = new int[size];
				System.out.println("Enter elements in array");
				for (int i = 0; i < size; i++) {
					arr[i] = Utility.checkInteger();
				}

				switch (choice) {// switch case to choose the option
				case 1:
					if (object.selectComparisonSort(arr).equals("Bubble Sort")) { // if
																					// input
																					// is
																					// less
																					// than
																					// 10
																					// than
																					// bubble
																					// sort
																					// is
																					// called
						System.out.println("Sorting used is : Bubble Sort"
								+ "\nElements are:");
						object.display(BubbleSort.bubbleSort(arr));
					} else {// length of input array is greater than 10 then
							// quick sort is called
						System.out.println("Sorting used is : QuickSort"
								+ "\nElements are:");
						object.display(QuickSort.quickSort(arr, 0, arr.length));
					}
					break;

				case 2:
					int num = object.checkMaximumNumber(arr); // obtaining
																// maximum value
																// in the array
					if (object.selectLinearSort(num).equals("Radix Sort")) {// if
																			// maximum
																			// value
																			// is
																			// greater
																			// than
																			// 99
																			// than
						System.out.println("Sorting used is : Radix Sort"// radix
																			// sort
																			// is
																			// used
								+ "\nElements are:");

						object.display(RadixSort.radixSort(arr, num));
					} else {// maximum value in array is less than 99
						System.out.println("Sorting used is : Counting Sort"
								+ "\nElements are:");
						object.display(CountingSort.countSort(arr));
					}
					break;

				case 3:
					System.out.println("Bye !!");// user want to exit the
													// program
					System.exit(0);
				}

			} while (true);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
