import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Sumitra Write a program which create a concordance of characters
 *         occurring in a string (i.e which characters occur where in a string).
 *         Read the string from the command line. Example: java Concordance
 *         Hello World {d=[9], o=[4, 6], r=[7], W=[5], H=[0], l=[2, 3, 8],
 *         e=[1]}
 */
public class ConcordanceOfCharacter {
	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
		String name;
		System.out.println("enter the string");
		name = scanner.next();
		Set<Character> result = new HashSet<Character>();

		for (int i = 0; i < name.length(); i++) {
			result.add(name.charAt(i));
		}
		String output[] = new String[result.size()];
		int j = 0;
		Iterator<Character> itr = result.iterator();
		while (itr.hasNext()) {
			Character a = itr.next();

			for (int i = 0; i < name.length(); i++) {
				if (i == 0) {
					output[j] = a + " ";
				}
				if (a == name.charAt(i)) {
					output[j] += i + " ";
				}
			}
			j++;
		}
		System.out.println(name);
		// System.out.println(result);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
		scanner.close();
	}
}
