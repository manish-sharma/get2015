package treeSort;

import java.util.Scanner;

public class SortMainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TreeSort treeSort = new TreeSort();

		int dataOfTree;

		while (true) {
			try {
				// Performing binary tree operation
				System.out.println("\n***Menu***\n1. Insert student detail "
						+ "\n2. Sort Student List by roll No."
						+ "\n3. Exit");
				System.out.println("Enter Your choice: ");
				String choice = sc.next();

				switch (choice) {
				case "1":
					// Inserting in  binary tree
					System.out.print("Enter Roll No. : ");
					dataOfTree = sc.nextInt();
					treeSort.insert(dataOfTree);
					break;

				case "2":
					// In Order Traversal or tree sorting
					System.out.println("Sorted student list by roll no. : ");
					treeSort. inorderTreeSorting();
					break;

				case "3":
					// exit application
					sc.close();
					System.exit(0);

				default:
					System.out.println("Invalid input");
					break;
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
