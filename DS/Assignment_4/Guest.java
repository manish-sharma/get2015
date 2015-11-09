package assignmentDS_4;

public class Guest {
	private int id;
	private String name;
	private int roomNo;
	public Guest(int id, String name, int roomNo) {
		super();
		this.id = id;
		this.name = name;
		this.roomNo = roomNo;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the roomNo
	 */
	public int getRoomNo() {
		return roomNo;
	}
	/**
	 * @param roomNo the roomNo to set
	 */
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Guest [id=" + id + ", name=" + name + ", roomNo=" + roomNo
				+ "]";
	}
	
	
	
	

}
