/**
 * Class to implement functionality of vehicle helper class
 * @author Sanjay
 */

package com.metacampus.vehiclemanagement;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.metacampus.vehiclemanagement.helper.VehicleHelper;
import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;

public class VehicleHelperTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testCreateCar() {
		Car carObj = VehicleHelper.create("Hyundai", "Amit", new java.sql.Date(new java.util.Date().getTime()), "Verna", "1200 CC", "60 Liters", "21 km/pl", 900000, 78000, "YES", "YES", "YES");
		assertEquals("Hyundai", carObj.getMake());
	}

	@Test 
	public void testCreateCarNullTest() {
		Car carObj = VehicleHelper.create("Hyundai", "Amit", new java.sql.Date(new java.util.Date().getTime()), "Verna", "1200 CC", "60 Liters", "21 km/pl", 900000, 78000, "YES", "YES", "YES");
		assertNotNull(carObj);
	}
	
	@Test
	public void testCreateBike() {
		Bike bikeObj = VehicleHelper.create("TVS", "Amit", new java.sql.Date(new java.util.Date().getTime()), "Apache", "180 CC", "14 Liters", "40 km/pl", 80000, 7800, "YES", 1000);
		assertEquals("180 CC",  bikeObj.getEngineCC());
	}
	
	@Test
	public void testCreateBikeNullTest() {
		Bike bikeObj = VehicleHelper.create("TVS", "Amit", new java.sql.Date(new java.util.Date().getTime()), "Apache", "180 CC", "14 Liters", "40 km/pl", 80000, 7800, "YES", 1000);
		assertNotNull(bikeObj);
	}

}
