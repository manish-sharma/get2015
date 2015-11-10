package com.cardekho.test;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.helper.CarDBHelper;
import com.cardekho.model.Car;
import com.cardekho.service.CarDekhoService;

public class CarDbHelperTest {

	@Test
	public void testCreateCar() {
		Car car = new Car();
		car.setMake("Hyundai");
		car.setModel("i20");
		car.setEngineCC("600");
		car.setFuelCapacity("35");
		car.setMileage("15");
		car.setPrice(500000);
		car.setRoadTax(8);
		car.setAC("YES");
		car.setPowerSteering("YES");
		car.setAccessoryKit("Yes");
		car.setCreatedBy("Parul Joshi");
		car.setCreatedTime(Calendar.getInstance().getTime());
		car.setLastModifiedTime(Calendar.getInstance().getTime());
		car.setImagePath("car6.jpg");
		CarDekhoService service = new CarDekhoService();
		boolean flag = true;
		try {
			flag = service.createCar(car);
		} catch (CarDekhoSystemException e) {
			e.printStackTrace();
		}
		System.out.println(flag);
		assertFalse(flag);
	}
	
	@Test
	public void testGetCarDetails() {
		CarDekhoService service = new CarDekhoService();
		Car car = null;
		
		try {
			car = service.getCarDetails(2);
		} catch (CarDekhoSystemException e) {
			e.printStackTrace();
		}
		
		boolean flag = false;
		if(car.getModel().equals("Verna"))
		{
			flag = true;
		}
		
		assertTrue(flag);
	}
	
	@Test
	public void NegativTestToGetVehicleByModel() {
		CarDBHelper carDBHelper = new CarDBHelper();
		boolean flag = false;
		try {
			flag = carDBHelper.getVehicleByModel("i10");
		} catch (CarDekhoSystemException e) {
			e.printStackTrace();
		}
	
		assertFalse(flag);
	}
	
	@Test
	public void PositiveTestToGetVehicleByModel() {
		CarDBHelper carDBHelper = new CarDBHelper();
		boolean flag = false;
		
		try {
			flag = carDBHelper.getVehicleByModel("Verna");
		} catch (CarDekhoSystemException e) {
			e.printStackTrace();
		}
	
		assertTrue(flag);
	}
	
	@Test
	public void PositiveTestToUpdateCar() {
		CarDekhoService service = new CarDekhoService();
		boolean flag = true;
		Car car = new Car();
		car.setMake("Hyundai");
		car.setModel("Verna");
		car.setEngineCC("600");
		car.setFuelCapacity("35");
		car.setMileage("13");
		car.setPrice(1000000);
		car.setRoadTax(8);
		car.setAC("YES");
		car.setPowerSteering("YES");
		car.setAccessoryKit("Yes");
		car.setLastModifiedTime(Calendar.getInstance().getTime());
		car.setImagePath("car6.jpg");
		try 
		{
			flag = service.updateByModel(car, 2);
		} 
		catch (CarDekhoSystemException e) 
		{
			e.printStackTrace();
		}
		
		assertFalse(flag);
	}
	
}
