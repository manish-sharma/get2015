public class Validation {

	// Method to  check validate expression
	public static boolean isExpression(String expression) 
	{
		if(expression == null)
			return false;
		char[] expressionArray = expression.toCharArray();
		int length = expressionArray.length;
	    int openCount = 0, closeCount = 0;
	    int i = 0;
	    
	    for(i = 0; i < (length-1); i++)
	    {   	
	    	if(expressionArray[i] == ')')
	    	{
	    		if(Character.isDigit(expressionArray[i+1]) || expressionArray[i+1] == '(')
	    				return false;
	    	}
	    	
	    	if(expressionArray[i] == '(')
	    	{
	    		if(expressionArray[i+1] == ',')
	    				return false;
	    	}
	    	
	    	if(expressionArray[i] == ',')
	    	{
	    		if(expressionArray[i+1] == ')' || expressionArray[i+1] == ',')
	    				return false;
	    	}
	    	
	    	if(Character.isDigit(expressionArray[i])) {
	    		if(expressionArray[i+1] == '(') {
	    			return false;
	    		}
	    	}
	    }
	    
	    /* Validation for first character and last character*/
	    if(expressionArray[0] != '(' || expressionArray[length-1] != ')')
	    	return false;
	    
	    /* Validation for acceptable symbols number or open and closed braces */
	   for (i = 0; i < (length); i++) 
	    {
	    	if(!(Character.isDigit(expressionArray[i])) && !(expressionArray[i] == ',') && !(expressionArray[i] == '(') && !(expressionArray[i] == ')')) {
	    		return false;
	    	}
	        else if(expressionArray[i] == '(' || expressionArray[i] == ')')
	        {
	        	if(expressionArray[i] == '(')
	        		openCount++;
	            else if(expressionArray[i] == ')')
	            	closeCount++;
	        }
	        if(openCount == closeCount) {
	        	if(!(i == (length -1))) {
	        		return false;
	        	}
	        }
	    }
	    if(openCount == closeCount)
	    	return true;
	    else
	    	return false;
	}
}
