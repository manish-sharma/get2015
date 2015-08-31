/**class for performing room allotment to customers
 * based on their age
 * 
 * @author Gaurav Saini
 * Date : 31/08/2015
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class RoomAllotment {
	
	//main method
	public static void main(String[] args) {
		final int ROOM_COUNT = 13;
		Scanner scan = null;
		BufferedReader br = null;
		try {
			scan = new Scanner(System.in);
			String name;
			int age, i, count = 1, roomNumber, hashCode, choice;
			boolean flag = true;
			Enumeration<Integer> roomNumbers;
			
			br = new BufferedReader(new InputStreamReader(System.in));					//to read customer names from user
			
			Hashtable<Integer, String> rooms = new Hashtable<Integer, String>();		//hashmap for storing allotment list
			
			for(i = 0; i < ROOM_COUNT; i++)					//initially all rooms are empty
				rooms.put(i, "");
			
			do {
				flag = true;
				System.out.println("1. Show room allotment list");				//showing the menu
				System.out.println("2. Allot room to customer");
				System.out.println("3. Get room status");
				System.out.println("4. Get person status");
				System.out.println("5. Exit");
				System.out.println("Enter your choice: ");
				do {
					while(!scan.hasNextInt()) {
						System.out.println("Enter valid input");
						scan.next();
					}
					choice = scan.nextInt();
				} while(choice <= 0 || choice >= 6);
				
				switch(choice) {

					case 1:											//showing the room allotment list
						System.out.println("room allotment list is : ");
						roomNumbers = rooms.keys();
						while(roomNumbers.hasMoreElements()) {
					         roomNumber = roomNumbers.nextElement();
					         System.out.println("Room no. " + (roomNumber) + " : " +
					        		 rooms.get(roomNumber));
						}
					    break;
				    
					case 2:											//adding new customer in room
						System.out.println("enter name : ");
						name = br.readLine();
						
						System.out.println("Enter age of the guest : (age >= 18)");
						do {
							while(!scan.hasNextInt()) {
								System.out.println("Please Enter Integer Number");
								scan.next();
							}
							age = scan.nextInt();
						} while(age < 18);
						
						hashCode = age % ROOM_COUNT;
						
						for(i = hashCode; i <= (ROOM_COUNT - 1);) {					//searching for empty room
							if(rooms.get(i).equals("")) {
								rooms.put(i, name);
								System.out.println("Room number " + i + " is alloted to " + name);				//allotting room to customer
								flag = false;
								break;
							}
							else
								i += 3;									//increasing room number by 3 (Quadratic probing for collision resolution)
						}
						
						i = 0;
						while(flag) {					//if all rooms are checked, then start again from room no. 0
							for(int j = i; j <= (ROOM_COUNT - 1); j++) {
								if(rooms.get(j).equals("")) {
									rooms.put(j, name);
									System.out.println("Room number " + j + " is alloted to " + name);			//allotting room to customer
									flag = false;
									break;
								}
								else
									j += 3;
							}
							i++;
						}
						count++;
						break;
						
					case 3:								//showing status of room
						System.out.println("Enter Room Number: ");
						do {
							System.out.println("(Please enter valid room number)");
							while(!scan.hasNextInt()) {
								System.out.println("Please Enter Integer Number");
								scan.next();
							}
							roomNumber = scan.nextInt();
						} while(roomNumber < 0 || roomNumber > (ROOM_COUNT - 1));
						
						if(rooms.get(roomNumber) != "")					//showing allotment status of room
							System.out.println("Room no. " + roomNumber + " is alloted to " + rooms.get(roomNumber));
						else
							System.out.println("Room is empty");
						break;
						
					case 4:
						boolean flag2 = false;
						roomNumber = 0;
						
						/* Inputting name of the person */
						System.out.println("Enter Name: ");
						name = br.readLine();
						
						/* Get all keys of the hashtable */
						roomNumbers = rooms.keys();
						
						/* Searching for the person by using key */
						while(roomNumbers.hasMoreElements()) {
							roomNumber = roomNumbers.nextElement();
							if(rooms.get(roomNumber).equalsIgnoreCase(name)) {
					        	flag2 = true;
								break;
							}
						}
						
						/* If person is found then room number will be displayed */
						if(flag2 == true)
							System.out.println(name+" is alloted room Number "+ roomNumber);
						
						/* If person is not found then this code will be executed */
						else
							System.out.println("Not alloted any room to "+name);
						break;
						
					case 5:				//exit case
						System.exit(0);
						break;
					
					default:			//default case
						System.out.println("Enter valid choice");
				}
			} while(count <= ROOM_COUNT);
			
			if(count == ROOM_COUNT)
				System.out.println("no empty rooms available");
			
			System.out.println("Rooms allotment list is: ");
			roomNumbers = rooms.keys();
			while(roomNumbers.hasMoreElements()) {
		         roomNumber = roomNumbers.nextElement();
		         System.out.println("Room no. " + (roomNumber) + " : " +
		         rooms.get(roomNumber));
			}
			scan.close();
			br.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			scan.close();
		}
	}
}