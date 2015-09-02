import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * Class to count the number of unique characters in the string using one
 * collection and hashmap
 * 
 * @author Riddhi
 *
 */
public class UniqueCharacters {

	Map<String, Set<Character>> finalAnswer;

	public UniqueCharacters() {
		finalAnswer = new HashMap<String, Set<Character>>();
	}

	// method which returns number of unique characters in the string
	public int unique(String str) {

		// set to store unique characters in the string
		Set<Character> uniqueElements = new HashSet<Character>();

		// to iterate over the set
		Iterator<Entry<String, Set<Character>>> i = finalAnswer.entrySet()
				.iterator();
		/*
		 * if the string is already present in the hash map than its unique
		 * characters are not calculated again, result is returned from previous
		 * stored value in hash map corresponding to its key
		 */

		while (i.hasNext()) {
			Entry<String, Set<Character>> pair = i.next();
			if (pair.getKey().equals(str)) {
				// number of unique characters is returned
				System.out.println("String already exits");
				return (pair.getValue().size());
			}
		}
		// if string not stored already its uniqu characters value is calculated
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) != ' ')
				uniqueElements.add(str.charAt(index));
		}
		/*
		 * current string and its corresponding unique characters is added to
		 * hash map for maintaining cached data
		 */
		finalAnswer.put(str, uniqueElements);

		// number of unique characters is returned
		return (finalAnswer.get(str).size());
	}

	/*
	 * to String method of object class is overridden to display all key value
	 * pair of hash map
	 */
	@Override
	public String toString() {
		String result = "\n";
		Iterator<Entry<String, Set<Character>>> i = finalAnswer.entrySet()
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
		BufferedReader br=null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			UniqueCharacters object = new UniqueCharacters();
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