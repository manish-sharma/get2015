package GenrealizedList;
/**This class forms the node structure for generalized list node and have fields tag,data and next node
 * and contains it default and parameterized constructor and getter setter for its various fields
 * @author Shishir
 *Date 4th October 2015
 */
public class Node {
	private Object data;
	private Node nextNode;
	private int tag;
    
	//default constructor
	Node() {
		tag = 0;
		data = null;
	}
    //Parameterized constructor
	Node(int tag, Object data) {
		this.data = data;
		nextNode = null;
		this.tag = tag;
	}
    //getter for data
	public Object getData() {
		return data;
	}
    //setter for data
	public void setData(Object data) {
		this.data = data;
	}
    //getter for Next node
	public Node getNextNode() {
		return nextNode;
	}
    //setter for next node
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
    //getter for tag 
	public int getTag() {
		return tag;
	}
    //setter for tag
	public void setTag(int tag) {
		this.tag = tag;
	}
}
