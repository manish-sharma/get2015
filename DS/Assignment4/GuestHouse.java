
public class GuestHouse {
	
	private Room roomArray[];
	private int noOfRooms;
	
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
	
	public boolean allotRoom(int ageOfPerson)
	{
		boolean isAlloted=false;
		if(ageOfPerson<18&&ageOfPerson>120)
		{
			System.out.println("please enter valid age");
			return isAlloted;
		}
		int roomIndex = ageOfPerson % noOfRooms;
		int newRoomIndex;
		if(Room.getNoOfRoomsAlloted()==noOfRooms)
		{
			System.out.println("All rooms are alloted");
			return isAlloted;
		}
		do
		{
			if(!roomArray[roomIndex].isAlloted())
			{
				roomArray[roomIndex].alloteRoom(roomIndex);
				isAlloted=true;
				break;
			}
			else
				roomIndex+=3;
			
			newRoomIndex=roomIndex%noOfRooms;
			if(newRoomIndex>0)
				roomIndex=newRoomIndex;
			
		}while(true);
			
		return isAlloted;
	}
	public void display()
	{
		for(int index=0;index<noOfRooms;index++)
		{
			if(roomArray[index].isAlloted())
			System.out.println("room no is"+roomArray[index].getRoomId());
		}
	}
	
	
}
