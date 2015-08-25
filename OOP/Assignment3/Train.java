
/**IT IS A SUPER CLASS FOR PASSENGER AND GOODS TRAINS
 *
 * @author Gaurav Saini
 * 
 */
public class Train {
	int trainId;
	String fromPlace;
	String toPlace;
	double duration;
	double price;

	public Train(int trainId, String fromPlace, String toPlace,
			double duration, double price) { // CONSTRUCTOR CALLING

		this.trainId = trainId;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.duration = duration;
		this.price = price;
	}

	public int getTrainId() { // GETTING TRAIN ID
		return trainId;
	}

	public void setTrainId(int trainId) { // SETTING TRAIN ID
		this.trainId = trainId;
	}

	public String getFromPlace() { // GETTING FROM PLACE OF TRAIN
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) { // SETTING FROM PLACE OF TRAIN
		this.fromPlace = fromPlace;
	}

	public String getToPlace() { // GETTING TO PLACE OF TRAIN
		return toPlace;
	}

	public void setToPlace(String toPlace) { // SETTING TO PLACE OF TRAIN
		this.toPlace = toPlace;
	}

	public double getDuration() { // GETTING DURATION
		return duration;
	}

	public void setDuration(double duration) { // SETTING DURATION
		this.duration = duration;
	}

	public double getPrice() { // GETTING PRICE
		return price;
	}

	public void setPrice(double price) { // SETTING PRICE
		this.price = price;
	}

}
