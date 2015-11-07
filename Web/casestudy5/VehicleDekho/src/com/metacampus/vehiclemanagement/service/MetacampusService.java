package com.metacampus.vehiclemanagement.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.metacampus.vehiclemanagement.CarAlreadyExistsException;
import com.metacampus.vehiclemanagement.MetacampusException;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.model.Vehicle;
import com.metacampus.vehiclemanagement.db.ConnectionFactory;
import com.metacampus.vehiclemanagement.facade.MetacampusFacade;
public class MetacampusService {

	public List<Vehicle> createVehicle(Vehicle vehicle) 
			throws CarAlreadyExistsException, MetacampusException{
		Connection connection = ConnectionFactory.getConnection();
		MetacampusFacade facade = new MetacampusFacade();
		List<Vehicle> vehicleList = facade.createVehicle(connection, vehicle);
		return vehicleList;
	}
	
	public List<Vehicle> fetchBrandNameFromdb() throws MetacampusException, SQLException {
		Connection connection = ConnectionFactory.getConnection();
		MetacampusFacade facade = new MetacampusFacade();
		List<Vehicle> vehicleList = facade.fetchBrandNameFromdb(connection);
		return vehicleList;
	}

	public List<Vehicle> searchVehicle(Vehicle vehicle) throws MetacampusException, SQLException {
		System.out.println("inservice"+vehicle.getMake() + vehicle.getModel());
		Connection connection = ConnectionFactory.getConnection();
		MetacampusFacade facade = new MetacampusFacade();
		List<Vehicle> vehicleList = facade.searchVehicle(connection, vehicle);
		System.out.println(vehicleList);
		return vehicleList;
	}

	public List<Vehicle> updateVehicle(Vehicle vehicle) throws MetacampusException, CarAlreadyExistsException{
		Connection connection = ConnectionFactory.getConnection();
		MetacampusFacade facade = new MetacampusFacade();
		List<Vehicle> vehicleList = facade.updateVehicle(connection, vehicle);
		return vehicleList;
	}

	public List<Vehicle> searchVehicle(String budgetValue) throws MetacampusException, SQLException {
		Connection connection = ConnectionFactory.getConnection();
		MetacampusFacade facade = new MetacampusFacade();
		List<Vehicle> vehicleList = facade.searchVehicle(connection, budgetValue);
		System.out.println(vehicleList);
		return vehicleList;
	}
}
