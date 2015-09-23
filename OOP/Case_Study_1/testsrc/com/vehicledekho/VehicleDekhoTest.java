package com.vehicledekho;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.vehicle.core.Bike;
import com.vehicle.core.Car;
import com.vehicle.core.Vehicle;
import com.vehicle.core.helper.VehicleHelper;


public class VehicleDekhoTest {

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
	public void VehicleHelperTestForCarInstance() {
		Vehicle vehicle = VehicleHelper.createVehicle("car", "Sedan", "2008");
		assertEquals(true, vehicle instanceof Car);
	}

	@Test
	public void VehicleHelperTestForBikeInstance() {
		Vehicle vehicle = VehicleHelper.createVehicle("bike", "CafeRacer", "2008");
		assertEquals(true, vehicle instanceof Bike);
	}

	@Test
	public void VehicleDetailPrinterTestForCar() {
		Vehicle vehicle=VehicleHelper.createVehicle("car", "Sedan", "2008");
		String expString="Vehicle [make=2008, model=Sedan, engineInCC=1225, fuelCapacity=400, mileage=17.25, price=650000.0, roadTax=5400.0]Car [isAcAvailable=true, powerSteering=true, accessoryKit=true]";
		assertEquals(expString,vehicle.toString());
	}
	
	@Test
	public void VehicleDetailPrinterTestForBike() {
		Vehicle vehicle=VehicleHelper.createVehicle("bike", "CafeRacer", "2008");
		String expString="Vehicle [make=2008, model=CafeRacer, engineInCC=125, fuelCapacity=40, mileage=60.0, price=80000.0, roadTax=2400.0]Bike [selfStart=true, helmetPrice=500.8]";
		assertEquals(expString,vehicle.toString());
	}

}
