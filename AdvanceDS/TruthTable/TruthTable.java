package TruthTable;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class TruthTable {
	char[][] table;//2-D char array contains output table
	Set<Character> elementSet;//Set contains unique operand in input expression 
	//method to calculating truth table
	public String createTruthTable(String input) throws MyException {
		String result = "";
		if (!Validation.validate(input)) {  //to check input expression is valid or not
			Exception e = null;    //MyException class object
			throw new MyException(e);
		}
		String postfix = TruthTableHelper.getPostfix(input); //method to calculate postfix expression from given input
		elementSet = new HashSet<Character>();    
		elementSet = TruthTableHelper.getElements();   //get unique elements
		int rows = (int) Math.pow(2, elementSet.size());   //calculate number of rows
		char[][] table = new char[rows][elementSet.size()];    //creating 2-D table for output
		int count = 0;     //to point current position of char  
		result+=elementSet; 
		result+="	" + input+"\n";
		for (int i = 0; i < rows; i++) {    //method to initialize the Table
			int index = 0;  
			for (int j = 0; j < elementSet.size();) {
				String binary = TruthTableHelper.getBinary(count,elementSet.size()); //get binary value of count
				while (index < binary.length()) {
					if (Character.getNumericValue(binary.charAt(index)) == 0) //check if it is 0 then put F else T
						table[i][j++] = 'F';
					else {
						table[i][j++] = 'T';
					}
					index++;
				}
				count++;
			}
			for (int j = 0; j < elementSet.size(); j++)
			result+=" " + table[i][j] + " ";
			result+="	" + getTruthTable(postfix, rows, table, i)+"\n";
		}
		return result;
	}
	//method for calculating result for each rows
	private char getTruthTable(String postfix, int rows, char[][] table, int i) {
		int j = 0, index = 0;
		char currentChar, output = 0;
		String postfixUpdate = postfix;//copy postfix string
		index = 0;
		j = 0;
		while (index < postfixUpdate.length()) {
			currentChar = postfixUpdate.charAt(index);
			if (isLatter(currentChar) && j < elementSet.size()) { //check if currentchar is a Operand in expression then replace it corresponding values in table  
				postfixUpdate = postfixUpdate.replace(currentChar, table[i][j]);//update postfixUpdate
				j++;
			}
			index++;
		}
		index = 0;
		char previousChar;
		char operator;
		Stack<Character> list = new Stack<Character>();//to hold values
		//loop for manipulation if currentChar is '~' then call negation function
		// if it is '&' or '|' call performOPertaion function
		while (index < postfixUpdate.length()) {
			currentChar = postfixUpdate.charAt(index);
			if (isLatter(currentChar)) {
				list.push(currentChar);
				index++;
			} else if (currentChar == '~') {
				previousChar = list.pop();
				previousChar = negation(previousChar);
				list.push(previousChar);
				index++;
			} else if (currentChar == '&') {
				operator = currentChar;
				currentChar = list.pop();
				previousChar = list.pop();
				currentChar = performOperation(currentChar, previousChar,
						operator);
				list.push(currentChar);
				index++;
			} else if (currentChar == '|') {
				operator = currentChar;
				currentChar = list.pop();
				previousChar = list.pop();
				currentChar = performOperation(currentChar, previousChar,
						operator);
				list.push(currentChar);
				index++;
			}
		}
		output = list.pop();
		return output;//return current row output
	}
	//to check currentChar is a Latter or not
	public static boolean isLatter(char currentChar) {
		if ((currentChar >= 'a' && currentChar <= 'z')
				|| (currentChar >= 'A' && currentChar <= 'Z'))
			return true;
		else
			return false;
	}
	//for negation
	private char negation(char operand) {
		if (operand == 'F')
			return 'T';
		else
			return 'F';
	}
	//for & or | operation
	private char performOperation(char c1, char c2, char operator) {
		if (operator == '&') {
			if (c1 == 'F' || c2 == 'F') {
				return 'F';
			} else
				return 'T';
		} else {
			if (c1 == 'T' || c2 == 'T')
				return 'T';
			else
				return 'F';
		}
	}
}
