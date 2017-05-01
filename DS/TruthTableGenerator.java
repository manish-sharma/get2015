import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

/**
 * to generate the truth table
 * @author Ravika
 * @since 10/5/2015
 */
public class TruthTableGenerator {
	
	/** Method to generate truth table for given input 
	 * 
	 * @param input : input expression
	 */
	public void truthTableGenerator(String input) {
		input = furnish(input);
		if(Validation.isExpression(input)) {
		
			/* converting infix expression to postfix */
			String inputPostfix = postfixConvertor(input);
			System.out.println(inputPostfix);
			
			/* Evaluating the given postfix expression to generate truth table */
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
	 * @param inputPostfix : postfix expression
	 * @return letterSet : set of unique letters
	 */
	private Set<Character> countletters(String inputPostfix) {
		
		
		Set<Character> letterSet = new TreeSet<Character>();
		
		char[] chars = inputPostfix.toCharArray();
		
		for(char c : chars) {
			if(Character.isLetter(c))
				letterSet.add(c);
		}
		
		return letterSet;
	}
	
	
	/** Method to evaluate postfix input expression
	 * 
	 * @param inputPostfix : postfix expression 
	 */
	private void evalPostfix(String inputPostfix) {
		
		
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
	    for(int i = 0; i < chars.length; i++) {
	    	
	    	String inputUpdate = inputPostfix;
	    	int j = 0;
	    	Iterator<Character> letterSetIterator = letterSet.iterator();
	    	
	    	while(letterSetIterator.hasNext()) {
	    		
	    		char c = letterSetIterator.next();
	    		
	    		inputUpdate = inputUpdate.replace(c, chars[i][j]);
	    		j++;
	    	}
	    	
		    Stack<Character> list = new Stack<Character>();
		    char c1;     
		    char c2;    
		    
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

	/** method to perform binary operations
	 * 
	 * @param c1 : first character
	 * @param c2 : second character
	 * @param op : operator
	 * @return output character
	 */
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
	
	/** Method to perform boolean not operation
	 * 
	 * @param c1 : input character
	 * @param op : not operator
	 * @return output character if input character is 'F' then retrun 'T', otherwise return 'T'
	 */
	private Character operationPerform(char c1, char op) {
		

		if(c1 == 'F')
			return 'T';
		else
			return 'F';
	}
	
	/** MEthod to convert infix to postfix
	 * 
	 * @param input : input string in infix
	 * @return postfix equivalent
	 */
	private String postfixConvertor(String input) {
		Stack<Character> stackObj = new Stack<Character>();
		
		int inputLength = input.length();
		String postfixExpression = "";
		Object poppedItem;
		int countBraces = 0;
		
		for(int i = 0; i < inputLength; i++) {
			Character temp = new Character(input.charAt(i));
			
			if(Character.isLetter(temp))
			{
				postfixExpression = postfixExpression + temp;
			}
			
			else if(input.charAt(i) == '(')
			{
				stackObj.push(temp);
				countBraces++;
			}
			
			
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
			
			else if(temp == '&' || temp == '|' || temp == '~')
			{
				if(stackObj.size() == 0) {
					stackObj.push(temp);
				}
				else
				{
					if(input.charAt(i) == '~')
					{
						if((char)stackObj.peek() == '~')
						{
							poppedItem = stackObj.pop();
							postfixExpression = postfixExpression + poppedItem;
						}
					}
					
					else if(input.charAt(i) == '&')
					{
						
						while(stackObj.peek() != '|' && stackObj.peek() != '(') {
							poppedItem = stackObj.pop();
							postfixExpression = postfixExpression + poppedItem;
							if(stackObj.size() == 0)
								break;
						}
					}
					else if(input.charAt(i) == '|')
					{
						
						while(stackObj.size() != 0 && stackObj.peek() != '(') {
							poppedItem = stackObj.pop();
							postfixExpression = postfixExpression + poppedItem;
						}
					}	
					
					stackObj.push(temp);
				}
			}
		}
		
		
		while(stackObj.size() != 0)
		{
			poppedItem = stackObj.pop();
			postfixExpression = postfixExpression + poppedItem;
		}
		return postfixExpression;
	}
	
	/** Method to find binary combination for a given number
	 * 
	 * @param numberOfCharacters
	 * @return character Array corresponding to binary combinations
	 */
	private char[][] binaryCombinations(int numberOfCharacters) {
	   
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
