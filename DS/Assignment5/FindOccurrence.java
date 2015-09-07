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

public class FindOccurrence {
	HashMap<Character, String> hashMapObject = new HashMap<Character, String>(); 
	public void findOccurrence(String inputString) {
		int stringLength = inputString.length();
		char key ;
		String keyString = "" ;

		for(int count = 0; count < stringLength; count++) {
			key = inputString.charAt(count);
			keyString = "";
			if(hashMapObject.containsKey(key)) {
				keyString = hashMapObject.get(key);
				keyString += ", "+ count;
			} else {
				keyString += count;
			}
			hashMapObject.put(key, keyString);
		}
	}
	public void printOccurence() {
		for(Map.Entry mapping:hashMapObject.entrySet()){  
			System.out.println(mapping.getKey()+" = "+mapping.getValue());  
		}  
	}

}
