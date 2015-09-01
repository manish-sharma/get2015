/**
 * @author : Pooja Khandelwal
 * @created Date : 01/09/2015
 * @Name : ConcordanceOfStringCharacters class
 * @description : it will create concordance of given string
 *  i.e display the indices for each distinct character of String
 */
package com.string.concordanceOfCharacters;

import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.Scanner;

public class ConcordanceOfStringCharacters {
	public void createConcordance(String string) {

		int j = 0;
		char[] charArray = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			if (((string.charAt(i)) != ' ')) {
				charArray[j] = string.charAt(i);
				j++;
			} else {
				charArray = Arrays.copyOf(charArray, (charArray.length - 1));
			}
		}
		int checkCharTraverseOrNot[] = new int[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			checkCharTraverseOrNot[i] = 0;
		}
		int k = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (checkCharTraverseOrNot[i] == 0) {
				System.out.print(charArray[i] + "={" + i);
				checkCharTraverseOrNot[i] = 1;
				for (k = i + 1; k < charArray.length; k++) {
					if (charArray[k] == charArray[i]) {
						System.out.print("," + k);
						checkCharTraverseOrNot[k] = 1;
					}
				}
				System.out.print("}");
				System.out.println();
			}
		}
	}

}
