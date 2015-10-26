import java.util.Scanner;

import Helper.Chaining;
import model.HRManager;
import model.LeaveApprover;
import model.Mentor;
import model.SeniorMentor;

public class Main {

	public static void main(String args[]) {

		LeaveApprover mentor = new Mentor();
		LeaveApprover srMentor = new SeniorMentor();
		LeaveApprover hrManager = new HRManager();

		Chaining.setChaining(mentor, srMentor, hrManager);
		int numberOfLeaves;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter Number of leaves(greater than 0)");
			while (!scanner.hasNextInt()) {
				System.out.println("not an integer ! Enter again");
				scanner.next();
			}
			numberOfLeaves = scanner.nextInt();
		} while (numberOfLeaves < 1);
		mentor.processRequest(numberOfLeaves);
		scanner.close();
	}
}
