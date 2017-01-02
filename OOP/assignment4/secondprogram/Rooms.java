package secondprogram;
/**
 * Class that stores information about available rooms in hotel
 * @author Riddhi
 *
 */
public class Rooms {

	private int number;        //room number
	private boolean occupied;  //status of availability

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

}
