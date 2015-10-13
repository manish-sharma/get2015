package com.ds8.treesort;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * This class implements the main function in which user can enter the number of
 * students whose roll number he wants to enter and them can view the list in
 * sorted order Note tree will not insert duplicate values even if it is
 * accepting it so please don't pain your fingers by doing such testing and
 * don't waste your time
 * 
 * @author Shishir Date 3rd September 2015
 */
public class TreeSort {

	// main function
	public static void main(String agrs[]) {
		Set<Integer> rollNumberSet = new HashSet<Integer>();
		String regix = "[0-9]+";
		Scanner sc = new Scanner(System.in);
		// creating tree Sort Object
		Tree tree = new Tree();

		while (true) {
			System.out.println("\nPress 1 to enter Student Detalis ");

			System.out
					.println("Press 2 to Show Student Details Roll number wise");

			System.out.println("Press 3 to Exit");

			String choice = sc.next();

			switch (choice) {

			case "1":
				String rNumber;
				do {
					System.out.println("Enter Student Roll no.");
					rNumber = sc.next();
					if (!(rNumber.matches(regix))) {

						System.out
								.println("\nSorry ! Invalid Roll Number ,Enter Again\n");
					}

				} while (!(rNumber.matches(regix)));

				int rollNo = Integer.parseInt(rNumber);

				System.out.println("Enter Student name");
				String name = sc.next();
				if (!rollNumberSet.contains(rollNo)) {
					rollNumberSet.add(rollNo);
					// adding student node to tree
					tree.addNode(rollNo, name);

				} else {
					// if same roll number already present in set
					System.out
							.println("\nSorry ! Student Details Already Entered\n");
				}
				break;
			case "2":
				if (rollNumberSet.size() != 0) {
					System.out
							.println("**Students Details Sorted in Ascending Order of Roll number**\n");
					TreeNode root = tree.getRoot();
					// in-order traversal of tree
					tree.inOrderTraversalTree(root);
				} else {
					System.out.println("\nSorry ! No Student Entry Present\n");

				}
				break;
			case "3":
				System.exit(0);
			default:
				System.out.println("Please enter valid choice");

			}

		}

	}
}
