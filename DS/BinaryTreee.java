
public class BinaryTreee {
	Node root;
	public BinaryTreee() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	public void insert(Node root, int item,int node) {
		Node newNode = new Node();
		newNode.setData(item);
		if(node == 0) {
				this.root = newNode;
		} else {
			int parent = (node - 1) / 2;
			if( parent == 0){	
				if(isEmpty(root.getLeft())) { 
					root.setLeft(newNode);
				} else {
					root.setRight(newNode);
				}
			} else {
				if(parent%2 == 1){
					insert(root.getLeft(), item, parent);
				} else {
					insert(root.getRight(), item, parent);
				}
		   	}
		}
		return ;
	}
			 
	public boolean isEmpty(Node newNode) {
		if(newNode == null) {
		   return true;
		}
			 	return false;
	}
	
	public Node getRoot() {
		return root;
	}
}
