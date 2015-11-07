package advanceds;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**This is the main class to run truth-table function.
 * @author Khemanshu
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader bufferedReaderObj = null;
		int result = -1;
		TruthTableGenerator truthTableObj = null;
		try {
			/* choice will hold choice of user */
			String choice;
			do {
				System.out.println("Enter a String\n(only letters, &, | and ~ are allowed)");
				bufferedReaderObj = new BufferedReader(new InputStreamReader(System.in));
				/* input will contain infix expression */
				String input = bufferedReaderObj.readLine();
				/* converting whole expression to lower case */
				truthTableObj = new TruthTableGenerator();
				result = truthTableObj.truthTableGenerator(input);
				if(result == 1)
					System.out.println("Successfully created");
				else if(result == 0)
					System.out.println("String is empty or null");
				else if(result == -1)
					System.out.println("Invalid expression");
				else
					System.out.println("Some problem occcuy"
							+ "rred");
				System.out.println("Press Y ot y to continue and any other key to exit");
				/* taking user's choice as input */
				choice = bufferedReaderObj.readLine();
				if(!(choice.charAt(0) == 'Y' || choice.charAt(0) == 'y')) {
					System.out.println("System Exit");
					System.exit(0);
				}
			} while(true);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
