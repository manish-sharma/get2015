package ServiceCarSystem;

/**
 * @author Sumitra
 * this class conatin setter and getter method.
 */
public class Cars {
	String type;
	double serviceRate;

	public Cars(String type, double serviceRate) {
		super();
		this.type = type;
		this.serviceRate = serviceRate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getServiceRate() {
		return serviceRate;
	}

	public void setServiceRate(double serviceRate) {
		this.serviceRate = serviceRate;
	}

}
