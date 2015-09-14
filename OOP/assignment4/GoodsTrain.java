package oopAssignment5;
/**
 * Class to store goods train information
 * @author Riddhi
 *
 */

public class GoodsTrain extends Train {

	String type;
	String weight;

	public GoodsTrain(String trainId, String type, String from, String to,
			String weight, String travelTime, String price) {
		super(trainId, from, to, travelTime, price);
		this.weight = weight;
		this.type = type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getWeight() {
		return weight;
	}
}
