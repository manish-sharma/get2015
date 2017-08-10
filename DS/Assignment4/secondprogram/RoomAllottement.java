package secondprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Class that handles all room allottement of the guest visiting hotel
 * 
 * @author Riddhi
 *
 */
public class RoomAllottement {

	HashMap<Integer, String> roomsAllotted;
	List<Rooms> room;

	// Constructor
	public RoomAllottement() {
		roomsAllotted = new HashMap<Integer, String>();
		room = new ArrayList<Rooms>();
	}

	// method that allots the room based on index and put the value in hashmap
	public boolean allotingRooms(int index, Guest objectOf) {
		// if index is smaller than number of rooms and room is available than
		// that room is allocated
		if (index < room.size() && room.get(index).isOccupied() == false) {
			room.get(index).setOccupied(true);
			roomsAllotted.put(room.get(index).getNumber(), objectOf.getName());
			return true;
		}
		// if index is smaller than room size and room is not available than the
		// index value is incremented and next available room is alloted
		else if (index < room.size() && room.get(index).isOccupied() == true) {
			allotingRooms(index + 2, objectOf);
		}
		// if end of room list is reached than function is recursively called
		// from starting
		else {
			index = 0;
			allotingRooms(index, objectOf);
		}

		return true;
	}

	// method used to print guest and its room alloted
	public void print() {
		Iterator<?> i = roomsAllotted.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry pair = (Map.Entry) i.next();
			System.out.println("Room : " + pair.getKey() + " "
					+ "Allotted to : " + pair.getValue());
		}

	}

	// method to deallocate the room
	public String checkOut(int roomNumber) {
		String name = roomsAllotted.get(roomNumber);
		roomsAllotted.remove(roomNumber);
		return name;

	}

}
