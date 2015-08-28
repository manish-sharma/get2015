package firstprogram;

import java.util.Scanner;

/**
 * Class that does the conversion of any infix expression to postfix
 * 
 * @author Riddhi
 * 
 */
public class Infix2Posfix {
	StackInfix2Posfix<Character> newStack;
	String postfix = "";

	// parameterized constructor
	public Infix2Posfix(String value) {
		newStack = new StackInfix2Posfix<Character>(value.length());

	}

	// checks for precedence of operators
	public void checkPrecedence(char operator, int precedence1) {
		int precedence2 = 0;
		if (newStack.isEmpty()) {
			newStack.push(operator);
		} else {

			if (newStack.peek().equals('+') || newStack.peek().equals('-')) {
				precedence2 = 1;
			} else {
				precedence2 = 2;
			}

			if (precedence2 < precedence1) { // if a higher precedence operator
				// comes that it is pused on to
				// the stack
				newStack.push(operator);
			} else {
				postfix += newStack.pop(); // if a lower precedence operator comes than the element at the peek of stack is poped and concatenate to the postfix string
				if (!newStack.isEmpty() && newStack.peek().equals(operator)) {
					checkPrecedence(operator, precedence1);
				} else {
					newStack.push(operator);
				}
			}
		}
	}

	// function that pops all element left in the stack at the end
	public void popAll() {
		while (!newStack.isEmpty()) {
			postfix += newStack.pop();
		}
	}

	public boolean isBetween(char value)
	{
		int number=value;
		if((number>=97 && number<=122) || (number>=65 && number<=90) || (number>=48 && number<=57)){
			return true;
		}
		return false;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String infix = sc.next();
		Infix2Posfix object = new Infix2Posfix(infix);
		boolean result=false;
		int index = 0;
		while (index < infix.length()) {
			char value = infix.charAt(index);
			//based on the char value its precedence is decided
			switch (value) {
			case '+':
			case '-':
				object.checkPrecedence(value, 1);
				break;
			case '*':
			case '/':
				object.checkPrecedence(value, 2);
				break;
			case '(':
				object.newStack.push(value);
				break;
			case ')':
				while (!object.newStack.isEmpty()) {
					if (object.newStack.peek() == '(') {
						object.newStack.pop();
						break;
					} else {
						object.postfix += object.newStack.pop();
					}
				}
				break;

			default: 
				result=object.isBetween(value);
				if(result){
					object.postfix += value;}
				else
				{
					System.out.println("Invalid value entered. Bye!!");
					System.exit(0);
				}

			}
			index++;
		}
		object.popAll();
		System.out.println("Postfix Expression is:");
		System.out.println(object.postfix);  //display final postfix converted expression
	}

}
