/**Stack class to define the operations of the stack
 * 
 * @author Gaurav Saini
 * Date : 27/08/2015
 */

public class Stack<Object> {

	int top = -1;				//initialize top with -1
	
	//method to push value in the stack
	public Node<Object> push(Object item, Node<Object> first) {
		Node<Object> current = first;
		if (top == -1) {			//inserting first element
			Node<Object> newNode = new Node<Object>(item);
			first = newNode;
			first.next = null;
			top++;
			return first;
		} 
		else if (top >= 0) {		//inserting rest of the elements
			for (int i = 0; i < top; i++)
				current = current.next;

			Node<Object> newNode = new Node<Object>(item);
			newNode.next = null;
			current.next = newNode;
			top++;					//increment top after pushing value
			return first;
		}	
		return first;
	}
	
	//method to pop the top value from stack
	public Object pop(Node<Object> current) {
		if(top == -1)
			return null;			//if empty stack

		int i;
		Node<Object> previousNode = current;
		Node<Object> currNode = current;
		for(i = 0; i < top; i++) {		//traversing up to top element
			previousNode = currNode;
			currNode = currNode.next;
		}
		
		previousNode.next = currNode.next;			//removing top element
		currNode.next = null;
		top--;
		return currNode.value;
	}
	
	//method to determine top value
	public Object peep(Node<Object> current) {
		int i;
		Node<Object> currNode = current;

		for(i = 0; i < top; i++)
			currNode = currNode.next;
		return currNode.value;
	}
	
	//method to show the complete stack
	public void display(Node<Object> first) {
		if(top == -1) {
			System.out.println("Stack is empty");
			return;
		}
		Node<Object> current = first;
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
	
	//method to convert infix to postfix
	public String convertToPostfix(String inputString, Node<Object> current) {
		Stack<Object> stackObj = new Stack<Object>();
		String postfix = "";
		Object received;
		int count = 0;
		
		for (int i = 0; i < inputString.length(); i++) {
			Object temp = (Object) new Character(inputString.charAt(i));			//storing all characters in temp object
			
			if (Validation.isAlphabet(inputString.charAt(i)))
				postfix = postfix + inputString.charAt(i);					//add alphabet or digit to postfix expression
			else if (inputString.charAt(i) == '(') {
				current = stackObj.push(temp, current);						//push open brackets in stack
				count++;
			}
			else if(inputString.charAt(i) == ')') {
				if(count == 0) {									//returns false if nothing is between brackets
					System.out.println("Invalid Expression");
					return null;
				}
				while(!((char)stackObj.peep(current) == '(')) {		//pop elements from stack until open bracket is found
					received = stackObj.pop(current);				//and store in object
					postfix = postfix + received;
				}
				stackObj.pop(current);
				count--;
			}
			else if(inputString.charAt(i) == '+' || inputString.charAt(i) == '-' || inputString.charAt(i) == '*' || inputString.charAt(i) == '/' || inputString.charAt(i) == '^') {
				if(stackObj.top == -1)				//if empty stack then push operator in stack
					current = stackObj.push(temp, current);
				else {
					if(inputString.charAt(i) == '^') {						//checking precedence of top operator in stack
						if((char)stackObj.peep(current) == '^') {			//and pop until top contains operator with lower or equal precedence
							received = stackObj.pop(current);
							postfix = postfix + received;
						}
					}
					else if(inputString.charAt(i) == '-' || inputString.charAt(i) == '+') {
						if((char)stackObj.peep(current) == '^') {
							received = stackObj.pop(current);
							postfix = postfix + received;
						}
						if((char)stackObj.peep(current) == '/' || (char)stackObj.peep(current) == '*') {
							received = stackObj.pop(current);
							postfix = postfix + received;
						}
						if((char)stackObj.peep(current) == '+' || (char)stackObj.peep(current) == '-') {
							received = stackObj.pop(current);
							postfix = postfix + received;
						}
					}	
					else if(inputString.charAt(i) == '*' || inputString.charAt(i) == '/') {
						if((char)stackObj.peep(current) == '^') {
							received = stackObj.pop(current);
							postfix = postfix + received;
						}
						if((char)stackObj.peep(current) == '/' || (char)stackObj.peep(current) == '*') {
							received = stackObj.pop(current);
							postfix = postfix + received;
						}
					}
					current = stackObj.push(temp, current);
				}
			}
		}
		
		while(stackObj.top != -1) {				//pop from stack until it is empty after processing the entire expression
			received = stackObj.pop(current);
			postfix = postfix + received;
		}
		return postfix;
	}
	
	//method to clear the stack
	public void clear() {
		top = -1;
	}
}
