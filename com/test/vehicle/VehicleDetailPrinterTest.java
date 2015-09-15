/**
 * @author Pooja Khandelwal
 * @createdDate 15/09/2015
 * @name VehicleDetailPrinterTest
 * @description this class will test the method printVehicleSpecification1() of VehicleDetailPrinter class
 */
package com.test.vehicle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.vehicle.Bike;
import com.vehicle.Car;
import com.vehicle.Vehicle;
import com.vehicle.VehicleDetailPrinter;
import com.vehicle.VehicleHelper;

public class VehicleDetailPrinterTest {
	private Vehicle vehicle;
	private Car car;
	private Bike bike;
	private String vehicleAttributes;
	private String expectedVehicleAttributes;

	/**
	 * @name setUp()
	 * @description this is an overrided method of JUnit test class and it
	 *              create the instance of Vehicle,Car,Bike class
	 * @param
	 * @return
	 */
	@Before
	public void setUp() throws Exception {
		vehicle = new Vehicle();
		car = new Car();
		bike = new Bike();
	}

	/**
	 * @name testPrintVehicleSpecificationForCar()
	 * @description this is a test method.it will test the method
	 *              printVehicleSpecification1() of VehicleDetailPrinter class
	 *              when vehicle is car
	 * @param
	 * @return
	 */
	@Test
	public void testPrintVehicleSpecificationForCar() {
		Vehicle vehicle = VehicleHelper
				.createVehicle("car", "Ford", "EcoSport");
		vehicle.getMake();
		if (vehicle.getClass().equals(new Car().getClass())) {
			car = VehicleHelper.createCar((Car) vehicle, 2000, 50, 22, 850009,
					40049, true, true, "Radio , Cd Player");
			vehicleAttributes = VehicleDetailPrinter
					.printVehicleSpecification1(car);
		} else if (vehicle.getClass().equals(new Bike().getClass())) {
			bike = VehicleHelper.createBike((Bike) vehicle, 350, 15, 30,
					120009, 150049, true, 1500);
			vehicleAttributes = VehicleDetailPrinter
					.printVehicleSpecification1(bike);
		}
		expectedVehicleAttributes = "{make : Ford\nmodel : EcoSport\nengineInCC : 2000\nfuelCapacity : 50\nmilage : 22\nprice : 850009\nroadTax : 40049"
				+ "\nAC : true\npowerSteering : true\naccessoryKit : Radio , Cd Player}";
		assertEquals(expectedVehicleAttributes, vehicleAttributes);

	}

	/**
	 * @name testPrintVehicleSpecificationForCar()
	 * @description this is a test method.it will test the method
	 *              printVehicleSpecification1() of VehicleDetailPrinter class
	 *              when vehicle is bike
	 * @param
	 * @return
	 */
	@Test
	public void testPrintVehicleSpecificationForBike() {
		Vehicle vehicle = VehicleHelper.createVehicle("bike", "Royal Enfield",
				"Bullet 300");
		if (vehicle.getClass().equals(new Car().getClass())) {
			car = VehicleHelper.createCar((Car) vehicle, 2000, 50, 22, 850009,
					40049, true, true, "Radio , Cd Player");
			vehicleAttributes = VehicleDetailPrinter
					.printVehicleSpecification1(car);
		} else if (vehicle.getClass().equals(new Bike().getClass())) {
			bike = VehicleHelper.createBike((Bike) vehicle, 350, 15, 30,
					120009, 150049, true, 1500);
			vehicleAttributes = VehicleDetailPrinter
					.printVehicleSpecification1(bike);
		}
		expectedVehicleAttributes = "{make : Royal Enfield\nmodel : Bullet 300\nengineInCC : 350\nfuelCapacity : 15\nmilage : 30\nprice : 120009\nroadTax : 150049"
				+ "\nselfStart : true\nhelmetPrice : 1500}";
		assertEquals(expectedVehicleAttributes, vehicleAttributes);
	}
}
