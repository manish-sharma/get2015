/**
 * @author Sumitra
 *this class is for passenger type and extends the abstract class train
 */
public class PassengerTrain extends Train {

	int available;

	public PassengerTrain(int trainNumber, String source, String destination,
			double price, int time,int availableSeat) {
		super(trainNumber, source, destination, price, time);
		// TODO Auto-generated constructor stub
		this.available=availableSeat;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int availableSeat) {
		this.available = availableSeat;
	}
	

}
