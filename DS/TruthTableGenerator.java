package Com.AdvanceDS.Question2;

import java.util.*;


public class TruthTableGenerator {
	
	/** Method to generate truth table for given input 
	 * 
	 * @param input : input expression
	 */
	public void truthTableGenerator(String input) {
		
		/* input string will be furnished */
		input = furnish(input);
		
		/* after furnish also checked for validation */
		if(Validation.isExpression(input)) {
			
			/* If input string is validated successfully then this part will be executed */
			
			/* converting infix expression to post fix */
			String inputPostfix = postfixConvertor(input);
			System.out.println(inputPostfix);
			
			/* Evaluating the given post fix expression to generate truth table */
			evalPostfix(inputPostfix);
		}
		else {
			System.out.println("Enter Valid Expression");
			return;
		}
	}
	
	/** Method to furnish the input expression
	 * i.e. this method will remove pairs of '~'
	 * symbols from expression
	 * @param input :  input expression
	 * @return furnished input expression
	 */
	private String furnish(String input) {
		
		/* Traversing over the input string to furnish it
		 */
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '~') {
				if(input.charAt(i+1) == '~') {
					if(i == 0) {
						input = input.substring(i+2, input.length());
						i = -1;
					}
					else
						input = input.substring(0, i) + input.substring(i+2, input.length());
				}
			}
		}
		System.out.println(input);
		return input;
	}
	
	/** Method to count letters in the given expression
	 * 
	 * @param inputPostfix : post fix expression
	 * @return letterSet : set of unique letters
	 */
	private Set<Character> countletters(String inputPostfix) {
		
		/* defining character set */
		Set<Character> letterSet = new TreeSet<Character>();
		
		/* converting input string in character array */
		char[] chars = inputPostfix.toCharArray();
		
		/* adding unique letters from the array to the set */
		for(char c : chars) {
			if(Character.isLetter(c))
				letterSet.add(c);
		}
		
		/* returning letter set */
		return letterSet;
	}
	
	
	/** Method to evaluate post fix input expression
	 * 
	 * @param inputPostfix : post fix expression 
	 */
	private void evalPostfix(String inputPostfix) {
		
		/* letterSet will contain unique characters from
		 * the input string 
		 */
		Set<Character> letterSet = countletters(inputPostfix);
	    char res = ' ';
	    
	    /* generating binary combinations from the size of letterSet
	     * and stores them to character array
	     */
	    char[][] chars = binaryCombinations(letterSet.size());
	    
	    /* letterSetIterator1 is iterator over the letterSet */
	    Iterator<Character> letterSetIterator1 = letterSet.iterator();
	    
	    /* iterating over the set letterSet */
    	while(letterSetIterator1.hasNext()) {
    		char c = letterSetIterator1.next();
    		System.out.print(c+"\t");
    	}
    	System.out.print("Output");
    	System.out.println();
	    for(int i = 0; i < chars.length; i++) {
	    	
	    	/* input update also contains the same string as inputPostfix */
	    	String inputUpdate = inputPostfix;
	    	int j = 0;
	    	/* letterSetIterator is iterator over the set letterSet */
	    	Iterator<Character> letterSetIterator = letterSet.iterator();
	    	
	    	/* iterating over the set letterSet */ 
	    	while(letterSetIterator.hasNext()) {
	    		
	    		/* extracting character from the set */
	    		char c = letterSetIterator.next();
	    		
	    		/* replacing characters from the inputUpdate */
	    		inputUpdate = inputUpdate.replace(c, chars[i][j]);
	    		j++;
	    	}
	    	
	    	/* list is a set of characters */
		    Stack<Character> list = new Stack<Character>();
		    char c1;     // result of 1st popping
		    char c2;     // result of 2nd popping
		    
		    /* iterating over the complete input string */
		    for (j = 0; j < inputUpdate.length(); j++) {
		        char ch = inputUpdate.charAt(j);
	            if (ch == ' ') {
	            } 
	            else {
	            	/* if character is letter then push that onto the stack */
	            	if (Character.isLetter(ch)) {
	                    list.push(ch);
	                } 
	                else {
	                	/* if character is not operator
	                	 * then pop one character from stack and perform 
	                	 * not operation on that and store the result on 
	                	 * the stack
	                	 */
	                	if(ch == '~') {
	                		c1 = list.pop();
	                		list.push(operationPerform(c1, ch));
	                	}
	                	else {
	                		/* popping top two characters from stack
		                	 */
		                    c1 = list.pop();
		                    c2 = list.pop();
	
		                    switch (ch) {
		                    	/* if operator is AND operator 
		                			this case will be executed
		                    	 */
		                        case '&':
		                            list.push(operationPerform(c1,c2,'&'));
		                            break;
		                         /* if operator is OR operator 
		                			this case will be executed
		                    	 */
		                        case '|':
		                            list.push(operationPerform(c1,c2,'|'));
		                            break;
		                        /* This Code will be executed if the order of operators is invalid */
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

	/** method to perform binary operations
	 * 
	 * @param c1 : first character
	 * @param c2 : second character
	 * @param op : operator
	 * @return output character
	 */
	private Character operationPerform(char c1, char c2, char op) {
		
		/* If operator is '&' then this code will be executed */
		if(op == '&') {
			/* If both characters are 'F' then retrun false, otherwise return true */
			if(c1 == 'F' || c2 == 'F') {
				return 'F';
			}
			else
				return 'T';
		}
		/* If operator is '|' then this code will be executed */
		else {
			/* If both characters are 'T' then return true, otherwise return false */
			if(c1 == 'T' || c2 == 'T') {
				return 'T';
			}
			else
				return 'F';
		}
	}
	
	/** Method to perform boolean not operation
	 * 
	 * @param c1 : input character
	 * @param op : not operator
	 * @return output character
	 */
	private Character operationPerform(char c1, char op) {
		
		/* if input character is 'F' then return 'T', otherwise return 'T'*/
		if(c1 == 'F')
			return 'T';
		else
			return 'F';
	}
	
	/** MEthod to convert infix to post fix
	 * 
	 * @param input : input string in infix
	 * @return post fix equivalent
	 */
	private String postfixConvertor(String input) {
		Stack<Character> stackObj = new Stack<Character>();
		
		/* Calculating length of infix expression */
		int inputLength = input.length();
		String postfixExpression = "";
		Object poppedItem;
		int countBraces = 0;
		
		/* Traversing each character in the input string using for loop */
		for(int i = 0; i < inputLength; i++) {
			Character temp = new Character(input.charAt(i));
			
			/* Checking whether the character is alphabet or not*/
			if(Character.isLetter(temp))
			{
				/* If the character is alphabet, then add the character to string postfix expression */
				postfixExpression = postfixExpression + temp;
			}
			
			/* if the character is '(' then push it on the stack */
			else if(input.charAt(i) == '(')
			{
				stackObj.push(temp);
				countBraces++;
			}
			
			/* if the character is ')' then pop elements from stack and add
			 *  them to post fix String until '(' is encountered 
			 *  and then also pop the top element i.e.'(' 
			 */
			else if(temp == ')')
			{
				if(countBraces == 0)
				{
					System.out.println("Invalid Expression");
					return null;
				}
				
				
				while(!((char)stackObj.peek() == '('))
				{
					poppedItem = stackObj.pop();
					postfixExpression = postfixExpression + poppedItem;
				}
				stackObj.pop();
				countBraces--;
			}
			
			/* if the character is an operator */
			else if(temp == '&' || temp == '|' || temp == '~')
			{
				/* if stack is empty then push the operator on the stack */
				if(stackObj.size() == 0) {
					stackObj.push(temp);
				}
				else
				{
					/* is current character is '~', then this code will be executed */
					if(input.charAt(i) == '~')
					{
						/* popping characters from stack if top is '~' */
						if((char)stackObj.peek() == '~')
						{
							poppedItem = stackObj.pop();
							postfixExpression = postfixExpression + poppedItem;
						}
					}
					
					/* if current character is '&', then this code will be executed */
					else if(input.charAt(i) == '&')
					{
						/* Popping characters from top of the stack until the character is
						 * not equal to '|' or '('
						 */
						while(stackObj.peek() != '|' && stackObj.peek() != '(') {
							poppedItem = stackObj.pop();
							postfixExpression = postfixExpression + poppedItem;
							if(stackObj.size() == 0)
								break;
						}
					}
					/* if current character is '|' , then this code will be executed */
					else if(input.charAt(i) == '|')
					{
						while(stackObj.size() != 0 && stackObj.peek() != '(') {
							poppedItem = stackObj.pop();
							postfixExpression = postfixExpression + poppedItem;
						}
					}	
					
					/* adding operator to top if the operator has higher precedence than top operator */
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
		/* Returning postfix expression */
		return postfixExpression;
	}
	
	/** Method to find binary combination for a given number
	 * 
	 * @param numberOfCharacters
	 * @return character Array corresponding to binary combinations
	 */
	private char[][] binaryCombinations(int numberOfCharacters) {
	   
		/* numberOfRows will contain the number of rown in booelan array bools */
		int numberOfRows = (int)Math.pow(2, numberOfCharacters);
		
		/* creating boolean array */
	    boolean[][] bools = new boolean[numberOfRows][numberOfCharacters];
	    /* creating character array */
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
