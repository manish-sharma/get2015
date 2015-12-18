package stack;

public class Node {
	
	private Object value;
	private Node next;
	
	Node(){
		this.value=0;
		this.next=null;
	}
	
	public Node(int value,Node next){
		this.value=value;
		this.next=next;
	}
	
	public Object getValue() {
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
}
