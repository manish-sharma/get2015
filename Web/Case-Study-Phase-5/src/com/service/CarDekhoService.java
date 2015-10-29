package com.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exception.CarDekhoCarAlreadyExistException;
import com.exception.CarDekhoSystemException;
import com.facade.CarDekhoFacade;
import com.helper.ConnectionFactory;
import com.model.Car;
import com.model.Vehicle;

public class CarDekhoService {

	public Vehicle createVehicle(Vehicle vehicle,Car car) throws CarDekhoSystemException{
		Vehicle returnVehicle = null;
		Connection connection = ConnectionFactory.getConnection();
		CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
		try{
		returnVehicle = carDekhoFacade.CreateVehicle(connection ,vehicle,car);
		try{
		connection.commit();
		}catch(SQLException e){
			System.out.println(e.getMessage());
			
		}
		}catch(CarDekhoSystemException e){
		
			try{
				connection.rollback();
			}catch(SQLException e1){
				System.out.println("Could not Rollback");
			}
			throw e;
		}finally{
			ConnectionFactory.closeConnection(connection);
		}
		return returnVehicle;
	}
	 public Vehicle getVehicle(Vehicle vehicle,Car car,int id)throws CarDekhoSystemException{
		 Vehicle returnVehicle = null;
		 Connection connection = ConnectionFactory.getConnection();
		 CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
		 try{
			 returnVehicle = carDekhoFacade.getVehicle(connection ,vehicle , car ,id);
			 try{
					connection.commit();
					}catch(SQLException e){
						System.out.println(e.getMessage());
						
					}
		 }catch(CarDekhoSystemException e){
			 try{
				 connection.rollback();
			 }catch(SQLException e1){
					System.out.println("Could not Rollback");

			 }
			 throw e;
		 }finally{
			 ConnectionFactory.closeConnection(connection);
		 }
		 return returnVehicle;
	 }
	 
	 public Car searchById(int id)throws CarDekhoSystemException{
		 Car returnVehicle = null;
		 Connection connection = ConnectionFactory.getConnection();
		 CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
		 try{
			 returnVehicle = carDekhoFacade.searchById(connection,id);
			 try{
					connection.commit();
					}catch(SQLException e){
						System.out.println(e.getMessage());
						
					}
		 }catch(CarDekhoSystemException e){
			 try{
				 connection.rollback();
			 }catch(SQLException e1){
					System.out.println("Could not Rollback");

			 }
			 throw e;
		 }finally{
			 ConnectionFactory.closeConnection(connection);
		 }
		 return returnVehicle;
	 }
	public int updateByModel(Vehicle vehicle, Car car, int id) throws CarDekhoSystemException {
		int returnVehicle = 0;
		 Connection connection = ConnectionFactory.getConnection();
		 CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
		 try{
			 returnVehicle = carDekhoFacade.updateByModel(connection,vehicle, car,id);
			 try{
					connection.commit();
					}catch(SQLException e){
						System.out.println(e.getMessage());
						
					}
		 }catch(CarDekhoSystemException e){
			 try{
				 connection.rollback();
			 }catch(SQLException e1){
					System.out.println("Could not Rollback");

			 }
			 throw e;
		 }finally{
			 ConnectionFactory.closeConnection(connection);
		 }
		 return returnVehicle;
	}
	public List<Vehicle> searchByMakeAndModel(String make, String model) throws CarDekhoSystemException {
		List<Vehicle> list = new ArrayList<Vehicle>();
		 Connection connection = ConnectionFactory.getConnection();
		 CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
		 try{
			list = carDekhoFacade.searchByMakeAndModel(connection,make,model);
			 try{
					connection.commit();
					}catch(SQLException e){
						System.out.println(e.getMessage());
						
					}
		 }catch(CarDekhoSystemException e){
			 try{
				 connection.rollback();
			 }catch(SQLException e1){
					System.out.println("Could not Rollback");

			 }
			 throw e;
		 }finally{
			 ConnectionFactory.closeConnection(connection);
		 }
		 return list;
	}
	 
}
