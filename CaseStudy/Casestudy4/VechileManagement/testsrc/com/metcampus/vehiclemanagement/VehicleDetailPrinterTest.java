package com.metcampus.vehiclemanagement;

import static org.junit.Assert.*;

import org.junit.Test;

import com.metacampus.vehiclemanagement.VehicleDetailPrinter;
import com.metacampus.vehiclemanagement.VehicleHelper;
import com.metacampus.vehiclemanagement.VehicleType;
import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.model.Vehicle;

public class VehicleDetailPrinterTest {
	
	@Test
	public void VehicleHelperTestForCarInstanceForStub() {
		Vehicle car=new Car();
		car.setVehicleId(1);
		car.setMake("ford");
		car.setModel("figo");
		car.setEngineInCC(2000);
		car.setMileage(20);
		car.setFuelCapacity(35);
		car.setPrice(850000.0f);
		car.setRoadTax(40000.0f);
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.CAR,1, "ford", "figo",2000,20,35,850000.0f,40000.0f);
		assertEquals(true, car.equals(vehicle));
	}

	@Test
	public void VehicleHelperTestForBikeInstance() {
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.BIKE,1,"CafeRacer", "Bullet 300",
				350, 15, 30, 120000.14f, 15001.45f);
		assertEquals(true, vehicle instanceof Bike);
	}

	@Test
	public void testPrintVehicleSpecification() {
		
		Vehicle vehicle =  VehicleHelper.createVehicle (VehicleType.BIKE,2,"Royal Enfield", "Bullet 300",
				350, 15, 30, 120000.14f, 15001.45f);
		
		Bike bike = VehicleHelper.createBike(vehicle, true, 1500);
		assertNotNull(bike);
		assertEquals(" Company name : Royal Enfield Model : Bullet 300 EngineInCC : 350 Mileage : 30 "
				+ "FuelCapacity : 15 Price : 120000.14 RoadTax : 15001.45 SelfStart : true"
				+ " HelmetPrice : 1500", VehicleDetailPrinter.printVehicleSpecification(bike));
	}

}
