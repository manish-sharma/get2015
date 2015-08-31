/**
 * @author Girdhari
 * Program to implement scenario of guest rooms
 */

package hash;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

/* Start of Hash class */
public class Hash {

	private final int numberOfRooms = 29;
	private final int numberOfGuest = 0;

	void allotRoom() {
		boolean flag;
		int choice, roomNumber, hashCode;
		Enumeration<Integer> roomNumbers;
		Hashtable<Integer, String> roomsHash = new Hashtable<Integer, String>();
		Scanner scannerObject = new Scanner(System.in);
		try {	
			for (int count = 0; count < numberOfRooms; count++)	{
				roomsHash.put(count, "");
			}
			int count = 0;
			do {
				flag = true;
				System.out.println("1. Show  Booked Status of rooms");
				System.out.println("2. Allot room to a guest based on age");
				System.out.println("3. Exit");
				
				do {
					System.out.println("Enter your Choice: ");
					choice = scannerObject.nextInt();
				} while (choice <= 0 || choice >= 4);

				int age;
				switch (choice) {
				case 1:
					System.out.println("Status of  Alloted rooms is: ");
					roomNumbers = roomsHash.keys();
					while (roomNumbers.hasMoreElements()) {
						roomNumber = roomNumbers.nextElement();
						System.out.println("Room " + (roomNumber) + " : "+ roomsHash.get(roomNumber));
					}
					break;
				case 2:
					System.out.println("Enter name of guest: ");
					String name = scannerObject.next();
					System.out.println("Enter age of the guest: ");
					do {
						System.out.println("(Please Enter Positive integer Number greater than 18)");
						age = scannerObject.nextInt();
					} while (age <= 18);
					hashCode = age % numberOfRooms;
					for ( count = hashCode; count <= (numberOfRooms - 1); count = count + 3 ) {
						if (roomsHash.get(count).equals("")) {
							roomsHash.put(count, name);
							System.out.println("Room number " + count + " is alloted to " + name);
							flag = false;
							break;
						} 
						
					}
					count = 0;
					// if not alloted then switch to this loop
					while (flag) {
						for (int count2 = count; count2 <= (numberOfRooms - 1); count2++) {
							if (roomsHash.get(count2).equals("")) {
								roomsHash.put(count2, name);
								System.out.println("Room number " + count2 + " is alloted to " + name);
								flag = false;
								break;
							}
							else {
								count2 += 3;
							}
						}
						count++;
					}
					count++;
					break;
					// Exiting the System
				case 3:
					System.out.println("System will Exit");
					System.exit(0);
					break;

				default:
					System.out.println("Enter correct Choice");
				}
			} while (count < numberOfRooms);

			System.out.println("All Rooms are full now");
			System.out.println("Status of rooms is: ");
			roomNumbers = roomsHash.keys();
			
			while (roomNumbers.hasMoreElements()) {
				roomNumber = roomNumbers.nextElement();
				System.out.println("Room " + (roomNumber + 1) + " : " + roomsHash.get(roomNumber));
			}
		} 
		catch(NumberFormatException exception) {
			System.out.println("You have entered a wrong number / please provide integer numbers only!!");
		}
		catch (Exception exception) {
			System.out.println("Unhandled Error Occured!!");
		}
	}
	/* Starting of isValidCondition */
	boolean isValidCondition() {
		return numberOfRooms > numberOfGuest;
	}

	/* End of isValidCondition */
	/* Starting of isPrime function */
	boolean isPrime(int number) {
		for (int count = 2; count > number / 2; count++) {
			if (number % count == 0) {
				return false;
			}
		}
		return true;
	}
	/* Ending of isPrime function */
}
/* End of Hash Class */
