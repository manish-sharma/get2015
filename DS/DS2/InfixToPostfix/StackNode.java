package InfixToPostfix;


public class StackNode {
	private char value;
	private StackNode next;
	static StackNode start = null;

	StackNode() {
		this.value = 0;
		this.next = null;
	}

	/**
	 * @param value
	 * @param next
	 */
	public StackNode(char value, StackNode next) {
		this.value = value;
		this.next = next;
	}

	/**
	 * @return value
	 */
	public char getValue() {
		return value;
	}

	/**
	 * @param value
	 */
	public void setValue(char value) {
		this.value = value;
	}

	/**
	 * @return next
	 */
	public StackNode getNext() {
		return next;
	}

	/**
	 * @param next
	 */
	public void setNext(StackNode next) {
		this.next = next;
	}
	void push(char value) {
		StackNode newNode = new StackNode(value,null);
		if (start == null) {
			start = newNode;
		} else {
			newNode.setNext(start);
			
		}
		start = newNode;
	}

	void pop() {
		if (start == null) {
			System.out.println("Stack is empty");
		} else {
			start = start.getNext();
		}
	}
	
	char peep(){
		return start.getValue();
	}
	
	void printStack(){
		StackNode current;
		current=start;
		while(current != null){
			System.out.println("->"+current.getValue());
			current=current.getNext();
		}
	}
}
