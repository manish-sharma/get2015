package com.metacampus.vehiclemanagement;

import java.sql.SQLException;
import java.util.List;

import datamodeler.BikeDAO;
import datamodeler.CarDAO;
import datamodeler.VehicleDAO;

public class VehicleReadTest {
	public static void main(String args[]) throws SQLException {
		StaxParser objSaxParser = new StaxParser();

		String filePath = "C://Users/Riddhi/workspace/CaseStudy/src/Vehicle.xml";
		List<Vehicle> readVehicleFromConfig = objSaxParser.readConfig(filePath);

		VehicleDAO.createTable();
		CarDAO.createTable();
		BikeDAO.createTable();

		for (Vehicle objVehicle : readVehicleFromConfig) {
			System.out.println(objVehicle);

			if (objVehicle instanceof Car) {
				CarDAO.insertIntotable((Car) objVehicle);
			} else {
				BikeDAO.insertIntotable((Bike) objVehicle);
			}

		}
	}
}