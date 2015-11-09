package com.metacampus.vehiclemanagement;

import static org.junit.Assert.*;

import org.junit.Test;

import com.metacampus.vehiclemanagement.model.Vehicle;

public class VehicleHelperTest {
	@Test
	public void testCreateCar() {
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.Car,"City", "Honda");
		assertNotNull(vehicle);
		assertEquals("City", vehicle.getModel());
	}

	@Test
	public void testCreateBike() {
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.Bike,
				"Pulsar", "Tvs");
		assertEquals("Pulsar", vehicle.getModel());
	}

}