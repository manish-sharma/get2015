/**
 * to check the validity of the input
 * @author Ravika
 * @since 10/5/2015
 */
public class Validation {

	/** Method to validate expression
	 * 
	 * @param expression : expression to validate 
	 * @return true if validated, false otherwise
	 */
	public static boolean isExpression(String expression) 
	{
		if(expression == null || expression.length() == 0)
			return false;
		char[] expressionArray = expression.toCharArray();
		int length = expressionArray.length;
	    int openCount = 0, closeCount = 0;
	    int i = 0;
	    
	    for(i = 0; i < (length-1); i++)
	    {
			
	    	if((Character.isLetter(expressionArray[i])))
	    	{
	    		if(Character.isLetter(expressionArray[i+1]) || expressionArray[i+1] == '(')
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
	    	
	    	if(expressionArray[i] == '~')
	    	{
	    		if(expressionArray[i+1] == ')')
	    				return false;
	    	}
	    }

	    if(expressionArray[0] == '&' || expressionArray[0] == '|' || expressionArray[length-1] == '&' || expressionArray[length-1] == '|' || expressionArray[length-1] == '~')
	    	return false;
	    
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
