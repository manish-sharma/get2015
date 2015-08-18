/**
 * @author Priyamvada
 * 
 */
public class PassengerTrain {

	int trainNumber;
	String startingPoint;
	String endPoint;
	double price;
	int seats;

	public PassengerTrain(int trainNumber, String startingPoint, String endPoint,
			double price, int seats) {// CONSTRUCTOR CALLING
		super();
		this.trainNumber = trainNumber;
		this.startingPoint = startingPoint;
		this.endPoint = endPoint;
		this.price = price;
		this.seats = seats;
	}

	public String getStartingPoint() {// getting starting point
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {// setting starting
														// point
		this.startingPoint = startingPoint;
	}

	public String getEndPoint() {// getting end point
		return endPoint;
	}

	public void setEndPoint(String endPoint) {// setting end point
		this.endPoint = endPoint;
	}

	public double getPrice() {// getting price
		return price;
	}

	public void setPrice(double price) {// setting price
		this.price = price;
	}

	public int getSeats() {// getting seats
		return seats;
	}

	public void setSeats(int seats) {// setting seats
		this.seats = seats;
	}

	public int getTrainNumber() {// getting train number
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {// setting train number
		this.trainNumber = trainNumber;
	}

}
