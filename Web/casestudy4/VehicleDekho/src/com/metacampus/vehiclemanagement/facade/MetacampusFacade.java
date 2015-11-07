package com.metacampus.vehiclemanagement.facade;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.metacampus.vehiclemanagement.helper.VehicleJDBCHelper;
import com.metacampus.vehiclemanagement.model.Vehicle;

public class MetacampusFacade {
	
	public List<Vehicle> createVehicle(Connection connection, Vehicle vehicle) {
		List<Vehicle> vehicleList = VehicleJDBCHelper.insert(connection, vehicle);
		return vehicleList;
	}
	
	public List<Vehicle> fetchBrandNameFromdb(Connection connection) throws SQLException {
		List<Vehicle> vehicleList = VehicleJDBCHelper.fetchBrandNameFromdb(connection);
		return vehicleList;
	}

	public List<Vehicle> searchVehicle(Connection connection, Vehicle vehicle) throws SQLException {
		System.out.println("infacade"+vehicle.getMake() + vehicle.getModel());
		List<Vehicle> vehicleList = VehicleJDBCHelper.searchCar(connection, vehicle);
		System.out.println(vehicleList);
		return vehicleList;
	}

	public List<Vehicle> updateVehicle(Connection connection, Vehicle vehicle) {
		List<Vehicle> vehicleList = VehicleJDBCHelper.updateVehicle(connection, vehicle);
		return vehicleList;
	}

	public List<Vehicle> searchVehicle(Connection connection, String budgetValue) throws SQLException {
		List<Vehicle> vehicleList = VehicleJDBCHelper.searchCar(connection, budgetValue);
		System.out.println(vehicleList);
		return vehicleList;
	}

}
