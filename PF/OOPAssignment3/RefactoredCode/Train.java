/**
 *@author Sumitra
 *this is abstract class which is having all the entity required for the Train and the required getter and setter are available.
 */
public  class Train {
	int trainNumber;
	String source;
	String Destination;
	
	
	double price;
	int time;

	public Train(int trainNumber, String source, String destination,  double price, int time) {
	
		this.trainNumber = trainNumber;
		this.source = source;
		Destination = destination;
	
		
		this.price = price;
		this.time = time;
	}

	public int getTime() {
		return time;
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

	

	

	public void setDestination(String destination) {
		Destination = destination;
	}

	

	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
