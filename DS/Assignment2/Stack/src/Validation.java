import java.util.Scanner;


public class Validation {

	/** Method to validate expression
	 * 
	 * @param expression : expression to validate 
	 * @return true if validated, false otherwise
	 */
	public static boolean isExpression(String expression) 
	{
	    
		if(expression == null)
			return false;
		char[] expressionArray = expression.toCharArray();
		int length = expressionArray.length;
	    int openCount = 0, closeCount = 0;
	    int i = 0;
	    
	    /* validation for two consecutive letters or numbers */
	    for(i = 0; i < expressionArray.length-1; i++)
	    {
	    	if((Character.isLetter(expressionArray[i])))
	    	{
	    		if(Character.isLetter(expressionArray[i+1]) || expressionArray[i+1] == '(')
	    				return false;
	    	}
	    }
	    
	    for(i = 0; i < expressionArray.length-1; i++)
	    {
	    	if(expressionArray[i] == ')')
	    	{
	    		if(expressionArray[i+1] == '(')
	    				return false;
	    	}
	    }
	    
	    /* validation for two consecutive operators or numbers */
	    for(i = 0; i < expressionArray.length-1; i++)
	    {
	    	if(expressionArray[i] == '+' || expressionArray[i] == '/' || expressionArray[i] == '*' || expressionArray[i] == '-' || expressionArray[i] == '^')
	    	{
	    		if(expressionArray[i+1] == '+' || expressionArray[i+1] == '/' || expressionArray[i+1] == '*' || expressionArray[i+1] == '-' || expressionArray[i+1] == '^' || expressionArray[i+1] == ')')
	    				return false;
	    	}
	    }
	    
	    /* validation for first character is operator */
	    if(expressionArray[0] == '+' || expressionArray[0] == '/' || expressionArray[0] == '*' || expressionArray[0] == '-' || expressionArray[0] == '^')
	    	return false;
	    
	    /* validation for last character is operator */
	    if(expressionArray[length-1] == '+' || expressionArray[length-1] == '/' || expressionArray[length-1] == '*' || expressionArray[length-1] == '-' || expressionArray[length-1] == '^')
	    	return false;
	    
	    
	    /* Vlidation for acceptable symbola number or open and closed braces */
	   for (char c : expressionArray) 
	    {
	    	if(!(Character.isLetter(c)) && !(c == '+') && !(c == '-') && !(c == '*') && !(c == '/') && !(c == '(') && !(c == ')') && !(c == '^')) {
	    		if(!(Character.isDigit(c)))
	    		return false;
	    	}
	        else
	        {
	        	if(c == '(')
	        		openCount++;
	            else if(c == ')')
	            	closeCount++;
	        }
	    }
	    if(openCount == closeCount)
	    	return true;
	    else
	    	return false;
	}
	
	/** Method to check whether the character is alphabate or not
	 * 
	 * @param c which is to be checked
	 * @return true if character is alphabate or digit, false otherwise
	 */
	public static boolean isAlphabateOrDigit(char c)
	{
		if(Character.isLetter(c) || Character.isDigit(c))
			return true;
		else
			return false;
	}
	
	/** Method for integer input validation
	 * 
	 * @return input number
	 */
	public static int isInteger() {
		Scanner scan = new Scanner(System.in);
		while (!scan.hasNextInt()) {
			System.out.println("That's not an integer!Please enter again");
			scan.next();
			}
		int choice = scan.nextInt();
		return choice;
	}
}
