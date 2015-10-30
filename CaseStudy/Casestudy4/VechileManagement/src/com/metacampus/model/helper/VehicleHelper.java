package com.metacampus.model.helper;

import com.metacampus.model.Bike;
import com.metacampus.model.Car;
import com.metacampus.model.Vehicle;

public class VehicleHelper {

	public static Vehicle createCar(String make, String model, int engineInCC,
			int fuelCapacity, int mileage, float price, float roadTax,
			String createdBy, boolean aC, boolean powerSteering,
			String accessoryKit) {
		Car car = new Car();
		car.setMake(make);
		car.setModel(model);
		car.setEngineInCC(engineInCC);
		car.setFuelCapacity(fuelCapacity);
		car.setMileage(mileage);
		car.setPrice(price);
		car.setRoadTax(roadTax);
		car.setCreatedBy(createdBy);
		car.setAC(aC);
		car.setPowerSteering(powerSteering);
		car.setAccessoryKit(accessoryKit);
		return car;

	}

	public static Bike createBike(String make, String model, int engineInCC,
			int fuelCapacity, int mileage, float price, float roadTax,
			boolean selfStart, int helmetPrice) {
		Bike bike = new Bike();
		bike.setMake(make);
		bike.setModel(model);
		bike.setEngineInCC(engineInCC);
		bike.setFuelCapacity(fuelCapacity);
		bike.setMileage(mileage);
		bike.setPrice(price);
		bike.setRoadTax(roadTax);
		bike.setSelfStart(selfStart);
		bike.setHelmetPrice(helmetPrice);
		return bike;
	}

	public static String search(String car, String budget) {
		String query = "";
		if (car != null && budget != null) {

			query = "select * from vehicle where " + budget + " and " + "make="
					+ "'" + car + "' " + ";";

		} else if (car == null & budget != null) {

			query = "select * from vehicle where " + budget + ";";

		} else if (budget == null && car != null) {

			query = "select * from vehicle where " + "make=" + "'" + car + "' "
					+ ";";

		} else {
			query = "select * from vehicle ;";

		}
		return query;
	}

}
