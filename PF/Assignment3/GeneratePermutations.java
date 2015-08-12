package pf_assignment_4;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
/*
 * permutation is used to make the possible arrangement of the given string
 * It takes input as a string  and print the possible  arrangement
 * **@author Ankur Gupta
 * ** @since 12-08-2015*/
public class GeneratePermutations 
{
	
	static List<String> Result=new ArrayList<String>();
	List<String> generatePermutations(String beginningString, String endingString) 
	{
		/*this method can generate all the possible arrangements of the given string
		 * @result array list
		 * @beginningstring start index of the string
		 * @ending string last index of the string
		 * @return return the possible arrangement of the user string
		 * */
	    if (endingString.length() <= 1)
	     Result.add(beginningString + endingString);//add the string in array list
	    else             
	      for (int i = 0; i < endingString.length(); i++)
	      {
	        try 
	        {
	          String newString = endingString.substring(0, i) + endingString.substring(i + 1);//newstring creates string by substring

	          generatePermutations(beginningString + endingString.charAt(i), newString);//recursive method calling
	        }
	        catch (StringIndexOutOfBoundsException exception) 
	        {
	          exception.printStackTrace();
	        }
	      }
	    return Result;//return list of possible arrangement of user strings
	  }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*main method to print all possible values*/
		Result=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);//scanner class object
		GeneratePermutations generatePermutations=new GeneratePermutations();//class object
		System.out.println("Enter the string:");
		String string = sc.next();//scan user string
		
		
			Result=generatePermutations.generatePermutations("", string);//method calling
			Iterator<String> itr=Result.iterator();//getting Iterator from arraylist to traverse elements  
		
			while(itr.hasNext())
			{  
				System.out.println(itr.next());  
			}
		}
		
	}


