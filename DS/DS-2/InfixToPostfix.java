/**
 * Class to implement Infix to Postfix transformation
 * @author Sanjay
 */

import java.util.Scanner;


public class InfixToPostfix  extends LinkedList{

	public InfixToPostfix() {
	} 
	
	
	/**
	 * to get the priority of operator
	 * @param operator = its priority will be checked
	 * @return priority
	 */
	
	private int priority(char operator) {
		switch(operator) {
		case '(':
			return 0;
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 3;
		}
		return -1;
	}
	
	
	/**
	 * to check that current character is operand or not
	 * @param c = current character
	 * @return true if operand,otherwise false
	 */
	private boolean isOperand(char c) {
		if(c >='0' && c <= '9' ) {
			return true;
		} else if(c >= 'a' && c <= 'z') {
			return true;
		} else if(c >= 'A' && c <= 'Z') {
			return true;
		}
		return false;		
	}
	
	/**
	 * to check current character is operator or not
	 * @param c = current character
	 * @return true if operand,otherwise false
	 */
	private boolean isOperator(char c) {
		if(c == '/' || c == '*' || c == '+' || c == '-' || c== '^' ) {
			return true;
		}
		return false;
	}
	
	
	/**
	 * to convert infix into post fix
	 * @param infix = input String
	 */
	public String infixToPostfix (String infix) {
		String postFix ="";
		Stack stack = new Stack();
		LinkedList linkList = new LinkedList();
		stack.push('(');
		for(int count = 0; count < infix.length()+1; count++) {
			char currentChar ;
			if(count == infix.length()) {
				currentChar = ')';
			} else {
				currentChar = infix.charAt(count);
			}
			
			if(isOperand(currentChar)) {
				postFix += currentChar;
				System.out.print("" + currentChar);
			} else if(isOperator(currentChar)) {
				
				if(priority(currentChar) <= priority((char)linkList.getTop().data)) {
					postFix +=(char)linkList.getTop().data;
					System.out.print("" + (char)linkList.getTop().data);
				 stack.pop();
				 
				}
				if(top!=null)
				{
					if(priority(currentChar) <= priority((char)linkList.getTop().data)) {
						postFix +=(char)linkList.getTop().data;
						System.out.print("" + (char)linkList.getTop().data);
					 stack.pop();
					 
					}
					stack.push(currentChar);
				}
				else {
					stack.push(currentChar);
				}
			} else if(currentChar == ')') {								//if current character is ')' than we have to pop all the elements of stack till ')'
				while(linkList.getTop().data != '(') {
					postFix +=(char)linkList.getTop().data;
					System.out.print("" + (char)linkList.getTop().data);
					stack.pop();
				}
				stack.pop();
			} else if(currentChar == '(') {
				stack.push(currentChar);
			} else {
				System.out.println("invalid infix");
			}
		}
		while(linkList.getTop()!=null)
		{
			postFix +=(char)linkList.getTop().data;
			stack.pop();
			
		}
		return postFix;
	}
	
	public static void main(String[] args) {
		System.out.println("enter the infix String");
		Scanner scanner = new Scanner(System.in);
		String infix = scanner.next();
		InfixToPostfix infixToPostfix = new InfixToPostfix();
		infixToPostfix.infixToPostfix(infix);
		scanner.close();
		
	}
}
