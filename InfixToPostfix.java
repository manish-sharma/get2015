import java.util.Scanner;

import com.Stack;
/*
 * sumitra
 * convert INFIX TO postfix
 */
public class InfixToPostfix {
/*
 * method return priority of operator
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
	/*
	 * Method return boolean value if it is operand
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
	/*
	 * method return true if operator
	 */
	private boolean isOperator(char c) {
		if(c == '/' || c == '*' || c == '+' || c == '-' || c== '^') {
			return true;
		}
		return false;
	}
	/*
	 * method convert infix into postfix
	 */
	public void infixToPostfix (String infix) {
		Stack stack = new Stack();
		stack.pushItem('(');
		for(int count = 0; count < infix.length()+1; count++) {
			char currentChar ;
			if(count == infix.length()) {
				currentChar = ')';
			} else {
				currentChar = infix.charAt(count);
			}
			
			if(isOperand(currentChar)) {
				System.out.print("" + currentChar);
			} else if(isOperator(currentChar)) {
				if(priority(currentChar) < priority((char)Stack.top.data)) {
					System.out.print("" + (char)Stack.top.data);
				 stack.popItem();	
				} else {
					stack.pushItem(currentChar);
				}
			} else if(currentChar == ')') {
				while((char)Stack.top.data != '(') {
					System.out.print("" + (char)Stack.top.data);
					stack.popItem();
				}
			} else {
				System.out.println("invalid infix");
			}
		}
	}
	/*
	 * main method
	 */
	public static void main(String[] args) {
		System.out.println("enter infix String");
		Scanner scanner = new Scanner(System.in);
		String infix = scanner.next();
		InfixToPostfix infixToPostfix = new InfixToPostfix();
		infixToPostfix.infixToPostfix(infix);
		scanner.close();
		
	}
}
