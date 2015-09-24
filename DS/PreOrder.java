
public class PreOrder {
	
	public PreOrder() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void printTree (Node tempRoot) {
		Node currentNode = tempRoot;
		System.out.println("" + currentNode.getData() + " ");
		if(currentNode.getLeft() != null) {
			printTree(tempRoot.getLeft());	
		}
		if(currentNode.getRight() != null) {
			printTree(tempRoot.getRight());	
		}
	}
	
	public static void main(String[] args) {
		PreOrder preOrder = new PreOrder();
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(3);
		binaryTree.insert(9);
		binaryTree.insert(7);
		binaryTree.insert(5);
		binaryTree.insert(3);
		preOrder.printTree(binaryTree.getRoot());
	}

}
