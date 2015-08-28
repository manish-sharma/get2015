/**node class for binary search tree
 * 
 * @author Gaurav
 * Date : 27/08/2015
 */

public class TreeNode {

	public int data;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(int data) {			//constructor to initialize node with some value
		this.data = data;
		left = null;
		right = null;
	}
	
	public TreeNode() {					//constructor to initialize null node
		left = null;
		right = null;
	}
	
	//method to get data from a node
	public int getData() {
		return data;
	}
	
}
