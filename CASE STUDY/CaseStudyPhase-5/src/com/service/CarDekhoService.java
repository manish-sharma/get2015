package com.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.connections.ConnectionPool;
import com.facade.CarDekhoFacade;
import com.model.Admin;
import com.model.vehicle;

public class CarDekhoService {

		public static boolean matchAdmin(Admin logUser){
			Connection connectionObject = null;
			ConnectionPool poolObject = new ConnectionPool();

			boolean flag =false ;
			try{
				
				connectionObject = (Connection) poolObject.getConnectionFromPool();
				connectionObject.setAutoCommit(false); 
				CarDekhoFacade facade = new CarDekhoFacade();
				flag = facade.matchAdmin(connectionObject,logUser);
			}
			catch (Exception e){
				e.printStackTrace();
			}
			finally{
				poolObject.returnConnectionToPool(connectionObject);
			}
			
			return flag;
		}
		
		public boolean insertUserIntoDatabase(vehicle vehicle) {
			Connection connectionObject = null;
			ConnectionPool poolObject = new ConnectionPool();

			boolean flag =false ;
			try{
				
				connectionObject = (Connection) poolObject.getConnectionFromPool();
				connectionObject.setAutoCommit(false); 
				CarDekhoFacade facade = new CarDekhoFacade();
				flag = facade.insertUserIntoDatabase(connectionObject ,vehicle);
			}
			catch (Exception e){
				e.printStackTrace();
			}
			finally{
				poolObject.returnConnectionToPool(connectionObject);
			}
			
			return flag;
		}
		
		public static List<String> searchMakes(){
			Connection connectionObject = null;
			ConnectionPool poolObject = new ConnectionPool();

			List<String> makes = new ArrayList<String>() ;
			try{
				
				connectionObject = (Connection) poolObject.getConnectionFromPool();
				connectionObject.setAutoCommit(false); 
				CarDekhoFacade facade = new CarDekhoFacade();
				makes = facade.searchMakes(connectionObject);
			}
			catch (Exception e){
				e.printStackTrace();
			}
			finally{
				poolObject.returnConnectionToPool(connectionObject);
			}
			
			return makes;
		}
		
		public static List<String> searchModels(){
			Connection connectionObject = null;
			ConnectionPool poolObject = new ConnectionPool();

			List<String> models = new ArrayList<String>() ;
			try{
				
				connectionObject = (Connection) poolObject.getConnectionFromPool();
				connectionObject.setAutoCommit(false); 
				CarDekhoFacade facade = new CarDekhoFacade();
				models = facade.searchModel(connectionObject);
			}
			catch (Exception e){
				e.printStackTrace();
			}
			finally{
				poolObject.returnConnectionToPool(connectionObject);
			}
			
			return models;
		}
		
		public static int findMinPrice(){
			Connection connectionObject = null;
			ConnectionPool poolObject = new ConnectionPool();

			int minPrice = 0;
			try{
				
				connectionObject = (Connection) poolObject.getConnectionFromPool();
				connectionObject.setAutoCommit(false); 
				CarDekhoFacade facade = new CarDekhoFacade();
				minPrice = facade.findMinPrice(connectionObject);
			}
			catch (Exception e){
				e.printStackTrace();
			}
			finally{
				poolObject.returnConnectionToPool(connectionObject);
			}
			
			return minPrice;
		}
		
		public static int findMaxPrice(){
			Connection connectionObject = null;
			ConnectionPool poolObject = new ConnectionPool();

			int maxPrice = 0;
			try{
				
				connectionObject = (Connection) poolObject.getConnectionFromPool();
				connectionObject.setAutoCommit(false); 
				CarDekhoFacade facade = new CarDekhoFacade();
				maxPrice = facade.findMaxPrice(connectionObject);
			}
			catch (Exception e){
				e.printStackTrace();
			}
			finally{
				poolObject.returnConnectionToPool(connectionObject);
			}
			
			return maxPrice;
		}
		
		public static List<vehicle> findCarsByBudget(String start, String end){
			Connection connectionObject = null;
			ConnectionPool poolObject = new ConnectionPool();

			List<vehicle> carByBudget = new ArrayList<vehicle>() ;
			try{
				
				connectionObject = (Connection) poolObject.getConnectionFromPool();
				connectionObject.setAutoCommit(false); 
				CarDekhoFacade facade = new CarDekhoFacade();
				carByBudget = facade.findCarsByBudget(connectionObject,start,end);
			}
			catch (Exception e){
				e.printStackTrace();
			}
			finally{
				poolObject.returnConnectionToPool(connectionObject);
			}
			
			return carByBudget;
		}
		
		public static boolean updateCar(vehicle newVehicle, String id){
			Connection connectionObject = null;
			ConnectionPool poolObject = new ConnectionPool();

			boolean flag =false ;
			try{
				
				connectionObject = (Connection) poolObject.getConnectionFromPool();
				connectionObject.setAutoCommit(false); 
				CarDekhoFacade facade = new CarDekhoFacade();
				flag = facade.updateCar(newVehicle,id,connectionObject);
			}
			catch (Exception e){
				e.printStackTrace();
			}
			finally{
				poolObject.returnConnectionToPool(connectionObject);
			}
			
			return flag;
		}

		public static vehicle searchCarById(String id){
			Connection connectionObject = null;
			ConnectionPool poolObject = new ConnectionPool();

			vehicle newVehicle = new vehicle();
			try{
				
				connectionObject = (Connection) poolObject.getConnectionFromPool();
				connectionObject.setAutoCommit(false); 
				CarDekhoFacade facade = new CarDekhoFacade();
				newVehicle = facade.searhCarById(id,connectionObject);
			}
			catch (Exception e){
				e.printStackTrace();
			}
			finally{
				poolObject.returnConnectionToPool(connectionObject);
			}
			
			return newVehicle;
		}
		
		public static vehicle searchCarByMakeAndModel(String make, String model){
			Connection connectionObject = null;
			ConnectionPool poolObject = new ConnectionPool();

			vehicle newVehicle = new vehicle();
			try{
				
				connectionObject = (Connection) poolObject.getConnectionFromPool();
				connectionObject.setAutoCommit(false); 
				CarDekhoFacade facade = new CarDekhoFacade();
				newVehicle = facade.searchCarByMakeAndModel(make,model,connectionObject);
			}
			catch (Exception e){
				e.printStackTrace();
			}
			finally{
				poolObject.returnConnectionToPool(connectionObject);
			}
			
			return newVehicle;
		}
		
}
