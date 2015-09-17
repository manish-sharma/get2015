/**
 * below method is to  takes a string and returns the number of unique characters in the string.
 * It is expected that a string with the same character sequence may be passed several times 
 * to the method.Since the counting operation can be time consuming, so here the methods are cache the results,
 * so that when the methods is given a string previously encountered,
 * it will simply retrieve the stored result.
 * @author  Neha Bansal
 * @version 1.0
 * @since   2015-09-3
 */
package assignmentDS_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CachingUsingMaps 
{
	public static HashMap<String,Integer>hashMap;

	//constructor
	public CachingUsingMaps() {
		super();
		this.hashMap = new HashMap<String, Integer>();
	}
	
	/**
	 * below method is used to count to no of distinct character in string
	 * @param str : given string 
	 * @return : no of distinct character in string
	 */
	public int countUniqueCharacter(String str)
	{
		int count=0;
		if(hashMap.containsKey(str))
		{
				count=hashMap.get(str);
		}
		else
		{
				
			int index=0;
			count=0;
			ArrayList <String>arraylist=new ArrayList<String>();
			while(index<str.length())
			{
				String characterAtIthPosition=str.substring(index,index+1);
				if(!arraylist.contains(characterAtIthPosition))
				{
					count++;
					arraylist.add(characterAtIthPosition);
				}
				index++;
			}
			hashMap.put(str, count);
		}
		return count;
	}
	public static void main(String args[])
	{
		CachingUsingMaps cachingUsingMaps = new CachingUsingMaps();
		String ans="yes";
		final String YES_STRING = "Yes";
		
		Scanner scanner = new Scanner(System.in);
		
		
		do
		{
			System.out.println("\nPlease enter the String(Without spaces)");
			String str=scanner.next();
			int count=cachingUsingMaps.countUniqueCharacter(str);
			System.out.println("\nNo Of Unique Character in the given String is :"+count);



			System.out.println("\nDo you want to continue(press yes for continue)");
	    	ans=scanner.next();
			
			
		}while(ans.equalsIgnoreCase(YES_STRING));
		scanner.close();
	}
			
	

}

