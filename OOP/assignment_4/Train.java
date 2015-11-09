package assignmentOOP_3;


public class Train 
{
	//String trainType;
	String trainID;
	String trainName;
	String trainFrom;
	String trainTo;
	int trainDuration;
	int trainFare;
	//int availability;
	public Train(String trainID, String trainName,
			String trainFrom, String trainTo, int trainDuration, int trainFare
			) {
		super();
		//this.trainType = trainType;
		this.trainID = trainID;
		this.trainName = trainName;
		this.trainFrom = trainFrom;
		this.trainTo = trainTo;
		this.trainDuration = trainDuration;
		this.trainFare = trainFare;
		//this.availability = availability;
	}
	/**
	 * @return the trainType
	 */
//	public String getTrainType() {
//		return trainType;
//	}
	/**
	 * @param trainType the trainType to set
	 */
//	public void setTrainType(String trainType) {
//		this.trainType = trainType;
//	}
	/**
	 * @return the trainID
	 */
	public String getTrainID() {
		return trainID;
	}
	/**
	 * @param trainID the trainID to set
	 */
	public void setTrainID(String trainID) {
		this.trainID = trainID;
	}
	/**
	 * @return the trainName
	 */
	public String getTrainName() {
		return trainName;
	}
	/**
	 * @param trainName the trainName to set
	 */
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	/**
	 * @return the trainFrom
	 */
	public String getTrainFrom() {
		return trainFrom;
	}
	/**
	 * @param trainFrom the trainFrom to set
	 */
	public void setTrainFrom(String trainFrom) {
		this.trainFrom = trainFrom;
	}
	/**
	 * @return the trainTo
	 */
	public String getTrainTo() {
		return trainTo;
	}
	/**
	 * @param trainTo the trainTo to set
	 */
	public void setTrainTo(String trainTo) {
		this.trainTo = trainTo;
	}
	/**
	 * @return the trainDuration
	 */
	public int getTrainDuration() {
		return trainDuration;
	}
	/**
	 * @param trainDuration the trainDuration to set
	 */
	public void setTrainDuration(int trainDuration) {
		this.trainDuration = trainDuration;
	}
	/**
	 * @return the trainFare
	 */
	public int getTrainFare() {
		return trainFare;
	}
	/**
	 * @param trainFare the trainFare to set
	 */
	public void setTrainFare(int trainFare) {
		this.trainFare = trainFare;
	}
	/**
	 * @return the availability
	 */
	/*public int getAvailability() {
		return availability;
	}
	
	 * @param availability the availability to set
	 
	public void setAvailability(int availability) {
		this.availability = availability;
	}*/
	
}


