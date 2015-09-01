import java.util.HashSet;
import java.util.Set;

/**
 * Class used to calculate concordance of character
 * 
 * @author Riddhi
 *
 */
public class ConcordanceOfCharacters {

	Set<Character> set;
	String str1;

	// Constructor
	public ConcordanceOfCharacters() {
		set = new HashSet<Character>();
		str1 = "";
	}

	// function used to calculate the frequency of every character in the string
	public void concordance(String str[]) {

		// used to store the array in the string
		for (int i = 0; i < str.length; i++) {
				str1 = str1 + str[i];
		}

		// used to store unique elements of string in set
		for (int i = 0; i < str1.length(); i++) {
			set.add(str1.charAt(i));
		}

		// used to calculate the frequency of every letter and print its occurence index position
		for (Character s : set) {
			String result = "[ " + s + " = ";
			for (int i = 0; i < str1.length(); i++) {
				if (s == str1.charAt(i)) {
					result = result + i + " ";
				}
			}
			result = result + " ]";
			System.out.println(result);
		}

	}

}
