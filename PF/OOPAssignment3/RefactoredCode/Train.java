/**
 * @author Sumitra
 *this is abstract class which is having all the entity required for the train and the required getter and setter are available.
 */
public abstract class Train {
	int trainNumber;
	String source;
	String Destination;
	String type;
	int available;
	double price;
	int time;

	public Train(int trainNumber, String source, String destination,
			String type, int available, double price, int time) {
		super();
		this.trainNumber = trainNumber;
		this.source = source;
		Destination = destination;
		this.type = type;
		this.available = available;
		this.price = price;
		this.time = time;
	}

	public int getTime() {
		return time;
	}

	public void setAvailable(int available)
	{
		this.available=available;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	

	public String getSource() {
		return source;
	}

	

	public String getDestination() {
		return Destination;
	}

	public String getType() {
		return type;
	}

	

	public void setDestination(String destination) {
		Destination = destination;
	}

	public int getAvailable() {
		return available;
	}

	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
