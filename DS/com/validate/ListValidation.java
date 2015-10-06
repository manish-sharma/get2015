/**
 * @author Pooja Khandelwal
 * @created date 10/06/2015
 * @name ListValidation
 * @description this class will validate the input string of list elements and also has a function to check whether the generalized list is empty or not
 */
package com.validate;

public class ListValidation {
	/**
	 * @name isInputValid()
	 * @description this function will validate the input string of list
	 *              elements
	 * @param input
	 *            ( string of list elements )
	 * @return true or false
	 */
	public static boolean isInputValid(String input) {
		char currentChar = 0;
		int countOpenBrackets = 0;
		int countCloseBrackets = 0;
		int countNumber = 0;
		int countComma = 0;
		int otherChar = 0;
		int count = 0;
		while (count < input.length()) {
			currentChar = input.charAt(count);
			switch (currentChar) {
			case '(':
				count++;
				if (count < input.length()) {
					currentChar = input.charAt(count);
				}
				countOpenBrackets++;
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				count++;
				if (count < input.length()) {
					currentChar = input.charAt(count);
				}
				while (currentChar >= '0' && currentChar <= '9') {
					count++;
					if (count < input.length()) {
						currentChar = input.charAt(count);
					} else {
						break;
					}
				}
				countNumber++;
				break;
			case ')':
				count++;
				if (count < input.length()) {
					currentChar = input.charAt(count);
				}
				countCloseBrackets++;
				break;
			case ',':
				count++;
				if (count < input.length()) {
					currentChar = input.charAt(count);
				}
				countComma++;
				break;
			default:
				count++;
				if (count < input.length()) {
					currentChar = input.charAt(count);
				}
				otherChar++;
				break;
			}
		}
		if (countCloseBrackets != countOpenBrackets || countOpenBrackets <= 0) {
			return false;
		} else if ((countNumber - 1) != countComma) {
			return false;
		} else if (otherChar != 0) {
			return false;
		}
		return true;

	}

	/**
	 * @name isEmpty()
	 * @description it will check whether the generalized list is empty or not
	 * @param size
	 *            (total no. of elements in the generalized list
	 * @return true or false
	 */
	public static boolean isEmpty(int size) {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}
}
