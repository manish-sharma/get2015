package com.metacampus.vehicleDekhoTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.metacampus.vehicledekho.*;
import com.metacampus.vehicledekho.model.*;

public class VehicleDekhoHelperTest {

	@Test
	public void testCreateCar() {
		Vehicle vehicle = VehicleHelper.createCar("Hundai", "i20", "1300cc", 30, "21.17", 821405, 21, true, true, true);
		assertNotNull(vehicle);
		assertEquals("1300cc",vehicle.getEngineiInCC());
	}
	
	@Test
	public void testCreateBike() {
		Vehicle vehicle = VehicleHelper.createBike("Honda", "Activa", "124cc", 8, "60.04", 56000, 11, true, 1199);
		assertNotNull(vehicle);
		assertEquals("124cc",vehicle.getEngineiInCC());
	}
	
	@Test
	public void testToString() {
		Car car = VehicleHelper.createCar("Hundai", "i20", "1300cc", 30, "21.17", 821405, 21, true, true, true);
		assertNotNull(car);
		assertEquals("Make:Hundai, Model:i20 ,engineInCC:1300cc, fuelCapacity:30, milage:21.17, Price:821405.0,"
				+ " roadTax:21.0, AC:true, powerSteering:true, accessoryKit:true",VehicleDetailPrinter.printVehicleSpecification(car));
	}
	
	@Test
	public void testToStringBike() {
		Vehicle bike = VehicleHelper.createBike("Honda", "Activa", "124cc", 8, "60.04", 56000, 11, true, 1199);
		assertNotNull(bike);
		assertEquals("Make:Honda, Model:Activa ,engineInCC:124cc, fuelCapacity:8, milage:60.04, Price:56000.0,"
				+ " roadTax:11.0, selfStart:true, helmetPrice:1199.0",VehicleDetailPrinter.printVehicleSpecification(bike));
		
	}

}
