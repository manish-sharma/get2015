package TreeSort;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to perform all basic operation of binary search tree like
 * insertion and inorder traverse.
 * 
 * @author Nikhil
 */
public class BinaryTree {
	Node root;

	BinaryTree() {
		root = null;
	}

	List<Integer> sortedTree;

	/**
	 * InsertionInBinaryTree is a function which is used to insert an element in
	 * binary tree. if binary tree is not created this function created the
	 * tree.
	 */
	public void listintialize() {
		sortedTree = new ArrayList<Integer>();

	}

	public Node insertionInBinaryTree(int value, Node insert) {

		if (insert == null) {
			Node newNode = new Node(value, null, null);
			return newNode;
		} else {
			if (insert.getValue() >= value) {
				insert.setLeftChild(insertionInBinaryTree(value,
						insert.getLeftChild()));
			} else if (insert.getValue() < value) {
				insert.setRightChild(insertionInBinaryTree(value,
						insert.getRightChild()));
			}
		}
		return insert;
	}

	public Boolean SearchInBinaryTree(int value, Node insert) {
		boolean checkflag = false;
		if (insert == null)
			return checkflag;
		else {
			if (insert.getValue() == value)
				checkflag = true;
			else if (insert.getValue() > value) {
				checkflag = SearchInBinaryTree(value, insert.getLeftChild());
			} else if (insert.getValue() < value) {
				checkflag = SearchInBinaryTree(value, insert.getRightChild());
			}
		}
		return checkflag;
	}

	/**
	 * InorderTraverse is a function which is used to print all node in sorted
	 * order it's print Left,Root,Right order
	 */
	public void inorderTraverse(Node inorder) {
		if (inorder != null) {
			inorderTraverse(inorder.getLeftChild());
			sortedTree.add(inorder.getValue());
			inorderTraverse(inorder.getRightChild());
		}

	}

}
