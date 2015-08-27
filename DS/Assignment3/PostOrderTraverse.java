package preordertraversal;

public class PostOrderTraverse {
	private static String postOrderString = "";
	public Node postOrderTraversal(Node root) {
		if( root != null ) {
			postOrderTraversal(root.getLeftNode());
			postOrderTraversal(root.getRightNode());
			System.out.print(root.getDataNode());
			postOrderString.concat(""+root.getDataNode());
		}
		return null;
	}
	public static String getPostOrderString() {
		return postOrderString;
	}

}
