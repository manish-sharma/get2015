/**
 * 
 * @author Pooja Khandelwal


 * created date:28/08/2015
 * Name: MainClass   
 *Description: to implement Binary search tree creation and traversing(both preOrder and postOrder) 
 */
package com.tree.binary.searchTree;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.menu.tree.binarySearchTree.Menu;

public class MainClass {

	public static void main(String args[]) {
		BinarySearchTree<Object> binaryTree = new BinarySearchTree<Object>(); // BinarySearchTree class object
		BinarySearchTree<Object> rootNode1 = null; // BinarySearchTree class object
		Scanner scan = new Scanner(System.in);
		int userChoice = 0;
		int flag1 = 1;
		int flag, data;
		while (flag1 != 0) {
			Menu menu = new Menu();
			try {
				userChoice = scan.nextInt();
			} catch (InputMismatchException input) {
				System.out.println("Enter integer value");
			}
			switch (userChoice) {
			case 1:
				flag = 1;
				while (flag == 1) {
					System.out.println("\nEnter data for a new node");
					data = scan.nextInt();
					rootNode1 = binaryTree.addNode(rootNode1, data);  // call addNode() function of BinarySearchTree Class
					System.out.println(data + " added into tree");
					System.out
							.println("\nPress 1 to continue ,Otherwise press 2");
					flag = scan.nextInt();
				}
				break;
			case 2:
				binaryTree.traverseTreeInPreOrder(rootNode1); // call traverseTreeInPreOrder() function of BinarySearchTree Class
				break;
			case 3:
				binaryTree.traverseTreeInPostOrder(rootNode1); // call traverseTreeInPostOrder() function of BinarySearchTree Class
				break;
			case 0:
				flag1 = 0;
				System.exit(0);
				break;
			}
		}
	}

}
