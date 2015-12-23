/*
 * This class for checking different type of validation
 * @author Bnawari Kevat
 */
public class Validation {
	
	public static boolean isExpression(String expression) 
	{
		if(expression == null)
			return false;
		char[] expressionArray = expression.toCharArray();
		int length = expressionArray.length;
	    int openCount = 0, closeCount = 0;
	    int i = 0;
	    
	    // for two consecutive number
	    for( i = 0; i < (length-1); i++)
	    {
			
	    	if(  Character.isLetter(expressionArray[i])  )
	    	  {
	    		if( Character.isLetter( expressionArray[i+1] ) || expressionArray[i+1] == '(' )
	    				return false;
	    	  }
	    	if(expressionArray[i] == ')')
	    	{
	    		if(expressionArray[i+1] == '(')
	    				return false;
	    	}
	    	
	    	if(expressionArray[i] == ')' || Character.isLetter(expressionArray[i]))
	    	{
	    		if(expressionArray[i+1] == '~')
	    				return false;
	    	}
	    	
	    	if(expressionArray[i] == '&' || expressionArray[i] == '|')
	    	{
	    		if(expressionArray[i+1] == '&' || expressionArray[i+1] == '|')
	    				return false;
	    	}
	    }

	    // for first character and last character
	    if(expressionArray[0] == '&' || expressionArray[0] == '|' || expressionArray[length-1] == '&' || expressionArray[length-1] == '|' || expressionArray[length-1] == '~')
	    	return false;
	    
	    // acceptable symbols number or open and closed braces */
	   for (char c : expressionArray) 
	    {
	    	if(!(Character.isLetter(c)) && !(c == '&') && !(c == '|') && !(c == '~') && !(c == '(') && !(c == ')')) {
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
}
