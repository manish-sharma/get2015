/**
 * @author Girdhari
 * This class will perform Post Order Traversal on a tree
 */

package preordertraversal;

/* Start of PostOrderTraverse class*/
public class PostOrderTraverse {
	private static String postOrderString = "";
	/* Start of postOrderTraversal function */
	public Node postOrderTraversal(Node root) {
		if( root != null ) {
			postOrderTraversal(root.getLeftNode());
			postOrderTraversal(root.getRightNode());
			System.out.print(root.getDataNode());
			postOrderString.concat(""+root.getDataNode());
		}
		return null;
	}
	/* End of postOrderTraversal function */
	//getter of postOrderString variable
	public static String getPostOrderString() {
		return postOrderString;
	}

}
/* End of PostOrderTraverse class*/
