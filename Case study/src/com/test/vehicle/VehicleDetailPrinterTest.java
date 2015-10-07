/**
 * @author Pooja Khandelwal
 * @createdDate 20/09/2015
 * @name VehicleDetailPrinterTest
 * @description this class will test the method printVehicleSpecification1() of VehicleDetailPrinter class
 */
package com.test.vehicle;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import com.databsehelperclass.DatabaseHelper;
import com.vehicle.Bike;
import com.vehicle.Car;
import com.vehicle.VehicleDetailPrinter;

public class VehicleDetailPrinterTest {
	private Car car;
	private Bike bike;
	private String vehicleAttributes;

	/**
	 * @name setUp()
	 * @description this is an overrided method of JUnit test class and it
	 *              create the instance of Car,Bike class
	 * @param
	 * @return
	 */
	@Before
	public void setUp() throws Exception {
		car = new Car();
		bike = new Bike();
	}

	/**
	 * @name PrintCarSpecification()
	 * @description this is a test method.it will fetch all cars details from
	 *              car and vehicle table by calling queryToFetchAllCarDetails()
	 *              method of DatabaseHelper class and then print all cars
	 *              details by calling the printVehicleSpecification() method of
	 *              VehicleDetailPrinter class
	 * @param
	 * @return
	 */
	@Test
	public void printCarSpecification() {
		List<Car> carsList = new ArrayList<Car>();
		System.out
				.println("                                       ****-----CAR----****");
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
	 * @name PrintBikeSpecification()
	 * @description this is a test method.it will fetch all bikes details from
	 *              bike and vehicle table by calling
	 *              queryToFetchAllBikeDetails() method of DatabaseHelper class
	 *              and then print all bikes details by calling the
	 *              printVehicleSpecification() method of VehicleDetailPrinter
	 *              class
	 * @param
	 * @return
	 */
	@Test
	public void printBikeSpecification() {
		List<Bike> bikesList = new ArrayList<Bike>();
		System.out
				.println("                                     ****-----BIKE----****");
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
