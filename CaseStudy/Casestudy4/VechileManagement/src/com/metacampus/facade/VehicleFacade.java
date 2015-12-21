package com.metacampus.facade;

import java.sql.Connection;
import java.util.List;

import Exception.VehicleException;

import com.metacampus.db.helper.VechileDBHelper;
import com.metacampus.model.Vehicle;

public class VehicleFacade {

	public List<Vehicle> SearchVehicle(Connection connection, String query)
			throws VehicleException {
		List<Vehicle> response = null;
		VechileDBHelper vechileDBHelper = new VechileDBHelper();
		response = vechileDBHelper.searchVehicle(connection, query);
		return response;

	}

	public boolean createVehicle(Connection connection, Vehicle vehicle)
			throws VehicleException {
		boolean response = false;
		response = VechileDBHelper.insertIntoVehicle(connection, vehicle);
		return response;
	}

	public Vehicle getVehicleById(Connection connection, Vehicle vehicle) {
		Vehicle response = null;
		response = VechileDBHelper.getVehicleById(connection, vehicle);
		return response;

	}
	public boolean updateVehicle(Connection connection, Vehicle vehicle)
			throws VehicleException {
		boolean response = false;
		response = VechileDBHelper.updateVechile(connection, vehicle);
		return response;
	}
}
