public class Services {
	String personName;
	String carType;
	double serviceRate;
	int carNumber;

	public Services(String personName, String carType, double serviceRate, // Constructor
																			// calling
			int carNumber) {
		super();
		this.personName = personName;
		this.carType = carType;
		this.serviceRate = serviceRate;
		this.carNumber = carNumber;
	}

	public String getPersonName() { // getting mechanic name
		return personName;
	}

	public void setPersonName(String personName) { // setting mechanic name
		this.personName = personName;
	}

	public String getCarType() { // getting type of car serviced by mechanic
		return carType;
	}

	public void setCarType(String carType) { // setting type of car serviced by
												// mechanic
		this.carType = carType;
	}

	public double getServiceRate() { // getting service rate of car
		return serviceRate;
	}

	public void setServiceRate(double serviceRate) { // setting service rate of
														// car
		this.serviceRate = serviceRate;
	}

	public int getCarNumber() { // getting id of car
		return carNumber;
	}

	public void setCarNumber(int carNumber) { // setting id of car
		this.carNumber = carNumber;
	}

}
