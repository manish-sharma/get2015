package ds4;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**This class contains functionality of rooms i.e allocation of room , search of guest name and many more
 * @author Khemanshu
 *
 */
public class Rooms {

	// use to store the data of the room number in one to one relation with name
	// of person.
	HashMap<Integer, String> roomList = new HashMap<Integer, String>();
	//stores the details of every person in guest house rooms.
	List<Person> personList = new ArrayList<Person>();
	//noOfRooms are total number of rooms in guest house
	private int noOfRooms = 11;
	//count the number of guest enter in the guest house
	int countOfGuest = 0;
	
	/** this function is use to generate a key to particular customer
	 * @param age of customer
	 * @param i ittration variable in key function
	 * @return
	 */
	private int generateKey(int age , int i) {
		int key;
		key = (age + i) % noOfRooms;
		return key;
	}
	
	/** allocate a room
	 * 
	 */
	public void allocateRoom() {
		if(countOfGuest >= noOfRooms) {
			System.out.println("rooms are full, NO SPACE FOR NEW GUEST");
			return;
		}
		Person person = new Person();
		System.out.println("enter the name of person");
		person.setName();
		System.out.println("enter the age of person");
		person.setAge();
		personList.add(person);
		// i is use to itrate the hash function until specific key is found
		int i = 0;
		while(i < noOfRooms) {
			int key = generateKey(person.getAge(), i);
			if(roomList.get(key) == null) {
				roomList.put(key, person.getName());
				System.out.println("room "+(key+1)+" is allocated to "+roomList.get(key));
				countOfGuest++;
				break;
			}
			i++;
		}	
	}
	
	/**use to search name of guest staying in a room
	 * @param roomNumber
	 */
	public void searchByRoom(int roomNumber) {
		if(roomList.get(roomNumber-1) == null) {
			System.out.println("no one is living in this room");
		}
		else
			System.out.println(roomList.get(roomNumber-1)+" is in room number "+roomNumber);
	}
	
	/** use to search room number of a guest
	 * @param nameOfGuest
	 */
	public void searchByName(String nameOfGuest) {
		boolean isNameFound = false;
		for(Entry<Integer, String> records: roomList.entrySet()) {
			if(records.getValue().equalsIgnoreCase(nameOfGuest)) {
				System.out.println(records.getValue()+" is currently living in room "+(records.getKey()+1));
				isNameFound = true;
			}
		}
		if(isNameFound == false)
			System.out.println("no guest stay in guest house with this name ");
	}
	/** show the booking detail of guset house
	 * 
	 */
	public void showBookingDetail() {
		for(Entry<Integer, String> records: roomList.entrySet()) {
			System.out.println("Room Number: "+(records.getKey()+1)+" ---> "+records.getValue());
		}
	}
	
}
