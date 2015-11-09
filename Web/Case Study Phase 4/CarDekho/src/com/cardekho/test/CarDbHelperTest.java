package com.cardekho.test;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.helper.CarDBHelper;
import com.cardekho.model.Car;

public class CarDbHelperTest {

	@Test
	public void PositiveTestToUpdateCar() {
		CarDBHelper carDBHelper = new CarDBHelper();
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
			flag = carDBHelper.updateByModel(car, 2);
		} 
		catch (CarDekhoSystemException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertFalse(flag);
	}
	
}
