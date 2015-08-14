package programingFundamental4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class permutation {

	/**make the all possible pattern of the string.
	 * @param input is initially is empty string.it helps in dividing the string.
	 * @param str is the string given by the user.
	 * @return
	 */
	public List<String> generatePermutations(String input, String str) {
		List<String> permutations = new ArrayList<>();
		int n = str.length();
		if (n == 0)
			permutations.add(input);
		else
			for (int i = 0; i < n; i++)
				permutations.addAll(generatePermutations(input + str.charAt(i),str.substring(i + 1, n) + str.substring(0, i))); //this line make all pattern by recalling itself by more divided string.
		return permutations;
	}

	public static void main(String args[]) {
		permutation obj = new permutation();
		Scanner readInput = new Scanner(System.in);
		String string = new String();
		System.out.println("enter the string");
		string = readInput.next();
		String input = "";
		List<String> result = new ArrayList();
		result = obj.generatePermutations(input, string);
		for (String strng : result)
			System.out.println(strng);
	}

}
