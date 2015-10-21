package TrurhTable;
/**
 * This class is used to validate the string that it is correct or not
 */
public class Validation {

    /**
     *This function is used to validate the string given by the user 
     * @param expression: expression to validate
     * @return true if validated, false otherwise
     */
    public static boolean isExpression(String expression) {
	if (expression == null)
	    return false;
	char[] expressionArray = expression.toCharArray();
	int length = expressionArray.length;
	int openCount = 0, closeCount = 0;
	int traverse = 0;

	/* validation for two consecutive letters or numbers */
	for (traverse = 0; traverse < (length - 1); traverse++) {

	    if ((Character.isLetter(expressionArray[traverse]))) {
		if (Character.isLetter(expressionArray[traverse + 1])
			|| expressionArray[traverse + 1] == '(')
		    return false;
	    }
	    if (expressionArray[traverse] == ')') {
		if (expressionArray[traverse + 1] == '(')
		    return false;
	    }

	    if (expressionArray[traverse] == ')'
		    || Character.isLetter(expressionArray[traverse])) {
		if (expressionArray[traverse + 1] == '~')
		    return false;
	    }

	    if (expressionArray[traverse] == '&'
		    || expressionArray[traverse] == '|') {
		if (expressionArray[traverse + 1] == '&'
			|| expressionArray[traverse + 1] == '|')
		    return false;
	    }
	}

	/* validation for first character is operator */
	if (expressionArray[0] == '&' || expressionArray[0] == '|'
		|| expressionArray[length - 1] == '&'
		|| expressionArray[length - 1] == '|'
		|| expressionArray[length - 1] == '~')
	    return false;

	/* Validation for acceptable symbols number or open and closed braces */
	for (char character : expressionArray) {
	    if (!(Character.isLetter(character)) && !(character == '&') && !(character == '|')
		    && !(character == '~') && !(character == '(') && !(character == ')')) {
		return false;
	    } else {
		if (character == '(')
		    openCount++;
		else if (character == ')')
		    closeCount++;
	    }
	}
	if (openCount == closeCount)
	    return true;
	else
	    return false;
    }
}
