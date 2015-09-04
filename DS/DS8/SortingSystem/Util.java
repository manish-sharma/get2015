
package SortingSystem;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

	/**This function takes string input from user and validate that it only contain Integers .it doesn't contain the negative element.
	 * @return Integer
	 */
    public static int userInput() {
	int number = 0;
	Scanner sc = new Scanner(System.in);
	try {
	    number = sc.nextInt();
	    if (number < 0) {
		System.out.println("Number can't be negative.");
		number = userInput();
	    }
	    return number;
	} catch (InputMismatchException e) {
	    System.out.println("\nPlease Enter only integer.");
	    number = userInput();
	}
	return number;
    }

	/**This function takes string input from user and validate that it only contain Integers.
	 * @return Integer
	 */
    public static int userInputInArrayList() {
	int number = 0;
	Scanner sc = new Scanner(System.in);
	try {
	    number = sc.nextInt();
	    return number;
	} catch (InputMismatchException e) {
	    System.out.println("\n Please Enter only integer.");
	    number = userInputInArrayList();
	}
	return number;
    }
    /**This function takes string input from user and validate neither it is empty nor it is contains only spaces. 
  	 * @return String
  	 */
    public static String userInputForString() {
	Scanner scanner = new Scanner(System.in);
	String detail = scanner.nextLine();
	if (detail.replaceAll("\\s", "").isEmpty()) {
	    System.out.println("Please Enter valid string.");
	    detail = userInputForString();
	}

	return detail;
    }

  
    /**This function used to print the displayMenue for sorting system. 
 	 * @return String
 	 */
    public static void menueDisplay() {
	System.out.println("1. Insert an Element in a list.");
	System.out.println("2. Linear Sorting. If List contain only positive elements than you can select Linear Sorting.");
	System.out.println("3. Comparison Sorting.");
	System.out.println("4. Display list.");
	System.out.println("5. Exit.");

	System.out.println("Enter your choice: ");

    }
    /**This function used to print the displayMenue for For SortedTree. 
   	 * @return String
   	 */
    public static void menueDisplayForSortedTree() {
    	System.out.println("1.Enter the student's roll number");
    	System.out.println("2. Display student's roll.");
       	System.out.println("3. Exit.");

    	System.out.println("Please Enter your choice: ");

        }
    public static void print(Object string) {
		System.out.println(string);
	}
}
