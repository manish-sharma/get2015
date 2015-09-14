package secondprogram;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Class that handles all room allottement of the guest visiting hotel
 * 
 * @author Riddhi
 *
 */
public class RoomAllottement {

	HashMap<Integer, String> roomsAllotted;
	List<Rooms> room;
	
	//Constructor
	public RoomAllottement() {
		roomsAllotted = new HashMap<Integer, String>();
		room = new ArrayList<Rooms>();
	}

	//method to give unique index for mapping
	public int hashFunction(int age, int totalRooms) {
		return age % totalRooms;

	}

	//method that allots the room based on index and put the value in hashmap
	public boolean allotingRooms(int index, Guest objectOf) {
		//if index is smaller than number of rooms and room is available than that room is allocated
		if (index < room.size() && room.get(index).isOccupied() == false) {      
			room.get(index).setOccupied(true);
			roomsAllotted.put(room.get(index).getNumber(), objectOf.getName());
			return true;
		}
		//if index is smaller than room size and room is not available than the index value is incremented and next available room is alloted
		else if (index < room.size() && room.get(index).isOccupied() == true) {
			allotingRooms(index + 2, objectOf);
		} 
		//if end of room list is reached than function is recursively called from starting
		else {
			index = 0;
			allotingRooms(index, objectOf);
		}
		
		return true;
	}

	//method used to print guest and its room alloted
	public void print() {
		Iterator i = roomsAllotted.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry pair = (Map.Entry) i.next();
			System.out.println("Room : " + pair.getKey() + " "
					+ "Allotted to : " + pair.getValue());
		}

	}

	//method to deallocate the room
	public String checkOut(int roomNumber) {
		String name = roomsAllotted.get(roomNumber);
		roomsAllotted.remove(roomNumber);
		return name;

	}

	public static void main(String args[]) {
		Scanner sc;
		try {
			 sc = new Scanner(System.in);
			RoomAllottement object = new RoomAllottement();
			RoomDetails objectOfRooms = new RoomDetails();
			Guest objectOfGuest;
			object.room = objectOfRooms.readInfo();
			int totalRooms = object.room.size();
			//menu to display
			int choice;
			do {
				System.out.println("1. Room Booking");
				System.out.println("2. Already Allotted Rooms");
				System.out.println("3. CheckOut");
				System.out.println("4. Exit");
				choice = sc.nextInt();
				switch (choice) {

				case 1:
					objectOfGuest = new Guest();
					System.out.println("Enter name");
					String name = sc.next();
					objectOfGuest.setName(name);
					System.out.println("Enter the age of guests");
					objectOfGuest.setAge(sc.nextInt());
					int index = object.hashFunction(objectOfGuest.getAge(),
							totalRooms);
					if (object.allotingRooms(index, objectOfGuest))
						System.out.println("Welcome :" + name);
					break;

				case 2://function to print all rooms alloted
					object.print();
					break;

				case 3:
					System.out.println("Enter the number of room");
					int roomNumber = sc.nextInt();
					name = object.checkOut(roomNumber);
					if (name != null)
						System.out.println("Thank you for visiting " + name);
					else
						System.out.println("Enter a valid room number");
					break;

				case 4:
					System.exit(0);

				default:
					System.out.println("Enter a valid input");

				}

			} while (true);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
