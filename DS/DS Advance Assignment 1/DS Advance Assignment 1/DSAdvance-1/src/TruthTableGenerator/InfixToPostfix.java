package TruthTableGenerator;

import java.util.Stack;

/**
 * This class converts the given infix boolean expression into postfix for easy
 * evaluaton
 * 
 * @author Shishir
 *
 * @param <T>
 */
public class InfixToPostfix<T> {
	String strPostFix = "";
	Stack<Character> objectStack = new Stack<Character>();

	/**
	 * This function takes the character as input and precedence and then
	 * accordingly converts the expression
	 * 
	 * @param precedence
	 * @param infixChar
	 */
	public void pushAndPopOperatorInStack(int precedence, char infixChar) {
		if (objectStack.isEmpty() == false) {// if stack is not empty then it
												// already contains some value
			while (objectStack.isEmpty() == false) {// loop till stack does not
													// become empty
				if (objectStack.peek().equals("(")// if the value in stack is
													// "(" or ")" then return
													// null value
						|| objectStack.peek().equals(")")) {
					return;
				} else {
					int precedenceOfTop = checkPrecedence(objectStack.peek()// else
																			// check
																			// precedence
																			// of
																			// the
																			// operator
																			// on
																			// top
																			// of
																			// stack
							.toString().charAt(0));
					if (precedenceOfTop <= precedence) {// if the operator on
														// top has lower
														// precedence then the
														// current one then pop
														// the item and concat
														// it to string
						Object item = objectStack.pop();
						strPostFix = strPostFix.concat(item.toString());
					} else {
						break;// otherwise break the loop and add the current
								// operator to the stack
					}
				}
				objectStack.push(infixChar);
			}
		} else {
			objectStack.push(infixChar);
		}
	}

	/**
	 * This function check the precedence of the character passed as argument
	 * and returns the interger value based on character
	 * 
	 * @param charInfix
	 * @return
	 */
	public int checkPrecedence(char charInfix) {
		int precedence = 0;
		switch (charInfix) {// switch case to choose the precedence based on the
							// input
		case '!':
			precedence = 3;
			break;
		case '&':
			precedence = 2;
			break;

		case '|':
			precedence = 1;
			break;

		case '(':
			precedence = 4;
			break;

		case ')':
			precedence = 5;
			break;

		default:
			precedence = 0;
		}

		return precedence;
	}

	/**
	 * This function converts the infix expression to postfix
	 * 
	 * @param inputString
	 * @return
	 */
	public String convertInfixToPostfix(String inputString) {
		for (int index = 0; index < inputString.length(); index++) {
			char charInfix;
			charInfix = inputString.charAt(index);
			int precedence;
			precedence = checkPrecedence(charInfix);
			if (precedence == 0) // if precedence is zero then its operand so
									// add it to postfix string
			{
				strPostFix = strPostFix + charInfix;
			} else if (precedence == 4) // if precedence is 4 then its an
										// opertaor so push it in stack
			{
				objectStack.push(charInfix);
			} else if (precedence == 5) // if precednece is 5 then its the
										// ending bracket and expression is
										// ended so pop till the opening braces
										// is not encountered
			{
				Object item;
				while (objectStack.peek() != '(') {
					item = objectStack.pop();
					strPostFix = strPostFix.concat(item.toString());// adding
																	// the poped
																	// item to
																	// postfix
																	// string
				}

				item = objectStack.pop();// pop the element from stack and add
											// it to item
			} else {
				pushAndPopOperatorInStack(precedence, charInfix);
			}
		}

		// pops operators left in stack
		while (!objectStack.empty()) {
			strPostFix += objectStack.pop();
		}

		return strPostFix;
	}
}
