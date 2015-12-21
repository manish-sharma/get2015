package uniqueCharacterCount;

import java.util.HashMap;

public class UniqueCharacter {
	int flag = 0;
	String uniqueString = "";
	//hash map storing string and unique character  as value
	HashMap<String, String> hashMap = new HashMap<String, String>();

	String uniqueCharacterCounting(String string) {
        // method to calculate unique characters
		if (hashMap.containsKey(string)) {

			System.out.print("already present or empty");
			return hashMap.get(string);

		} else {
			//identifying unique characters in string
			for (int i = 0; i < string.length(); i++) {
				flag = 0;
				for (int j = i + 1; j < string.length(); j++) {
					if (string.charAt(i) == string.charAt(j)) {
						flag++;
					}
				}
				if (flag == 0) {
					uniqueString = uniqueString + " " + string.charAt(i);
				}
			}
			hashMap.put(string, uniqueString);
			return uniqueString;
		}
	}

}
