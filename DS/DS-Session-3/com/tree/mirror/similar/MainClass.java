/**
 * 
 * @author: Pooja Khandelwal

 * created date:28/08/2015
 * Name: MainClass
 * Description: to find if two given trees are mirror similar or not? 
 *
 */
package com.tree.mirror.similar;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.menu.tree.mirror.similar.Menu;

public class MainClass {
	public static void main(String args[]) {
		Tree<Object> tree = new Tree<Object>(); // Tree class object
		Tree<Object> rootNodeOfFirstTree = null; // Tree class object
		Tree<Object> rootNodeOfSecondTree = null; // Tree class object
		VerifyMirrorSimilarTrees verifyMirrorSimilarTrees = new VerifyMirrorSimilarTrees(); // VerifyMirrorSimilarTrees class object
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
					System.out
							.println("\nEnter element for a new node of 1st tree");
					data = scan.nextInt();
					rootNodeOfFirstTree = tree.addNodeForFirstTree(rootNodeOfFirstTree, data); //call addNodeForFirstTree() function of Tree class
					System.out.println(data + " added into first tree");
					System.out
							.println("\nPress 1 to continue ,Otherwise press 2");
					flag = scan.nextInt();
				}
				break;
			case 2:
				flag = 1;
				while (flag == 1) {
					System.out
							.println("\nEnter element for a new node of 2nd tree");
					data = scan.nextInt();
					rootNodeOfSecondTree = tree.addNodeForSecondTree(rootNodeOfSecondTree, data); // call rootNodeOfSecondTree() function of Tree class
					System.out.println(data + " added into second tree");
					System.out
							.println("\nPress 1 to continue ,Otherwise press 2");
					flag = scan.nextInt();
				}
				break;
			case 3:
				verifyMirrorSimilarTrees.areTreeMirrorSimiliar(rootNodeOfFirstTree, rootNodeOfSecondTree); // call verifyMirrorSimilarTrees() function of VerifyMirrorSimilarTrees Class
				break;
			case 0:
				flag1 = 0;
				System.exit(0);
				break;
			}
		}
	}
}
