import java.util.Scanner;

/**
 * This class handles all the wrong input condition by the user and makes user
 * that the user inputs the value which is permissible
 * 
 * @author Shishir Date 16th September 2015
 */
public class Utility {
	// function to make sure that only integer values are input
	public static int getIntegerValue(String message) {

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(message);
			int number;
			String inputStr = sc.next();
			if (isNumeric(inputStr) && (Integer.parseInt(inputStr) > 0))// input
			// value
			// is
			// integer
			// and
			// should
			// be
			// positive
			{
				number = Integer.parseInt(inputStr);
				return number;
			} else {
				System.out.println("Enter positive integer value");
			}
		} while (true);
	}

	// function to make sure that the input given is numeric
	public static boolean isNumeric(String input) {
		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			return false;
		}

		return true;
	}

	// function to get string input from user
	public static String getStringInput(String message) {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		return inputStr;
	}

	// function to show message if the user inputs wrong value
	public static void showMessage(String message) {
		System.out.println(message);
	}

	// function to get character input
	public static Character getCharacterInput(String message) {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		Character inputStr = sc.next().charAt(0);
		return inputStr;
	}
}
