/**
 * @author Pooja Khandelwal
 * @createdDate 20/09/2015
 * @name VehicleHelperTest
 * @description this class will call the methods createVehicle(),createCar(),createBike() of VehicleHelper class and set the attributes of car or bike based on vehicle type and then call the method printVehicleSpecification() of VehicleDetailPrinter Class and print the vehicle attributes in string format
 */
package com.test.vehicle;

import org.junit.Before;
import org.junit.Test;
import com.databsehelperclass.DatabaseHelper;
import com.vehicle.Bike;
import com.vehicle.Car;
import com.vehicle.Vehicle;
import com.xml.ReadVehicleXml;
import java.util.*;

public class VehicleHelperTest {
	private static Vehicle vehicle;
	private static Car car;
	private static Bike bike;

	/**
	 * @name setUp()
	 * @description this is an override method of JUnit test class and it create
	 *              the instance of Car & Bike class
	 * @param
	 * @return
	 */
	@Before
	public void setUp() throws Exception {
		car = new Car();
		bike = new Bike();
	}

	/**
	 * @name testCreateVehicle1()
	 * @description this is a override test method .this method will read the
	 *              data from vehicle.xml file and get the list of vehicle
	 *              objects which may contain either car object or bike object
	 *              or both.then this method will call insert methods of
	 *              DatabaseHelper class to insert the readed data into vehicle
	 *              ,car & bike tables.
	 * @param
	 * @return
	 */
	@Test
	public void testCreateVehicle1() {
		ReadVehicleXml read = new ReadVehicleXml();

		List<Vehicle> vehiclesList = new ArrayList<Vehicle>();
		/*
		 * reading data from vehicle.xml by calling the readConfig() method from
		 * ReadVehicleXml class
		 */
		vehiclesList = read.readConfig("vehicle.xml");

		for (int i = 0; i < vehiclesList.size(); i++) {
			vehicle = vehiclesList.get(i);
			if (vehicle instanceof Car) {
				car = (Car) vehicle;
				DatabaseHelper.queryToInsertDataIntoVehicleTable(car);
				DatabaseHelper.queryToInsertDataIntoCarTable(car);
			} else if (vehicle instanceof Bike) {
				bike = (Bike) vehicle;
				DatabaseHelper.queryToInsertDataIntoVehicleTable(bike);
				DatabaseHelper.queryToInsertDataIntoBikeTable(bike);
			}
		}
	}
}
