package InfixToPostfix;

public class InfixToPostfixConversion extends StackNode {

	/**
	 * infixToPostfix is a function which is used to convert infix string to postfix string 
	 *  this function use the stack to store the operator  and operand is store in string 
	 */
	String infixToPostfix(String infix) {

		StackNode temp1 = start;
		StackNode temp = new StackNode();
		char ch;
		String postfix = "";

		int i = 0;
		if (infix.charAt(0) != '(') 
		{
			infix = '(' + infix + ')';
		}
		temp.push(infix.charAt(0));

		for (i = 1; i < infix.length(); i++) 
		{
			if ((Character.isDigit(infix.charAt(i)))
					|| (Character.isLetter(infix.charAt(i)))) 
			{
				postfix = postfix + infix.charAt(i);
			} 
			else 
			{
				if (start == null) 
				{

					temp.push(infix.charAt(i));
				} 
				else 
				{
					ch = (char) temp.peep();
					if ((infix.charAt(i) == '+') || (infix.charAt(i) == '-'))
					{
						if (ch == '*' || ch == '/') 
						{
							postfix = postfix + ch;

							temp.pop();
						}

						ch = (char) temp.peep();
						if (ch == '+' || ch == '-') {
							postfix = postfix + ch;
							temp.pop();
						}

						temp.push(infix.charAt(i));
					}
					else if ((infix.charAt(i) == '*')
							|| (infix.charAt(i) == '/'))
                      {
						if (ch == '*' || ch == '/')
						{
							postfix = postfix + ch;
							temp.pop();
						}
						temp.push(infix.charAt(i));
					} 
					else if (infix.charAt(i) == '(')
					{
						temp.push(infix.charAt(i));

					}
					else if (infix.charAt(i) == ' ') 
					{

					} 
					else if (infix.charAt(i) == ')') 
					{
						ch = (char) temp.peep();
						while (ch != '(') {
							postfix = postfix + ch;
							temp.pop();
							ch = (char) temp.peep();
					}
						temp.pop();
					}
				}
			}
		}
		
		while (start != null) {
			ch = (char) temp.peep();
			temp.pop();
			postfix = postfix + ch;
		}
		start = temp1;
		return postfix;
	}
}
