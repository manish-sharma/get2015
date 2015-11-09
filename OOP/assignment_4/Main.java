package assignmentOOP_3;
import java.util.Scanner;


/**
 * 
 
 * Description: This class contains the main function
 *
 */
public class Main {
	static Scanner sc=new Scanner(System.in);
	static int valid=0;
	
	
	
	/**
	 * This is the main function
	 */
	public static void main(String args[])
	{
		TrainReservationSystem trainReservationSystem=new TrainReservationSystem();
		trainReservationSystem.readTrainChart();
		System.out.print("WELCOME...");
		ConsoleMenuItem cm=new ConsoleMenuItem();
		int i=0;
		cm.setMenu();
		Menu m=new Menu();
		do{
			i=m.displayMenu(trainReservationSystem);
			
			}while(i==1);
	}
	
}