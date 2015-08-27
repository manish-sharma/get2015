/**
 * @author Girdhari
 * This class will perform PreOrderTraversal of a tree
 * */

package traversal;
/* Start of PreOrderTraverse class */
public class PreOrderTraverse {
	private static String preOrderString = "";
	/* Start of preOrderTraversal function */
	Node preOrderTraversal(Node root) {
		if( root != null ) {
			System.out.print(root.getDataNode());
			preOrderString.concat(""+root.getDataNode());
			preOrderTraversal(root.getLeftNode());
			preOrderTraversal(root.getRightNode());
		}
		return null;
	}
	/* End of preOrderTraversal function */
	//getter of preOrderString variable	
	public static String getPreOrderString() {
		return preOrderString;
	}
}
/* End of PreOrderTraverse class */
