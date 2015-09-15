/*
 * This is a class contains all operation operate stack
 * @author Banwari Kevat
 */
 class Node {
	char item;
	Node next;
	
	Node(){
	   next=null;	
	}
	
	Node(char item) {
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
	public Node createNode(char item) {
		 Node node = new Node(item);
		 return node;
	}
	/*
	 * This method insert the node at top of the stack
	 * @param item is the which will be push into stack
	 */
	public void push( char item ) {
		if(top==null) {
			top = createNode(item);
		}
		else {
			Node node = createNode(item);
			node.next=top;
			top=node;
		}
	}
	
	//This method return the top element
	public char peep() {
		return top.item;
	}
	
	//This method pop the element
	public char pop() {
		if(top == null ) {
			return 0;
		}
		else {
			char item = top.item;
			top=top.next;
			return item;
		}
	}
	
	
		/**
		  * Checks if the input is operator or not
		  * @param c input to be checked
		  * @return true if operator
		  */
		private boolean isOperator(char c){
		    if(c == '+' || c == '-' || c == '*' || c =='/' || c == '^')
		      return true;
		   return false;
		}
		
		/*
		  * Checks if operator2 has same or higher precedence than operator1
		  * @param c1 first operator
		  * @param operator2 second operator
		  * @return true if operator2 has same or higher precedence
		  */
		private boolean checkPrecedence(char operator1, char operator2){
		  if((operator2 == '+' || operator2 == '-') && (operator1 == '+' || operator1 == '-'))
		   return true;
	    else if((operator2 == '*' || operator2 == '/') && (operator1 == '+' || operator1 == '-' || operator1 == '*' || operator1 == '/'))
		  return true;
		   else if((operator2 == '^') && (operator1 == '+' || operator1 == '-' || operator1 == '*' || operator1 == '/'))
		    return true;
		else
		    return false;
		}
	
		/*
		  * Converts infix expression to postfix
		  * @param infix infix expression to be converted
		  * @return postfix expression
		  */
		public String infixToPostfix(String infix){
			//equivalent postfix is empty initially
		   String postfix = "";
		 //stack to hold symbols
		   Stack s = new Stack();
		   
		   //symbol to denote end of stack
		   s.push('#');
		   
		   for(int i = 0; i < infix.length(); i++){
			 //symbol to be processed
			 char inputSymbol = infix.charAt(i);  
		     if(isOperator(inputSymbol)){
		    	/*
		    	 * if a operator
		    	 * repeatedly pops if stack top has same or higher precedence
		    	 */
		   
		    	 while(checkPrecedence(inputSymbol, s.peep()))
		     postfix += s.pop();
		      s.push(inputSymbol);
		     }
		       else if(inputSymbol == '(')
		    	 //push if left parenthesis
		         s.push(inputSymbol);
		    else if(inputSymbol == ')'){
		     //repeatedly pops if right parenthesis until left parenthesis is found
		    while(s.peep() != '(') 
		    postfix += s.pop();
		     s.pop();
		    }
		    else 
		   postfix += inputSymbol;
		 }
		
		//pops all elements of stack left
		while(s.peep() != '#'){
	     postfix += s.pop();
		}
	
	       return postfix;
	    }

	
	
	
	
	//This method will display the stack;
	public void show(){
	   Node traverse = top;
	   while(traverse!=null) {
		   System.out.print("\n\t"+traverse.item);
		   System.out.print("\n\t^");;
		   traverse = traverse.next;
	   }
	   
	}
	
	public static void main (String[] arg ) {
		
		Stack obj = new Stack();
		
		System.out.println(obj.infixToPostfix("a+b*c-y"));
		
	}

}