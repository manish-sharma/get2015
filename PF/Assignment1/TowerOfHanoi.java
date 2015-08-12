/** Title : Solve the tower of hanoi problem for n number of disks using recursion.
 * 
 * @author Gaurav Saini
 *
 */

import java.util.*;

public class TowerOfHanoi {
	
	static List<String> result;

	//main method
	public static void main(String[] args) {
		TowerOfHanoi obj1 = new TowerOfHanoi();
		Scanner sc = new Scanner(System.in);
		int disks = 0;										//number of disks in the problem
		String source = "A";								//source peg
		String destination = "B";							//destination peg
		String temp = "C";									//temporary or intermediate peg
		int testVar;										//used to execute the program until the user wants
		do {
		System.out.println("Enter the no. of disks. ");
		try{
			disks = sc.nextInt();						//to restrict user input to int only
		}
		catch(Exception e){
			System.out.println("Enter number only.");
			System.exit(0);
		}
		result = new ArrayList<String>();				//list to store the solution of the problem

		result = obj1.towerOfHanoi(source, destination, temp, disks);
		System.out.println("the solution is. ");
		for (String string : result)
			System.out.println(string);						//printing the solution
		System.out.println("\nDo you want to continue?\n  1. yes\n  0. no ");
		testVar = sc.nextInt();
		} while (testVar != 0);
		sc.close();

	}

	/*towerOfHanoi method accepts source, destination, temp and no. of disks as arguments
	 * and returns a list containing the solution of tower of hanoi problem.
	 */
	
	public List<String> towerOfHanoi(String source, String destination,	String temp, int numOfDisk) {

		if (numOfDisk == 1)								//numOfDisk holds the height of tower or the no. of disks
			result.add("Move Disk " + numOfDisk + " from " + source + " to " + destination);		//adding the movement to the list
		else{
			towerOfHanoi(source, temp, destination, numOfDisk - 1);
			result.add("Move Disk " + numOfDisk + " from " + source + " to " + destination);
			towerOfHanoi(temp, destination, source, numOfDisk - 1);
		}
		return result;							//return the list containing the solution
	}

}