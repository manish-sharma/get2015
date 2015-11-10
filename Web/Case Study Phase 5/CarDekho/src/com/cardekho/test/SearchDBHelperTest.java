package com.cardekho.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.helper.SearchDBHelper;
import com.cardekho.model.Vehicle;

public class SearchDBHelperTest {

	@Test
	public void testPopulatedList() {
		List<String> carList = new ArrayList<String>();
		SearchDBHelper searchDBHelper = new SearchDBHelper();
		try {
			carList = searchDBHelper.populateList();
		} catch (CarDekhoSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String firstCar = carList.get(0);
		boolean flag = false;
		if(firstCar.equalsIgnoreCase("maruti-dzire"))
		{
			flag = true;
		}
		
		assertTrue(flag);
	}
	
	@Test
	public void testPopulatedListSize() {
		List<String> carList = new ArrayList<String>();
		SearchDBHelper searchDBHelper = new SearchDBHelper();
		try {
			carList = searchDBHelper.populateList();
		} catch (CarDekhoSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int numberOfCars = carList.size();
		assertEquals(8,numberOfCars);
	}
	
	@Test
	public void testSearchCar() {
		List<Vehicle> carList = new ArrayList<Vehicle>();
		SearchDBHelper searchDBHelper = new SearchDBHelper();
		try {
			carList = searchDBHelper.searchCar("Maruti","dzire");
		} catch (CarDekhoSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Vehicle vehicle = carList.get(0);
		String make = "Maruti";
		boolean flag = false;
		if(make.equalsIgnoreCase(vehicle.getMake()))
		{
			flag = true;
		}
		
		assertTrue(flag);
	}
	
	
}
