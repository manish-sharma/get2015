
public class PostOrder {
	public PostOrder() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	public void printTree (Node tempRoot) {
		Node currentNode = tempRoot;
		if(currentNode.getLeft() != null) {
			printTree(tempRoot.getLeft());	
		}
		if(currentNode.getRight() != null) {
			printTree(tempRoot.getRight());	
		}
		System.out.println("" + currentNode.getData() + " ");
		
	}
	
	public static void main(String[] args) {
		PostOrder postOrder = new PostOrder();
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(3);
		binaryTree.insert(9);
		binaryTree.insert(7);
		binaryTree.insert(5);
		binaryTree.insert(3);
		postOrder.printTree(binaryTree.getRoot());
	}

}
