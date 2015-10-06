/**
 * Class to generate node.
 * @author Sanjay
 *
 */
public class ListNode {
	
	/* Data Members */
	int tag;
	Object data;
	ListNode next;
	
	/** Method to get tag value of a node 
	 * @return tag
	 * */
	public int getTag() {
		return tag;
	}
	
	/** Method to set tag value of a node
	 * 
	 * @param tag
	 */
	public void setTag(int tag) {
		this.tag = tag;
	}
	
	/** Method to get data of a node
	 * 
	 * @return data
	 */
	public Object getData() {
		return data;
	}
	
	/** Method to set data of a node
	 * 
	 * @param data
	 */
	public void setData(Object data) {
		this.data = data;
	}
	
	/** Method to get next of a node
	 * 
	 * @return next
	 */
	public ListNode getNext() {
		return next;
	}
	
	/** Method to set next of a node
	 * 
	 * @param next
	 */
	public void setNext(ListNode next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "ListNode [tag=" + tag + ", data=" + data + ", next=" + next
				+ "]";
	}
	
}
