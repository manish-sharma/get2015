package com.ds5.concordance;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*This class give the letter respective position in the input string and input
 * string is passed as command line argument
 * @author Shishir Pareek
 * Date 1st September 2015
 */
public class ConcordanceOfString {
 
	/**function to find out the concordance of string
	 *  
	 * @param input
	 * @return map
	 */
    public static Map<Character,Set<Integer>> characterConcordance(String input)
    {
    	Map<Character,Set<Integer>> concordance = new HashMap<Character,Set<Integer>>();//map to store character and position pair
    	for(int index=0;index<input.length();index++)
    	{
    		char charAt=input.charAt(index);//extracting input at index
    		if(charAt==' '){//if space occurs than avoid
    			continue;
    		}
    	Set<Integer> set=concordance.get(charAt);//setting the set at key value char
    	if(set == null){//if no value is inserted till now
    		set=new HashSet<Integer>();//Initialize the set object
    	}
    	set.add(index);//adding index in set
    	concordance.put(charAt, set);//putting value in map
    	}
    	return concordance;
    }
    
    public static void main(String args[])
    {
    	String input="";
    	for(int index=0;index<args.length;index++)
    	{
    	    input=input+args[index];//converting command line argument into one string
    	}
    	System.out.println(ConcordanceOfString.characterConcordance(input));
    }
    
}
