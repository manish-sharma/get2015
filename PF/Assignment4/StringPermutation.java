
import java.util.Scanner;
public class StringPermutation 
{
	String result="";
	public static void main(String args[]) 
	{
		String input,output;
		StringPermutation object = new StringPermutation();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter input string");
		input= scan.nextLine();
		output=object.generatePermutations("", input);
		System.out.println(output);
		scan.close();
	}

	String generatePermutations(String beginningString, String endingString)
	{
		
		if (endingString.length() <= 1)
		{
			result=result+beginningString+endingString;
		}
		else
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
		return result;
	}
}
