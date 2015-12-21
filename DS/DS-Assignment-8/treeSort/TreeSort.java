package treeSort;

public class TreeSort {
	Node root;
	int sortedArray[];
	int size=0,i=0;

	public void insert(int data) {
		root = insert(root, data);
		size++;
	}

	private Node insert(Node node, int data) {
		// Inserting node in binary tree
		if (node == null) {
			node = new Node(data);
		} else {
			if (data <= node.nodeValue) {
				node.left = insert(node.left, data);
			} else {
				node.right = insert(node.right, data);
			}
		}
		return node;
	}

	public void inorderTreeSorting() {
		// public function for in order traversal or treeSorting
		sortedArray=new int[size];
		inorderTreeSorting(root);
	}

	private void inorderTreeSorting(Node node) {
		
		// private function for in order traversal or treeSorting
		if (node == null) {
			return;
		}
		inorderTreeSorting(node.left);
		sortedArray[i++]=node.nodeValue;
		System.out.println(node.nodeValue);
		inorderTreeSorting(node.right);
	}

}
