import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class GuestHouse {
	
	private Room roomArray[];
	private int noOfRooms;
	private Map<Integer,String> allotList=new HashMap<Integer,String>();
	
	public Room[] getRoomArray() {
		return roomArray;
	}

	public void setRoomArray(Room[] roomArray) {
		this.roomArray = roomArray;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public GuestHouse(int noOfRooms) {
		
		this.noOfRooms=noOfRooms;
		this.roomArray=new Room[noOfRooms];
		for(int index=0;index<noOfRooms;index++)
			roomArray[index] = new Room(index);
		
	}
	
	public int allotRoom(String name,int ageOfPerson)
	{
		if(ageOfPerson<18&&ageOfPerson>120)
		{
			System.out.println("please enter valid age");
			return -1;
		}
		int roomIndex = ageOfPerson % noOfRooms;
		int newRoomIndex;
		if(Room.getNoOfRoomsAlloted()==noOfRooms)
		{
			System.out.println("All rooms are alloted");
			return -1;
		}
		do
		{
			if(!roomArray[roomIndex].isAlloted())
			{
				roomArray[roomIndex].alloteRoom(roomIndex);
				allotList.put(roomIndex+1, name);
				break;
			}
			else
				roomIndex+=3;
			
			newRoomIndex=roomIndex%noOfRooms;
			if(newRoomIndex>0)
				roomIndex=newRoomIndex;
			
		}while(true);
			
		return roomIndex+1;
	}
	public void display()
	{
		Set<Integer> keySet = allotList.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) 
		{
			Integer roomNo = (Integer) iterator.next();
			String name = (String)allotList.get(roomNo);
			System.out.println("Room No:"+roomNo+"\tName :"+name);
		}
	}
	
	
}
