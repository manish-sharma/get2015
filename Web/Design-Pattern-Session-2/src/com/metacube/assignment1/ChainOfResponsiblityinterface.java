package com.metacube.assignment1;

import java.util.Scanner;
/**
 * Name: ChainOfResponsiblityInterface
 * @author Gaurav Saini
 * Since: 22 October,2015
 * Description: User Interface
 **/
public class ChainOfResponsiblityinterface
{
	/**
	 * Name: main
	 * @param args
	 * Description: User Interface
	 **/
	public static void main(String[] args)
	{
		// Initializing the object
		Approver mentorObject = new Mentor();
		Approver seniorMentorObject = new SeniorMentor();
		Approver hrManagerObject = new HrManager();

		mentorObject.SetSuccessor(seniorMentorObject);
		seniorMentorObject.SetSuccessor(hrManagerObject);

		System.out.println("Leave Application");
		System.out.println("Enter no Of days For Leave");

		int n = new Scanner(System.in).nextInt();
		mentorObject.ProcessRequest(n);
	}
}