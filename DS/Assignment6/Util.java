package ds6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**this class id responsible for taking input from user via console
 * @author Khemanshu
 *
 */
public class Util {

	 /**takes string input from user and validate neither it is empty nor it is contains only spaces. 
	 * @return
	 */
	static String userInput() {
		String input;
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine();
		if(input.replaceAll("\\s", "").isEmpty()) {
			 System.out.println("you cannot enter a blank string , kindly enter a valid string");
			 input = userInput();
		 }
		return input;
	 }
	 
	 /** takes input from user and validate either it contains alphabet or digits only
	 * @return
	 */
	static String employeeIdInput() {
		 String Id;
		 Id = userInput();
		 if(Id.matches("[a-zA-Z0-9]*")) {
			 return Id;
		 }
		 else {
			 System.out.println("Id contains only alphabet and digit, kindly enter correct Id");
			 Id = employeeIdInput();
		 }
		 return Id;
	 }
	 
	 /**takes input from user and validates that it contains only alphabet
	 * @return
	 */
	static String employeeNameInput() {
		 String name;
		 name = userInput();
		 if(name.matches("[a-z A-Z]*")) {
			 return name;
		 }
		 else {
			 System.out.println("name doesn't contain numbers, kindly enter correct name");
			 name = employeeNameInput();
		 }
		 return name;
	 }
	  
	/**take input choice from user
	 * @return
	 */
	static int userChoice() {
		int number;
		Scanner scanner = new Scanner(System.in);
		try{
			number = scanner.nextInt();
			return number;
		}
		catch(InputMismatchException e) {
			System.out.println("enter only integer");
			number = userChoice();
		}
		return number;
	}
}
