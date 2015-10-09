/**
 * @author Girdhari
 * Program to return unique characters in a string, use cache for fast result
 */
package question2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* Starting of UniqueCharacters class */

public class UniqueCharacters {
	//set is hashSet that will reduce duplicate characters
	private Set<Character> uniqueCharacter = new HashSet<Character>();
	// Hashmap for caching
	private static HashMap<String,String> cache = new HashMap<String, String>(); 
	String uniqueCharacterString = "";		//string to store unique characters
	
	/* Starting of function finUniqueCharacters */
	public String findUniqueCharacters(String inputString) {
		if(!cache.containsKey(inputString)) {
			for(int counter = 0; counter < inputString.length(); counter++) {
				uniqueCharacter.add(inputString.charAt(counter));
			}
			for(char counter : uniqueCharacter) {
				uniqueCharacterString += counter;
			}
			cache.put(inputString, uniqueCharacterString);
		} else {
			uniqueCharacterString = cache.get(inputString);
		}
		return uniqueCharacterString;
	}
}

/* Ending of UniqueCharacters class */
