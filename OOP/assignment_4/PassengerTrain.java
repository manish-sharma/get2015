package assignmentOOP_3;

public class PassengerTrain extends Train
{
	int availableSeat;

	public PassengerTrain(String trainID, String trainName, String trainFrom,
			String trainTo, int trainDuration, int trainFare, int availableSeat) {
		super(trainID, trainName, trainFrom, trainTo, trainDuration, trainFare);
		this.availableSeat = availableSeat;
	}

	/**
	 * @return the availableSeat
	 */
	public int getAvailableSeat() {
		return availableSeat;
	}

	/**
	 * @param availableSeat the availableSeat to set
	 */
	public void setAvailableSeat(int availableSeat) {
		this.availableSeat = availableSeat;
	}
	

}
