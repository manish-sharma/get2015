/*
 This class is used to create a node of generalized list
 and it override the toString method. 
 */
public class Node {
	Node next;
	Object data;
	boolean isNestedList;
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public boolean isNestedList() {
		return isNestedList;
	}
	public void setNestedList(boolean isNestedList) {
		this.isNestedList = isNestedList;
	}
	@Override
	public String toString() {
		return "Node [next=" + next + ", data=" + data + ", isNestedList="
				+ isNestedList + "]";
	}
}
