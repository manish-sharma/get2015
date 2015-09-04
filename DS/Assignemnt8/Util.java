package ds8;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Util {

	/**take input choice from user
	 * @return
	 */
	public static int userChoice() {
		int number;
		Scanner scanner = new Scanner(System.in);
		try{
			number = scanner.nextInt();
			if(number <= 0) {
				System.out.println(Error.positiveInteger);
				number = userChoice();
			}
			return number;
		}
		catch(InputMismatchException e) {
			System.out.println(Error.positiveInteger);
			number = userChoice();
		}
		return number;
	}
	
	/**use to take input for arrayList.
	 * @return
	 */
	public static int arrayListInput() {
		int element;
		Scanner scanner = new Scanner(System.in);
		try {
			element = scanner.nextInt();
			return element;
		}
		catch(InputMismatchException e) {
			System.out.println(Error.positiveInteger);
			element = arrayListInput();
		}
		return element;
	}
	

	/**returns maximum number of list. 
	 * @param list
	 * @return
	 */
	public static int returnMaximumOfList(List<Integer> list) {
		int maximum = 0;
		for(int element: list) {
			if(element > maximum)
				maximum = element;
		}
		return maximum;
	}
}
