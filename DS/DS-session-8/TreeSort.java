/**class for sorting roll numbers of students using tree sort technique
 * 
 * @author Gaurav Saini
 * Date : 03/09/2015
 */

import java.util.Scanner;

public class TreeSort {

	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of students");
		int count = sc.nextInt();												//number of students
		System.out.println("enter roll numbers for " + count + " students");
		int rollNumber;															//roll number of student
		
		BinarySearchTree treeObject = new BinarySearchTree();					//new binary search tree
		for (int i = 0; i < count; i++) {
			rollNumber = sc.nextInt();											//reading roll number from user
			if (!(treeObject.contains(rollNumber)))
				treeObject.insert(rollNumber);									//if roll number is unique then insert in tree
			else {
				System.out.println("Roll number already exists. Enter different value.");		//if roll number already exists print message
				i--;															//decrement index to enter different roll number
			}
		}
		
		BinarySearchTree.list1.clear();											//clear the list in case it contains some previous values
		BinarySearchTree.inOrder(treeObject.root);								//find inOrder traversal
		System.out.println("roll number sorted list : " + BinarySearchTree.list1);		//show sorted list of student roll numbers
		sc.close();
	}
}