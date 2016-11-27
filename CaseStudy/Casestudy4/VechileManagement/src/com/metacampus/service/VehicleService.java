package com.metacampus.service;

import java.sql.Connection;
import java.util.List;

import Exception.VehicleException;

import com.metacampus.db.ConnectionFactory;
import com.metacampus.facade.VehicleFacade;
import com.metacampus.model.Vehicle;

public class VehicleService {

	public List<Vehicle> SearchVehicle(String quary) throws VehicleException {
		List<Vehicle> returnValue = null;
		Connection connection = ConnectionFactory.getConnection();
		VehicleFacade facade = new VehicleFacade();
		try {
			returnValue = facade.SearchVehicle(connection, quary);
		} finally {
			ConnectionFactory.closeConnection(connection);
		}
		return returnValue;
	}

	public boolean createVehicle(Vehicle vehicle) throws VehicleException {
		boolean returnValue = false;
		Connection connection = ConnectionFactory.getConnection();
		VehicleFacade facade = new VehicleFacade();
		returnValue = facade.createVehicle(connection, vehicle);
		return returnValue;
	}

	public Vehicle getVehicleById(Vehicle vehicle) throws VehicleException {
    Vehicle returnValue=null;
    Connection connection = ConnectionFactory.getConnection();
	VehicleFacade facade = new VehicleFacade();
	  returnValue=facade.getVehicleById(connection, vehicle);
      return returnValue;
	}

	public boolean updatesVehicle(Vehicle vehicle) throws VehicleException {
		boolean returnValue = false;
		Connection connection = ConnectionFactory.getConnection();
		VehicleFacade facade = new VehicleFacade();
		returnValue = facade.updateVehicle(connection, vehicle);
		return returnValue;
	}


}




