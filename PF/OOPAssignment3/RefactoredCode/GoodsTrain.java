/**
 * @author Sumitra
 *this class is for goods train and it extends the train class
 */
public class GoodsTrain extends Train {

	double available;
	public GoodsTrain(int trainNumber, String source, String destination, double price, int time,double weight) {
		super(trainNumber, source, destination, price, time);
		// TODO Auto-generated constructor stub
		this.available=weight;
	}
	public double getavailable() {
		return available;
	}
	public void setavailable(double weight) {
		this.available = weight;
	}

}
