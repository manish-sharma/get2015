package com.vehicaldekho.vehical.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class VehicleHelperTest {

	@Test
	public void testBikeInstance() {
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.BIKE, "RacerBike", "2008");
		assertEquals(true, vehicle instanceof Bike);
	}
	
	@Test
	public void testCarInstance() {
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.CAR, "Suv", "2011");
		assertEquals(true, vehicle instanceof Car);
	}
	
	@Test
	public void testCarDetailPrinter() {
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.CAR, "Suv","2011");
		String expectedString = VehicleHelper.displayVehicleSpecification(vehicle);
		String actualString = "Vehicle [makeYear=2011, model=Suv, engineInCC=1500, fuelCapacity=500, milage=21.5, price=800000.0, roadTax=5400.0]Car [hasAC=YES, haspowerSteering=YES, hasaccessoryKit=YES]";
		assertEquals(actualString, expectedString);
	}
	
	@Test
	public void testBikeDetailPrinter() {
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.BIKE, "RacerBike","2008");
		String expectedString = VehicleHelper.displayVehicleSpecification(vehicle);
		String actualString = "Vehicle [makeYear=2008, model=RacerBike, engineInCC=150, fuelCapacity=40, milage=35.0, price=90000.0, roadTax=2400.0]Bike [isSelfStart=YES, helmetPrice=1101]";
		assertEquals(actualString, expectedString);
	}

}
