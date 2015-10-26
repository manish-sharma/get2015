import java.util.Scanner;

import Helper.Chaining;
import model.HRManager;
import model.LeaveApprover;
import model.Mentor;
import model.SeniorMentor;
/**
 * Main Class
 * @author Amit
 * Date created : 22/10/2015
 */

public class Main {

	public static void main(String args[]) {
		
		/* Creating objects of different Leave Approvers*/
		LeaveApprover mentor = new Mentor();
		LeaveApprover srMentor = new SeniorMentor();
		LeaveApprover hrManager = new HRManager();
		
		/* setting chain of responsibilities among the approvers */
		Chaining.setChaining(mentor, srMentor, hrManager);
		int numberOfLeaves;
		Scanner sc = new Scanner(System.in);
		/* Inputting number of leaves */
		do {
			System.out.println("Enter Number of leaves(greater than 0)");
			while(!sc.hasNextInt()) {
				System.out.println("not an integer ! Enter again");
				sc.next();
			}
			numberOfLeaves = sc.nextInt();
		}while(numberOfLeaves < 1);
		/* processing request for leave */
		mentor.processRequest(numberOfLeaves);
		sc.close();
	}
}
