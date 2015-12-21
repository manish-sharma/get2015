package Concordance;

public class Concordance {

	int countLetter(String string, char characterOfString) {
		//Function for counting occurrence of character in string
		int count = 0;
		for (int i = 0; i < string.length(); i++) {

			if (characterOfString == string.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
