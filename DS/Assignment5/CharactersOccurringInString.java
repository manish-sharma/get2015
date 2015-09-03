package ds5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Khemanshu
 *
 */
public class CharactersOccurringInString {
	
	/**
	 *  calculteCharactersOccurringInString function which is determine the each index of every character in a string.
	 *
	 */
	public static void calculteCharactersOccurringInString(String string) {
		//set to store unique elements of string
		Set<String> set = new HashSet<String>();
		
		string = string.replaceAll("\\s", "");						//remove white spaces from string
	
		for (int count = 0; count < string.length(); count++) {
			set.add("" + string.charAt(count)); 					//add each character in the set
		}
		//character count to store the occurrence of character in string
		HashMap<String, String> characterCount = new HashMap<String, String>();
		
		for (String str : set) {
			int val = 0;
			for(int countIndex = 0; countIndex < string.length(); countIndex++) {
				if(string.charAt(countIndex) == str.charAt(0)) {
					if(characterCount.containsKey(str)) {	
						characterCount.put(str,characterCount.get(str)+","+string.indexOf(str, val));
						
					}
					else {
						characterCount.put(str,""+string.indexOf(str, val));
						
					}	
				}
				val++;
			}

		}
		System.out.println(characterCount);

	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string");
		String string=scanner.nextLine();
		calculteCharactersOccurringInString(string);
	}
}
