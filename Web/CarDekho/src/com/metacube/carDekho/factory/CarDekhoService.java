package com.metacube.carDekho.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.metacube.carDekho.CarDekhoException;
import com.metacube.carDekho.CarIsNotExistException;
import com.metacube.carDekho.ModelAlreadyExists;
import com.metacube.carDekho.db.ConnectionUtil;
import com.metacube.carDekho.db.helper.CarJDBCHelper;
import com.metacube.carDekho.db.helper.VehicleJDBCHelper;
import com.metacube.carDekho.facade.CarDekhoFacade;
import com.metacube.carDekho.helper.VehicleHelper;
import com.metacube.carDekho.helper.VehicleType;
import com.metacube.carDekho.model.Car;
import com.metacube.carDekho.model.Vehicle;

public class CarDekhoService {
	public static Car createCar(Car car) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
		Car createdCar =null;
		try {
			createdCar = carDekhoFacade.create(connection, car);
			
		} catch(CarDekhoException | ModelAlreadyExists e){
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			throw e;
		} finally {
			ConnectionUtil.closeConnection(connection);
		}
		return createdCar;
	}
	
	public  Car update(Car car) throws CarIsNotExistException, ModelAlreadyExists {
		Connection connection = ConnectionUtil.getConnection();
		CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
		Car createdCar =null;
		try {
			createdCar = carDekhoFacade.update(connection, car);
			
		} catch(CarDekhoException e){
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not rollback.");
			}
			try {
				throw e;
			} catch (CarDekhoException e1) {
				e1.printStackTrace();
			}
		} finally {
			ConnectionUtil.closeConnection(connection);
		}
		return createdCar;
	}
	
	public List<Vehicle> searchAllCar() {
		Connection connection = ConnectionUtil.getConnection();
		CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
		List<Vehicle> vehicles = null;
		
			vehicles = carDekhoFacade.searchAllCar(connection);			
		return vehicles;
	}
	public List<Vehicle> searchCarsByMake(String make) {
		Connection connection = ConnectionUtil.getConnection();
		CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
		List<Vehicle> vehicles = null;
		
			vehicles = carDekhoFacade.searchCarsByMake(connection,make);			
		return vehicles;
	}
	public Vehicle searchCarByModel(String model) {
		Connection connection = ConnectionUtil.getConnection();
		CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
		Vehicle vehicles = null;		
		vehicles = carDekhoFacade.searchCarByModel(connection,model);			
		return vehicles;
	}
	public List<String> searchMakes() {
		Connection connection = ConnectionUtil.getConnection();
		CarDekhoFacade carDekhoFacade = new CarDekhoFacade();
		List<String> makes = null;
		
			makes = carDekhoFacade.searchMakes(connection);			
		return makes;
	}
}
