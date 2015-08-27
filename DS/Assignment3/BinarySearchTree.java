package preordertraversal;

public class BinarySearchTree {

	public Node insertElement(Node root, Node nodeObject ) {
		if(root == null ) {
			root = nodeObject ;
		}
		else if( root.getDataNode() > nodeObject.getDataNode() ) {
				root.setLeftNode(insertElement(root.getLeftNode(), nodeObject)); 
			} else if(root.getDataNode() < nodeObject.getDataNode()) {
				root.setRightNode(root.getRightNode()); 
			}
		System.out.println(root.getDataNode());
		return root;
	}
}
