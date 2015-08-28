
public class BinarySearchTree<T> 
{
	private static String mirrorString = "";
	private static String preOrderString = "";
	
	public static String getPostOrderString() {
		return mirrorString;
	}

	public static void setPostOrderString(String postOrderString) {
		BinarySearchTree.mirrorString = postOrderString;
	}

	public static String getPreOrderString() {
		return preOrderString;
	}

	public static void setPreOrderString(String preOrderString) {
		BinarySearchTree.preOrderString = preOrderString;
	}

	//Insertion of data
	public Node<T> insertData(Node<T> root, T data ) 
	{
		if(root==null) 
		{
			Node<T> newNode = new Node<T>(data);
			return newNode;
		}
		else if((Integer)root.getData()>(Integer)data) 
			root.setLeftNode(insertData(root.getLeftNode(),data));
		else  
			root.setRightNode(insertData(root.getRightNode(), data)); 
		return root;
	}
	
	//Insertion of data in mirror
	public Node<T> insertDataMirror(Node<T> root, T data ) 
	{
		if(root==null) 
		{
			Node<T> newNode = new Node<T>(data);
			return newNode;
		}
		else if((Integer)root.getData()<(Integer)data) 
			root.setLeftNode(insertData(root.getLeftNode(),data));
		else  
			root.setRightNode(insertData(root.getRightNode(), data)); 
		return root;
	}
		
	//Pre order traversal of tree
	public Node<T> preOrderTraversal(Node<T> root)
	{
		if(root!=null) 
		{
			System.out.print(root.getData());
			preOrderString.concat(""+root.getData());
			preOrderTraversal(root.getLeftNode());
			preOrderTraversal(root.getRightNode());
		}
		return null;
	}
	
	//Post order traversal of data
	public Node<T> postOrderTraversal(Node<T> root) 
	{
		if( root != null ) 
		{
			postOrderTraversal(root.getLeftNode());
			postOrderTraversal(root.getRightNode());
			System.out.print(root.getData());
			
		}
		return null;
	}
	public Node<T> mirrorTraversal(Node<T> root)
	{
		if(root!=null) 
		{
			System.out.print(root.getData());
			mirrorString.concat(""+root.getData());
			preOrderTraversal(root.getLeftNode());
			preOrderTraversal(root.getRightNode());
		}
		return null;
	}
	//Check that the two tress are both mirror of each other
	//if postorder of tree 1 and preorder of tree 2 is equal then they are mirror of each other
	public  boolean isMirror(Node<T> root1 ,Node<T> root2) 
	{
		postOrderTraversal(root1);
		preOrderTraversal(root2);
		return mirrorString.equalsIgnoreCase(preOrderString);
	}

}
