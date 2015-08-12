import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Generate_permutation
{
	//to calculate all possible permutation;
	static List<String> Result=new ArrayList<String>();
	List<String> generatePermutations(String beginningString, String endingString) 
	{
		//method  to generate all possible permutation;
	    if (endingString.length() <= 1)// in base case
	     Result.add(beginningString + endingString);
	    else
	    	//recursive case
	      for (int i = 0; i < endingString.length(); i++)
	      {
	        try 
	        {
	          String newString = endingString.substring(0, i) + endingString.substring(i + 1);

	          generatePermutations(beginningString + endingString.charAt(i), newString);
	        }
	        catch (StringIndexOutOfBoundsException exception) 
	        {
	          exception.printStackTrace();
	        }
	      }
	    return Result;
	  }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Result=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		Generate_permutation G=new Generate_permutation();
		System.out.println("Enter the string:");
		String string = sc.next();
		
		
			Result=G.generatePermutations("", string);
			Iterator<String> itr=Result.iterator();//getting Iterator from arraylist to traverse elements  
			while(itr.hasNext())
			{  
				System.out.println(itr.next());  
			}
		}
}
