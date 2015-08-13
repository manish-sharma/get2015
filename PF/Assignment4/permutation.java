// program to generate permutations of alphabets in a string

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class permutation 
{
	public static void main(String[] args) 
	{
		String inputStr;
		permutation  obj = new permutation ();
		List<String> stringArray ;
		Scanner sc =new Scanner(System.in);
		try
		{
			System.out.println("Enter the string : ");
			inputStr = sc.next();
			System.out.println("Permutations are : ");
			stringArray =  obj.generatePermutations(inputStr);
			for(String str : stringArray)    // uses for each to print the list present in List<String>
			{
				System.out.println(str);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if(sc!=null)
				sc = null;
			if(obj!=null)
				obj = null;
		}
	}
	
	
	List<String> generatePermutations(String inputStr)
	{	
		boolean used[] = new boolean [inputStr.length()];         // used to show if an alphabet is present in result of permutation
		List<String> outputStr = new ArrayList<String>() ;    
		char inputArr[] = inputStr.toCharArray();                 // convert input string to char array
		StringBuffer output = new StringBuffer();    
        outputStr = returnPermutation(inputArr, output, used, outputStr);
        return outputStr;                                         // contains all results of permutations
	}
	
	
	// takes a character from char array and generates permutation for rest of alphabets and so on
	List<String> returnPermutation(char[] inputArr, StringBuffer output, boolean used[], List<String> outputStr)                                                                                                                        
	{
		if( output.length()==inputArr.length)                     // base case
        {
			outputStr.add(output.toString());					  // add a permutation in list containing all permutations
			return outputStr;
		}
        for (int index=0; index<inputArr.length; index++)	
        {
        	if (used[index])									  // if an alphabet is used then its used contains true & that alphabet should not be repeated again
        		continue;
        	else
        	{ 
        		output.append(String.valueOf(inputArr[index]));   // returns one permutation
        		used[index] = true;								  // sets its boolean to true
        		returnPermutation(inputArr, output, used, outputStr);
        		used[index] = false;
        		output.setLength(output.length()-1);              
        	}
        }
        return outputStr;
	}
}
