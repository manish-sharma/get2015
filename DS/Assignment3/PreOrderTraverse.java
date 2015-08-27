package preordertraversal;

public class PreOrderTraverse {
	private static String preOrderString = "";
	Node preOrderTraversal(Node root) {
		if( root != null ) {
			System.out.print(root.getDataNode());
			preOrderString.concat(""+root.getDataNode());
			preOrderTraversal(root.getLeftNode());
			preOrderTraversal(root.getRightNode());
		}
		return null;
	}
	public static String getPreOrderString() {
		return preOrderString;
	}

}
