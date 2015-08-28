import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
/**
 * Main Binary search class is used to make binary search tree
 * various operations are to be performed like insertion ,pre order traversal, post order traversal
 * Mirror images of two binary tree
 * @author sanjay
 * @since 27-08-2015
 * 
 */
public class BinarySearchTree {
	
	public TreeNode root;
	public static List<Integer> list1 = new ArrayList<Integer>();			//list to store traversal of tree
	public static List<Integer> list2 = new ArrayList<Integer>();
	
	static String str1 = "";
	static String str2 = "";
	
	//initialize the root node
	public BinarySearchTree() {
		root = null;
	}
	
	/**
	 * method to insert nodes in the tree
	 * @param data
	 */
	public void insert(int data) {
		TreeNode newNode = new TreeNode();
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
	
	/**
	 * recursive method to find preorder traversal
	 * @param n
	 */
	public void preOrder(TreeNode n) {
		if (n != null) {
			list1.add(n.getData());
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	
	/**
	 * recursive method to find postorder traversal
	 * 
	 * @param n
	 */
	public void postOrder(TreeNode n) {
		if (n != null) {
			postOrder(n.left);
			postOrder(n.right);
//			System.out.print(n.getData() + " ");
			list2.add(n.getData());
		}
	}
	
	/**
	 * method to insert values in mirror tree
	 * @param data
	 */
	public void insertInMirror(int data) {
		TreeNode newNode = new TreeNode();
		newNode.data = data;
		if (root == null)
			root = newNode;
		else {
			TreeNode current = root;
			TreeNode parent;
			while (true) {
				parent = current;
				if (data >= current.data) {				//if large node value insert in left sub tree
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						break;
					}
				}
				else {
					current = current.right;			//if small node value insert in right sub tree
					if (current == null) {
						parent.right = newNode;
						break;
					}
				}
			}
		}
	}
	
	/**
	 * method to find if two trees are mirror image or not
	 * @param bst1
	 * @param bst2
	 * @return
	 */
	public static boolean checkMirrorImage(BinarySearchTree bst1,BinarySearchTree bst2) {
		bst1.preOrder(bst1.root);
		bst2.postOrder(bst2.root);
		for (Integer i : list1)
			str1 += i;
		for (int i = list2.size() - 1; i >= 0; i--)
			str2 += list2.get(i);
		if (str1.equals(str2))
			return true;
		else
			return false;
	}
}