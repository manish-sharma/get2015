package oop3;

/**
 * @author Khemanshu
 *
 */
public class Train {
	// train number of train.
	int trainNumber;
	// name of train.
	String trainName;
	//source station of train.
	String source;
	// destination station of train.
	String destination;
	// start time of train.
	String duration;
	// fare of train.
	int fare;
	/**un parameterized constructor
	 * 
	 */
	public Train(){};
	/**parameterized constructor
	 * @param trainNumber number of train.
	 * @param trainName name of train.
	 * @param source of train.
	 * @param destination of train.
	 * @param duration of whole journey.
	 * @param fare per seat
	 */
	public Train(int trainNumber, String trainName, String source,String destination,String duration, int fare) {
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.duration = duration;
		this.fare = fare;
	}	
}
