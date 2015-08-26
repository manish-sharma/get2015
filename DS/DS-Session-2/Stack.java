/*
 * This is a class contains all operation operate stack
 * @author Banwari Kevat
 */
 class Node {
	int item;
	Node next;
	
	Node(){
	   next=null;	
	}
	
	Node(int item) {
		this.item = item;
		this.next = null;
	}
}
 // This class contains the Linked list operation
class Stack {
		private Node top;
		
		Stack() {
			this.top=null;
		}
		
	//This method create node and then return reference of that node
	public Node createNode(int item) {
		 Node node = new Node(item);
		 return node;
	}
	/*
	 * This method insert the node at top of the stack
	 * @param item is the which will be push into stack
	 */
	public void push( int item ) {
		if(top==null) {
			top = createNode(item);
		}
		else {
			Node node = createNode(item);
			node.next=top;
			top=node;
		}
	}
	
	public int pop() {
		if(top == null ) {
			return 0;
		}
		else {
			int item = top.item;
			top=top.next;
			return item;
		}
	}
	
	
	//This method will display the stack;
	public void showStack(){
	   Node traverse = top;
	   while(traverse!=null) {
		   System.out.print("\n\t"+traverse.item);
		   System.out.print("\n\t^");;
		   traverse = traverse.next;
	   }
	   
	}
	
	public static void main (String[] arg ) {
		
		Stack obj = new Stack();
		
		obj.push(56);
		obj.push(67);
		obj.push(45);
		obj.push(90);
		obj.push(10);
		obj.push(23);
		
		obj.showStack();
		System.out.println();
		obj.pop();
		obj.push(100);
		obj.showStack();
		
	}

}