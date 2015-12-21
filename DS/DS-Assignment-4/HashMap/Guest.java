package HashMap;

import java.util.Hashtable;
import java.util.Map;

public class Guest {
	String customerName;
	int customerAge;
	int roomNo;
	int noOFRoomsInHotel;
	int temp = 0; // Temporary variable to hold information

	static Hashtable<Integer, Guest> hashTable = new Hashtable<Integer, Guest>();

	public Guest(String customerName, int customerAge, int noOFRoomsInHotel) {
		// Parameterized constructor
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.noOFRoomsInHotel = noOFRoomsInHotel;
	}

	void roomAllotment(Guest guest) {
		// Function for allocating room by calculating hash table index by
		// customer age
		int flag = 0, temp2;
		roomNo = customerAge % noOFRoomsInHotel;
		temp2 = roomNo;
		while (roomNo < noOFRoomsInHotel) {
			if (hashTable.get(roomNo) == null) {
				hashTable.put(roomNo, guest);
				flag = 1;
				break;
			} else {
				roomNo++;
			}
		}
		while (temp < temp2 && flag == 0) {
			if (hashTable.get(temp) == null) {
				hashTable.put(temp, guest);
				flag = 0;
				break;
			} else {
				temp++;
			}
		}

	}

	static void displayRoomAllocationList() {
		// displaying allocation of guest to room
		if (!(hashTable.isEmpty())) {
			// displaying allocation of guest to room
			System.out.println("\nRoom no.\t\t\tName\t\t\tAge");
			for (Map.Entry<Integer, Guest> entry : hashTable.entrySet()) {

				System.out.println(entry.getKey() + "\t\t\t\t"
						+ entry.getValue().customerName + "\t\t\t"
						+ entry.getValue().customerAge);

			}
		} else {
			System.out.println("\nCurrently Guest Rooms are not Allocated\n");
		}
	}

}
