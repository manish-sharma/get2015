package Assignments;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

//Class for solving the problem of tower of hanoi for n number of disks. Top most disk is considered as number n and the bottom most and largest one is numbered 1.
public class Assignment1 {
	static List<String> Result; // Object of List String type is declared

	public static void main(String[] args) {

		Result = new ArrayList<String>();
		int numberOfDisk;
		Assignment1 towerHanoi = new Assignment1();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of Disk for Tower Of Hanoi");
		numberOfDisk = sc.nextInt();
		if (numberOfDisk > 0) {
			Result = towerHanoi.towerOfHanoi("A", "B", "C", numberOfDisk); // Received Result
			Iterator<String> itr = Result.iterator(); 			// getting Iterator from arraylist to traverse elements
			while (itr.hasNext()) { 					// hasNext() gives value true if next string is present in the list
				System.out.println(itr.next()); // next() returns the next string in list
			}
		}

	}

	List<String> towerOfHanoi(String source, String destination, String temp,
			int n) // function for solving the problem of tower of hanoi for n
					// number of disks
	{
		if (n == 1) {
			Result.add("Move Disk  " + n + "   " + source + "->" + destination); // moves																				// destination
		} else {
			towerOfHanoi(source, temp, destination, n - 1); // moves top n-1 disk from source to temporary location
			Result.add("Move Disk  " + n + "   " + source + "->" + destination); // moves nth disk from source to destination
			towerOfHanoi(temp, destination, source, n - 1); // moves n-1 disk from temporary to destination location
		}
		return Result;

	}
}
