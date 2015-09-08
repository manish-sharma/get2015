
public class Room {
	
	private int roomNumber;
	private boolean isAlloted;
	private static int noOfRoomsAlloted;
	public int getRoomId() {
		return roomNumber;
	}
	public void setRoomId(int roomId) {
		this.roomNumber = roomId;
	}
	

	public boolean isAlloted() {
		return isAlloted;
	}
	public void setAlloted(boolean isAlloted) {
		this.isAlloted = isAlloted;
	}
	public static int getNoOfRoomsAlloted() {
		return noOfRoomsAlloted;
	}
	public static void setNoOfRoomsAlloted(int noOfRoomsAlloted) {
		Room.noOfRoomsAlloted = noOfRoomsAlloted;
	}
	public Room(int roomNumber)
	{
		this.roomNumber=roomNumber;
	
	}
	public void alloteRoom(int roomNumber)
	{
		this.isAlloted=true;
		noOfRoomsAlloted++;
	}
	
}
