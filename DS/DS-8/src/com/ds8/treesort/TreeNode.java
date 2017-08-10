package com.ds8.treesort;

/*This class defines the function for tree node structures and initializes them
 * @author Shishir Pareek
 * Date 27th August 2015
 */
public class TreeNode {

	TreeNode lefChild;// pointer to left child of node
	TreeNode rightChild;// pointer to right child of node
	int value;// variable to hold value
	String name;

	// default constructor
	public TreeNode() {
		lefChild = null;
		rightChild = null;
		value = 0;
		name = null;

	}

	// overloaded constructor
	public TreeNode(int data, String name2) {
		lefChild = null;
		rightChild = null;
		value = data;
		name = name2;
	}

	// getter for left child
	public TreeNode getLefChild() {
		return lefChild;
	}

	// setter for leftchild
	public void setLefChild(TreeNode left) {
		lefChild = left;
	}

	// getter for rightchild
	public TreeNode getRightChild() {
		return rightChild;
	}

	// setter for right child
	public void setRightChild(TreeNode right) {
		rightChild = right;
	}

	// getter for value
	public int getValue() {
		return value;
	}

	// setter value for child
	public void setValue(int data) {
		value = data;
	}

	// overriding the toString method of the object class
	public String toString() {

		return "Roll No. = " + value + "  Student Name = " + name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}