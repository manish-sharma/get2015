package Assignment1;

import java.util.Scanner;

/**
 * @author Chetna
 * Logger class (Singleton) to log application exceptions in Log file
 */
public class LoggerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int firstValue;
		int secondValue;	
		int choice=0;
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first value");
		firstValue = scanner.nextInt();
		System.out.println("Enter second value");
		secondValue = scanner.nextInt();
		calculator.setFirstValue(firstValue);
		calculator.setSecondValue(secondValue);
		
		do{
			System.out.println("Enter 1 for addition");
			System.out.println("Enter 2 for subtraction");
			System.out.println("Enter 3 for multiplication");
			System.out.println("Enter 4 for devision");
			System.out.println("Enter 5 for exit");
			System.out.println("Enter your choice");
			choice= scanner.nextInt();
			switch(choice){
				case 1:
					System.out.println(calculator.addition());
					break;
				case 2:
					System.out.println(calculator.subtraction());
					break;
				case 3:
					System.out.println(calculator.multiplication());
					break;
				case 4:
					System.out.println(calculator.division());
					break;
				case 5:
					System.exit(0);
					break;
				default :
					System.out.println("Enter correct choice");
					break;
			}
		}while(choice!=5);
		scanner.close();
	}
}
