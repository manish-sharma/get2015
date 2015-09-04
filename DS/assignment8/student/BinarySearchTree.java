package student;

import java.util.ArrayList;

/**
 *  purpose : to made node of tree
 */


class Node {
	private int data;
	private Node left;
	private Node right;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
}

/**
 * class Binary tree to make binary search tree
 * @author Ravika
 *
 */
public class BinarySearchTree {
	Node root;
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	/**
	 * purpose : to initialize binary tree
	 */
	public BinarySearchTree() {
		root = null;
	} 
	
	/** 
	 * purpose : to get the root of tree
	*/
	public Node getRoot() {
		return root;
	}
	
	/**
	 * purpose : to insert an item in binary search tree
	 * @param item = to insert
	 */
	public void insert(int item ) {
		Node currentNode = root;
		Node newNode = new Node();
		newNode.setData(item);
		if(root == null ) {
			root = newNode;
			currentNode = root;
			return ;
		}
		while(true) {
			if(currentNode.getData() < item && currentNode.getRight() == null) {
				currentNode.setRight(newNode); 
				return;
				
			} else if(currentNode.getData() >= item && currentNode.getLeft() == null) {
				currentNode.setLeft(newNode);
				return;
			}
			
		
			if(currentNode.getData() < item ) {
				currentNode = currentNode.getRight();
				
			} else if(currentNode.getData() >= item ) {
				currentNode = currentNode.getLeft();
			}
		}
	}
	
	/**
	 * purpose : to display the elements of tree in inOrder
	 * @param tempRoot
	 */
	public void inOrder(Node tempRoot) {
		Node currentNode = tempRoot;
		
		if(currentNode.getLeft() != null) {
			inOrder(tempRoot.getLeft());	
		}
		list.add(currentNode.getData());
		System.out.print("" + currentNode.getData() + " ");
		if(currentNode.getRight() != null) {
			inOrder(tempRoot.getRight());	
		}
	}
	
	/**
	 * to get list
	 * @return list of data
	 */
	ArrayList<Integer> getList() {
		return list;
	}
}
