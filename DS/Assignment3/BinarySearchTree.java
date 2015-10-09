/**
 * @author Girdhari
 * This class will handle various operation on Binary Search
 */

package preordertraversal;

/* Start of BinarySearchTree class */
public class BinarySearchTree {

	/* Start of insertElement function */
	public Node insertElement(Node root, Node nodeObject ) {
		if(root == null ) {
			root = nodeObject ;
		}
		else if( root.getDataNode() > nodeObject.getDataNode() ) {
				root.setLeftNode(insertElement(root.getLeftNode(), nodeObject)); 
			} else if(root.getDataNode() < nodeObject.getDataNode()) {
				root.setRightNode(insertElement(root.getRightNode(), nodeObject)); 
			}
		System.out.println(root.getDataNode());
		return root;
	}
	/* End of insertElement function */
}
/* End of BinarySearchTree Class */
