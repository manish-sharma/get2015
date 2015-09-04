/**
 * @author : Pooja Khandelwal
 * @created Date : 04/09/2015
 * @Name : SortingSystem_Main 
 * @Description : this class provides takes the input from user and then handle sorting of input elements.
 */
package com.system.sorting;

import java.util.Scanner;
import com.menu.system.sorting.Menu;

public class SotingSystem_Main {
	public static void main(String args[]) {
		int totalElements;
		String totalElements1;
		String regex = "[0-9]+";
		Scanner scanner = new Scanner(System.in);
		Menu menu = new Menu(); // Menu class object
		System.out.println("*----SORTING SYSTEM----*\n");
		
		do {
			System.out.println("Total no. of elements to be sorted");
			totalElements1 = scanner.nextLine();
		} while (!totalElements1.matches(regex));
		
		totalElements = Integer.parseInt(totalElements1);
		
		if (totalElements > 0) {
			int inputArray[] = new int[totalElements];
			//int elementFlag;
			int count = 0;
			System.out.println("Enter your elements");
			
			for (int i = 0; i < totalElements; i++) {
				// elementFlag=0;
				// while(elementFlag!=1){
				// try{
				inputArray[i] = scanner.nextInt();
				// elementFlag=1;
				// }
				// catch(Exception exception){
				// elementFlag=0;

				// System.out.println("Give valid input");
				// inputArray[i]=0;
				// continue;

				// }
				// }
			}
			
			int sortedArray[] = new int[totalElements];
			int userChoice;
			String userChoice1;
			int exitFlag = 1;
			SortingSystem sortElements = new SortingSystem(totalElements); // SortingSystem Class object
			
			while (exitFlag != 0) {
				do {
					menu.displayMenu();
					if (count == 0) {
						userChoice1 = scanner.nextLine();
					}
					userChoice1 = scanner.nextLine();
				} while (!userChoice1.matches(regex));
				userChoice = Integer.parseInt(userChoice1);
				switch (userChoice) {
				case 1:
					System.out.println("*--Comparision Sort will be used--*\n");
					sortedArray = sortElements.comparisionSorting(inputArray); // call comparisionSorting() function of SortingSystem class
					System.out.println("*--Sorted Elements--*\n");
					for (int i = 0; i < totalElements; i++) {
						System.out.print(sortedArray[i] + " ");
					}
					break;
				case 2:
					System.out.println("*--Linear Sort will be used--*\n");
					sortedArray = sortElements.linearSorting(inputArray); // call linearSorting() function of SortingSystem class
					System.out.println("*--Sorted Elements--*\n");
					for (int i = 0; i < totalElements; i++) {
						System.out.print(sortedArray[i] + " ");
					}
					break;
				case 3:
					exitFlag = 0;
					System.exit(0);
					break;
				default:
					System.out.println("Choose valid option");
					break;
				}
				count = 1;
			}
		} else {
			System.out.println("No elements are there");
		}
		scanner.close();
		System.out.println("*--Exit--*");
	}
}
