import java.util.Scanner;
/**
 * main class 
 * @author Ankur
 * @since 23-10-2015
 */

public class ChainOfResponsiblityinterface {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Approver mentor = new Mentor();
		Approver seniorMentor = new SeniorMentor();
		Approver headHR = new HrManager();

		mentor.SetSuccessor(seniorMentor);
		seniorMentor.SetSuccessor(headHR);

		System.out.println("Enter the number of days you want to leave:");
		int day = scan.nextInt();
		if(day >= 1)
			mentor.ProcessRequest(day);
		else
			System.out.println("enter proper format");


	}

}
