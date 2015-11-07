package programingFundamental4;

import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TowerOfHanoi {
	List<String> result = new ArrayList(); // It stores the result in the form of list of string.

	/** used to track the movement of each disk on each tower.
	 * @param source is the name of source tower.
	 * @param destination is the name f destination tower.
	 * @param temp is the name of intermediate tower.
	 * @param numOfDisk is the no. disk for which user want's to check. 
	 * @return the list of string.
	 */
	public List<String> towerOfHanoi(String source, String destination,String temp, int numOfDisk) {
		if (numOfDisk == 1) {
			result.add("Move Disk " + numOfDisk + " from " + source + " to "
					+ destination);

			return result;
			// System.out.println("disk"+numOfDisk+source + " -> " +
			// destination);
		} 
		else {
			towerOfHanoi(source, temp, destination, numOfDisk - 1);
			result.add("Move Disk " + numOfDisk + " from " + source + " to "
					+ destination);

			// System.out.println("disk"+numOfDisk+source +" -> "+destination);
			towerOfHanoi(temp, destination, source, numOfDisk - 1);

		}
		return result;
	}
	/** reads the input from user.
	 */
	public void readInput() {
		int noOfDisk = 0;
		Scanner input = new Scanner(System.in);
		int option=1;
		while(option==1){
			System.out.println("enter the no of disk");
			try {
				noOfDisk = input.nextInt();
			} catch (InputMismatchException e) {
				System.out
						.println("enter only integer value in noOfDisk next time");
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("enter the name of source tower.");
			String source = new String();
			source = input.next();
			System.out.println("enter the name of Destination tower.");
			String destination = new String();
			destination = input.next();
			System.out.println("enter the name of tempraory tower.");
			String temp = new String();
			temp = input.next();
			result = towerOfHanoi(source, destination, temp, noOfDisk);
			for (String str : result) {
				System.out.println(str);
			}
			System.out.println("enter 1 to continue");
			try{
				option=input.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("enter correct valur next time");
				option=0;
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}

	public static void main(String args[]) {
		TowerOfHanoi obj = new TowerOfHanoi();
		obj.readInput();

	}
}
