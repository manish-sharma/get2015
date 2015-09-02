import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/**
 * class to print the total unique elements in the string
 * @author Sanjay
 *
 */
public class UniqueCharacters {
	public static void  main(String args[]) {
		HashMap<String, Set<Character>> hash = new HashMap<String, Set<Character>>();
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("enter the string:"); 
			String userString = scan.nextLine();
			Set<Character> setOfChars = addToMap(userString,hash);
			System.out.println("number of unique characters in given string is : " + setOfChars.size());
			System.out.println("unique characters are : " + setOfChars);
			System.out.println("\n Cache :");
			for (Map.Entry<String, Set<Character>> character : hash.entrySet()) {
				System.out.print(character.getKey()+ ":"+character.getValue());
				System.out.println();
			}
		}
	}
	
	/**
	 * Method to check string from cache. if available display from the cache otherwise add to the hashmap.
	 * @param userString = String entered by user
	 * @param hash = hashmap / cache
	 * @return = set of unique characters in the string
	 */
	private static Set<Character> addToMap(String userString,HashMap<String,Set<Character>> hash) {
		String[] stringArray = userString.split(" ");
		Set<Character> setOfChars = new HashSet<Character>();
		for (String string : stringArray) {
			if((hash.containsKey(string))) {
				setOfChars.addAll(hash.get(string));
			}
			else{
				hash.put(string, UniqueChars(string));
				setOfChars.addAll(hash.get(string));
			}
		}
		return setOfChars;
	}
	
	/**
	 * Method to find unique characters from the string
	 * @param string = string of characters
	 * @return set of unique characters
	 */
	private static Set<Character> UniqueChars(String string) {
		Set<Character> set = new HashSet<Character>();
		char[] array = string.toCharArray();
		for (char c : array) {
			set.add(c);
		}
		return set;
	}
}