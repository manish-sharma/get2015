/**class for checking the validity of input expression
 * 
 * @author Gaurav Saini
 * Date : 27/08/2015
 */

public class Validation {

	//Method to check validity of expression
	public static boolean isValidExpression(String expression) {
		char[] charArray = expression.toCharArray();
		int length = charArray.length;
		int count1 = 0, count2 = 0;
		int i = 0;
		
		for(i = 0; i < charArray.length - 1; i++)						//return false if alphabet or bracket appear after alphabet
			if((Character.isLetter(charArray[i]))) {
	    		if(Character.isLetter(charArray[i+1]) || charArray[i+1] == '(')
	    			return false;
			}

		for(i = 0; i < charArray.length - 1; i++)				//return false if 2 operators appear successively
	    	if(charArray[i] == '+' || charArray[i] == '/' || charArray[i] == '*' || charArray[i] == '-' || charArray[i] == '^') {
	    		if(charArray[i+1] == '+' || charArray[i+1] == '/' || charArray[i+1] == '*' || charArray[i+1] == '-' || charArray[i+1] == '^' || charArray[i+1] == ')')
	    				return false;
	    	}

		if(charArray[0] == '+' || charArray[0] == '/' || charArray[0] == '*' || charArray[0] == '-' || charArray[0] == '^')
	    	return false;								//return false if expression begin with operator
	    
		if(charArray[length-1] == '+' || charArray[length-1] == '/' || charArray[length-1] == '*' || charArray[length-1] == '-' || charArray[length-1] == '^')
	    	return false;								//return false if expression end with operator
		
		for (char c : charArray) {						//returns false if digit appears after alphabet
	    	if(!(Character.isLetter(c)) && !(c == '+') && !(c == '-') && !(c == '*') && !(c == '/') && !(c == '(') && !(c == ')') && !(c == '^')) {
	    		if(!(Character.isDigit(c)))
	    			return false;
	    	}
	        else {
	        	if(c == '(')
	        	    count1++;				//storing number of opening brackets
	            else if(c == ')')
	            	count2++;				//storing number of closing brackets
	        }
	    }
		
	    if(count1 == count2)
	    	return true;					//returns true if number of opening and closing brackets are equal
	    else
	    	return false;					//returns true if number of opening and closing brackets are not equal
	}
	
	//method to check if the current character is alphabet or digit
	//only alphabet and digits are valid
	//special characters are invalid
	public static boolean isAlphabet(char c) {
		if(Character.isLetter(c) || Character.isDigit(c))
			return true;
		else
			return false;
	}
}
