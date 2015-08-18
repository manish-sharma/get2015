/**
 * @author Priyamvada Setting and getting parameters for goods train
 * 
 */
public class GoodsTrain {
	int trainNumber;
	String startingPoint;
	String endPoint;
	double price;
	double weight;

	public GoodsTrain(int trainNumber, String startingPoint, String endPoint,// calling
																				// constructor
			double price, double weight) {
		super();
		this.trainNumber = trainNumber;
		this.startingPoint = startingPoint;
		this.endPoint = endPoint;
		this.price = price;
		this.weight = weight;
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

	public double getWeight() {// getting weight
		return weight;
	}

	public void setWeight(double weight) {// setting weight
		this.weight = weight;
	}

	public int getTrainNumber() {// getting train no.
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {// setting train no
		this.trainNumber = trainNumber;
	}

}
