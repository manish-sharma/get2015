import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String args[]) {
		
		/* Initialization */
		Stack<Object> object = new Stack<Object>();
		BufferedReader bufferedReaderObj = null;
		String inputItem, infix;
		int choice;
		Object result;
		Node<Object> first = null;
		try
		{
			bufferedReaderObj = new BufferedReader(new InputStreamReader(System.in));
			do
			{
				/* Displaying Menu */
				
				System.out.println("Press 1 to push an element onto stack");
				System.out.println("press 2 pop from stack");
				System.out.println("Press 3 to peek from stack");
				System.out.println("Press 4 to display the stack");
				System.out.println("press 5 to clear the stack");
				System.out.println("Press 6 to convert infix to postfix");
				System.out.println("Press 7 to Exit");
				
				choice = Validation.isInteger();
				
				/* Switch case based on user's Choice */
				switch(choice)
				{
					/* Case to push an element */
					case 1:
						System.out.println("Enter an element to be inserted");
						inputItem = bufferedReaderObj.readLine();
						first = object.push(inputItem, first);
						if(first == null)
						{
							System.out.println("Some problem occured in insertion, try again");
						}
						break;
						
						/* Case to pop an element */
					case 2:
						/* result will contain the popped element, and if the stack
						 * is empty then result will contain null
						 */
						result = object.pop(first);
						
						if(result == null)
						{
							System.out.println("Stcak is empty");
						}
						else
						{
							System.out.println("Popped Element is: "+result);
						}
						break;
						
						/* Case to peek an element from stack */
					case 3:
						/* result will contain the peeked element, and if the stack
						 * is empty then result will contain null
						 */
						result = object.peek(first);
						if(result == null)
						{
							System.out.println("Stcak is empty");
						}
						else
						{
							System.out.println("Element at top of the stack is: "+result);
						}
						break;
						
						/* Case to display the stack */
					case 4:
						object.display(first);
						break;	
						
						/* Case to clear the stack */
					case 5:
						boolean output = object.clear();
						if(output == true)
							System.out.println("Stack is cleared Successfully");
						else
							System.out.println("Stack is already Empty");
						break;
						
						/* Case to conversion from infix to postfix */
					case 6:
						System.out.println("Enter input infix expression");
						object.clear();
						do
						{
							infix = bufferedReaderObj.readLine();
							if(!(Validation.isExpression(infix)))
								System.out.println("Enter valid expression");
							else
								break;
						}
						while(true);
						String postfix = object.infixToPostfix(infix, first);
						if(postfix == null)
						{
							System.out.println("Problem Occured, try again");
						}
						else
						{
							System.out.println("PostFix Expression is: " + postfix);
						}
						break;
					
						/*Exit Case */
					case 7:
						System.out.println("System Exited");
						System.exit(0);
						
			
						/* default case */
					default:
						System.out.println("Enter Correct Choice");
				} 
				
			} while(true);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
