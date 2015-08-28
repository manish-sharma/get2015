import java.util.Scanner;

/**
 * @author Sumitra
 *this is the main class and will call the methods to be required.
 */
public class Postfix {
	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
		StackOperator stack = new StackOperator();
		System.out.println("enter the input");
		String infix = scanner.next();
		int i = 0;
		String result = "";
		while (i != infix.length()) {
			if (isOperator(infix.charAt(i))) {
				
				if(stack.isEmpty() && isOperator(infix.charAt(i)) && infix.charAt(i)!='(' && infix.charAt(i)!=')')
				{
					stack.push(infix.charAt(i));
					i++;
				}
				else
					if(infix.charAt(i)=='(' || (infix.charAt(i)==')'))
					{
						//while(infix.charAt(i)!=')')
						{
							//stack.push(infix.charAt(i));
							i++;
						}
						
					}
					
					else
				if(precedenceOfStack(stack.topData())>=precedenceOfInput(infix.charAt(i)))
				{
					if(infix.charAt(i)=='(')
					{
						i++;
					}
					else
						 if(infix.charAt(i)==')')
						 {
							 i++;
						 }
						 else
						 {
					stack.push(infix.charAt(i));
					i++;
						 }
				}
				else
					if(precedenceOfStack(stack.topData())<precedenceOfInput(infix.charAt(i)))
					{
						while(!stack.isEmpty() && precedenceOfStack(stack.topData())<precedenceOfInput(infix.charAt(i)) ){
							result+=stack.pop();
						}
					}
					
			}
			else {
				result += infix.charAt(i);
				i++;
			}
		}
		while(!stack.isEmpty())
		{
			result+=stack.pop();
			
		}
		System.out.println(result);
		scanner.close();
	}
/**
 * will return the precedence of operator
 * @param ch operator whose precedence we have to check
 * @return will return the precedence;
 */
	static int precedenceOfStack(char ch) {
		
		if (ch == '^')
			return 1;
		else if (ch == '*' || ch == '/')
			return 2;
		else if (ch == '+' || ch == '-')
			return 3;
		
			 return 10;
		
	}
	/**
	 * will return the precedence of operator
	 * @param ch operator whose precedence we have to check
	 * @return will return the precedence;
	 */
	static int precedenceOfInput(char ch) {
			if (ch == '^')
			return 1;
		else if (ch == '*' || ch == '/')
			return 2;
		else if (ch == '+' || ch == '-')
			return 3;
		return 10;
	}
	/**
	 * 
	 * @param ch character 
	 * @return either a alphabet or a operator
	 */
	static boolean isOperator(char ch)
	{
		if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='(' || ch==')' || ch=='^'){
			return true;
		}
		return false;
	}
}
