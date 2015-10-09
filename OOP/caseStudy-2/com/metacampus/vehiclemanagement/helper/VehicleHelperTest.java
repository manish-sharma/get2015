package com.metacampus.vehiclemanagement.helper;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.Assert;

import org.hamcrest.core.IsInstanceOf;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.metacampus.vehiclemanagement.Bike;
import com.metacampus.vehiclemanagement.Car;
import com.metacampus.vehiclemanagement.StaxParser;
import com.metacampus.vehiclemanagement.Vehicle;
import com.metacampus.vehiclemanagement.VehicleDetailPrinter;
import com.metacampus.vehiclemanagement.VehicleType;

import datamodeler.BikeDAO;
import datamodeler.CarDAO;

@SuppressWarnings("deprecation")
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
		Vehicle vehicle=VehicleHelper.createVehicle(VehicleType.Car, "X101","Swift" );
		assertTrue(vehicle instanceof Car);
		assertEquals("Swift", vehicle.getMake());
	}

	@Test
	public void testprintVehicleSpecification() {
		Vehicle vehicle=VehicleHelper.createVehicle(VehicleType.Car, "X101","Swift" );
		String details=VehicleDetailPrinter.printVehicleSpecification(vehicle);
		assertEquals("SwiftX101",details);
	}

	@Test
	public void checkEqualsAndHashCode(){
	Set<Vehicle> vehicle = new HashSet<Vehicle>();
	Vehicle vehicle1 = VehicleHelper.createVehicle(VehicleType.Bike, "Honda", "honda34");
	vehicle.add(vehicle1);
	Vehicle vehicle2 = VehicleHelper.createVehicle(VehicleType.Car, "Verna", "verna104");
	vehicle.add(vehicle2);
	Vehicle vehicle3 = VehicleHelper.createVehicle(VehicleType.Car, "Verna", "verna104");
	vehicle.add(vehicle3);
	assertEquals("correct",2,vehicle.size());
	}
	

	 @Test
	public void testCarCreatePositive() {
	   StaxParser objSaxParser = new StaxParser();
	   String filePath = "C://Users/Riddhi/workspace/CaseStudy/src/Vehicle.xml";
	   List<Vehicle> readVehicleFromConfig = objSaxParser.readConfig(filePath);
	   assertTrue("True", readVehicleFromConfig.get(0) instanceof Car);
	}
	
	 @Test
		public void testBikeCreatePositive() {
		   StaxParser objSaxParser = new StaxParser();
		   String filePath = "C://Users/Riddhi/workspace/CaseStudy/src/Vehicle.xml";
		   List<Vehicle> readVehicleFromConfig = objSaxParser.readConfig(filePath);
		   assertTrue("True", readVehicleFromConfig.get(3) instanceof Bike);
		}
	 
	 @Test
	 public void testInsertCar(){
		 Vehicle object=new Car();
		 object.setVehilceId(1);
		 object.setMake("Make1");
		 object.setModel("Model1");
		 object.setEngineInCC("engineInCC1");
		 object.setMilage(12);
		 object.setPrice(120);
		 object.setCreatedBy("Riddhi");
		 object.setFuelCapacity(5);
		 object.setCreatedTime(new Date());
		 int result=CarDAO.insertIntotable((Car)object);
		 assertEquals(1, result);
	 }
	 
	 
	 @Test
	 public void testCreateCar(){
		 String actual=CarDAO.createTable();
		 assertEquals("Car Table Created", actual);
	 }
	 
	 @Test
	 public void testInsertBike(){
		 Vehicle object=new Bike();
		 object.setVehilceId(1);
		 object.setMake("Make1");
		 object.setModel("Model1");
		 object.setEngineInCC("engineInCC1");
		 object.setMilage(12);
		 object.setPrice(120);
		 object.setCreatedBy("Riddhi");
		 object.setFuelCapacity(5);
		 object.setCreatedTime(new Date());
		 int result=BikeDAO.insertIntotable((Bike)object);
		 assertEquals(1, result);
	 }
	 
	 @Test
	 public void testCreateBike(){
		 String actual=BikeDAO.createTable();
		 assertEquals("Bike Table Created", actual);
	 }
}


