
/**
 * @author Sumitra
 *this is for user input and all getter are there.
 */
public class UserInformation {
	String from;
	String to;
	String type;
	int wantedSeat;
	String name;
	public UserInformation(String from, String to, String type, int wantedSeat,
			String name) {
		super();
		this.from = from;
		this.to = to;
		this.type = type;
		this.wantedSeat = wantedSeat;
		this.name = name;
	}
	public String getFrom() {
		return from;
	}
	
	public String getTo() {
		return to;
	}
	
	public String getType() {
		return type;
	}
	
	public int getWantedSeat() {
		return wantedSeat;
	}
	public void setWantedSeat(int wantedSeat)
	{
		this.wantedSeat=wantedSeat;
	}
	
	public String getName() {
		return name;
	}
	

}
