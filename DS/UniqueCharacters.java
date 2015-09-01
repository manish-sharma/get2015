import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/**
 * class to print the total unique elements in the string
 * @author Ankur
 * @since 01-09-2015
 */

public class UniqueCharacters {
	/**
	 * main method
	 * 
	 * @param args
	 */
	
	public static void  main(String args[]) {
		
		System.out.println("enter the string:"); //scan the element
		Scanner scan = new Scanner(System.in);
		String userString = scan.nextLine();
		/**
		 * HashMap to store unique value string as key ,object array as a value
		 */
		HashMap<String, Object[]> hash = new HashMap<String, Object[]>();
		String[] splittedUserString = userString.split(" ");//split the user string
		/**
		 * hash contains  key as unique splittedUserString of array  
		 * value as its unique character of that splittedUserString of array
		 */
		for (String string : splittedUserString) {
			if(!(hash.containsKey(string)))//check that splittedUserString is present already in hashMap or not
				{
				hash.put(string, UniqueChars(string));//if not the add it in hashMap
			}
		}
		
		Set<Character> set1 = new HashSet<Character>();
		/**
		 * get value from hash map and add in the set
		 * set add only unique characters from the value of HashMap
		 */
		for (Map.Entry<String, Object[]> value : hash.entrySet()) {
			for (Object characters : value.getValue()) {
				set1.add((Character)characters);
			}
		}
		System.out.println("number of unique characters in given string is : " + set1.size()); //print total unique characters in the User String
		System.out.println("unique characters are : " + set1);
		scan.close();
	}
	/**
	 * method to change convert string into character  array
	 * then add that array in set
	 * set contains only unique characters
	 * @param string
	 * @return set
	 */
	public static Object[] UniqueChars(String string) {
		Set<Character> set = new HashSet<Character>();
		char[] array = string.toCharArray();
		for (char c : array) {
			set.add(c);
		}
		return set.toArray();
	}
	
}
