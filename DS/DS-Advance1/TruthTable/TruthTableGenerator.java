/*
 * This class generate the truth table of a regular expression
 * @author Bnawari kevat
 */
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
public class TruthTableGenerator {
	
	public void truthTableGenerator(String input) 
	{
		input = furnish(input);
		if(Validation.isExpression(input)) {
			String inputPostfix = postfixConvertor(input);
			System.out.println(inputPostfix);
			evalPostfix(inputPostfix);
		}
		else {
			System.out.println("Enter Valid Expression");
		}
	}
	//this will remove two continuous ~
	private String furnish(String input) 
	{
		for(int i = 0; i < input.length(); i++)
		{
			if(input.charAt(i) == '~') 
			{
				if(input.charAt(i+1) == '~') 
				{
					if(i == 0) 
					{
						input = input.substring(i+2, input.length());
						i = -1;
					}
					else
						input = input.substring(0, i) + input.substring(i+2, input.length());
				}
			}
		}
		return input;
	}
	
	private Set<Character> countletters(String inputPostfix)
	{
		Set<Character> letterSet = new TreeSet<Character>();
		char[] chars = inputPostfix.toCharArray();
		for(char c : chars) {
			if(Character.isLetter(c))
				letterSet.add(c);
		}
		return letterSet;
	}
	private void evalPostfix(String inputPostfix) 
	{
			
		Set<Character> letterSet = countletters(inputPostfix);
	    char res = ' ';
	    char[][] chars = binaryCombinations(letterSet.size());
	    Iterator<Character> letterSetIterator1 = letterSet.iterator();
    	while(letterSetIterator1.hasNext()) {
    		char c = letterSetIterator1.next();
    		System.out.print(c+"\t");
    	}
    	System.out.print("Output");
    	System.out.println();
	    for(int i = 0; i < chars.length; i++)
	    {
	    	String inputUpdate = inputPostfix;
	    	int j = 0;
	    	Iterator<Character> letterSetIterator = letterSet.iterator();
	    	
	    	while(letterSetIterator.hasNext()) 
	    	{
	    		char c = letterSetIterator.next();
	    		inputUpdate = inputUpdate.replace(c, chars[i][j]);
	    		j++;
	    	}
		    Stack<Character> list = new Stack<Character>();
		    char c1;     //result of 1st popping
		    char c2;     // result of 2nd popping
		    for (j = 0; j < inputUpdate.length(); j++) {
		        char ch = inputUpdate.charAt(j);
	            if (ch == ' ') {
	            } 
	            else {
	            	if (Character.isLetter(ch)) {
	                    list.push(ch);
	                } 
	                else {
	                	if(ch == '~') {
	                		c1 = list.pop();
	                		list.push(operationPerform(c1, ch));
	                	}
	                	else {
		                    c1 = list.pop();
		                    c2 = list.pop();
	
		                    switch (ch) {
		                        case '&':
		                            list.push(operationPerform(c1,c2,'&'));
		                            break;
		                        case '|':
		                            list.push(operationPerform(c1,c2,'|'));
		                            break;
		                        default:
		                            System.out.println("Invalid operator order!");
		                    }
	                	}
	                }
	            }
		    }
		    res =  list.pop();
		    for(int count = 0; count < chars[0].length; count++) {
		    	System.out.print(chars[i][count]+"\t");
		    }
		    System.out.println(res);
		}
	}
    //this method perform binary operation based on operator op
	private Character operationPerform(char c1, char c2, char op) {
		if(op == '&') {
			if(c1 == 'F' || c2 == 'F') {
				return 'F';
			}
			else
				return 'T';
		}
		
		else {
			if(c1 == 'T' || c2 == 'T') {
				return 'T';
			}
			else
				return 'F';
		}
	}
	
	//this method perform unary operation based on operator op
	private Character operationPerform(char c1, char op) {
		if(c1 == 'F')
			return 'T';
		else
			return 'F';
	}
	
	//This method take infix expression and return postfix expression
	private String postfixConvertor(String input)
	{
		Stack<Character> stackObj = new Stack<Character>();
		
		// Calculating length of infix expression
		int inputLength = input.length();
		String postfixExpression = "";
		Object poppedItem;
		int countBraces = 0;
		
		// Traversing each character in the input string using for loop 
		for(int i = 0; i < inputLength; i++) {
			Character temp = new Character(input.charAt(i));
			
			// Checking whether the character is alphabet or digit 
			if(Character.isLetter(temp))
			{
				// Adding the character to string postfix expression 
				postfixExpression = postfixExpression + temp;
			}
			
			// if the character is '(' then push it on the stack 
			else if(input.charAt(i) == '(')
			{
				stackObj.push(temp);
				countBraces++;
			}
			
			/* if the character is ')' then pop elements from stack and add
			 *  them to postfix String until '(' is encountered 
			 *  and then also pop the top element i.e.'(' 
			 */
			else if(temp == ')')
			{
				if(countBraces == 0)
				{
					System.out.println("Invalid Expression");
					return null;
				}
				
				// retrieving top elemetns from stack 
				while(!((char)stackObj.peek() == '('))
				{
					poppedItem = stackObj.pop();
					postfixExpression = postfixExpression + poppedItem;
				}
				stackObj.pop();
				countBraces--;
			}
			
			// if the character is an operator 
			else if(temp == '&' || temp == '|' || temp == '~')
			{
				// if stack is empty then push the operator on the stack 
				if(stackObj.size() == 0) {
					stackObj.push(temp);
				}
				else
				{
					// is current character is '^', then this code will be executed 
					if(input.charAt(i) == '~')
					{
						// popping characters from stack if top is '^' 
						if((char)stackObj.peek() == '~')
						{
							poppedItem = stackObj.pop();
							postfixExpression = postfixExpression + poppedItem;
						}
					}
					
					// if current character is '*' or '/', then this code will be executed 
					else if(input.charAt(i) == '&')
					{
						while(stackObj.peek() != '|' && stackObj.peek() != '(') {
							poppedItem = stackObj.pop();
							postfixExpression = postfixExpression + poppedItem;
							if(stackObj.size() == 0)
								break;
						}
					}
					// if current character is '+' or '-', then this code will be executed 
					else if(input.charAt(i) == '|')
					{
						while(stackObj.size() != 0 && stackObj.peek() != '(') {
							poppedItem = stackObj.pop();
							postfixExpression = postfixExpression + poppedItem;
						}
					}	
					
					// adding operator to top if the operator has higher precedence than top operator 
					stackObj.push(temp);
				}
			}
		}
		
		/* After complete traversal of input expression,
		 * all the elements of stack are added to postfix string 
		 */
		while(stackObj.size() != 0)
		{
			poppedItem = stackObj.pop();
			postfixExpression = postfixExpression + poppedItem;
		}
		return postfixExpression;
	}
	
	//This method returns the truth table in the form of 2-D array
	private char[][] binaryCombinations(int numberOfCharacters)
	{
	    int numberOfRows = (int)Math.pow(2, numberOfCharacters);
	    boolean[][] bools = new boolean[numberOfRows][numberOfCharacters];
	    char[][] chars = new char[numberOfRows][numberOfCharacters];
	    for(int i = 0;i<bools.length;i++)
	    {
	        for(int j = 0; j < bools[i].length; j++)
	        {
	            int val = bools.length * j + i;
	            int ret = (1 & (val >>> j));
	            bools[i][j] = ret != 0;
	            if(bools[i][j]) {
	            	chars[i][j] = 'T';
	            }
	            else {
	            	chars[i][j] = 'F';
	            }
	        }
	    }
	    return chars;
	}
}
