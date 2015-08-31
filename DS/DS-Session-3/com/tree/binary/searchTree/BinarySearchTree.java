/**
 *  @author: Pooja Khandelwal
 *   
 * created date:28/08/2015
 * Name: BinarySearchTree Class
 * Description: this class have addNode(),traverseTreeInPreOrder(),traverseTreeInPostOrder() functions 
 *  to perform Binary search tree creation and traversing(both preOrder and postOrder) operations  
 *
 */
package com.tree.binary.searchTree;

public class BinarySearchTree<T> {
	private BinarySearchTree<T> leftChild;
	private BinarySearchTree<T> rightChild;
	private T nodeValue;

	/*
	 * Name: BinarySearchTree Class Constructor 
	 * Description: it will set the
	 * leftNode and rightNode value for a new node
	 */
	public BinarySearchTree() {

		leftChild = null;
		rightChild = null;

	}

	/*
	 * Name: Parameterized Constructor of BinarySearchTree Class
	 * 
	 * @param: data(new node's data value) 
	 * Description: it will set the
	 * nodeValue,leftNode and rightNode value for a new node
	 */
	public BinarySearchTree(T data) {
		nodeValue = data;
		leftChild = null;
		rightChild = null;

	}

	/*
	 * Name: addNode() function
	 * 
	 * @param: rootNode1(root Node of a tree),data(new node's data value)
	 * Description: it will add a new node into tree,(if current node's value of
	 * tree is greater than new node's value then add new node into left
	 * ,otherwise add new node into right)
	 * 
	 * @return: roootNode(root node of tree after adding new node in the tree)
	 */

	public BinarySearchTree<T> addNode(BinarySearchTree<T> rootNode1, T data) {
		BinarySearchTree<T> newNode = new BinarySearchTree<T>(data);

		if (rootNode1 == null) {
			rootNode1 = newNode;

			return rootNode1;
		} else {

			if (((int) newNode.nodeValue) < ((int) rootNode1.nodeValue)) {
				if (rootNode1.leftChild == null) {
					rootNode1.leftChild = newNode;
					return rootNode1;
				} else {
					addNode(rootNode1.leftChild, data);
				}
			} else if (((int) newNode.nodeValue) > ((int) rootNode1.nodeValue)) {
				if (rootNode1.rightChild == null) {
					rootNode1.rightChild = newNode;
					return rootNode1;
				} else {
					addNode(rootNode1.rightChild, data);
				}
			} else {
				return rootNode1;
			}
			return rootNode1;
		}

	}

	/*
	 * Name: traverseTreeInPreOrder() function
	 * 
	 * @param: rootNode1(root Node of a tree) 
	 * Description: it will display the
	 * tree elements in preOrder manner(root->left->right)
	 * 
	 * @return: nothing
	 */
	public void traverseTreeInPreOrder(BinarySearchTree<T> rootNode1) {

		System.out.print(rootNode1.nodeValue + " ");
		if (rootNode1.leftChild != null) {

			traverseTreeInPreOrder(rootNode1.leftChild);
		}
		if (rootNode1.rightChild != null) {
			traverseTreeInPreOrder(rootNode1.rightChild);
		}

	}

	/*
	 * Name: traverseTreeInPostOrder() function
	 * 
	 * @param: rootNode1(root Node of a tree) 
	 * Description: it will display the
	 * tree elements in postOrder manner(left->right->root)
	 * 
	 * @return: nothing
	 */
	public void traverseTreeInPostOrder(BinarySearchTree<T> rootNode1) {

		if (rootNode1.leftChild != null) {

			traverseTreeInPostOrder(rootNode1.leftChild);
		}
		if (rootNode1.rightChild != null) {
			traverseTreeInPostOrder(rootNode1.rightChild);
		}
		System.out.print(rootNode1.nodeValue + " ");

	}

}
