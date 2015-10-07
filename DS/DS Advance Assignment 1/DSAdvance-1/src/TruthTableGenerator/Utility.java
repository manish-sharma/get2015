package TruthTableGenerator;

import java.util.Scanner;
/**This class is to check and make sure that the input by the user is proper and is what is demandea nd if not then handles 
 * that exception properly
 *
 * @author Shishir 
 *Date 4th October 2015
 */
public class Utility {
	/**Function to makes sure that the integer value is given as input by user
	 * 
	 * @param message
	 * @return
	 */
	public static int getIntegerValue(String message) {

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(message);
			int number;
			String inputStr = sc.next();
			if (isNumeric(inputStr) && (Integer.parseInt(inputStr) > 0)) {//check if the value is integer or not 
				number = Integer.parseInt(inputStr);
				return number;
			} else {
				System.out.println("Enter positive integer value");
			}
		} while (true);//infinite loop until correct value is not input 
		
	}
    /*Function to check if the value is number or not
     * 
     */
	public static boolean isNumeric(String input) {
		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			return false;
		}

		return true;
	}
    /*Function to make sure that the value is string value
     * 
     */
	public static String getStringInput(String message) {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		return inputStr;
	}
    /**This function makes sure that the user inputs only character input
     * 
     * @param message
     * @return message
     */
	public static char getCharacterInput(String message) {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		if ((input == 'y' || input == 'Y') || (input == 'n' || input == 'N')) {
			return input;
		} else {
			return getCharacterInput(message);

		}

	}
    /**Function to get the input for array
     * 
     * @param message
     * @return array
     */
	public static int[] getArrayInput(String message) {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		int array[] = new int[9];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

}
