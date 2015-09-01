/**
 *  @author : Pooja Khandelwal
 * @created Date : 31/08/2015
 * @Name : HotelManagement Class
 * @Description : this class extend the Hotel Class and it will do the manangement work 
 * in hotel i.e. allocate room to the guest if any rooom is vacant in the hotel 
 */
package com.hotel.roomAllocation;

import java.util.HashMap;
import java.util.Hashtable;

public class HotelManagement extends Hotel {
	private int roomKey;
	public static int allocatedRooms;
	private Hashtable<Integer, String> hotel = new Hashtable<Integer, String>();

	/**
	 * @Name : default constructor of HotelManagement class
	 * 
	 * @Description : initiallize class variables by 0
	 */
	HotelManagement() {
		allocatedRooms = 0;
		roomKey = 0;
	}

	/**
	 * @Name : allocateRoomToTheGuest() function
	 * 
	 * @param :guestName(name of new guest),guestAge(age of new guest)
	 * 
	 * @Description : this function will allocate room to the new guest on the
	 * basis of guest'age;if there is conflict between age of 2 or more guests
	 * then the b=next room will be allocated to new guest
	 * 
	 * @Return : nothing
	 */
	public void allocateRoomToTheGuest(String guestName, int guestAge) {

		roomKey = guestAge % getTotalRooms();
		int allocationFlag = 0;
		while (allocationFlag == 0) {
			if (hotel.get(roomKey) == null) {
				hotel.put(roomKey, guestName);
				System.out.println("Room no. " + roomKey + " allocated to "
						+ hotel.get(roomKey));
				allocationFlag = 1;
				++allocatedRooms;
			} else if (roomKey < getTotalRooms() - 1) {
				roomKey++;
			} else {
				roomKey = 0;
			}
		}
	}

	/**
	 * @Name : viewRoomsList() function
	 * 
	 * @param : nothing
	 * 
	 * @Description :it will show all the rooms and there allocation
	 * 
	 * @Return : nothing
	 */
	public void viewRoomsList() {
		int i;
		String roomsAllocatedTo;
		System.out.println("*-----Rooms Allocation-----*");
		System.out.println("Room        Allocated To");
		for (i = 0; i < getTotalRooms(); i++) {
			roomsAllocatedTo = hotel.get(i);
			if(roomsAllocatedTo!=null){
			System.out.println("  "+i+"           " + roomsAllocatedTo);
			}
		}
	}

}
