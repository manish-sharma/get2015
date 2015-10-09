package TrurhTable;

import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
/**
 * This class is used to Genetate the table and store the result of it
 */
public class TruthTableGenerator {
	/**
	 * This function is used to insert element in list if list contain '('
	 * braces than create new node with tag 1 Otherwise node store data value
	 * with tag 0 This function recursivly insert element
	 */
	public void truthTableGenerator(String input) {
		if (Validation.isExpression(input)) {
			String inputPostfix = postfixConvertor(input);
			System.out.println(inputPostfix);
			executeOperation(inputPostfix);
		} else {
			System.out.println("Enter Valid Expression");
		}
	}

	/**
	 * This function is used to store unique operand in the set
	 * 
	 * @return set
	 */
	private Set<Character> countletters(String inputPostfix) {
		Set<Character> letterSet = new TreeSet<Character>();
		char[] chars = inputPostfix.toCharArray();
		for (char c : chars) {
			if (Character.isLetter(c))
				letterSet.add(c);
		}
		return letterSet;
	}

	/**
	 * This function is used to calculate the output String Operand is replace
	 * with its value and calculate the output
	 */
	private void executeOperation(String inputPostfix) {

		Set<Character> letterSet = countletters(inputPostfix);
		char output = ' ';
		char[][] chars = binaryCombinations(letterSet.size());
		Iterator<Character> letterSetIteratorForSchema = letterSet.iterator();
		while (letterSetIteratorForSchema.hasNext()) {
			char character = letterSetIteratorForSchema.next();
			System.out.print(character + "\t");
		}
		System.out.print("Output");
		System.out.println();
		for (int row = 0; row < chars.length; row++) {
			String inputUpdate = inputPostfix;
			int col = 0;
			Iterator<Character> letterSetIterator = letterSet.iterator();
			while (letterSetIterator.hasNext()) {
				char c = letterSetIterator.next();
				// System.out.println(c + " replce with" + chars[row][col]);
				inputUpdate = inputUpdate.replace(c, chars[row][col]);
				col++;
			}

			Stack<Character> list = new Stack<Character>();
			char fristOperand;
			char secondOperand;
			for (col = 0; col < inputUpdate.length(); col++) {
				char character = inputUpdate.charAt(col);
				if (character == ' ') {
				} else {
					if (Character.isLetter(character)) {
						list.push(character);
					} else {
						if (character == '~') {
							fristOperand = list.pop();
							list.push(operationPerform(fristOperand, character));
						} else {
							fristOperand = list.pop();
							secondOperand = list.pop();

							switch (character) {
							case '&':
								list.push(operationPerform(fristOperand,
										secondOperand, '&'));
								break;
							case '|':
								list.push(operationPerform(fristOperand,
										secondOperand, '|'));
								break;
							default:
								System.out.println("Invalid operator order!");
							}
						}
					}
				}
			}
			output = list.pop();
			for (int count = 0; count < chars[0].length; count++) {
				System.out.print(chars[row][count] + "\t");
			}
			System.out.println(output);
		}
	}

	/**
	 * This function is used to perform opration on two operand and store result
	 * of it. Operator can be & and |
	 * 
	 * @return result
	 */
	private Character operationPerform(char fristOperand, char secondOperand,
			char operator) {
		if (operator == '&') {
			if (fristOperand == 'F' || secondOperand == 'F') {
				return 'F';
			} else
				return 'T';
		}

		else {
			if (fristOperand == 'T' || secondOperand == 'T') {
				return 'T';
			} else
				return 'F';
		}
	}

	/***
	 * This function is used to perform not operation on operand
	 * @return result
	 */
	private Character operationPerform(char Operand, char operator) {
		if (Operand == 'F')
			return 'T';
		else
			return 'F';
	}

   /** This function is used convert infix expression into postfix expression  
	 * @param: String: input string
	 * @return: postfix string
	 * */
	private String postfixConvertor(String input) {
		Stack<Character> stackObj = new Stack<Character>();

		int inputLength = input.length();
		String postfixExpression = "";
		Object poppedItem;
		int countBraces = 0;

		for (int traverse = 0; traverse < inputLength; traverse++) {
			Character temp = new Character(input.charAt(traverse));

			if (Character.isLetter(temp)) {
				postfixExpression = postfixExpression + temp;
			}

			else if (input.charAt(traverse) == '(') {
				stackObj.push(temp);
				countBraces++;
			}

			else if (temp == ')') {
				if (countBraces == 0) {
					System.out.println("Invalid Expression");
					return null;
				}

				while (!((char) stackObj.peek() == '(')) {
					poppedItem = stackObj.pop();
					postfixExpression = postfixExpression + poppedItem;
				}
				stackObj.pop();
				countBraces--;
			}

			else if (temp == '&' || temp == '|' || temp == '~') {
				if (stackObj.size() == 0) {
					stackObj.push(temp);
				} else {
					if (input.charAt(traverse) == '~') {
						if ((char) stackObj.peek() == '~') {
							poppedItem = stackObj.pop();
							postfixExpression = postfixExpression + poppedItem;
						}
					}

					else if (input.charAt(traverse) == '&') {
						while (stackObj.peek() != '|' && stackObj.peek() != '(') {
							poppedItem = stackObj.pop();
							postfixExpression = postfixExpression + poppedItem;
							if (stackObj.size() == 0)
								break;
						}
					} else if (input.charAt(traverse) == '|') {
						while (stackObj.size() != 0 && stackObj.peek() != '(') {
							poppedItem = stackObj.pop();
							postfixExpression = postfixExpression + poppedItem;
						}
					}

					stackObj.push(temp);
				}
			}
		}

		while (stackObj.size() != 0) {
			poppedItem = stackObj.pop();
			postfixExpression = postfixExpression + poppedItem;
		}
		return postfixExpression;
	}

	/**
	 *This funtion is used to calculate input value of operand according to binary value 
	 * @return: 2d array of binary Combinations
	 * */
	private char[][] binaryCombinations(int numberOfCharacters) {
		int numberOfRows = (int) Math.pow(2, numberOfCharacters);
		char[][] table = new char[numberOfRows][numberOfCharacters];
		char[][] chars = new char[numberOfRows][numberOfCharacters];

		// initialize table with 0
		for (int row = 0; row < table.length; row++) {
			for (int col = 0; col < table[row].length; col++) {
				table[row][col] = '0';
			}
		}

		// initialize table with input values
		for (int row = 0; row < table.length; row++) {
			char[] temp = Integer.toBinaryString(row).toCharArray();
			int length = table[row].length;

			for (int col = length - 1; temp.length - (length - col) >= 0; col--) {
				table[row][col] = temp[temp.length - (length - col)];
			}
		}

		for (int row = 0; row < table.length; row++) {
			for (int col = 0; col < table[row].length; col++) {
				if (table[row][col] == '0') {
					chars[row][col] = 'F';
				} else {
					chars[row][col] = 'T';
				}
			}
		}

		return chars;
	}
}
