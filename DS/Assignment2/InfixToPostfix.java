package InfixToPostfix;

import java.util.Scanner;

/**
 * @author Khemanshu
 *
 */
public class InfixToPostfix {

	private static Scanner scanner;

	/**
	 * checkForString is a function which is used to check the string that string cannot be number and in the form of infix string
	 */
	boolean checkForString(String infix) {
		boolean flag = true;
		String operater = "[\\+\\-\\*\\/\\%]";
		String operters;
		String operands;
		String number = "[0-9]";
		int lenghtCounter = 0;

		if (checkParenthesis(infix)) {
			flag = true;
		}
		for (int count = 0; count < infix.length(); count++) {

			if (lenghtCounter % 2 == 0) {
				operands = "" + infix.charAt(count);
				if (operands.matches(number)) {
					System.out.println("you cannot insert number. it will apply only for alphabhate");
					return false;
				}
				if (operands.equals("(") || operands.equals(")")) {
					continue;

				}

				else if (operands.matches(operater)) {

					flag = false;
					return flag;
				}
				else {
					lenghtCounter++;
				}
			} 
			else {
				operters = "" + infix.charAt(count);
				if (operters.matches(number)) {
					System.out
							.println("you cannot insert number. it will apply only for alphabhate");
					return false;
				}
				if (operters.equals("(") || operters.equals(")")) {
					continue;
				} 
				else if (!operters.matches(operater))                   // !operands.equals("(")||!operands.equals(")"))
				{
					flag = false;
					return flag;
				} 
				else {
					lenghtCounter++;
				}
				if (count == infix.length() - 1
						&& (operters.equals("(") || operters.equals(")"))) {
					flag = false;

				}

			}
		}

		return flag;
	}

	/**
	 * checkForString is a function which is used to check the parenthesis in the string 
	 */
	boolean checkParenthesis(String infix) {
		int countforLeft = 0, countforRight = 0;
		for (int count = 0; count < infix.length(); count++) {
			if (infix.charAt(count) == '(') {
				countforLeft++;
			} else if (infix.charAt(count) == ')') {
				countforRight++;
			}
		}
		if (countforLeft == countforRight) {
			return true;
		} else {
			return false;
		}

	}
	/**
	 * userInput is a function which is used to take the input in recursive manner
	 */
	public String userInput() {
		scanner = new Scanner(System.in);
		String infix;
		infix = scanner.nextLine();
		return infix;
	}

	public static void main(String[] args) {
		boolean flag = false;
		scanner = new Scanner(System.in);
		InfixToPostfixConversion conversion = new InfixToPostfixConversion();
		InfixToPostfix infixToPostfix = new InfixToPostfix();
		System.out.println("Enter the infix expression: ");
		String infix = infixToPostfix.userInput();
		while (!flag) {
			if (infixToPostfix.checkForString(infix)) {
				infix = conversion.infixToPostfix(infix);
				System.out.println("postfix string is"+"\n"+infix);
				flag = true;
			} 
			else
			{
				System.out.println("Enter correct String ");
				infix = infixToPostfix.userInput();
			}

		}

	}

}
