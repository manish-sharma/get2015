import java.util.*;

public class Permutation {

	/**
	 * Program to print all permutation of strings
	 * 
	 * @param args
	 */
	static List<String> result;

	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		result = new ArrayList<String>();
		result = permutation(s1);
		Iterator<String> itr = result.iterator();// getting Iterator from array
		// list to traverse elements
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		sc.close();

		sc.close();

	}

	/**
	 * Function calls a recursive function to find out all strings and then
	 * adding it to the list and then returning it.
	 * 
	 * @param str
	 *            ->input string
	 * @return list of all permuted values
	 */
	public static List<String> permutation(String str) {
		permutation("", str);

		Set<String> hs = new HashSet<>();
		hs.addAll(result);
		result.clear();
		result.addAll(hs);
		return result;
	}

	/**
	 * Function calls itself so that it checks at every character and store
	 * every permutation in list
	 * 
	 * @param prefix
	 *            ->prefix string
	 * @param str
	 *            ->string which is to be permuted now
	 */
	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			result.add(prefix);

		} else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1, n));
		}
	}

}
