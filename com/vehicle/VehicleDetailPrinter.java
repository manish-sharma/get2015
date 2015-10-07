/**
 * @author Pooja Khandelwal
 * @createdDate 15/09/2015
 * @name  VehicleDetailPrinter
 * @description this class will create string format for all vehicle attributes based on car or bike type 
 */
package com.vehicle;

public class VehicleDetailPrinter {
	private static String vehicleAttributes;

	/**
	 * @name printVehicleSpecification()
	 * @description this method will create string format for all vehicle
	 *              attributes based on car or bike type and then return that
	 *              string
	 * @param vehicle
	 * @return vehicleAttributes(String format of all vehicle attributes)
	 */
	public static String printVehicleSpecification(Vehicle vehicle) {
		if (vehicle.getClass() == new Car().getClass()) {
			Car car = (Car) vehicle;
			vehicleAttributes = "{make : " + car.getMake() + "\nmodel : "
					+ car.getModel() + "\nengineInCC : " + car.getEngineInCC()
					+ "\nfuelCapacity : " + car.getFuelCapacity()
					+ "\nmilage : " + car.getMilage() + "\nprice : "
					+ car.getPrice() + "\nroadTax : " + car.getRoadTax()
					+ "\nonRoadPrice : " + car.getOnRoadPrice() + "\nAC : "
					+ car.isAC() + "\npowerSteering : " + car.isPowerSteering()
					+ "\naccessoryKit : " + car.getAccessoryKit() + "}";
		} else if (vehicle.getClass() == new Bike().getClass()) {
			Bike bike = (Bike) vehicle;
			vehicleAttributes = "{make : " + bike.getMake() + "\nmodel : "
					+ bike.getModel() + "\nengineInCC : "
					+ bike.getEngineInCC() + "\nfuelCapacity : "
					+ bike.getFuelCapacity() + "\nmilage : " + bike.getMilage()
					+ "\nprice : " + bike.getPrice() + "\nroadTax : "
					+ bike.getRoadTax() + "\nonRoadPrice : "
					+ bike.getOnRoadPrice() + "\nselfStart : "
					+ bike.iSSelfStart() + "\nhelmetPrice : "
					+ bike.getHelmetPrice() + "}";
		}
		return vehicleAttributes;
	}

	/**
	 * @name printVehicleSpecification1()
	 * @description this method will create string format for all vehicle
	 *              attributes based on car or bike type and then return that
	 *              string
	 * @param vehicle
	 * @return vehicleAttributes(String format of all vehicle attributes)
	 */
	public static String printVehicleSpecification1(Vehicle vehicle) {
		if (vehicle.getClass() == new Car().getClass()) {
			Car car = (Car) vehicle;
			vehicleAttributes = "{make : " + car.getMake() + "\nmodel : "
					+ car.getModel() + "\nengineInCC : " + car.getEngineInCC()
					+ "\nfuelCapacity : " + car.getFuelCapacity()
					+ "\nmilage : " + car.getMilage() + "\nprice : "
					+ car.getPrice() + "\nroadTax : " + car.getRoadTax()
					+ "\nAC : " + car.isAC() + "\npowerSteering : "
					+ car.isPowerSteering() + "\naccessoryKit : "
					+ car.getAccessoryKit() + "}";

		} else if (vehicle.getClass() == new Bike().getClass()) {
			Bike bike = (Bike) vehicle;

			vehicleAttributes = "{make : " + bike.getMake() + "\nmodel : "
					+ bike.getModel() + "\nengineInCC : "
					+ bike.getEngineInCC() + "\nfuelCapacity : "
					+ bike.getFuelCapacity() + "\nmilage : " + bike.getMilage()
					+ "\nprice : " + bike.getPrice() + "\nroadTax : "
					+ bike.getRoadTax() + "\nselfStart : " + bike.iSSelfStart()
					+ "\nhelmetPrice : " + bike.getHelmetPrice() + "}";

		}
		return vehicleAttributes;
	}
}
