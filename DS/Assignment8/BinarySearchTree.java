/**
 * @author Girdhari
 * This class will handle various operation on Binary Search
 */
package question1;

import java.util.ArrayList;
import java.util.List;


/* Start of BinarySearchTree class */
public class BinarySearchTree {
	private static List<Integer> sortedArray = new ArrayList<Integer>();
	/* Start of insertElement function */
	public Node insertElement(Node root, Node nodeObject ) {
		if(root == null ) {
			root = nodeObject ;
		}
		else if( root.getDataNode() >= nodeObject.getDataNode() ) {
				root.setLeftNode(insertElement(root.getLeftNode(), nodeObject)); 
			} else if(root.getDataNode() < nodeObject.getDataNode()) {
				root.setRightNode(insertElement(root.getRightNode(), nodeObject)); 
			}
		return root;
	}
	/* End of insertElement function */
	List<Integer> inorderTraversal(Node current ) {
		if(current != null ) {
			inorderTraversal(current.getLeftNode());
			sortedArray.add(current.getDataNode());
			inorderTraversal(current.getRightNode());
		}
		return sortedArray;
	}
}
/* End of BinarySearchTree Class */
