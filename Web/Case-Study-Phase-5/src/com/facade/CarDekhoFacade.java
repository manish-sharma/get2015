package com.facade;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.exception.CarDekhoCarAlreadyExistException;
import com.exception.CarDekhoSystemException;
import com.helper.DBHelper;
import com.model.Car;
import com.model.Vehicle;

public class CarDekhoFacade {

	public Vehicle CreateVehicle(Connection connection, Vehicle vehicle, Car car)throws CarDekhoSystemException {
         Vehicle returnVehicle = null;
         List<Vehicle> list = new ArrayList<Vehicle>();
		 
		 try{ 
			 list = DBHelper.searchByMakeAndModel(connection,vehicle, car);
           if(list.size() == 0){
        	
        	  int i = DBHelper.addInformation(connection, vehicle, car);
        	  if(i != 0){
        		  returnVehicle =vehicle;
        	  }
        	  }else{
        	   returnVehicle = list.get(0);
        	   throw new CarDekhoCarAlreadyExistException("Vehicle with make " + vehicle.getMake() + " and model "+vehicle.getModel()+"  already exists.");
        	  } 
		 }catch(CarDekhoSystemException e){
			 System.out.println("Exception while creating sales person " + e.getMessage());
				throw e;
			}
		
		return returnVehicle;
	}

	public Vehicle getVehicle(Connection connection, Vehicle vehicle, Car car,
			int id)throws CarDekhoSystemException {
		Vehicle vehicleFromDB = null;
		DBHelper dbHelper = new DBHelper();
		return null;
	}

	public Car searchById(Connection connection, int id)throws CarDekhoSystemException {
		Car returnVehicle = null;
        List<Car> list = new ArrayList<Car>();
		 
		 try{ 
			 list = DBHelper.searchById(connection, id);
			 returnVehicle = list.get(0);
         
		 }catch(CarDekhoSystemException e){
			 System.out.println("Exception while Searching Car " + e.getMessage());
				throw e;
			}
		
		return returnVehicle;
	}

	public int updateByModel(Connection connection, Vehicle vehicle, Car car,
			int id)throws CarDekhoSystemException {
		int returnVehicle = 0;
        
		 try{ 
			 returnVehicle = DBHelper.updateByModel(connection, vehicle, car, id);
			          
		 }catch(CarDekhoSystemException e){
			 System.out.println("Exception while Updating Car " + e.getMessage());
				throw e;
			}
		
		return returnVehicle;
		
	}

	public List<Vehicle> searchByMakeAndModel(Connection connection,
			String make, String model)throws CarDekhoSystemException {
        List<Vehicle> list = new ArrayList<Vehicle>();
		 
		 try{ 
			 list = DBHelper.searchByMakeAndModel1(connection, make, model);
		         
		 }catch(CarDekhoSystemException e){
			 System.out.println("Exception while Searching Car " + e.getMessage());
				throw e;
			}
		
		return list;
	}
	}


