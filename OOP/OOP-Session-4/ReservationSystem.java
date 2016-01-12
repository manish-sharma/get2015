/*
 * User can see List of trains train
 * @author Banwari
 */
import java.util.Scanner;
import java.io.*;
public class ReservationSystem {

	public static void main(String [] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		User user = new User();
		
		 System.out.print("Enter the User Name: ");
		 String name=sc.nextLine();
		 
		 System.out.print("Enter the UserId: ");
		 String id=sc.nextLine();
		 
		 System.out.print("Enter the User Contact Number: ");
		 String contNum=sc.nextLine();
		
		user.userRegistration(name,id,contNum);
		
		Trains trains= new Trains();
		
		
		// Choice of train type 
		System.out.println("Enter the tpye of trains : ");
		MenuNew menuNew = new MenuNew();		
		
		
	
	}
}
