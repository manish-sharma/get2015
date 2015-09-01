/**
 * @author : Pooja Khandelwal
 * @created Date : 31/08/2015
 * @Name : Hotel Class
 * @Description : this class will set the value of total no. of rooms available in Hotel 
 * this is a pojo class which have getter,setter method for total rooms
 */
package com.hotel.roomAllocation;

public class Hotel {
	private static int totalRooms;

	/*
	 * @Name : getTotalRooms
	 * 
	 * @param : nothing
	 * 
	 * @Description : this is a static getter method to get the value of total
	 * no. rooms in hotel
	 * 
	 * @return : totalRooms(total rooms available in hotel)
	 */
	public static int getTotalRooms() {
		return totalRooms;
	}

	/*
	 * @Name : setTotalRooms
	 * 
	 * @param : totalRooms(total rooms available in hotel)
	 * 
	 * @Description : this is a static setter method to set the value of total
	 * no. rooms in hotel
	 * 
	 * @return : nothing
	 */
	public static void setTotalRooms(int totalRooms) {
		Hotel.totalRooms = totalRooms;
	}

}
