/**
 * @author Sumitra
 *in this class we will set all the information for one user and will get them when required.
 */
public class UserInformation {
	String from;
	String to;

	int wantedSeat;
	String name;

	public UserInformation(String from, String to, int wantedSeat, String name) {
		super();
		this.from = from;
		this.to = to;

		this.wantedSeat = wantedSeat;
		this.name = name;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	

	public int getWantedSeat() {
		return wantedSeat;
	}

	public void setWantedSeat(int wantedSeat) {
		this.wantedSeat = wantedSeat;
	}

	public String getName() {
		return name;
	}

}
