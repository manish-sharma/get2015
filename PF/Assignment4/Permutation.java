import java.util.ArrayList;
import java.util.List;

public class Permutation {

	private static List<String> permuteString(String beginningString,
			String endingString, List<String> permutationpattern) {
		if (endingString.length() <= 1)
			permutationpattern.add(beginningString + endingString);
		else
			for (int i = 0; i < endingString.length(); i++) {
				try {
					String newString = endingString.substring(0, i)
							+ endingString.substring(i + 1);// extracting
															// substring
					permuteString(beginningString + endingString.charAt(i),
							newString, permutationpattern);// appending the
															// substring
				} catch (StringIndexOutOfBoundsException exception) {
					exception.printStackTrace();
				}
			}
		return permutationpattern;

	}

	public static List<String> permuteStrings(String stringToPermute) {
		List<String> list = new ArrayList<String>();
		String beginningString = "";
		List<String> list1 = permuteString(beginningString, stringToPermute,
				list);

		return list1;

	}

}
