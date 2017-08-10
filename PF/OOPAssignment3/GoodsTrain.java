
/**
 * @author Sumitra
 * this contaion all getter and setter for available weight.
 */
public class GoodsTrain {
	String from;
	String to;
	int trainNumber;
	int availableWeight;
	double price;
	public GoodsTrain(String from, String to, int trainNumber,
			int availableWeight, double price) {
		super();
		this.from = from;
		this.to = to;
		this.trainNumber = trainNumber;
		this.availableWeight = availableWeight;
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
	
	public int getAvailableWeight() {
		return availableWeight;
	}
	public void setAvailableWeight(int availableWeight) {
		this.availableWeight = availableWeight;
	}
	public double getPrice() {
		return price;
	}
	
	
	
}
