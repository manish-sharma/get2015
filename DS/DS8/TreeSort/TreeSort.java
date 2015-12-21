package TreeSort;

import SortingSystem.Util;

public class TreeSort {

	public static void main(String args[]) {
		int choice = 0;

		BinaryTree binaryTreeSort = new BinaryTree();
		while (choice != 3) {
			Util.menueDisplayForSortedTree();
			choice = Util.userInput();
			switch (choice) {
			case 1:
				Util.print("Enter the students roll Number: ");
				int value = Util.userInputInArrayList();
				while (binaryTreeSort.SearchInBinaryTree(value,
						binaryTreeSort.root)) {
					Util.print("Student roll no alreay exits.Please enter another roll no.");
					value = Util.userInputInArrayList();
				}
				binaryTreeSort.root = binaryTreeSort.insertionInBinaryTree(
						value, binaryTreeSort.root);
				break;
			case 2:

				binaryTreeSort.listintialize();
				binaryTreeSort.inorderTraverse(binaryTreeSort.root);
				if (binaryTreeSort.sortedTree.size() == 0)
					Util.print("Tree is Empty.");
				else {
					Util.print("The students roll number in order are: ");
					System.out.println(binaryTreeSort.sortedTree);
				}
				break;
			case 3:
				choice = 3;
				break;

			default:
				Util.print("Please Enter the valid input.");
			}
		}
	}

}
