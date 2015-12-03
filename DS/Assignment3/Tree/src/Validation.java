import java.util.Scanner;

public class Validation {
	
	/** Method for integer input validation
	 * 
	 * @return input number
	 */
	public static int isInteger() {
		Scanner scan = new Scanner(System.in);
		while (!scan.hasNextInt()) {
			System.out.println("That's not an integer!Please enter again");
			scan.next();
			}
		int choice = scan.nextInt();
		return choice;
	}
}
