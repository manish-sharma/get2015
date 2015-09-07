package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class SortingMainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Display display = new Display();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		while (true) {
			// try {
			
			System.out.println("\n***Menu***\n1. Insert Elements"
					+ "\n2. comparison sorting" + "\n3. linear sorting"
					+ "\n4. Display" + "\n5. Exit ");
			System.out.println("Enter Your choice: ");
			String choice = sc.next();

			switch (choice) {
			case "1":
				// take input from user

				System.out.print("Enter element : ");
				arrayList.add(sc.nextInt());
				break;

			case "2":
				// sorting By comparison
				System.out.println("Sorted By comparison sorting");
				ComparisonSorting comparisonSorting = new ComparisonSorting();
				arrayList = comparisonSorting.sort(arrayList);
				break;

			case "3":
				// sorting By Linear
				System.out.println("Sorted By Linear sorting");
				LinearSorting linearSorting = new LinearSorting();
				arrayList = linearSorting.sort(arrayList);
				break;

			case "4":
				// Display
				display.display(arrayList);
				break;

			case "5":
				// exit application
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid input");
				break;
			}
			// } catch (Exception e) {
			// System.out.println(e);
			// }
		}
	}
}
