/**class for finding number of unique characters in given string
 * 
 * @author Gaurav Saini
 * Date : 01/09/2015
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
	
	//main method
	public static void  main(String args[]) {
		
		System.out.println("enter the string:");
		Scanner scan = new Scanner(System.in);
		String userString = scan.nextLine();													//accepting string from user
		
		HashMap<String, Object[]> hash = new HashMap<String, Object[]>();						//map to store unique characters in each word of the given string
		
//		String delims = "[ .,?!]+";
		String[] str = userString.split(" ");													//converting given string to string array
		
		for (String string : str)
			if(!(hash.containsKey(string)))														//getting unique characters in each word of given string
				hash.put(string, UniqueChars(string));											//and storing in hashmap (caching)
		
		Set<Character> set1 = new HashSet<Character>();											//set to store unique characters in given string
		
		for (Map.Entry<String, Object[]> e : hash.entrySet())
			for (Object c : e.getValue())														//getting unique characters from the map
				set1.add((Character)c);															//and storing in the set
		
		System.out.println("number of unique characters in given string is : " + set1.size());	//showing number of unique characters
		System.out.println("unique characters are : " + set1);									//showing list of unique characters
		scan.close();
	}
	
	//method to find unique characters in a word
	public static Object[] UniqueChars(String string) {
		Set<Character> set = new HashSet<Character>();
//		char[] array = string.toCharArray();
		
		for (char c : string.toCharArray())
			set.add(c);

		return set.toArray();
	}

}