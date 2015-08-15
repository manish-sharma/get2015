package ServiceCar;

/**
 * @author Arushi--> handling cars which are coming for services
 * 
 */
public class ServicingCars {
	String carType;
	int carNumber;

	public ServicingCars(String carType, int carNumber) { // constructor calling
		super();
		this.carType = carType;
		this.carNumber = carNumber;
	}

	public int getCarNumber() { // getting car id
		return carNumber;
	}

	public void setCarNumber(int carNumber) { // setting car id
		this.carNumber = carNumber;
	}

	public String getCarType() { // getting car type
		return carType;
	}

	public void setCarType(String carType) { // setting car type
		this.carType = carType;
	}
}
