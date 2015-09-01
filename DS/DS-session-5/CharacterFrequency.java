/**class to concordance of characters in given string
 * 
 * @author Gaurav Saini
 * Date : 31/08/2015
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
	
	public static HashSet<Character> characterSet = new HashSet<Character>();					//set to store unique characters
	public static HashMap<Character, String> concordance = new HashMap<Character, String>();	//set to store concordance characters
	
	//method to read distinct characters and store in set
	private void readCharacters(String string) {
		for(int i = 0; i < string.length(); i++)
			characterSet.add(string.charAt(i));
	}
	
	//method to find concordance of all characters
	private void concordance(String string) {
		Iterator itr = characterSet.iterator();			//iterator object for character set
		
		while(itr.hasNext())
			concordance.put((char)itr.next(), "");		//initializing the map

		itr = characterSet.iterator();					//re-initializing the iterator
		
		while(itr.hasNext()) {
			char temp = (char)itr.next();
			int i = string.indexOf(temp);
			while(i >= 0) {
				concordance.put(temp,concordance.get(temp) + i + " ");		//adding occurrences of all characters to the map
				i = string.indexOf(temp, i+1);
			}
		}
	}
	
	//main method
	public static void main(String args[]) {
		CharacterFrequency object = new CharacterFrequency();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String string = scan.nextLine();			//reading the string
		
		object.readCharacters(string);				//reading the characters
		object.concordance(string);					//finding concoradnce

		for(Map.Entry<Character, String> entry: object.concordance.entrySet()) {
			if (!(entry.getKey().equals(' ')))
				System.out.println(entry.getKey() + " : " + entry.getValue());			//printing the concordance of characters
		}
	}
}