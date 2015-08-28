package secondprogram;
/**
 * Class that stores information about a particular college
 * @author Riddhi
 *
 */

public class College {

	private String collegeName;      //name of the college
	private int seatsAvailable;      //number of seats available
	
	//getter setter for private fields
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getSeatsAvailable() {
		return seatsAvailable;
	}
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	

}
