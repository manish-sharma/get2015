package ProjectCompany.Utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/** Utility class for validation */
/**
 * 
 * @author Khemanshu
 *
 */
public class Utility {

	/** Method to validate Name */
	public static String readString(String message) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		boolean status = true;
		System.out.println(message);
		do {
			try {
				name = bufferedReader.readLine().trim();
			} catch (IOException io) {
				System.out.println("Error Occured Please input again");
				continue;
			}
			if(name.equals("")) {
				System.out.println("Enter a Valid Name");
				continue;
			}
			char[] array = name.toCharArray();
			for(char ch : array) {
				if((!Character.isLetter(ch)) && !(ch == ' ')) {
					System.out.println("Enter a Valid Name");
					status = false;
					break;
				}
			}
			if(!status) {
				status = true;
				continue;
			}
			break;
		} while(true);
		return name;
	}
	
	/** Method to validation for integer value */
	public static int getIntegerValue(String message)
	{
		int choice;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		do {// Validation
			while (!scan.hasNextInt()) {
			System.out.println("That's not a integer!Please enter again");
			scan.next(); 
			}
			choice = scan.nextInt();
			} while (choice >= 3 || choice <= 0);
		return choice;
	}
	
	/** Method to validation for integer value */
	public static int getChoice(String message)
	{
		int choice;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		while (!scan.hasNextInt()) {
			System.out.println("That's not a integer!Please enter again");
			scan.next(); 
		}
		choice = scan.nextInt();
		return choice;
	}
}
