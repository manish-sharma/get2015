public class Services {
	String personName;
	String carType;
	double serviceRate;
	int carNumber;

	public Services(String personName, String carType, double serviceRate,
			int carNumber) {// to set user input values like name,car type, car
							// number,rate
		super();
		this.personName = personName;
		this.carType = carType;
		this.serviceRate = serviceRate;
		this.carNumber = carNumber;
	}

	public String getPersonName() { // get customer name
		return personName;
	}

	public void setPersonName(String personName) {// set customer name
		this.personName = personName;
	}

	public String getCarType() {// get car type
		return carType;
	}

	public void setCarType(String carType) {// set car type
		this.carType = carType;
	}

	public double getServiceRate() {// get rate
		return serviceRate;
	}

	public void setServiceRate(double serviceRate) {// set rate
		this.serviceRate = serviceRate;
	}

	public int getCarNumber() {// get car number
		return carNumber;
	}

	public void setCarNumber(int carNumber) {// set car number
		this.carNumber = carNumber;
	}

}
