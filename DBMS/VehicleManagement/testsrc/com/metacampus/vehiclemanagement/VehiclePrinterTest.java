package com.metacampus.vehiclemanagement;

import static org.junit.Assert.*;

import org.junit.Test;

import com.metacampus.vehiclemanagement.helper.VehicleHelper;
import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.printer.VehiclePrinter;

public class VehiclePrinterTest {

	@Test
	public void testToStringCar() {
		Car carObj = VehicleHelper.create("Hyundai", "Verna", "1200 CC",
				"60 Liters", "21 km/pl", 900000, 78000, "YES", "YES", "YES");
		
		String expected = "Make: Hyundai, Model: Verna, Engine CC: 1200 CC, "
				+ "Fuel Capacity: 60 Liters, Mileage: 21 km/pl, Price: 900000, "
				+ "Road Tax: 78000, AC: YES, Power Steering: YES, Accessory Kit: YES";
		
		assertEquals(expected, VehiclePrinter.printVehicleSpecification(carObj));
	}
	
	@Test
	public void testToStringCarNull() {
		Car carObj = VehicleHelper.create("Hyundai", "Verna", "1200 CC",
				"60 Liters", "21 km/pl", 900000, 78000, "YES", "YES", "YES");
		
		assertNotNull(carObj);
	}
	
	@Test
	public void testToStringBike() {
		Bike bikeObj = VehicleHelper.create("TVS", "Apache", "180 CC",
				"14 Liters", "40 km/pl", 80000, 7800, "YES", 1000);
		
		String expected = "Make: TVS, Model: Apache, Engine CC: 180 CC, "
				+ "Fuel Capacity: 14 Liters, Mileage: 40 km/pl, Price: 80000, "
				+ "Road Tax: 7800, Helmet Price: 1000, Self Start: YES";
		
		assertEquals(expected, VehiclePrinter.printVehicleSpecification(bikeObj));
	}
	
	@Test
	public void testToStringBikeNull() {
		Bike bikeObj = VehicleHelper.create("TVS", "Apache", "180 CC",
				"14 Liters", "40 km/pl", 80000, 7800, "YES", 1000);
		
		assertNotNull(bikeObj);
	}
	
	@Test
	public void testPrintOnRoadPriceCar() {
		Car carObj = VehicleHelper.create("Hyundai", "Verna", "1200 CC",
				"60 Liters", "21 km/pl", 900000, 78000, "YES", "YES", "YES");
		
		assertEquals(978000, VehiclePrinter.printOnRoadPrice(carObj));
	}
	
	@Test
	public void testPrintOnRoadCarNull() {
		Car carObj = VehicleHelper.create("Hyundai", "Verna", "1200 CC",
				"60 Liters", "21 km/pl", 900000, 78000, "YES", "YES", "YES");
		
		assertNotNull(carObj);
	}
	
	@Test
	public void testPrintOnRoadPriceBike() {
		Bike bikeObj = VehicleHelper.create("TVS", "Apache", "180 CC",
				"14 Liters", "40 km/pl", 80000, 7800, "YES", 1000);
		
		assertEquals(87800, VehiclePrinter.printOnRoadPrice(bikeObj));
	}
	
	@Test
	public void testPrintOnRoadBikeNull() {
		Bike bikeObj = VehicleHelper.create("TVS", "Apache", "180 CC",
				"14 Liters", "40 km/pl", 80000, 7800, "YES", 1000);
		
		assertNotNull(bikeObj);
	}
}
