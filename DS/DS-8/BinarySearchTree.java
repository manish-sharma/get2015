import java.util.ArrayList;
import java.util.List;
/**
 * Main Binary search class is used to make binary search tree
 * operations performed insertion and inOrder traversal
 * @author sanjay
 */
public class BinarySearchTree {
	
	private TreeNode root;
	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	public static List<Integer> getListInAscendingOrder() {
		return listInAscendingOrder;
	}

	public static void setListInAscendingOrder(List<Integer> listInAscendingOrder) {
		BinarySearchTree.listInAscendingOrder = listInAscendingOrder;
	}


	private static List<Integer> listInAscendingOrder = new ArrayList<Integer>();
	
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
	 * Method to calculate inOrder Traversal of the tree to find out ascending order
	 * @param root
	 */
	public void inOrder(TreeNode root){
		if(root!=null){
			inOrder(root.left);
			listInAscendingOrder.add(root.getData());
			inOrder(root.right);
			
		}
	}
	

}