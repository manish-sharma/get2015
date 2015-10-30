package com.facade;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.connections.ConnectionPool;
import com.database.DatabaseQueries;
import com.model.Admin;
import com.model.vehicle;

public class CarDekhoFacade {
	public static boolean matchAdmin(Connection connectionObject, Admin logUser) {
		boolean flag = false;
		try{
			DatabaseQueries databaseQueries = new DatabaseQueries();
			flag = databaseQueries.matchAdmin(connectionObject,logUser);
			connectionObject.commit();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		return flag;
	}

	public boolean insertUserIntoDatabase(Connection connectionObject,
			vehicle vehicle) {
		boolean flag = false;
		try{
			DatabaseQueries databaseQueries = new DatabaseQueries();
			flag = databaseQueries.insertUserIntoDatabase(connectionObject, vehicle);
			connectionObject.commit();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		return flag;
	}

	public List<String> searchMakes(Connection connectionObject) {
		List<String> makes = new ArrayList<String>();
		
		try{
			DatabaseQueries databaseQueries = new DatabaseQueries();
			 makes = databaseQueries.searchMakes(connectionObject);
			connectionObject.commit();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return makes;
	}
	
	public List<String> searchModel(Connection connectionObject) {
		List<String> models = new ArrayList<String>();
		
		try{
			DatabaseQueries databaseQueries = new DatabaseQueries();
			 models = databaseQueries.searchModels(connectionObject);
			connectionObject.commit();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return models;
	}

	public int findMinPrice(Connection connectionObject) {
		int minPrice =0;
		try{
			DatabaseQueries databaseQueries = new DatabaseQueries();
			 minPrice = databaseQueries.findMinPrice(connectionObject);
			connectionObject.commit();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return minPrice;
	}

	public int findMaxPrice(Connection connectionObject) {
		int maxPrice =0;
		try{
			DatabaseQueries databaseQueries = new DatabaseQueries();
			 maxPrice = databaseQueries.findMaxPrice(connectionObject);
			connectionObject.commit();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return maxPrice;
	}

	public List<vehicle> findCarsByBudget(Connection connectionObject,
			String start, String end) {
List<vehicle> carByBudget = new ArrayList<vehicle>();
		
		try{
			DatabaseQueries databaseQueries = new DatabaseQueries();
			 carByBudget = databaseQueries.findCarsByBudget(connectionObject,start,end);
			connectionObject.commit();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return carByBudget;
	}

	public boolean updateCar(vehicle newVehicle, String id,
			Connection connectionObject) {
		boolean flag = false;
		try{
			DatabaseQueries databaseQueries = new DatabaseQueries();
			flag = databaseQueries.updateCar(newVehicle, id,connectionObject);
			connectionObject.commit();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		return flag;
	}

	public vehicle searhCarById(String id, Connection connectionObject) {
		vehicle newVehicle = new vehicle();
		try{
			DatabaseQueries databaseQueries = new DatabaseQueries();
			newVehicle = databaseQueries.searchCarById(id,connectionObject);
			connectionObject.commit();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		return newVehicle;
	}

	public vehicle searchCarByMakeAndModel(String make, String model,
			Connection connectionObject) {
		vehicle newVehicle = new vehicle();
		try{
			DatabaseQueries databaseQueries = new DatabaseQueries();
			newVehicle = databaseQueries.searchCarByMakeAndModel(make,model,connectionObject);
			connectionObject.commit();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		return newVehicle;
	}
}
