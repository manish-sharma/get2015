package com.chain_of_responsibility;

import java.util.Scanner;
/**
 * @name Main
 * @author Sumitra
 * @Description this class use chain of responsibility design pattern
 */
public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String args[]) {
		int leave=0;
		System.out.println("Enter Days for Leave");
		while (!scanner.hasNextInt()) {
			System.out.println("Please Enter only Integer!");
			scanner.next();
			}
			leave = scanner.nextInt();
		Approval mentor = new Mentor();//creating object of mentor class
		Approval seniorMentor = new SeniorMentor();//creating object of seniorMentor class
		HR hr = new HR();//creating object of HR class
		mentor.setSuccessor(seniorMentor);//setting successor of mentor
		seniorMentor.setSuccessor(hr);
		//setting successor of seniorMentor
		mentor.ProcessRequest(leave);
	}
}

