package doublyLinkList;

public class Node {
	private int value;
	private Node next;
	private Node previous;
	
	

	public Node(){
		this.value=0;
		this.next=null;
		this.previous=null;
	}
	
	public Node(int value,Node next,Node prev){
		this.value=value;
		this.next=next;
		this.previous=prev;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getPrev() {
		return previous;
	}

	public void setPrev(Node prev) {
		this.previous = prev;
	}
}

