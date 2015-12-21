package GeneralizedList;

/**
 * This class is represent the node
 * Node consist three type of information tag , data, next
 * Tag represent the node contain list or data
 * Next is store address of next node   
 * */
public class Node {
	private Object data;
	private Node next;
	private int tag;

	Node() {
		tag = 0;
		data = null;
	}

	Node(int tag, Object data) {
		this.data = data;
		next = null;
		this.tag = tag;

	}

	/**
	 * This function is used to get the next pointer.
	 * 
	 * @return next.
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * This function is used to set the address in next node.
	 * 
	 *  */
	public void setNext(Node next) {
		this.next = next;
	}

	/**
	 *This function is used to get the value of node.
	  
	 * @return data.
	 */
	public Object getData() {
		return data;
	}

	/**
	 * This function is used to get the value of tag.
	  */
	public int getTag() {
		return tag;
	}

	/**
	 *  This function is used to set the value of tag.
	 * 
	 */
	public void setTag(int tag) {
		this.tag = tag;
	}

	/**
	 * This function is used to set the value of node.
	*/
	public void setData(Object data) {
		this.data = data;
	}

}