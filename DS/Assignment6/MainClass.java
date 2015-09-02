/**
 * @author Girdhari
 * Class will return unique characters of String
 */
package question2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Starting of MainClass */
public class MainClass {

	/* Starting of main function */
	public static void main(String[] args) {
		UniqueCharacters uniqueCharactersObject = new UniqueCharacters();
		String uniqueCharacters;
		BufferedReader bufferedReaderObject = new BufferedReader( new InputStreamReader(System.in));
		try {
			System.out.println("Enter a String to Operate: ");
		String inputString = bufferedReaderObject.readLine();
		uniqueCharacters = uniqueCharactersObject.findUniqueCharacters(inputString);
		System.out.println("Unique Characters in String are: "+uniqueCharacters);
		} catch(IOException exception) {
			System.out.println("An Input/Output Error Occured!!");
		}
	}
	/* Ending of main function */
}
/* Ending of MainClass */
