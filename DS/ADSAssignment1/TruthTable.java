package Question2;

import java.util.Stack;

public class TruthTable {

	Stack<Character> infix=new Stack<Character>(); 
	int precedence1;
	String strPostfix = "";
	
	public String infixConversion ( String booleanExpression )
	{
		int precedence;
		
		for ( int index = 0; index < booleanExpression.length(); index++ )
		{
			char charInfix = booleanExpression.charAt(index);
			
			precedence = checkPrecedence ( charInfix);
			
			if ( precedence == 0 )         // if item in input string is character
				strPostfix = strPostfix + charInfix;
			else if ( precedence == 2 ){    // if item is  = '('   , push it
				infix.push(charInfix);
			}
			else if ( precedence == 1 )    // if item is  = ')'   , pop items till '(' comes, and pop '('  also
 			{
				while ( infix.peek() != '(' )
				{
					Object item = infix.pop();
					strPostfix = strPostfix.concat(item.toString());
				}
				int item = infix.pop();
			}
			else
				infixToPostfix ( precedence, charInfix, infix);
		}
		
		// pops operators left in stack
		while ( infix.isEmpty() == false )
			strPostfix += infix.pop();
		
		return strPostfix;
		
	}
	
	
	// assigns precedence to operators
	public int checkPrecedence ( char charInfix )
	{
		int precedence = 0;
		switch ( charInfix )
		{
			case '!' : precedence = 5;
					   break;
					   
			case '&' : precedence = 4;
			   		   break;
				
			case '|' : precedence = 3;
					   break;
			
			case '(' : precedence = 2;
					   break;
					   
			case ')' : precedence = 1;
				   	   break;
				   
			default : precedence = 0; 
		}
		return precedence;
	}
	
	// push and pop items in stack based on precedence
	public void infixToPostfix( int precedence2, char charInfix, Stack<Character> infix )
	{
		if ( infix.isEmpty() == false )
		{	
			while ( infix.isEmpty() == false )
			{
				if ( infix.peek().equals("(") || infix.peek().equals(")") );  // do nothing
				else
				{
					int precedence3 = checkPrecedence ( infix.peek().toString().charAt(0));
					// if incoming char has lower precedence then char at top of stack, then pop element from stack
					if ( precedence3 >= precedence2 )
					{
						Object item = infix.pop();
						strPostfix = strPostfix.concat(item.toString());    // concatenate popped item in output string
					}
					else
						break;
				}
			}
			infix.push( charInfix );     // push incoming char, after items in stack of greater precedence were popped
		}	
		else      // if stack is empty, push item in it
			infix.push( charInfix );
	}
	
	// set values of variables in expression
		public String getVariablesInExpresssion( String booleanExpressionPostfix )
		{
			String str = "";
			for ( int index=0; index<booleanExpressionPostfix.length(); index++ )
			{
				if( booleanExpressionPostfix.charAt(index) != '&' && booleanExpressionPostfix.charAt(index) != '|' && booleanExpressionPostfix.charAt(index) != '!')
				{
					if (!str.contains(booleanExpressionPostfix.charAt(index)+""))
						str += booleanExpressionPostfix.charAt(index);
				}
			}
			return str;
		}
		
		// evaluates postfix expression and generates truth table for expression
		public void generateTruthTable( String booleanExpressionPostfix, String str )
		{
			// checks for all possible cases of truth table
			for ( int index=0; index<(int)Math.pow(2,str.length()); index++ )
			{
				// creates boolean array corresponding to all operands in the expression
				boolean bool[]=new boolean[str.length()];
				for (int j=str.length()-1; j>=0; j--) {
	               bool[j]= ((index/(int) Math.pow(2, j))%2) !=0;
	               System.out.print(bool[j]+"\t");
				}

				Stack<Boolean> postfix  = new Stack<Boolean> (); 
				boolean result = false;
				for ( int index2 = 0; index2 < booleanExpressionPostfix.length(); index2++ )
				{
					char charPostfix = booleanExpressionPostfix.charAt(index2);
					if ( charPostfix != '&' && charPostfix != '|' && charPostfix != '!' )
					{
						int position = str.indexOf(charPostfix);
						postfix.push(bool[str.length()-1-position]);
					}
					else  
				    {  
						boolean item1 = postfix.pop();
						boolean item2=false;
						if(charPostfix != '!'){
						item2 = postfix.pop(); 
						}
				        switch(charPostfix)  
				        {  
				           case '&' : result = item1 & item2;
				              		  break;  
				           case '|' : result = item1 | item2;    
				              		 break;  
				           case '!' : result = !item1;   
				              		   break;   
				         }  
				        // result of boolean expression is returned
				        postfix.push(result);  
				     }  
				    
				}
				boolean answer = postfix.pop();
				System.out.print(answer+"\n");
			}
		}
}
