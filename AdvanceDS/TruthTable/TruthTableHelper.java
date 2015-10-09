package TruthTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
//this class is used to calculate postfix and some other operation
public class TruthTableHelper {
	static Set<Character> elementSet = new HashSet<Character>();
	//method to calculating postfix operation
	public static String getPostfix(String input) {
		Stack<Character> expression = new Stack<Character>();
		char currentChar;
		int count = 0;
		String postFix = "";
		ArrayList<Character> operator = new ArrayList<Character>();
		operator.add('~');
		operator.add('&');
		operator.add('|');
		operator.add('(');
		operator.add(')');
		while (count < input.length()) {
			currentChar = input.charAt(count);
			if (currentChar == '(') {
				expression.push(currentChar);
				count++;
			} 
			else if (currentChar == ')') {
				while (expression.peek() != null && expression.peek() != '(') {
					postFix = postFix + expression.pop();
				}
				expression.pop();
				count++;
			} else if (expression.isEmpty() && operator.contains(currentChar)) {
				expression.push(currentChar);
				count++;
			} else if (operator.contains(currentChar)) {
				while (expression.isEmpty() == false
						&& getPrecedence(expression.peek()) > getPrecedence(currentChar)
						&& expression.peek() != '(') {
					postFix += expression.pop();
				}
				expression.push(currentChar);
				count++;
				currentChar = input.charAt(count);
			} else {
				postFix += currentChar;
				elementSet.add(currentChar);
				//numberOfElement++;
				count++;
			}
		}
		while (!expression.isEmpty()) {
			postFix += expression.pop();
		}
		return postFix;
	}
	//method for get precedence of operators
	private static int getPrecedence(char input) {
		int precedence = 0;
		switch (input) {
		case '(':
			precedence = 0;
			break;
		case ')':
			precedence = 0;
			break;
		case '~':
			precedence = 3;
			break;
		case '&':
			precedence = 2;
			break;
		case '|':
			precedence = 1;
			break;
		}
		return precedence;
	}
	//to return set of unique elements
	public static Set<Character> getElements() {
		return elementSet;
	}
	//method to convert in binary
	public static String getBinary(int number, int max) {
		String binary = Integer.toBinaryString(number);
		while (binary.length() < max) {
			binary = "0" + binary; //for appending extra 0 in binary string
		}
		return binary;
	}

}
