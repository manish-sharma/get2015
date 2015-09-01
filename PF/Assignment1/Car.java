//class for car details like type and service rate

public class Cars {

	String type;
	double serviceRate;

	public Cars(String type, double serviceRate) { // Parameterized constructor
		super();
		this.type = type;
		this.serviceRate = serviceRate;
	}

	public String getType() { // Getting type of car
		return type;
	}

	public void setType(String type) { // Setting type of car
		this.type = type;
	}

	public double getServiceRate() { // getting service Rate of car
		return serviceRate;
	}

	public void setServiceRate(double serviceRate) { // Setting service rate of
														// car
		this.serviceRate = serviceRate;
	}

}
