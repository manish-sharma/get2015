
public class BinaryTree {
	Node root;
	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	public Node getRoot() {
		return root;
	}

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
	
}
