/**
 * @author Girdhari
 * Queue Main class
 */
package queue;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Start of MainQueue */
public class MainQueue {
	/* Start of main function */
	public static void main(String args[]) {
		char choiceContinue = 0;
		Queue<Integer> operationOnQueue = new Queue<Integer>(Integer[].class, 10);

		boolean isCorrect = false;
		Scanner scannerObject = new Scanner(System.in);
		do {
			System.out.print("Menu: \n1.Insert Element\n"
					+ "2.Remove Element\n" 
					+ "3.Display Queue\n"
					+ "4.Clear Queue\n" 
					+ "5.Get Front and Rear\n");
			try {

				System.out.println("Enter your choice(1,2,3,4,5)");
				int choice = scannerObject.nextInt();
				switch (choice) {

				case 1:
					System.out.println("Enter A Number: ");
					int data = scannerObject.nextInt();
					isCorrect = operationOnQueue.insertElement(data);
					if (isCorrect)
						System.out.println("Element inserted");
					else
						System.out.println("Element not inserted");
					break;
				case 2:
					int frontData = operationOnQueue.deleteElement();
					if (frontData != -1)
						System.out.println("Element deleted");
					else
						System.out.println("Element not deleted");
					break;
				case 3:
					operationOnQueue.displayQueue();
					break;
				case 4:
					operationOnQueue.clearAll();
					break;
				case 5:
					System.out.println("Front=" + operationOnQueue.getFront()  
							+ " and Rear=" + operationOnQueue.getRear());
					break;

				default:
					System.out.println("Please Enter Correct Choice!!");
				}
			} catch (InputMismatchException exception) {
				System.out.println("You had entered a incorrect number!!");

			}
			System.out.println("Do You Want to perform more operations (Y / N)?");
			choiceContinue = readData(scannerObject);

		} while (choiceContinue == 'y' || choiceContinue == 'Y');
		scannerObject.close();

	}
	/* End of main function */
	/* Starting of readData function */
	public static char readData(Scanner scanner) {
		char data = 0;
		do {
			try {
				data = scanner.next(".").charAt(0);
			} catch (InputMismatchException io) {
				System.out.println("Error occurred please enter again");
				continue;
			}
			break;
		} while (true);
		return data;
	}
	/* End of readData function */
}
/* End of MainQueue class */
