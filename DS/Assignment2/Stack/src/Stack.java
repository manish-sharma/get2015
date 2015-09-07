
@SuppressWarnings("hiding")
public class Stack<Object> {

	/* top will contain top index of the stack */
	int top = -1;
	
	/** Method to push an element in the stack
	 * 
	 * @param item : item to be inserted in the stack
	 * @param first : first node of the linked list
	 * @return first node of the linked list
	 */
	public Node<Object> push(Object item, Node<Object> first) {
			
		try
		{
			/* current contains first node */
			Node<Object> current = first;
			/* Code to execute when top = -1 */
			if (top == -1) {
				
				/* New node is created with the given value */
				Node<Object> newNode = new Node<Object>(item);
				first = newNode;
				first.next = null;
				top++;	// after addition of element top is incremented by one
				return first;
			} 
			
			/* Code to execute when top >= 0 */
			else if (top >= 0) {
				
				for (int i = 0; i < top; i++) {
					current = current.next;
				}
				/* New node is created with the given value */
				Node<Object> newNode = new Node<Object>(item);
				newNode.next = null;
				current.next = newNode;
				top++;	// after addition of element top is incremented by one
				return first;
			}	
			return first;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	/** Method to pop top element from the stack
	 * 
	 * @param first : first node of the linked list
	 * @return object that is popped from stack
	 */
	public Object pop(Node<Object> first)
	{
		/* if top = -1 then stack is empty */
		if(top == -1)
		{
			return null;
		}
		/* if top >= 0, then this code will be executed */
		int i;
		Node<Object> previous = first;
		Node<Object> currNode = first;
		
		/* traversing first node to top node using for loop */
		for(i = 0; i < top; i++)
		{
			previous = currNode;
			currNode = currNode.next;
		}
		previous.next = currNode.next;
		currNode.next = null;
		top --;		// decreasing top on every pop
		return currNode.value;
	}
	
	/** Method to peek top element from the stack
	 * This method does not remove the top element
	 * @param first : first node of the linked list
	 * @return object that is peeked from stack
	 */
	public Object peek(Node<Object> first)
	{
		/* if top = -1 then stack is empty */
		if(top == -1)
		{
			return null;
		}
		int i;
		Node<Object> currNode = first;
		for(i = 0; i < top; i++)
		{
			currNode = currNode.next;
		}
		return currNode.value;
	}
	
	/** Method to display the elements of stack */
	public void display(Node<Object> first) {
		
		/* Condition for empty stack */ 
		if(top == -1)
		{
			System.out.println("Empty Stack");
			return;
		}
		Node<Object> current = first;
		
		/* Traversing each node and printing the node value */
		while (current != null) {
			System.out.print(current.value + "\t");
			current = current.next;
		}
		System.out.println();
	}
	
	@SuppressWarnings("unchecked")
	
	/** Method to convert an expression from infix to postfix
	 * 
	 * @param infixExpression : infix expression
	 * @param first : first node of stack
	 * @return postfix equivalent of the infix expression in string representaion
	 */
	public String infixToPostfix(String infixExpression, Node<Object> first) {

		try
		{/*
			/* Stack object created*/
Stack<Object> stackObj = new Stack<Object>();
			
			/* Calculating length of infix expression */
			int infixLength = infixExpression.length();
			String postfixExpression = "";
			Object poppedItem;
			int countBraces = 0;
			
			/* Traversing each character in the input string using for loop */
			for(int i = 0; i < infixLength; i++) {
				Object temp = (Object) new Character(infixExpression.charAt(i));
				
				/* Checking whether the character is alphabate or digit */
				if(Validation.isAlphabateOrDigit(infixExpression.charAt(i)))
				{
					/* Adding the character to string postfix expression */
					postfixExpression = postfixExpression + infixExpression.charAt(i);
				}
				
				/* if the character is '(' then push it on the stack */
				else if(infixExpression.charAt(i) == '(')
				{
					first = stackObj.push(temp, first);
					countBraces++;
				}
				
				/* if the character is ')' then pop elements from stack and add
				 *  them to postfix String until '(' is encountered 
				 *  and then also pop the top element i.e.'(' 
				 */
				else if(infixExpression.charAt(i) == ')')
				{
					if(countBraces == 0)
					{
						System.out.println("Invalid Expression");
						return null;
					}
					
					/* retrieving top elemetns from stack */
					while(!((char)stackObj.peek(first) == '('))
					{
						poppedItem = stackObj.pop(first);
						postfixExpression = postfixExpression + poppedItem;
					}
					stackObj.pop(first);
					countBraces--;
				}
				
				/* if the character is an operator */
				else if(infixExpression.charAt(i) == '+' || infixExpression.charAt(i) == '-' || infixExpression.charAt(i) == '*' || infixExpression.charAt(i) == '/' || infixExpression.charAt(i) == '^')
				{
					
					/* if stack is empty then push the operator on the stack */
					if(stackObj.top == -1)
						first = stackObj.push(temp, first);
					
					else
					{
						/* is current character is '^', then this code will be executed */
						if(infixExpression.charAt(i) == '^')
						{
							/* popping characters from stack if top is '^' */
							if((char)stackObj.peek(first) == '^')
							{
								poppedItem = stackObj.pop(first);
								postfixExpression = postfixExpression + poppedItem;
							}
						}
						
						/* if current character is '+' or '-', then this code will be executed */
						else if(infixExpression.charAt(i) == '-' || infixExpression.charAt(i) == '+')
						{
							
							/* if top element is '^' then pop the top element and add that to postfix string */
							if((char)stackObj.peek(first) == '^')
							{
								poppedItem = stackObj.pop(first);
								postfixExpression = postfixExpression + poppedItem;
							}
							
							/*if top element is '*' or '/' then pop the top element and add that to postfix string */
							if((char)stackObj.peek(first) == '/' || (char)stackObj.peek(first) == '*') {
								poppedItem = stackObj.pop(first);
								postfixExpression = postfixExpression + poppedItem;
							}
							
							/*if top element is '+' or '-' then pop the top element and add that to postfix string */
							if((char)stackObj.peek(first) == '+' || (char)stackObj.peek(first) == '-') {
								poppedItem = stackObj.pop(first);
								postfixExpression = postfixExpression + poppedItem;
								
							}
						}	
						
						/* if current character is '*' or '/', then this code will be executed */
						else if(infixExpression.charAt(i) == '*' || infixExpression.charAt(i) == '/')
						{
							/* if top element is '^' then pop the top element and add that to postfix string */
							if((char)stackObj.peek(first) == '^')
							{
								poppedItem = stackObj.pop(first);
								postfixExpression = postfixExpression + poppedItem;
							}
							
							/*if top element is '*' or '/' then pop the top element and add that to postfix string */
							if((char)stackObj.peek(first) == '/' || (char)stackObj.peek(first) == '*') {
								poppedItem = stackObj.pop(first);
								postfixExpression = postfixExpression + poppedItem;
							}
						}
						
						/* adding operator to top if the operator has higher precedence than top operator */
						first = stackObj.push(temp, first);
					}
				}
			}
			
			/* After complete traversal of input expression,
			 * all the elements of stack are added to postfix string 
			 */
			while(stackObj.top != -1)
			{
				poppedItem = stackObj.pop(first);
				postfixExpression = postfixExpression + poppedItem;
			}
			return postfixExpression;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	/* Method to clear the stack */
	public boolean clear()
	{
		if(top == -1)
			return false;
		top = -1;
		return true;
	}
}
