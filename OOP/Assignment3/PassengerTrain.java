/**IT IS A PASSENGER TRAIN CLASS INHERITED FROM TRAIN CLASS
 * @author Gaurav Saini
 * 
 */
public class PassengerTrain extends Train {
	int type;
	int seats;

	public PassengerTrain(int trainId, String fromPlace, String toPlace,
			double duration, double price, int type, int seats) {
		// CALLING CONSTRUCTOR WITH CONSTRUCTOR OF BASE CLASS TOO
		super(trainId, fromPlace, toPlace, duration, price);
		this.type = type;
		this.seats = seats;
	}

	public int getType() { // GETTING TYPE OF TRAIN.FOR PASSENGER,IT MUST BE ONE
		return type;
	}

	public void setType(int type) { // SETTING TYPE OF TRAIN
		this.type = type;
	}

	public int getSeats() { // GETTING SEATS OF TRAIN
		return seats;
	}

	public void setSeats(int seats) { // SETTING SEATS OF TRAIN
		this.seats = seats;
	}

}
