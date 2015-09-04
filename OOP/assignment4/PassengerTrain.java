package oopAssignment5;
/**
 * Class to store passenger train information
 * @author Riddhi
 *
 */
public class PassengerTrain extends Train {

	String type;
	String seats;

	public PassengerTrain(String trainId, String type, String from, String to,
			String seats, String travelTime, String price) {
		super(trainId, from, to, travelTime, price);
		this.seats = seats;
		this.type = type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setWeight(String weight) {
		this.seats = seats;
	}

	public String getSeats() {
		return seats;
	}
}
