import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

	public static String userInputForSimpleString() {
		Scanner scanner = new Scanner(System.in);
		String detail = scanner.nextLine();
		return detail;
	}

	/**
	 * takes input from user and validate either it contains alphabet or digits
	 * only
	 * 
	 * @return String
	 */
	public static void displayMenueForEmolyee() {
		System.out.println("\nPress 1 To add Employee to Company");
		System.out.println("Press 2 To show list of Engineer in Company");
		System.out.println("Press 3 To Exit");

	}

	public static void displayMenueForEmolyeeType() {
		System.out.println("\nPress 1 To add Developer");
		System.out.println("Press 2 To add Tester");
		System.out.println("Press 3 To add HrManager");
	}

	public static int userInput() {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		try {
			number = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("\nPlease Enter only integer.");
			number = userInput();
		}
		return number;
	}

}
