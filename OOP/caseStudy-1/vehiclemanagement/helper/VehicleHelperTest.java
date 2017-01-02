package com.metacampus.vehiclemanagement.helper;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.metacampus.vehiclemanagement.Vehicle;
import com.metacampus.vehiclemanagement.VehicleDetailPrinter;

public class VehicleHelperTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVehicleObject() {
		Vehicle vehicle=VehicleHelper.createVehicle("Car", "X101","Swift" );
		assertNotNull(vehicle);
		assertEquals("Swift", vehicle.getMake());
	}

	@Test
	public void testCalculateOnRoadPrice() {
		Vehicle vehicle=VehicleHelper.createVehicle("Car", "X101","Swift" );
		assertNotNull(vehicle);
		double price=vehicle.calculateOnRoadPrice(110, 10);
		Assert.assertEquals(120, price, 0);
	}
	
	@Test
	public void testprintVehicleSpecification() {
		Vehicle vehicle=VehicleHelper.createVehicle("Car", "X101","Swift" );
		String details=VehicleDetailPrinter.printVehicleSpecification(vehicle);
		assertEquals("SwiftX101",details);
	}

}
