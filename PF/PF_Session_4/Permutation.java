import java.util.*;

public class Permutation
{
	static List<String> Result= new ArrayList<String>();
	List<String> generatePermutations(String beginningString, String endingString) 
	{
	    if (endingString.length() <= 1)
	     Result.add(beginningString + endingString);
	    else
	      for (int i = 0; i < endingString.length(); i++)
	        {
	          String newString = endingString.substring(0, i) + endingString.substring(i + 1);

	          generatePermutations(beginningString + endingString.charAt(i), newString);
	        }
	    return Result;
	  }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Result=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		Permutation generatePermutations=new Permutation();
		System.out.println("Enter the string:");
		String string = sc.next();
		
		
			Result=generatePermutations.generatePermutations("", string);
			Iterator<String> itr=Result.iterator();//getting Iterator from arraylist to traverse elements  
			while(itr.hasNext())
			{  
				System.out.println(itr.next());  
			}
		}
		//Result.removeAll(Result);
	}
