package com.ds6.uniquecharacter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**This class implements the a functionality in which the string entered
 * by user display the unique character in String and cache it till the program executes
 * @author Shishir
 *Date 2nd September 2015
 */
public class UniqueCharacter {
	Map<String, Set<Character>> unique = new HashMap<String, Set<Character>>();
    /**This function performs accepts the string as parameter and does 
     * the functionality to extract the unique letters and store it in 
     * hashmap for caching
     * @param input
     * @return set of unique character
     */
	public Set<Character> unique(String input) {
		//iterator to iterate over the map
		Iterator<Entry<String, Set<Character>>> itr = unique.entrySet()
				.iterator();
		Set<Character> uniqueElements = new HashSet<Character>();
		while (itr.hasNext()) {
			Entry<String, Set<Character>> set = itr.next();
			String str = set.getKey();
			if (str.equals(input)) {//if the value of the input already exists in map
				return set.getValue();
			}
		}

		for (int index = 0; index < input.length(); index++) {
			char charAt = input.charAt(index);
			if (charAt == ' ') {//if space is then ignore it and continue
				continue;
			}
			uniqueElements.add(charAt);
			unique.put(input, uniqueElements);
		}

		return (unique.get(input));
	}
    
	/*function to display the all the key value pairs in hashmap*/
	public void display() {
		Iterator<Entry<String, Set<Character>>> itr = unique.entrySet()
				.iterator();
		while (itr.hasNext()) {
			Entry<String, Set<Character>> set = itr.next();
			System.out.println(set.getKey() + "    " + set.getValue());
		}
	}
	/**Overridden method to display key value pair as string
	 * 
	 */
	@Override
	public String toString() {
		String result = "\n";
		Iterator<Entry<String, Set<Character>>> i = unique.entrySet()
				.iterator();
		while (i.hasNext()) {
			Entry<String, Set<Character>> pair = i.next();
			result = result + pair.getKey() + " " + pair.getValue() + "\n";
		}
		result += "";
		return result;
	}

	// main function
	public static void main(String args[]) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			UniqueCharacter object = new UniqueCharacter();
			do {
				// displays menu
				System.out.println("Press\n1. Enter string");
				System.out.println("2. Display all previous strings");
				System.out.println("3. Exit");
				int choice = Integer.parseInt(br.readLine());
				switch (choice) {
				case 1:
					System.out.println("Your string is");
					String str = br.readLine();
					System.out
							.println("Number of unique characters in this string is :"
									+ object.unique(str));
					break;

				case 2:
					System.out.println("All String Entered are :\n"
							+ object.toString());
					break;

				case 3:
					System.exit(0);

				default:
					System.out.println("Enter a valid input !!");
				}

			} while (true);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
