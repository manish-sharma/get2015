package com.ds8.sortingapplication;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class makes sure that the input entered by user is integer
 * 
 * @author Shishir Date 4th September 2015
 */
public class Utility {
	static Scanner sc = null;

	// checks for incorrect integer input
	public static int checkInteger() {
		int number = 0;
		try {
			sc = new Scanner(System.in);
			number = sc.nextInt();
			return number;
		} catch (InputMismatchException e) {
			System.out.println("Enter a valid integer value");
			number = checkInteger();
		}
		return number;
	}

	// checks for incorrect string input
	public static String checkString() {
		String name = sc.nextLine();
		return name;

	}

	// checks for incorrect double input
	public static Double checkDouble() {
		double number = 0;
		try {
			sc = new Scanner(System.in);
			number = sc.nextDouble();
			return number;
		} catch (InputMismatchException e) {
			System.out.println("Enter a valid double value");
			number = checkInteger();
		}
		return number;

	}
}
