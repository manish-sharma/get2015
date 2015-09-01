/*
 * @author : Pooja Khandelwal
 * @created Date :31/08/2015
 * @Name : RoomAllocationMainClass Class
 * @Description : this is the main class which handle the task of allocating  room to the new guest
 */
package com.hotel.roomAllocation;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.menu.hotel.roomAllocation.Menu;

public class RoomAllocationMainClass {
	private static int guestAge;
	private static String guestName;

	public static void main(String args[]) {
		String totalRooms1 = null;
		Scanner scan = new Scanner(System.in);
		
	String regix="[0-9]+";
	do{
		System.out.println("Total no. of rooms in your hotel ??");
			totalRooms1 = scan.next();
		} while(!(totalRooms1.matches(regix)));
			
		int totalRooms=Integer.parseInt(totalRooms1);
		Hotel.setTotalRooms(totalRooms); // call setTotalRooms() function of Hotel class
		HotelManagement hotelManagement = new HotelManagement(); // HotelManagement Class object
		String manager_s_Choice1=null;
		int manager_s_Choice = 0;
		Menu menu = new Menu(); // Menu class object
		int exitFlag = 1;
		while (exitFlag != 0) {
			do{
				menu.displayMenu(); // call displayMenu() function of Menu class
			    manager_s_Choice1= scan.next();
			  } while(!(manager_s_Choice1.matches(regix)));
			  manager_s_Choice=Integer.parseInt(manager_s_Choice1); 
			switch (manager_s_Choice) {
			case 1:
				if (HotelManagement.allocatedRooms < Hotel.getTotalRooms()) {
					System.out.println("Enter guest's name");
						guestName = scan.nextLine();
						guestName = scan.nextLine();
		                String guestAge1=null;
					    do{
					    	 System.out.println("Enter guest's age");
						     guestAge1 = scan.next();
					    } while(!(guestAge1.matches(regix)));
					guestAge=Integer.parseInt(guestAge1);
					hotelManagement.allocateRoomToTheGuest(guestName, guestAge); // call allocateRoomToTheGuest() function of HotelManagement Class
				} else {
					System.out
							.println("All rooms are full, room is not available");
				}
				break;
			case 2:
				hotelManagement.viewRoomsList(); // call viewRoomsList() function of HotelManagement Class
				break;
			case 3:
				exitFlag = 0;
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid choice");
				break;
			}
		}
		scan.close();

	}

}
