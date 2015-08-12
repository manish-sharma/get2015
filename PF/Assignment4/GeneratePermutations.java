/****************************************************************************************
Name            : GenratePermutation
Revision Log    : 2015-08-12: Babalu patidar : created.
                : 
                : 
Use             : This class is used to find all possible permutation of a string
                :
****************************************************************************************/

import java.util.Scanner;
public class GeneratePermutations 
{
	//permuteString method take input as beginningstring,endingstring
	//@param: String beginningstring :Specify first string
	//@param: String endingstring :Specify second string
	//@param: String outputpermutestring :contain all possible permutation
	public  String permutestring(String beginningstring, String endingstring) 
	{
	    if (endingstring.length()<=1)
	    {
	    	return beginningstring+endingstring+"\n";
	    }
	    else
	    {
	    	String outputpermutestring="";
	    	for (int count=0;count<endingstring.length();count++) 
	    	{
	    		String newString=endingstring.substring(0,count)+endingstring.substring(count+1);
	    		outputpermutestring+=permutestring(beginningstring+endingstring.charAt(count),newString);
	    	}
	    	return outputpermutestring;
	    }
	}
	//End of permutestring method
	
	//Start of main method
	//@param: String inputstring :Specify the input string that have to permuted
	//@param: String output :Specify the output return by permutestring method
	//@param: permutestring method is used for permutation.
	public static void main(String args[]) {
		
		String output="";
		String inputstring="";
		Scanner scan= new Scanner(System.in);
		GeneratePermutations object=new GeneratePermutations();
	    System.out.println("Enter a string that have no repeated char.\n");
	    try
	    {
	    	inputstring=scan.next();
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    System.out.println("\nAll permutation are as follow\n");
	    
		output=object.permutestring("",inputstring);
		System.out.print(output);
		scan.close();
	}
	//End of main 
}//End of GenratePermutations class
