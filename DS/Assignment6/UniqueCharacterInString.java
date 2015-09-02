package ds6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**this class calculate the unique occurrence of character in a string
 * @author Khemanshu
 *
 */
public class UniqueCharacterInString {

	// store the no. of unique character in a string
	private static HashMap<String, Integer> stringMap = new HashMap<String, Integer>();

	
	/**insert characters of a string in a set, so that no repetition of character can occur
	 * @param string
	 * @return size of set, i.e. no of unique character
	 */
	public static int insertInSet(String string) {
		Set<String> set = new HashSet<String>();
		for (int store = 0; store < string.length(); store++)
			set.add(string.charAt(store) + "");

		return set.size();
	}

	/** calculate the unique character occurrence in string
	 * @param string
	 */
	public static void calculateUniqueCharacterOccerence(String string) {
		string = string.toLowerCase();
		if (stringMap.containsKey(string))
			System.out.println("we have already that string so unique charater in that string is -> "
							+ stringMap.get(string));
		else
			stringMap.put(string, insertInSet(string));
		System.out.println("Unique charater in that string is -> "+ stringMap.get(string));

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		/* Showing menu */
		while (choice != 2) {
			System.out.println("1. Enter String");
			System.out.println("2. Exit");
			System.out.println("Enter your choice: ");
			choice=Util.userChoice();
			switch (choice) {
			case 1:String string=scanner.nextLine();
                     calculateUniqueCharacterOccerence(string);
				 break;
			case 2:
				choice = 2;

				break;

			default:
				System.out.println("Enter correct choice");
				break;
			}
		}

	}

}
