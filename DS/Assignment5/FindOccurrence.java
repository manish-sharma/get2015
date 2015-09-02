/**
 * @author Girdhari
 * Program to find occurrence of characters
 */

package question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* Starting of FindOccurrence class */
public class FindOccurrence {
	HashMap<Character, String> hashMapObject = new HashMap<Character, String>(); 

	/* Starting of findOccurrence function */
	public void findOccurrence(String inputString) {
		int counter;
		int stringLength = inputString.length();
		String key = "";
		//set for unique element
		Set<Character> uniqueElement = new HashSet<Character>();
		for(int loopCounter = 0 ; loopCounter < stringLength ; loopCounter++) {		//insert the elements in set
			uniqueElement.add(inputString.charAt(loopCounter));
		}
		// insert element in hashmap without value
		for(Character character : uniqueElement) {
			hashMapObject.put(character, "");
		}
		String positions = "" ;
		for(Character character : uniqueElement) {
			for(int loopCounter = 0 ; loopCounter < stringLength ; loopCounter++) {
				if(inputString.charAt(loopCounter) == character) {
					positions += loopCounter + ", ";
				}
			}
			hashMapObject.replace(character, positions);
			positions = "" ;
		}
		
	}
	/* Ending of findOccurrence function */
	
	/* Starting of printOccurence function */
	public void printOccurence() {
		for(Map.Entry mapping:hashMapObject.entrySet()){  
			   System.out.println(mapping.getKey()+" "+mapping.getValue());  
		}  
	}
	/* Ending of printOccurence function */
}
/* Ending of FindOccurrence function */
