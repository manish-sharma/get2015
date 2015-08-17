public class ServicingCars {
	String carType;// cartype of cars entering service station
	int carNumber;// car number

	public ServicingCars(String carType, int carNumber) {
		super();
		this.carType = carType;
		this.carNumber = carNumber;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}
}
