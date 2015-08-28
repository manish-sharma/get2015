/*
 * This is the class  which used as node of tree
 */
public class Node {
	 int key;
	 // left node of the tree
	 Node left ;
	 // right node of the tree
     Node right ;
	 
	 public Node()
	 {
		 left = null;
		 right = null;
	 }
	 /*
	  * parameterized constructor
	  * @param item is the item of node
	  */
	 public Node(int item)
	 {
		this.key = item;
		left = null;
		right = null;				
	 }
	 
	 public int getKey()
	 {
		 return this.key;
	 }
	 
	 public Node getLeft()
	 {
		 return this.left;
	 }
	 
	 public Node getRight()
	 {
		 return this.right;
	 }
}