/**
 * Class to implement HashMap and hotel room allotment
 * @author Sanjay
 */
import java.util.HashMap;
import java.util.Scanner;


public class HotelRoomAllotment {
	private int numberOfRooms = 13;
	private int count = 0;
	private HashMap<Integer, Integer> hotelRooms = new HashMap<Integer, Integer>();
	
	
	/**
	 * Method to initialize map
	 */
	private void createMap(){
		for(int i=0;i<numberOfRooms;i++){
			hotelRooms.put(i,null);
		}
	}
	
	/**
	 * Method to allot room
	 * @param age
	 */
	private void allotRoom(int age){
		int room = age%numberOfRooms;
		boolean flag = false;
		while(!flag){
			if(hotelRooms.get(room) == null){
				hotelRooms.put(room, age);
				flag=true;
				count++;
			}
			else if(room <= numberOfRooms ){
				room = room + 1;
			}
			else{
				room = 0;
			}
		}
		
	}
	
	
	/**
	 * Method to view the allotment list
	 */
	private void viewList(){
		for(int i = 0;i<=numberOfRooms;i++){
			System.out.println("Room Number " + i + " " +hotelRooms.get(i));
		}
	}
	
	public static void main(String args[]){
		
		HotelRoomAllotment object = new HotelRoomAllotment();
		Scanner scan = new Scanner(System.in);
		object.createMap();
		while(true){
			System.out.println("Enter 1 to allot room");
			System.out.println("Enter 2 to view current allotment");
			int userInput = scan.nextInt();
			switch (userInput) {
			case 1:
				if(object.count < object.numberOfRooms){
					System.out.println("Enter the age of person");
					int age = scan.nextInt();
					object.allotRoom(age);
				}
				else{
					System.out.println("There is no room in the hotel");
				}
				
				break;

			case 2:
				object.viewList();
				break;
			}
		}
		
		
	}

}
