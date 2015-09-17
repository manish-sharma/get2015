package firstProgram;


public class BinarySearchTree {
	private Node root;

	// insert the value in the tree
	public void insert(int arr[]) {
		for (int i = 0; i < arr.length; i++){
		Node newNode = new Node(arr[i]);
		if (root == null) {
			root = newNode;
		}
		else{
		insertInTree(root, newNode);
		}
		}
	}

	// inserts at subtree of a given node depending on the value
	public void insertInTree(Node latestRoot, Node node) {
		if (node.getData() < latestRoot.getData()) {
			if (latestRoot.getLeft() == null) {
				latestRoot.setLeft(node);
				return;
			}
			else
			insertInTree(latestRoot.getLeft(), node);
		} else if (node.getData() > latestRoot.getData()) {
			if (latestRoot.getRight() == null) {
				latestRoot.setRight(node);
				return;
			}
			else
			insertInTree(latestRoot.getRight(), node);
		}
	}
	
	//method to print roll number in ascending order
	public String printInAscending()
	{
		return inorderTraversal(root);
	}

	
	public String inorderTraversal(Node currentRoot) {
		if (currentRoot == null) // terminating condition for recursion
			return "";

		return inorderTraversal(currentRoot.getLeft()) + " "+ currentRoot.getData() + " "+ inorderTraversal(currentRoot.getRight());

	}

	
}
