/**binary search tree class containing insert, inOrder and contains method
 * 
 * @author Gaurav Saini
 * Date : 03/09/2015
 */

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
	
	public TreeNode root;
	public static List<Integer> list1 = new ArrayList<Integer>();			//list to store traversal of tree
	
	//initialize the root node
	public BinarySearchTree() {
		root = null;
	}
	
	//method to insert nodes in the tree
	public void insert(int data) {
		TreeNode newNode = new TreeNode();			//initialize new node
		newNode.data = data;
		if (root == null)							//insert into new tree the root node
			root = newNode;
		else {
			TreeNode current = root;
			TreeNode parent;
			while (true) {
				parent = current;
				if (data < current.data) {			//if small node value insert in left sub tree
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						break;
					}
				}
				else {
					current = current.right;		//if large node value insert in right sub tree
					if (current == null) {
						parent.right = newNode;
						break;
					}
				}
			}
		}
	}
	
	//method to check whether roll number already exists in the tree or not
	public boolean contains(int rollNumber) {
		inOrder(this.root);					//find inOrder traversal of tree
		if (list1.contains(rollNumber))
			return true;					//if number present then return true
		else
			return false;					//if number not present then return false
	}
	
	//method to find inOrder traversal of tree
	public static void inOrder(TreeNode n) {
		if (n != null) {
			inOrder(n.left);					//recursively calling method for left subtree
			list1.add(n.getData());				//storing node value in list
			inOrder(n.right);					//recursively calling method for right subtree
		}
	}
}