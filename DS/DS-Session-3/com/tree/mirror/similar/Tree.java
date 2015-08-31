/**
 *
 * @author Pooja Khandelwal


 * created date:28/08/2015
 * Name: Tree Class
 * Description: this class have addNodeForFirstTree(),addNodeForSecondTree() functions to create trees 
 *
 */
package com.tree.mirror.similar;

public class Tree<T> {
	Tree<T> leftChild;
	Tree<T> rightChild;
	T nodeValue;

	/*
	 * Name: Tree Class Constructor 
	 * Description: it will set the leftNode and
	 * rightNode value for a new node
	 */
	public Tree() {

		leftChild = null;
		rightChild = null;

	}

	/*
	 * Name: Parameterized Constructor of Tree Class
	 * 
	 * @param: data(new node's data value) 
	 * Description: it will set the
	 * nodeValue,leftNode and rightNode value for a new node
	 */
	public Tree(T data) {
		nodeValue = data;
		leftChild = null;
		rightChild = null;

	}

	/*
	 * Name: addNodeForFirstTree() function
	 * 
	 * @param: rootNode1(root Node of a first tree),data(new node's data value)
	 * Description: it will add a new node into first tree,(if current node's
	 * value of tree is greater than new node's value then add new node into
	 * left ,otherwise add new node into right)
	 * 
	 * @return: roootNode(root node of first tree after adding new node in the
	 * first tree)
	 */
	public Tree<T> addNodeForFirstTree(Tree<T> rootNode1, T data) {
		Tree<T> newNode = new Tree<T>(data);

		if (rootNode1 == null) {
			rootNode1 = newNode;

			return rootNode1;
		} else {

			if (((int) newNode.nodeValue) < ((int) rootNode1.nodeValue)) {
				if (rootNode1.leftChild == null) {
					rootNode1.leftChild = newNode;
					return rootNode1;
				} else {
					addNodeForFirstTree(rootNode1.leftChild, data);
				}
			} else if (((int) newNode.nodeValue) > ((int) rootNode1.nodeValue)) {
				if (rootNode1.rightChild == null) {
					rootNode1.rightChild = newNode;
					return rootNode1;
				} else {
					addNodeForFirstTree(rootNode1.rightChild, data);
				}
			} else {
				return rootNode1;
			}
			return rootNode1;
		}
	}

	/*
	 * Name: addNodeForSecondTree() function
	 * 
	 * @param: rootNode2(root Node of a second tree),data(new node's data value)
	 * Description: it will add a new node into second tree,(if current node's
	 * value of tree is less than new node's value then add new node into left
	 * ,otherwise add new node into right)
	 * 
	 * @return: roootNode(root node of second tree after adding new node in the
	 * second tree)
	 */
	public Tree<T> addNodeForSecondTree(Tree<T> rootNode2, T data) {
		Tree<T> newNode = new Tree<T>(data);

		if (rootNode2 == null) {
			rootNode2 = newNode;

			return rootNode2;
		} else {

			if (((int) newNode.nodeValue) > ((int) rootNode2.nodeValue)) {
				if (rootNode2.leftChild == null) {
					rootNode2.leftChild = newNode;
					return rootNode2;
				} else {
					addNodeForSecondTree(rootNode2.leftChild, data);
				}
			} else if (((int) newNode.nodeValue) < ((int) rootNode2.nodeValue)) {
				if (rootNode2.rightChild == null) {
					rootNode2.rightChild = newNode;
					return rootNode2;
				} else {
					addNodeForSecondTree(rootNode2.rightChild, data);
				}
			} else {
				return rootNode2;
			}
			return rootNode2;
		}
	}

}