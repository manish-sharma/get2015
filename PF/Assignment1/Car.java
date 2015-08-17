//class for car details like type and service rate
public class Car {
	String type;
	double serviceRate;

	public Car(String type, double serviceRate) { // assigns value to type and
													// service rate
		super();
		this.type = type;
		this.serviceRate = serviceRate;
	}

	public String getType() { // get car type
		return type;
	}

	public void setType(String type) { // set car type
		this.type = type;
	}

	public double getServiceRate() { // get service rate
		return serviceRate;
	}

	public void setServiceRate(double serviceRate) { // set service rate
		this.serviceRate = serviceRate;
	}

}
