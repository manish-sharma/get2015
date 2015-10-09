/**
 * @author Girdhari
 * Program to print truth table of a expression
 */
package assignment2;

public class Validation {

	/* Starting of isExpression method */
	public static boolean isExpression(String expression) 
	{
		if(expression == null || expression.length() == 0)
			return false;
		char[] expressionArray = expression.toCharArray();
		int length = expressionArray.length;
	    int count = 0;
	    int counter = 0;
	    
	    for(counter = 0; counter < (length-1); counter++)
	    {
			
	    	if((Character.isLetter(expressionArray[counter])))
	    	{
	    		if(Character.isLetter(expressionArray[counter+1]) || expressionArray[counter+1] == '(')
	    				return false;
	    	}
	    	if(expressionArray[counter] == ')')
	    	{
	    		if(expressionArray[counter+1] == '(')
	    				return false;
	    	}
	    	
	    	if(expressionArray[counter] == ')' || Character.isLetter(expressionArray[counter]))
	    	{
	    		if(expressionArray[counter+1] == '~')
	    				return false;
	    	}
	    	
	    	if(expressionArray[counter] == '&' || expressionArray[counter] == '|')
	    	{
	    		if(expressionArray[counter+1] == '&' || expressionArray[counter+1] == '|')
	    				return false;
	    	}
	    	
	    	if(expressionArray[counter] == '~')
	    	{
	    		if(expressionArray[counter+1] == ')')
	    				return false;
	    	}
	    }

	    if(expressionArray[0] == '&' || expressionArray[0] == '|' || expressionArray[length-1] == '&' || expressionArray[length-1] == '|' || expressionArray[length-1] == '~')
	    	return false;
	    
	   for (char character : expressionArray) 
	    {
	    	if(!(Character.isLetter(character)) && !(character == '&') && !(character == '|') && !(character == '~') && !(character == '(') && !(character == ')') && !(character == ' ')) {
	    		return false;
	    	}
	        else
	        {
	        	if(character == '(')
	        		count++;
	            else if(character == ')')
	            	count--;
	        }
	    }
	    if(count == 0)
	    	return true;
	    else
	    	return false;
	}
	/* Ending of isExpression method */
}
