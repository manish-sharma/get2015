/**
 * @author Pooja Khandelwal
 * @createdDate 15/09/2015
 * @name VehicleHelperTest
 * @description this class will call the methods createVehicle(),createCar(),createBike() of VehicleHelper class and set the attributes of car or bike based on vehicle type and then call the method printVehicleSpecification() of VehicleDetailPrinter Class and print the vehicle attributes in string format
 */
package com.test.vehicle;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.vehicle.Bike;
import com.vehicle.Car;
import com.vehicle.Vehicle;
import com.vehicle.VehicleDetailPrinter;
import com.vehicle.VehicleHelper;

public class VehicleHelperTest {
	private static Vehicle vehicle;
	private static Car car;
	private static Bike bike;
	private static String vehicleAttributes;

	/**
	 * @name setUp()
	 * @description this is an overided method of JUnit test class and it create
	 *              the instance of Vehicle,Car,Bike class
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
	 * @name testCreateVehicle1()
	 * @description this is a test method .it will set the attributes of car or
	 *              bike based on the vehicle type by calling the methods
	 *              createVehicle(),createCar(),createBike() of VehicleHelper
	 *              class and then call the method printVehicleSpecification()
	 *              of VehicleDetailPrinter Class
	 * @param
	 * @return
	 */
	@Test
	public void testCreateVehicle1() {
		Vehicle vehicle = VehicleHelper
				.createVehicle("car", "Ford", "EcoSport");
		vehicle.getMake();
		if (vehicle.getClass().equals(new Car().getClass())) {
			car = VehicleHelper.createCar((Car) vehicle, 2000, 50, 22, 850009,
					40049, true, true, "Radio , Cd Player");
			Assert.assertEquals("Ford", car.getMake());
			Assert.assertEquals("EcoSport", car.getModel());
			Assert.assertEquals(2000, car.getEngineInCC());
			Assert.assertEquals(50, car.getFuelCapacity());
			Assert.assertEquals(22, car.getMilage());
			Assert.assertEquals(850009, car.getPrice());
			Assert.assertEquals(40049, car.getRoadTax());
			Assert.assertEquals(true, car.isAC());
			Assert.assertEquals(true, car.isPowerSteering());
			Assert.assertEquals("Radio , Cd Player", car.getAccessoryKit());
			vehicleAttributes = VehicleDetailPrinter
					.printVehicleSpecification(car);
			System.out.println(vehicleAttributes);
			System.out.println();
		} else if (vehicle.getClass().equals(new Bike().getClass())) {
			bike = VehicleHelper.createBike((Bike) vehicle, 350, 15, 30,
					120009, 150049, true, 1500);
			Assert.assertEquals("Royal Enfield", bike.getMake());
			Assert.assertEquals("Bullet 300", bike.getModel());
			Assert.assertEquals(350, bike.getEngineInCC());
			Assert.assertEquals(15, bike.getFuelCapacity());
			Assert.assertEquals(30, bike.getMilage());
			Assert.assertEquals(120009, bike.getPrice());
			Assert.assertEquals(150049, bike.getRoadTax());
			Assert.assertEquals(true, bike.iSSelfStart());
			Assert.assertEquals(1500, bike.getHelmetPrice());
			vehicleAttributes = VehicleDetailPrinter
					.printVehicleSpecification(bike);
			System.out.println(vehicleAttributes);
			System.out.println();
		}
	}

	/**
	 * @name testCreateVehicle2()
	 * @description this is a test method .it will set the attributes of car or
	 *              bike based on the vehicle type by calling the methods
	 *              createVehicle(),createCar(),createBike() of VehicleHelper
	 *              class and then call the method printVehicleSpecification()
	 *              of VehicleDetailPrinter Class
	 * @param
	 * @return
	 */
	@Test
	public void testCreateVehicle2() {
		Vehicle vehicle = VehicleHelper.createVehicle("bike", "Royal Enfield",
				"Bullet 300");
		if (vehicle.getClass().equals(new Car().getClass())) {
			car = VehicleHelper.createCar((Car) vehicle, 2000, 50, 22, 850009,
					40049, true, true, "Radio , Cd Player");
			Assert.assertEquals("Ford", car.getMake());
			Assert.assertEquals("EcoSport", car.getModel());
			Assert.assertEquals(2000, car.getEngineInCC());
			Assert.assertEquals(50, car.getFuelCapacity());
			Assert.assertEquals(22, car.getMilage());
			Assert.assertEquals(850009, car.getPrice());
			Assert.assertEquals(40049, car.getRoadTax());
			Assert.assertEquals(true, car.isAC());
			Assert.assertEquals(true, car.isPowerSteering());
			Assert.assertEquals("Radio , Cd Player", car.getAccessoryKit());
			vehicleAttributes = VehicleDetailPrinter
					.printVehicleSpecification(car);
			System.out.println(vehicleAttributes);
			System.out.println();
		} else if (vehicle.getClass().equals(new Bike().getClass())) {
			bike = VehicleHelper.createBike((Bike) vehicle, 350, 15, 30,
					120009, 150049, true, 1500);
			Assert.assertEquals("Royal Enfield", bike.getMake());
			Assert.assertEquals("Bullet 300", bike.getModel());
			Assert.assertEquals(350, bike.getEngineInCC());
			Assert.assertEquals(15, bike.getFuelCapacity());
			Assert.assertEquals(30, bike.getMilage());
			Assert.assertEquals(120009, bike.getPrice());
			Assert.assertEquals(150049, bike.getRoadTax());
			Assert.assertEquals(true, bike.iSSelfStart());
			Assert.assertEquals(1500, bike.getHelmetPrice());
			vehicleAttributes = VehicleDetailPrinter
					.printVehicleSpecification(bike);
			System.out.println(vehicleAttributes);
			System.out.println();
		}
	}
}
