import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

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
	 
	static String employeeIdInput()
	{
		String employeeId;
	   employeeId=userInputForString();
	   if(!employeeId.matches("[a-zA-Z0-9]*")){
		   System.out.println("Please Enter Correct Employee Id");
			 employeeId = userInputForString();
		  }
	   return employeeId;
		
				
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
