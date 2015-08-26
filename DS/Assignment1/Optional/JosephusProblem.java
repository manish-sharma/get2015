package question7;

import java.util.Scanner;

public class JosephusProblem {
	public static void main(String []args) {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("\t\tJosephus Problem \nHere You will provide total number of peoples and a positive number m"
				+ "we will remove every mth person and finally who left alone will be the winner");
		System.out.println("Enter total number of peoples: ");
		int numberOfPeoples = scannerObject.nextInt();
		int array[] = new int[numberOfPeoples];
		
		System.out.print("Enter value of m");
		int valueOfM = scannerObject.nextInt();
		int startPosition = 0 ;
		for( int counter = 0 ; counter < numberOfPeoples ; counter++ ) {
			array[counter] = counter + 1 ;
		}
		for( int counter = 1 ; counter <= numberOfPeoples ; counter++ ) {
			array[( counter * valueOfM ) % numberOfPeoples] = -1;
			System.out.println("Person "+((counter * valueOfM) % numberOfPeoples )+" Removed/Out");
			for(int value : array) System.out.print(value+"  ");
			System.out.println();
		}
	}
}
