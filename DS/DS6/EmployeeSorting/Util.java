package EmployeeSorting;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

	/**this function takes string input from user and validate that it only contain Integers
		 * @return String
		 */
	public static int userInput() {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		try {
			number = sc.nextInt();
			if (number < 0) {
				System.out.println("number can't be negative");
				number = userInput();
			}
			return number;
		} catch (InputMismatchException e) {
			System.out.println("\n enter only integer");
			number = userInput();
		}
		return number;
	}
	
	public static int userInputInArrayList() {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		try {
			number = sc.nextInt();
			return number;
		} catch (InputMismatchException e) {
			System.out.println("\n enter only integer");
			number = userInputInArrayList();
		}
		return number;
	}

	/**this function takes string input from user and validate neither it is empty nor it is contains only spaces. 
		 * @return String
		 */
	static String userInputForString() {
		Scanner scanner = new Scanner(System.in);
		String detail = scanner.nextLine();
		if(detail.replaceAll("\\s","").isEmpty())
		{
			System.out.println("Please Enter valid string");
		    detail=userInputForString();
		}
		
		    return detail;
	}
	 /** takes input from user and validate either it contains alphabet or digits only
		 * @return String
		 */
	static String employeeIdInput()
	{
		String employeeId;
	   employeeId=userInputForString();
	   if(!employeeId.matches("[a-zA-Z0-9]*")){
		   System.out.println("Please Enter Correct Employee Id");
			 employeeId = userInputForString();
		  }
	   return employeeId;
		
	   /**this function takes input from user and validates that it contains only alphabet
		 * @return String
		 */			
	}
	 static String employeeNameInput() {
		 String name;
		 Scanner scanner = new Scanner(System.in);
		 name = userInputForString();
		
		 if(!name.matches("[a-z A-Z]*")) {
			 System.out.println("name doesn't contain numbers, kindly enter correct name");
			 name = employeeNameInput();
		 }
		 return name;
	 }

  
}
