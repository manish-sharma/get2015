import java.util.*;
/*
 * this class is use to allocate hotel rooms according to hash function
 * according to question here we are using hash function of age of guest
 * @author Ravika
 * @since 31/08/2015
 */
public class RoomAllocation{
	static Scanner scan = new Scanner(System.in);
	HashMap<Integer, String> hotelRoom = new HashMap<Integer, String>();
	int rooms=17;
	static int count= 0;
	/**
	 * purpose : to get total rooms
	 * @return = total rooms
	 */
	int getRooms() {
		return rooms;
	}
	public static void main(String []args){
		RoomAllocation roomAllocation = new RoomAllocation();
		roomAllocation.createMap();
		while(true){
			System.out.println("Enter 1 to allocate room\nEnter 2 to view list\nEnter your Choice:");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				if(count<roomAllocation.getRooms()){
					
					System.out.println("Enter age of person:");
					int age = scan.nextInt();
					System.out.println("Enter Name of person:");
					String name = scan.next();
					roomAllocation.allotRoom(name,age);
				}
				else{
					System.out.println("No Room Available");
					return;
				}
				break;
			case 2:
				roomAllocation.viewList();
				break;

			default:
				System.out.println("Enter valid option:");
				break;
			}
			
		}
		
	}
	/*
	 * purpose : this method create empty hash map data structure
	 * empty is specified by vacant room
	 */
	private void createMap(){
		for(int i=0;i<rooms;i++){
			hotelRoom.put(i,"vacant");
		}
	}
	/*
	 * purpose : this method is to allot room to guest according to their age
	 * it assign room according to hash function if vacant otherwise it allot next vacant room
	 * @param key = index or key of hash map
	 * @param flag = to room allocate to guest or not
	 */
	
	private void allotRoom(String name,int age) {
		int key = age%rooms;
		boolean flag = false;
		while(!flag){
			if(hotelRoom.get(key).equalsIgnoreCase( "vacant")){
				hotelRoom.put(key, name);
				flag=true;
				count++;
			}
			else if(key < rooms-2 ){
				key = key + 1;
			}
			else{
				key = 0;
			}
		}
		
		
	}
/*
 * purpose : this method provide the list of all rooms in hotel
 * either it is vacant or alloted to someone
 * if occupied then it show name of person whom room alloted
 */
	public void viewList() {
		for(int i =0;i<rooms;i++){
			if(((String)hotelRoom.get(i)).equalsIgnoreCase( "vacant")){
				System.out.println("Room number "+ i+" is " +hotelRoom.get(i));
			}
			else{
			System.out.println("Room number "+ i+"  allocated to " +hotelRoom.get(i));
		}
		}
	}
}
