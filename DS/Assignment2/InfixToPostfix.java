import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InfixToPostfix {
	
	
	public static void main(String args[])
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String infixString="";
		do 
		{
			System.out.print("Enter Infix Expression\t");
			try 
			{
				infixString=bufferedReader.readLine().trim();
			}
			catch(IOException io)
			{
				System.out.println("Error Occured");
				System.exit(1);
			}
			if(infixString.equals(""))
			{
				System.out.println("Please enter correct input");
				continue;
			}
			break;
		}while(true);
		String postfixString=infixToPostfixConversion(infixString);
		System.out.println("Post Fix Conversion is  "+postfixString);
	}
	
	public static String  infixToPostfixConversion(String infixString)
	{
		String postfixString="";
		char infixArray[] = infixString.toCharArray();
		int index=0;
		int priority=0;
		StackOperation<Character> stackOperation= new StackOperation<Character>();
		StackNode<Character> Top =null;
		while( index < infixArray.length )
		{
			if(infixArray[index]==' '||infixArray[index]=='\t')// if character is tab or space
			{
				index++;
				continue;
			}
			if(isAlphaNumeric(infixArray[index]))
				postfixString+=String.valueOf(infixArray[index]);
			else
			{
				priority=checkPriority(infixArray[index]);
				if(priority==0)
				{
					System.out.println("Given input contain incorrect operator");
					System.exit(1);
				}
				if(Top==null||priority<=checkPriority(Top.getData()))
					Top=stackOperation.pushData(Top, infixArray[index]);
				else
				{
					postfixString+=String.valueOf(Top.getData());
					Top=stackOperation.popData(Top);
					Top=stackOperation.pushData(Top, infixArray[index]);
				}
			}
			index++;
		}
		while(Top!=null)
		{
			postfixString+=String.valueOf(Top.getData());
			Top=stackOperation.popData(Top);
		}
		return postfixString;
	}
	
	public static int checkPriority(Character ch)
	{
		
		int priority=0;
		switch(ch)
		{
		
		case '*':
		case '/':
		case '^':priority=1;
				break;
		case '+':
		case '-':priority=2;
				break;
			
		}
		return priority;
	}
	
	public static boolean isAlphaNumeric(Character ch)
	{
		if(ch>=48&&ch<=57||ch>=65&&ch<=90||ch>=97&&ch<=122)
			return true;
		
		return false;
	}
	
}
