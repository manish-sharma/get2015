package attendence;

import java.util.Scanner;

public class MainClass {
	private static Scanner scanner;

	public static void main(String args[]) {
		scanner = new Scanner(System.in);
		
		Approver mentor=new Mentor();
		Approver seniorMentor=new SeniorMentor();
		Approver HRManager=new HRManager();
		
		System.out.println("Enter no of leave appyling : ");
		int days=scanner.nextInt();
		
		//validation check
		if (days<1) {
			System.out.println("Invalid Leave Application!!!!!!!!!!");
		}
		else if (days>31) {
			System.out.println("Maximum 30 days leave can be applied...");
		}else {
			//set successor 
			mentor.setSuccessor(seniorMentor);
			seniorMentor.setSuccessor(HRManager);

			mentor.processRequest(days);
		}
	}	
}
