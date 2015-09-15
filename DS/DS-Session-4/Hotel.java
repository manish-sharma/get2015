/*
 * This class for hotel rooms allotment between guest using their age
 * @author Banwari kevat
 */

import java.util.Scanner;
public class Hotel {
	//name of hotel
	private String hotelName;
	//array as room
	private String[] room;
	
	/*
	 * Parameterized constructor
	 * @param hotelNmae is the name of hotel
	 * @param numberOfRoom is the total vacate room
	 */
	Hotel (String hotelName, int numberOfRoom)
	{
	    this.hotelName = hotelName;	
	    //create room
	    this.room = new String[numberOfRoom];
	}
	//return total number of room
	int getNumberOfRoom()
	{
		return room.length;
	}
	/*
	 * This method allot room to the guest according his age
	 * @param guestNumber is the number of guest
	 * @param age is the age of guest
	 */
	public void allot(int guestNumber , int age)
	{   
		//roomNumber is calculated using age and total number of room
		int roomNumber = age % room.length;
		//search vacate room
		while(room[roomNumber] != null) 
		{   //search for next room
			roomNumber = (roomNumber+1) % room.length;
		}
		room[roomNumber] = "Guest-"+(guestNumber+1);
	}
	
	//This method display the room and correspondence  room
	public void displayAllotment() {
		System.out.println("Room Number\t\tGuest");
		for(int i=0 ; i< room.length; i++) 
		{
		    System.out.println((i+1)+"\t\t"+room[i]);
		}

	}
	
	public static void main(String [] arg) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Name of Hotel:   ");
		String hotelName = sc.next();
		System.out.print("Enter Number of available room in\n "+hotelName+"(MUST BE PRIME NUMBER) :  \n");
	    try {
	    	int numberOfRoom = Integer.parseInt(sc.next());
	        Hotel hotel = new Hotel(hotelName, numberOfRoom);
		    System.out.println("Enter Number of Guest(MUST BE LESS THEN NUMBER OF ROOM): ");
		    int numberOfGuest = Integer.parseInt(sc.next());
            if( numberOfRoom >= numberOfGuest )   
              {
             	for(int i = 0 ; i < numberOfGuest; i++ ) 
		         {
		         	System.out.println("Enter the age of Guest"+i);
		            int age = Integer.parseInt(sc.next());
		            hotel.allot( i , age); 
		         }
               hotel.displayAllotment();
             } 
           else 
               {
        	       System.out.println("Invalid input!!!!");
               }
	        }
	    catch(NumberFormatException e) 
	    {
	    	System.out.println("Invalid Input !!!");
	    }
	}

}
