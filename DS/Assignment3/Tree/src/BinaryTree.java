import java.util.*;

public class BinaryTree {
	
	/* root is a reference variable of type node */
	private Node root;
	
	/** This list contains the preOrder traversal of tree */
	public static List<Integer> preorderList = new ArrayList<Integer>();
	
	/** This list contains the postOrder traversal of tree */
	public static List<Integer> postorderList = new ArrayList<Integer>();
	
	static String firstTreeTraversal = "";
	static String secondTreeTraversal = "";
	
	/* No Argument constructor to create object of class BinarySearchTree */
	public BinaryTree() {
		root = null;
	}
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	/** Method to insert data in the tree
	 * 
	 * @param data : Data to be inserted in the tree
	 */
	public boolean insert(int data) {
		
		try
		{
			/* newNode will store the data to be added */
			Node newNode = new Node();
			newNode.setData(data);
			
			/* If root contains null, then 
			 * newNode will be assigned to root
			 */
			if (root == null)
				root = newNode;
			
			/* If root is not null, then this code will be executed */
			else {
				
				/* currentNode will hold root node */  
				Node currentNode = root;
				Node parentNode;
				while (true) {
					parentNode = currentNode;
					
					/* condition to compare the data to be inserted and data of currentNode */
					if (data < (Integer)currentNode.getData()) {
						
						/* if data is less than data of current node than
						 * left subtree is chosen
						 */
						currentNode = currentNode.getLeft();
						if (currentNode == null) {
							parentNode.setLeft(newNode);
							break;
						}
					}
					else {
						/* if data is greater than data of current node than
						 * right subtree is chosen
						 */
						currentNode = currentNode.getRight();
						if (currentNode == null) {
							parentNode.setRight(newNode);
							break;
						}
					}
				}
			}
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	/** Method to traverse the tree in preOrder
	 * 
	 * @param node : root node of the tree
	 */
	public boolean preOrder(Node node) {
		
		if (node != null) {
			/* preorderList contains preOrder traversal of tree */
			preorderList.add((Integer)node.getData());
			preOrder(node.getLeft());
			preOrder(node.getRight());
			return true;
		}
		else
			return false;
	}
	
	/** Method to traverse the tree in postOrder
	 * 
	 * @param node : root node of tree
	 */
	public boolean postOrder(Node node) {
		if (node != null) {
			/* postorderList contains postOrder traversal of tree */
			postOrder(node.getLeft()); 
			postOrder(node.getRight());
			postorderList.add((Integer)node.getData());
			return true;
		}
		else
			return false;
	}
	
	/** Method to insert nodes in the mirror tree 
	 * 
	 * @param data :  data to be added
	 */
	public boolean insertInMirrorTree(int data) {
		
		try
		{
			/* newNode will store the data to be added */
			Node newNode = new Node();
			newNode.setData(data);
			
			/* If root contains null, then 
			 * newNode will be assigned to root
			 */
			if (root == null)
				root = newNode;
			
			/* If root is not null, then this code will be executed */
			else {
				
				/* currentNode will hold root node */ 
				Node currentNode = root;
				Node parentNode;
				while (true) {
					
					parentNode = currentNode;
					/* condition to compare the data to be inserted and data of currentNode */
					if (data >= (Integer)currentNode.getData()) {
						
						/* if data is less than data of current node than
						 * left subtree is chosen
						 */
						currentNode = currentNode.getLeft();
						/* if current is null then assign newNode to parent */
						if (currentNode == null) {
							parentNode.setLeft(newNode);
							break;
						}
					}
					else {
						
						/* if data is greater than data of current node than
						 * right subtree is chosen
						 */
						currentNode = currentNode.getRight();
						if (currentNode == null) {
							parentNode.setRight(newNode);
							break;
						}
					}
				}
			}
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	/** Method to compare two trees whether they are mirror image or not 
	 * Trees will mirror image to each other if preOrder traversal of one tree is equal to
	 * reverse of postOrder traversal of other tree or
	 * postOrder traversal of one tree is equal to reverse of preOrder traversal of other tree
	 * or inOrder traversal of one tree is equal to reverse of inOrder of other tree
	 * 
	 * @param binaryTreeObj1 : Object of first tree
	 * @param binaryTreeObj2 : Object of second tree
	 * @return true if trees are mirror image, false otherwise
	 */
	public static boolean checkMirrorImage(BinaryTree binaryTreeObj1,
			BinaryTree binaryTreeObj2) {
		
		/* Computing preOrder traversal of first tree contained in binaryTreeObj1 */
		binaryTreeObj1.preOrder(binaryTreeObj1.root);
		
		/* Computing preOrder traversal of second tree contained in binaryTreeObj2 */
		binaryTreeObj2.postOrder(binaryTreeObj2.root);
		
		for (Integer i : preorderList) {
			firstTreeTraversal += i;
		}
		for (int i = postorderList.size() - 1; i >= 0; i--) {
			secondTreeTraversal += postorderList.get(i);
		}

		/* Comparing traversal of both trees for mirror images */
		if (firstTreeTraversal.equals(secondTreeTraversal))
			return true;
		else
			return false;
	}
}