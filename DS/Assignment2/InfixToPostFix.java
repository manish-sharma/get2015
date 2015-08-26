package question1;

import java.util.Scanner;

public class InfixToPostFix {

	public void infixToPostfix(String infixExpression) {
		char element;
		LinkedList linkedListObject = new LinkedList();
		for( int counter = 0 ; counter < infixExpression.length() ; counter++) {
			element = infixExpression.charAt(counter);
			int asciiValue = (int ) element;
			if((asciiValue >= 65 && asciiValue <= 90) || (asciiValue >= 97 && asciiValue <=122))
				System.out.print(element);
			else if(asciiValue == 32)
				continue;
			else {
				
			}
			
		}
	}
	
	public static void main(String []args) {
		System.out.print("Enter the Expression: ");
		Scanner scannerObject = new Scanner(System.in);
		String expression = scannerObject.nextLine();
		InfixToPostFix infixToPostfixObject = new InfixToPostFix();
		infixToPostfixObject.infixToPostfix(expression);
	}
}
