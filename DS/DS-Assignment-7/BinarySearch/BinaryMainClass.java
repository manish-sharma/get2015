package BinarySearch;

import java.util.Scanner;

public class BinaryMainClass {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		BinarySearch binarySearch = null;
		int noOfElement = 0;
		String choice = "";

		while (true) {
			try {
				System.out.print("\n1. Insert element in array"
						+ "\n2. Search element in array"
						+ "\n3. Exit\nEnter Your Choice : ");
				choice = scanner.next();

				switch (choice) {
				case "1":
					//Case for adding elements in array
					System.out.println("Enter number of elements in array : ");
					noOfElement = scanner.nextInt();
					binarySearch = new BinarySearch(noOfElement);
					int item[] = new int[noOfElement];
					System.out
							.println("Enter  elements of array in sorted order : ");
					for (int i = 0; i < noOfElement; i++) {
						item[i] = scanner.nextInt();
					}
					binarySearch.addInArray(item);
					break;

				case "2":
					//case for searching element in array
					System.out.println("Enter an element : ");
					int elementSearching = scanner.nextInt();
					int index = binarySearch.leftOccuranceByBinarySearch(
							elementSearching, 0, noOfElement - 1);
					if (index >= 0) {
						System.out.println("Element found at location : "
								+ index);
					} else {
						System.out.println("Element not found in array");
					}
					break;

				case "3":
					System.exit(0);

				default:
					System.out.println("Enter a valid choice");
					break;
				}

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
