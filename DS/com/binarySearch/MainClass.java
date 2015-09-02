/**
 * @author : Pooja khandelwal
 * @created Date : 02/09/2015
 * @Name : MainClass
 * @Description : this class will take input from user (array elements and element ]s to be searched) and then to use binary search algorithm it will sort the array elements and print the leftmost index of the searched element(if it present in the array)
 */
package com.binarySearch;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String regix = "[0-9]+";
		int totalArrayElements;
		String totalArrayElements1;
		do {
			System.out.println("Enter total no. of elements in array");
			totalArrayElements1 = scan.nextLine();
		} while (!totalArrayElements1.matches(regix));
		totalArrayElements = Integer.parseInt(totalArrayElements1);
		List<Integer> elementsList = new LinkedList<Integer>(); // LinkedList class object
		int array[] = new int[totalArrayElements];
		System.out.println("Enter elements of array\n");
		String newElement;
		int element;
		for (int i = 0; i < totalArrayElements; i++) {
			do {
				System.out.println("Enter element " + i);
				newElement = scan.nextLine();
			} while (!newElement.matches(regix));
			element = Integer.parseInt(newElement);
			elementsList.add(element);
		}
		Collections.sort(elementsList); // sort list elements
		for (int i = 0; i < totalArrayElements; i++) {
			array[i] = elementsList.get(i);
		}
		int searchedElement;
		String searchedElement1;
		System.out.println("\n*----Binary Search----*");
		int low = 0;
		int high = totalArrayElements - 1;
		int arraySize = totalArrayElements;
		BinarySearch binarySearch = new BinarySearch();
		do {
			System.out.println("Enter element to be searched");
			searchedElement1 = scan.nextLine();
		} while (!searchedElement1.matches(regix));
		searchedElement = Integer.parseInt(searchedElement1);
		int searchedElement_s_LeftMostIndex = binarySearch
				.findLeftMostOccuranceOfElement(array, arraySize, low, high,
						searchedElement); // call findLeftMostOccuranceOfElement() function of BinarySearch class
		if (searchedElement_s_LeftMostIndex == -1) {
			System.out.println("Element not found in the array");
		} else {
			System.out.println("Element's leftmost index in array : "
					+ searchedElement_s_LeftMostIndex);
		}

	}
}