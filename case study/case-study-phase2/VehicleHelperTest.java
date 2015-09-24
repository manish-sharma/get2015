package Com.Vehicle.Test;
/**
 * @author Ankur
 * @description this class CREAT VEHICLE  and display information of vehicles
 */

import org.junit.Before;
import org.junit.Test;

import Com.HelperClasses.*;
import Com.Vehicle.*;
import Com.Xml.*;

import java.util.*;

public class VehicleHelperTest {
	private static Vehicle vehicle;
	private static Car car;
	private static Bike bike;

	/**
	 * 
	 * @description this is an override method of JUnit test class and it create the Object of Car & Bike class
	 */
	@Before
	public void setUp() throws Exception {
		car = new Car();
		bike = new Bike();
	}

	/**

	 * @description this is a override test method .this method  read data from vehicle.xml file and get the list of vehicle objects which  contain 
	 * either car object or bike object or both.then this method  insert the data read from xml file into vehicle ,car & bike tables.
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
