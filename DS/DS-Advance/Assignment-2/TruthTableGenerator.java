/**
 * @author Girdhari
 * Program to print truth table of a expression
 */
package assignment2;

import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class TruthTableGenerator {
	/* Starting of truthTableGenerator Method */
	public int truthTableGenerator(String input) {

		try {
			
			if (input == null || input.length() == 0) {
				return 0;
			}

			input = input.toLowerCase();
			input = input.replaceAll("\\s", "");
			if (Validation.isExpression(input)) {
				input = removeNotPairs(input);

				if (Validation.isExpression(input)) {
					String inputPostfix = postfixConvertor(input);
					System.out.println("Postfix Equivalent : " + inputPostfix);

					evaluatePostfix(inputPostfix);
				} else {
					return -1;
				}
				return 1;
			} else
				return -1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return -2;
		}
	}
	/* End of truthTableGenerator function */
	
	/* Start of removeNotPairs method */
	private String removeNotPairs(String input) {

		/*
		 * Traversing over the input string to furnish it
		 */
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '~') {
				if (input.charAt(i + 1) == '~') {
					if (i == 0) {
						input = input.substring(i + 2, input.length());
						i = -1;
					} else
						input = input.substring(0, i)
								+ input.substring(i + 2, input.length());
				}
			}
		}
		System.out.println("Furnished Expression : " + input);
		return input;
	}
	/* End of removeNotPairs method*/
	
	/* Starting of countLetters function */
	private Set<Character> countLetters(String inputPostfix) {

		/* defining character set */
		Set<Character> letterSet = new TreeSet<Character>();

		/* converting input string in character array */
		char[] chars = inputPostfix.toCharArray();

		/* adding unique letters from the array to the set */
		for (char uniqueChar : chars) {
			if (Character.isLetter(uniqueChar))
				letterSet.add(uniqueChar);
		}

		/* returning letter set */
		return letterSet;
	}
	/* End of countLetters method */

	/* Start of evaluatePostfix method */
	private void evaluatePostfix(String inputPostfix) {

		Set<Character> letterSet = countLetters(inputPostfix);
		char res = ' ';

		char[][] chars = binaryCombinations(letterSet.size());

		Iterator<Character> letterSetIterator1 = letterSet.iterator();

		while (letterSetIterator1.hasNext()) {
			char c = letterSetIterator1.next();
			System.out.print(c + "\t");
		}
		System.out.println("Output");
		for (int i = 0; i < chars.length; i++) {

			String inputUpdate = inputPostfix;
			int j = 0;
			Iterator<Character> letterSetIterator = letterSet.iterator();

			while (letterSetIterator.hasNext()) {

				char c = letterSetIterator.next();

				inputUpdate = inputUpdate.replace(c, chars[i][j]);
				j++;
			}

			Stack<Character> list = new Stack<Character>();
			char c1; 
			char c2; 

			for (j = 0; j < inputUpdate.length(); j++) {
				char ch = inputUpdate.charAt(j);
				if (Character.isLetter(ch)) {
					list.push(ch);
				} else {
					if (ch == '~') {
						c1 = list.pop();
						list.push(operationPerform(c1, ch));
					} else {
						c1 = list.pop();
						c2 = list.pop();

						switch (ch) {
						case '&':
							list.push(operationPerform(c1, c2, '&'));
							break;
						case '|':
							list.push(operationPerform(c1, c2, '|'));
							break;
						default:
							System.out.println("Invalid operator order!");
							System.exit(0);
						}
					}
				}
			}
			res = list.pop();
			for (int count = 0; count < chars[0].length; count++) {
				System.out.print(chars[i][count] + "\t");
			}
			System.out.println(res);
		}
	}
	/* End of evaluatePostfix method */
	
	/* Start of operationPerform method */
	private Character operationPerform(char charFirst, char charSecond, char operator) {

		if (operator == '&') {
			if (charFirst == 'F' || charSecond == 'F') {
				return 'F';
			} else
				return 'T';
		}
		else {
			if (charFirst == 'T' || charSecond == 'T') {
				return 'T';
			} else
				return 'F';
		}
	}
	/* End of operationPerform method */

	/* Starting of operationPerform method */
	private Character operationPerform(char charFirst, char operator) {

		if (charFirst == 'F')
			return 'T';
		else
			return 'F';
	}
	/* Ending of operationPerform method */

	/* Starting of postfixConvertor method */
	private String postfixConvertor(String input) {
		Stack<Character> stackObj = new Stack<Character>();

		int inputLength = input.length();
		String postfixExpression = "";
		Object deletedItem;
		int countBraces = 0;

		for (int loopCounter = 0; loopCounter < inputLength; loopCounter++) {
			Character temp = new Character(input.charAt(loopCounter));

			if (Character.isLetter(temp)) {
				postfixExpression = postfixExpression + temp;
			}

			else if (input.charAt(loopCounter) == '(') {
				stackObj.push(temp);
				countBraces++;
			}

			else if (temp == ')') {
				if (countBraces == 0) {
					System.out.println("Invalid Expression");
					return null;
				}

				while (!((char) stackObj.peek() == '(')) {
					deletedItem = stackObj.pop();
					postfixExpression = postfixExpression + deletedItem;
				}
				stackObj.pop();
				countBraces--;
			}

			else if (temp == '&' || temp == '|' || temp == '~') {
				if (stackObj.size() == 0) {
					stackObj.push(temp);
				} else {
					if (input.charAt(loopCounter) == '~') {
						if ((char) stackObj.peek() == '~') {
							deletedItem = stackObj.pop();
							postfixExpression = postfixExpression + deletedItem;
						}
					}

					else if (input.charAt(loopCounter) == '&') {
						while (stackObj.peek() != '|' && stackObj.peek() != '(') {
							deletedItem = stackObj.pop();
							postfixExpression = postfixExpression + deletedItem;
							if (stackObj.size() == 0)
								break;
						}
					}
					else if (input.charAt(loopCounter) == '|') {
						while (stackObj.size() != 0 && stackObj.peek() != '(') {
							deletedItem = stackObj.pop();
							postfixExpression = postfixExpression + deletedItem;
						}
					}

					stackObj.push(temp);
				}
			}
		}

		while (stackObj.size() != 0) {
			deletedItem = stackObj.pop();
			postfixExpression = postfixExpression + deletedItem;
		}
		return postfixExpression;
	}

	/* Ending of postfixConvertor method */
	
	/* Starting of binaryCombinations method */
	private char[][] binaryCombinations(int numberOfCharacters) {

		if (numberOfCharacters == 0)
			return null;

		int numberOfRows = (int) Math.pow(2, numberOfCharacters);

		boolean[][] bools = new boolean[numberOfRows][numberOfCharacters];
		char[][] chars = new char[numberOfRows][numberOfCharacters];

		for (int i = 0; i < bools.length; i++) {
			for (int j = 0; j < bools[i].length; j++) {
				int val = bools.length * j + i;
				int ret = (1 & (val >>> j));
				bools[i][j] = ret != 0;
				if (bools[i][j]) {
					chars[i][j] = 'T';
				} else {
					chars[i][j] = 'F';
				}
			}
		}

		return chars;
	}
	/* Ending of binaryCombinations method */
}
