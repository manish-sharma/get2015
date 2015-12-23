/*
 * This class contains the binary tree operations
 * @author Bnawari kevat
 */
public class BinaryTree {
   //create root reference of tree
	 Node root;
	
	BinaryTree()
	{  //initially Binary tree not have even single node then root is null
		root = null; 
	}
	
	/*
	 * This method create a node and return its reference
	 * @param key is the key item of  node 
	 */
	private Node createNode (int key)
	{
		return new Node(key);
	}
	
	
	/*
	 * This method insert key 
	 * @param Node is the root node of inserting tree
	 * @param is the key which have to be inserted
	 */
     private Node insertKey(Node node, int key)
	 {   //if root is null then directly create node of given key and then  insert
		if(node == null)
		{ 
			node = createNode(key);	
		}
		
		//otherwise search the place where key will be inserted according key value
		else 
		{    // if key is smaller then insert it into left subtree otherwise right subtree
			if( key <= node.getKey() )
			{
			     node.left = insertKey( node.getLeft() , key );  //recursive call
			}
			else 
			{
				node.right = insertKey( node.getRight(), key);  //recursive call
			}			
		}
		return node;
	}
     
     //This method insert the key into tree
	public void insertKey(int key)
	{
		root = insertKey(root, key);
	}
	
	//Recursive method for preorder traversing
	private Node preorder(Node root)
	{   
	     if(root != null){
	    	 System.out.print(root.getKey()+" ");
	    	 preorder(root.getLeft());       //recursive call
	    	 preorder(root.getRight());      //recursive call
	     }
	    return root;
	}
	
	//method for preorder traversing
	public void preorder()
	{
		root = preorder(root);
	}
	
	
	//Recursive method for postorder traversing
	private Node postorder(Node root)
	{   
	     if(root != null){
	    	 postorder(root.getLeft());   //recursive call
	    	 postorder(root.getRight());  //recursive call
	    	 System.out.print(root.getKey()+" ");
	     }
	    return root;
	}
	
	//method for postorder traversing
	public void postorder()
	{
		root = postorder(root);
	}
	
	/*
	 * Recursive method for checking two trees are mirror similar or not
	 * @param node1 is the reference of tree1
	 * @param node2 is the reference of tree2
	 */
	private boolean isMirrorImage(Node node1 , Node node2 )
	{    //both node are null then they are mirror similar
		if(node1==null && node2==null)
		{	return true;    }
		//one of them are null then they are not mirror similar
		else if(node1==null || node2==null)		
		{	return false;   }
		
		//Node key of both trees are not equals then they are not mirror similar
		else if(node1.key != node2.key)		
		{	return false;   }
		
		//recursive call
		return isMirrorImage(node1.left,node2.right) && isMirrorImage(node1.right,node2.left);
	}
	
	
	/*
	 * This method check give tree2 is mirror similar to current tree
	 * @param binaryTree2 is the tree2
	 */
	public boolean isMirrorImage(BinaryTree binaryTree2)
	{
		return isMirrorImage( this.root , binaryTree2.root );
	}
	
	
	
	//Main Method
	public static void main(String [] arg)
	{
		BinaryTree binaryTree1 = new BinaryTree();
		BinaryTree binaryTree2 = new BinaryTree();
		
		binaryTree1.insertKey(10);
		System.out.println("Preorder of First tree: ");
		binaryTree1.preorder();
		
		binaryTree2.insertKey(10);
		System.out.println("\n\nPreorder of Second tree: ");
		binaryTree2.preorder();
		
		if(binaryTree1.isMirrorImage(binaryTree2)){
			System.out.println("\n\nBoth are miror similar");
		}
		else System.out.println("\n\nBoth are not miror similar");
	}
	
}
