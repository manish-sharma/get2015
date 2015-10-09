import java.util.Scanner;

/**
 * this class is responsible to handle input output operations
 * 
 * @author Riddhi
 *
 */
public class Utility {

	private static Scanner sc;

	public static int getIntegerValue(String message) {

		sc = new Scanner(System.in);
		do {
			System.out.println(message);
			int number;
			String inputStr = sc.next();
			if (isNumeric(inputStr) && (Integer.parseInt(inputStr) > 0)) {
				number = Integer.parseInt(inputStr);
				return number;
			} else {
				System.out.println("Enter positive integer value");
			}
		} while (true);
	}

	public static boolean isNumeric(String input) {
		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			return false;
		}

		return true;
	}

	public static String getStringInput(String message) {
		System.out.println(message);
		sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		return inputStr;
	}

	public static void showMessage(String message) {
		System.out.println(message);
	}

	public static Character getCharacterInput(String message) {
		System.out.println(message);
		sc = new Scanner(System.in);
		Character inputStr = sc.next().charAt(0);
		return inputStr;
	}
}