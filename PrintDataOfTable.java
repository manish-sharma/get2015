package com.vehicle.VeiwClasses;

import java.util.ArrayList;
import java.util.List;

import com.BusinessClasses.DatabaseHelper;
import com.vehicle.modelClasses.Bike;
import com.vehicle.modelClasses.Car;

public class PrintDataOfTable {
	
	private String vehicleAttributes;
	public void printCarSpecification() {
		List<Car> carsList = new ArrayList<Car>();
		System.out
				.println("                                       ****CAR - DETAILS****");
		System.out.println();

		carsList = DatabaseHelper.queryToFetchAllCarDetails();
		Car car = new Car();

		for (int i = 0; i < carsList.size(); i++) {
			car = carsList.get(i);
			vehicleAttributes = VehicleDetailPrinter
					.printVehicleSpecification(car);
			System.out.println(vehicleAttributes);
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	/**
	
	 it will fetch all bikes details from
	 * bike and vehicle table and then print all bikes details 
	 */
	
	public void printBikeSpecification() {
		List<Bike> bikesList = new ArrayList<Bike>();
		System.out
				.println("                                     ****BIKE - DETAILS****");
		System.out.println();

		bikesList = DatabaseHelper.queryToFetchAllBikeDetails();
		Bike bike = new Bike();

		for (int i = 0; i < bikesList.size(); i++) {
			bike = bikesList.get(i);
			vehicleAttributes = VehicleDetailPrinter
					.printVehicleSpecification(bike);
			System.out.println(vehicleAttributes);
			System.out.println();
		}

}
}
