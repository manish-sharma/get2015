import java.util.*;


/** Title : To find all possible permutations of a given string using recursion.
 *
 * @author Gaurav Saini
 *
 */
public class Permutation 
{

	//main method
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String inputString;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		inputString = sc.next();
		Permutation objOne=new Permutation();			//calling the method to find permutations of input string
		objOne.permute(inputString);
		sc.close();
	}
	
	List<String> permute(String inputString)
	{
	  int inputLength = inputString.length();
	  StringBuilder outputString = new StringBuilder();
	  boolean[ ] characterUsed = new boolean[ inputLength ];
	  List<String> Result = new ArrayList<String>();					//list to store all permutations
	  char[ ] inputArray = inputString.toCharArray( );
	  
	  Result = doPermute ( inputArray, Result, characterUsed, inputLength, 0, outputString);
	  for(String s : Result)
	  {
		  System.out.println(s);					//printing all the unique permutations of the given string
	  }
	  return Result;

	}
	
	List<String> doPermute ( char[] inputArray, List<String> Result, boolean[ ] characterUsed, int inputLength, int level, StringBuilder outputString)
	{
		boolean flag = false;
		if( level == inputLength) 
		{
			for(String s : Result)
			{
				if(s.equals(new String(outputString)))				//removing duplicate permutations
				{
					flag = true;
					break;
				}
			}
			if(flag == false)
				Result.add(outputString.toString());
			return Result;
		}
		
		for( int i = 0; i < inputLength; ++i )
		{       
	
			if( characterUsed[i] ) 
				continue;
			
			outputString.append( inputArray[i] );      
			characterUsed[i] = true;       
			doPermute( inputArray,   Result, characterUsed, inputLength, level + 1, outputString); 
			characterUsed[i] = false;       
			outputString.setLength(outputString.length() - 1 );
		}
		return Result;
	}
}