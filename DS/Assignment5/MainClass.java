import java.util.Scanner;

/**
 * Main class to call methods for displaying concordance of a character in the
 * string
 * 
 * @author Riddhi
 *
 */
public class MainClass {

	public static void main(String args[]) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			ConcordanceOfCharacters object = new ConcordanceOfCharacters();
			System.out.println("Frequency of every letter in string is");
			object.concordance(args);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			sc.close();
		}
	}

}
