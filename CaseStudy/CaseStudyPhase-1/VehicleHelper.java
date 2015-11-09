package CaseStudy1;

/**
 * @author Neha Bansal
 *
 */
public class VehicleHelper {
	private String vehicleType;

	/**
	 * @return
	 */
	public String getVehicleType() {
		return vehicleType;
	}

	/**
	 * @param vehicleType
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @param vehicleType
	 * @param model
	 * @param make
	 * @return vehicle type refrence
	 */
	public static Vehicle createVehicle(VehicleTypeEnum vehicleType, String model,
			String manufacturing_date) {
		String s = String.valueOf(vehicleType);
		if (s.equalsIgnoreCase("Car")) {
			return createCar(model, manufacturing_date);
		} else {
			return createBike(model, manufacturing_date);
		} 
	}

	/**
	 * @param model
	 * @param make
	 * @return car type
	 */
	static Vehicle createCar(String model, String manufacturing_date) {
		Car car = new Car();
		car.setModel(model);
		car.setManufacturing_date(manufacturing_date);
		return car;
	}
	
	/**
	 * @param model
	 * @param make
	 * @return bike type
	 */
	static Vehicle createBike(String model, String manufacturing_date) {
		Bike bike = new Bike();
		bike.setModel(model);
		bike.setManufacturing_date(manufacturing_date);
		return bike;
	}
}
