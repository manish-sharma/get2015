/**main class for performing stack operations
 * 
 * @author Gaurav Saini
 * Date : 27/08/2015
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainStackClass {
	
	//main method
	public static void main(String args[]) {
		
		Stack<Object> object = new Stack<Object>();				//create a new stack
		BufferedReader br = null;								//br is buffered reader object to read input
		String value, infix;							//value holds the item to push in the stack
														//infix holds the input infix expression
		int choice;
		Scanner scan = null;
		Object result;
		Node<Object> first = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			scan = new Scanner(System.in);
			do {								//printing the menu
				System.out.println("1. push");
				System.out.println("2. pop");
				System.out.println("3. peep");
				System.out.println("4. print the stack");
				System.out.println("5. clear the stack");
				System.out.println("6. convert infix to postfix");
				System.out.println("7. exit");
				do {
					System.out.println("enter choice");
					while (!scan.hasNextInt()) {
						System.out.println("enter valid choice");
						scan.next();
					}
					choice = scan.nextInt();
				} while (choice <= 0);
				
				switch(choice) {
					case 1:						//push value to stack
						System.out.println("Enter value to insert : ");
						value = br.readLine();
						first = object.push(value, first);
						break;
						
					case 2:						//pop value from stack
						result = object.pop(first);
						if(result == null)
							System.out.println("Stack is empty");
						else
							System.out.println(result);
						break;
						
					case 3:						//get top value from stack
						result = object.peep(first);
						System.out.println(result);
						break;

					case 4:						//show the stack
						object.display(first);
						break;	
						
					case 5:						//remove all values from stack
						object.clear();
						break;
						
					case 6:						//convert infix to postfix
						System.out.println("Enter infix expression");
						object.clear();
						do {
							infix = br.readLine();			//reading infix expression
							if(!(Validation.isValidExpression(infix)))			//checking validity of expression
								System.out.println("Enter valid expression");
							else
								break;
						} while(true);
						String postfix = object.convertToPostfix(infix, first);		//converting the expression to postfix notation
						System.out.println("postfix expression is : " + postfix + "\n");
						break;
					
					case 7:		//exit system
						System.exit(0);
				} 
			} while(true);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}