package com.ds8.treesort;

import java.util.ArrayList;
import java.util.Scanner;

/*This class implements tree function of inserting the value in tree as well as to print the tree values in 
 * in-order sequence 
 * Date 3rd September 2015
 */

public class Tree {
	ArrayList<Integer> rollNumber = new ArrayList<Integer>();

	TreeNode root;

	// method to add node in tree
	public void addNode(int rollNumber, String name) {

		TreeNode newNode = new TreeNode(rollNumber, name);

		// if root null,make it new node
		if (root == null) {

			root = newNode;

		} else {

			TreeNode currentNode = root;
			TreeNode parent;
			while (true) {
				parent = currentNode;
				if (rollNumber < currentNode.value) {
					currentNode = currentNode.lefChild;
					if (currentNode == null) {
						parent.lefChild = newNode;
						return;

					}
				} else {
					currentNode = currentNode.rightChild;
					if (currentNode == null) {
						parent.rightChild = newNode;
						return;

					}
				}
			}

		}

	}

	// method to show in-order traversal of tree
	public void inOrderTraversalTree(TreeNode currentNode) {

		if (currentNode != null) {

			inOrderTraversalTree(currentNode.lefChild);
			// adding sorted detail in ArrayList
			rollNumber.add(currentNode.value);

			System.out.println(currentNode);
			inOrderTraversalTree(currentNode.rightChild);

		}

	}

	// return roll number of the student node
	public int getrollNumber(TreeNode node) {
		return node.value;
	}

	// return root of the tree
	public TreeNode getRoot() {
		return root;
	}

	// returning array of the ascending order roll number
	public int[] ascendingOrderRollNumber() {
		int rollNumberArray[] = new int[rollNumber.size()];
		for (int i = 0; i < rollNumber.size(); i++) {
			rollNumberArray[i] = rollNumber.get(i);
		}

		return rollNumberArray;

	}
}
