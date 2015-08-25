/**
 * @author Gaurav Saini
 * 
 */
public class GoodsTrain extends Train {
	int type;
	double weight;

	public GoodsTrain(int trainId, String fromPlace, String toPlace,
			double duration, double price, int type, double weight) {
		// constructor calling
		super(trainId, fromPlace, toPlace, duration, price);
		this.type = type;
		this.weight = weight;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type
	 *            --- the type to set(which type of train it is---2 for goods)
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the weight available in train
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            --- the available weight to set of train
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
