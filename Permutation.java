import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Permutation {
	List<String> result = new ArrayList<String>();	
		
	List<String> generatePermutations(String beginningString, String endingString) 
	{
		Set<String> hs = new HashSet<String>();
	    if (endingString.length() <= 1) {
		    result.add(beginningString + endingString);
		    hs.addAll(result);
		  	result.clear();
		  	result.addAll(hs);
	    } else {
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
	    }
	    return result;
	  
	}
	
	public static void main(String[] args) 
	{
		List<String> result=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		Permutation generatePermutations=new Permutation();
		System.out.println("Enter the string:");
		String string = sc.next();
		result=generatePermutations.generatePermutations("", string);
		Iterator<String> itr=result.iterator();//getting Iterator from arraylist to traverse elements  
		while(itr.hasNext()) {  
				System.out.println(itr.next());  
		}
	}
		
}
