/**
 * @author Girdhari
 * Program to find occurrence of characters
 */

package question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindOccurrence {
	HashMap<String, List<String>> hashMapObject = new HashMap<String, List<String>>(); 
	public void findOccurrence(String inputString) {
		int counter;
		String key = "";
		int stringLength = inputString.length();
		for(counter = 0 ; counter < stringLength ; counter++ ) {
			key = "" + inputString.charAt(counter);
			List<String> listMap = new ArrayList<String>(); 
			if(hashMapObject.containsKey(key))
				hashMapObject.add(key, String.valueOf(counter));
		}
	}
	
	public void printOccurence() {
		for(Map.Entry mapping:hashMapObject.entrySet()){  
			   System.out.println(mapping.getKey()+" "+mapping.getValue());  
			  }  
	}

}
