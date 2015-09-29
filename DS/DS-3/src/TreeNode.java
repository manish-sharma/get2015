/*This class defines the function for tree node structures and initializes them
 * @author Shishir Pareek
 * Date 27th August 2015
 */
public class TreeNode {
	
	TreeNode  lefChild;//pointer to left child of node
	TreeNode rightChild;//pointer to right child of node
	int value;//variable to hold value
	//default constructor
	public TreeNode()
	{
		lefChild=null;
		rightChild=null;
		value=0;
		
	}
    //overloaded constructor
	public TreeNode(int data)
	{
		lefChild=null;
		rightChild=null;
	     value=data;
	}
    //getter for left child
	public TreeNode getLefChild() {
		return lefChild;
	}
    //setter for leftchild
	public void setLefChild(TreeNode left) {
		lefChild = left;
	}
    //getter for rightchild
	public TreeNode getRightChild() {
		return rightChild;
	}
     //setter for right child
	public void setRightChild(TreeNode right) {
		rightChild = right;
	}
    //getter for value
	public int getValue() {
		return value;
	}
     //setter value for child
	public void setValue(int data) {
		value = data;
	}
}
