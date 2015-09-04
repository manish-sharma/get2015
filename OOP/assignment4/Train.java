package oopAssignment5;
/**
 * Class to store train information
 * @author Riddhi
 *
 */
public class Train {

	String trainId;
	String from;
	String to;
	String travelTime;
	String price;

	public Train(String trainId, String from, String to, String travelTime,
			String price) {
		this.trainId = trainId;
		this.from = from;
		this.to = to;
		this.travelTime = travelTime;
		this.price = price;
	}

	public void setTrainId(String trainId) {
		this.trainId = trainId;
	}

	public String getTrainId() {
		return trainId;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getFrom() {
		return from;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTo() {
		return to;
	}

	public void setTravelTime(String travelTime) {
		this.travelTime = travelTime;
	}

	public String getTravelTime() {
		return travelTime;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPrice() {
		return price;
	}
}
