/**
 * @author: Pooja Khandelwal
 * @created Date : 01/09/2015
 * @@Name :ConcordanceOfString  class
 * @Description : it will create concordance of input string(find indices for each distinct element of string)
 */
package com.concordance.string;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class ConcordanceOfString {
	private Hashtable<Character, Set<Integer>> concordance = new Hashtable<Character, Set<Integer>>();

	/**
	 * @Name : findConcordance()
	 * @param : string array(strings read from command line)
	 * @description : method to find concordance of characters in string array
	 * @return : return hash table variable
	 */
	public Hashtable<Character, Set<Integer>> findConcordance(String arg[]) {
		int length = arg.length;
		int index = 0;

		for (int i = 0; i < length; i++) {

			for (int j = 0; j < arg[i].length(); j++) {

				char character = arg[i].charAt(j);
				if (character != 32) {
					if (!(concordance.containsKey(character))) {

						Set<Integer> indexValue = new HashSet<Integer>();
						indexValue.add(index);
						index++;
						concordance.put(character, indexValue);

					} else {

						Set<Integer> indexValue = concordance.get(character);
						indexValue.add(index);
						index++;
						concordance.put(character, indexValue);
					}
				} else {
					index++;
				}
			}
		}
		return concordance;
	}
}
