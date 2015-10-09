package TruthTable;
//class for validation
public class Validation {
	//method to check given input valid or not
	public static boolean validate(String input) throws MyException {
		Exception e = null; //MyException Object
		//to check if input contains tow or more operator consecutively then throw exception
		if (input.contains("&&") || input.contains("||")
				|| input.contains("~~") || input.contains("&|")
				|| input.contains("|&") || input.contains("~&")
				|| input.contains("~|"))
			return false;
		//variables for count 
		int countOperand = 0;
		int countOperator = 0;
		int countOpenBrac = 0;
		int countCloseBrac = 0;
		char startChar = input.charAt(0);
		char lastChar = input.charAt(input.length()-1);
		int count = 0;
		char currentChar;
		while (count < input.length()) {
			currentChar = input.charAt(count);
			if(count < input.length()-2 &&  currentChar == '~' && (input.charAt(count+2) == '~' || input.charAt(count+2) == '('))
				return false;
			else if(TruthTable.isLatter(currentChar) && (input.charAt(count+1) == '('))
					return false;
			else if(currentChar == '(' && input.charAt(count+2) == ')') {
				return false;
			}
			else if(startChar == ')' || startChar == '&' || startChar == '|' || lastChar =='~' || lastChar == '&' || lastChar == '|') {
				return false;
			}
			else if (currentChar == '|' || currentChar == '&' || currentChar == '~') {
				countOperator++;
				count++;
			} 
			else if ((currentChar >= 'a' && currentChar <= 'z')
					|| (currentChar >= 'A' && currentChar <= 'Z')) {
				countOperand++;
				count++;
			}
			else if (currentChar == '(') {
				countOpenBrac++;
				count++;
			}
			else if (currentChar == ')') {
				countCloseBrac++;
				count++;
			}
			else {
				throw new MyException(e);
			}
		}
		//condition for returning true or false
		if(countCloseBrac != countOpenBrac)
			return false;
		else if((countOperator == 2*countOperand-1) || (countOperand == countOperator+1) || (countOperand == countOperator) || (countOperand+1 == countOperator) || countOperator == countOperand*2)
			return true;
		else 
			return true;
	}
}