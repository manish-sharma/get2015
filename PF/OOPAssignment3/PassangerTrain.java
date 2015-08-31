/**
 * @author Sumitra
 *this is for passenger train and contain all getter and setter for available seat
 */
public class PassangerTrain {
	String from;
	String to;
	int trainNumber;
	int availableSeat;
	double price;

	public PassangerTrain(String from, String to, int trainNumber,
			int availableSeat,double price) {
		super();
		this.from = from;
		this.to = to;
		this.trainNumber = trainNumber;
		this.availableSeat = availableSeat;
		this.price = price;
	}
	public int getTrainNumber() {
		return trainNumber;
	}
	
	public String getFrom() {
		return from;
	}

	

	public String getTo() {
		return to;
	}

	

	public int getAvailableSeat() {
		return availableSeat;
	}

	public void setAvailableSeat(int availableSeat) {
		this.availableSeat = availableSeat;
	}

	public double getPrice() {
		return price;
	}

	
	
}
