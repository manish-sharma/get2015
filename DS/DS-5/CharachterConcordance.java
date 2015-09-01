/**
 * Class to implement character concordance
 * @author Sanjay
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class CharachterConcordance {
	HashSet<Character> setOfCharacters = new HashSet<Character>();
	HashMap<Character, String> concordance = new HashMap<Character, String>();
	
	
	/**
	 * Method to add alphabets to set
	 * @param string
	 */
	private void addCharToSet(String string){
		for(int i=0;i<string.length();i++){
			setOfCharacters.add(string.charAt(i));
			
		}
		
	}
	
	/**
	 * Method to add the occurence of the characters
	 * @param string
	 */
	private void concordance(String string){
		Iterator setIterator = setOfCharacters.iterator();
		while(setIterator.hasNext()){
			concordance.put((char)setIterator.next(), "");
		}
		setIterator = setOfCharacters.iterator();
		while(setIterator.hasNext()){
			char temp = (char)setIterator.next();
			int i = string.indexOf(temp);
			while(i >= 0) {

				concordance.put(temp,""+concordance.get(temp)+i+",");
			     i = string.indexOf(temp, i+1);
			}
		}
	}
	
	public static void main(String args[]) {
		CharachterConcordance object = new CharachterConcordance();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = scan.nextLine();
		object.addCharToSet(string);
		object.concordance(string);
		for(Map.Entry<Character, String> entry: object.concordance.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
