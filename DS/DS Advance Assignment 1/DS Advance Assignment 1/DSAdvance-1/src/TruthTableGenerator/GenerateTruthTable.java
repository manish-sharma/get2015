package TruthTableGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * This class generates the truth table for the given boolean expression by
 * converting it into postfix Notation and then depending upon the numbers of
 * distinct variables in expression it generates true or false combination and
 * its outcome
 * 
 * @author Shishir Pareek Date 4th Oct 2015
 **/
public class GenerateTruthTable {
	/* Count unique Operands */
	private ArrayList<Character> countUniqueOperands(String inputstring) {
		ArrayList<Character> charList = new ArrayList<Character>();
		char inputCharacterArray[] = inputstring.toCharArray();
		boolean flag = true;
		for (int index = 0; index < inputCharacterArray.length; index++) {
			if (Character.isLetter(inputCharacterArray[index])) {// if current
																	// character
																	// scanned
																	// is letter
																	// and is
																	// not in
																	// character
																	// list then
				for (int index1 = 0; index1 < charList.size(); index1++) {
					if (inputCharacterArray[index] == (char) charList// check if
																		// it
																		// already
																		// exists
																		// in
																		// character
																		// list
							.get(index1)) {
						flag = false;
						break;
					}
				}
				if (flag) {// if flag is true then character is not in list and
							// so we add it
					charList.add(inputCharacterArray[index]);
					flag = true;
				}
			}
		}

		System.out.println(charList + "    " + inputstring);
		return charList;// returning the list
	}

	/*
	 * Generate truth table for operands based on true false combination and
	 * operation.
	 */
	public void generateTruthTable(String inputstring) {
		ArrayList<Character> charList = countUniqueOperands(inputstring);
		boolean result[] = new boolean[charList.size()];
		generate(result, 0, inputstring, charList);// function call to generate
													// the truth table
	}

	/*
	 * This function generates the actual truth table and based on input string
	 * and position from where to start and character u=in the input string
	 */
	private void generate(boolean[] result, int start, String inputstring, ArrayList<Character> charList) {
		if (start == result.length) {// if start is equal to length then one of
										// the combination is complete
			System.out.print(Arrays.toString(result));
			boolean output = calculate(inputstring, charList, result);// calculating
																		// the
																		// output
																		// for
																		// the
																		// expression
																		// based
																		// on
																		// current
																		// combination
			System.out.println("   " + output);
		} else {
			generate(result, start + 1, inputstring, charList);// recursive
																// function call
			result[start] = true;// setting one value true
			generate(result, start + 1, inputstring, charList);// recursive
																// function call
			result[start] = false;// setting one of the value of combination as
									// false
		}
	}

	/* Generate table for postfix expression. */
	private boolean calculate(String inputstring, ArrayList<Character> charList, boolean result[]) {
		boolean output = false;
		boolean secondOperand, firstOperand;
		Stack<Boolean> stack = new Stack<Boolean>();
		for (int index3 = 0; index3 < inputstring.length(); index3++) {
			char[] input1 = inputstring.toCharArray();
			if (Character.isLetter(input1[index3])) {// if the value is letter
														// in the post fix
														// string extract its
														// position and insert
														// it into the stack
				int pos = charList.indexOf(input1[index3]);
				stack.push(result[pos]);
			} else if (input1[index3] == '&' || input1[index3] == '|') {// if
																		// the
																		// value
																		// is
																		// AND
																		// or OR
																		// boolean
																		// operator
																		// tan
																		// pop
																		// the
																		// top
																		// two
																		// operands
																		// calculate
																		// the
																		// expression
																		// and
																		// push
																		// the
																		// result
																		// back
				firstOperand = (boolean) stack.pop();
				secondOperand = (boolean) stack.pop();
				switch (input1[index3]) {
				case '&':
					output = firstOperand & secondOperand;
					break;
				case '|':
					output = firstOperand | secondOperand;
					break;
				}

				stack.push(output);
			} else {// if its not AND or Or than Appl NOT operator and push the
					// output back in stack
				firstOperand = (boolean) stack.pop();
				output = !firstOperand;
				stack.push(output);
			}
		}
		// when the string end output is at the top of stack so pop it and
		// return it
		output = (boolean) stack.pop();
		return (output);
	}
}
