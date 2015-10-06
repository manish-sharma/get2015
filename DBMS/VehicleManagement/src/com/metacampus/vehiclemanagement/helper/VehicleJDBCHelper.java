package com.metacampus.vehiclemanagement.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.model.Vehicle;
import com.metacampus.vehiclemanagement.util.ConnectionUtil;

public class VehicleJDBCHelper {

	public static void create(Vehicle vehicle) {

		Connection con = ConnectionUtil.getConnection();
		PreparedStatement preparedStmt = null;

		try {
			String make = vehicle.getMake();
			String model = vehicle.getModel();
			String engineCC = vehicle.getEngineCC();
			String fuelCapacity = vehicle.getFuelCapacity();
			String mileage = vehicle.getMileage();
			int price = vehicle.getPrice();
			int roadTax = vehicle.getRoadTax();
			String ac, powerSteering, accessoryKit, selfStart;
			int helmetPrice; 

			String query = "INSERT INTO vehicle (make, model, engine_cc, fuel_capacity,"
					+ "mileage, price, road_tax) VALUES(?, ?, ?, ?, ?, ?, ?)";
			preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1, make);
			preparedStmt.setString(2, model);
			preparedStmt.setString(3, engineCC);
			preparedStmt.setString(4, fuelCapacity);
			preparedStmt.setString(5, mileage);
			preparedStmt.setInt(6, price);
			preparedStmt.setInt(7, roadTax);
			preparedStmt.execute();

			query = "SELECT vehicle_id FROM vehicle ORDER BY vehicle_id DESC";

			ResultSet rs = preparedStmt.executeQuery(query);

			int vehicleId = 0;
			if(rs.next()) {
				vehicleId = rs.getInt(1);
			}

			if(vehicle instanceof Car) {
				ac = ((Car)vehicle).getAC();
				powerSteering = ((Car)vehicle).getPowerSteering();
				accessoryKit = ((Car)vehicle).getAccessoryKit();
				
				query = "INSERT INTO car(ac, power_steering, accessory_kit,"
						+ "vehicle_id) VALUES(?, ?, ?, ?)";
				
				preparedStmt = con.prepareStatement(query);
				preparedStmt.setString(1, ac);
				preparedStmt.setString(2, powerSteering);
				preparedStmt.setString(3, accessoryKit);
				preparedStmt.setInt(4, vehicleId);
				preparedStmt.execute();
			}
			else if(vehicle instanceof Bike) {
				selfStart = ((Bike) vehicle).getSelfStart();
				helmetPrice = ((Bike) vehicle).getHelmetPrice();
				
				query = "INSERT INTO bike(self_start, helmet_price, vehicle_id)"
						+ "VALUES (?, ?, ?)";
				
				preparedStmt = con.prepareStatement(query);
				preparedStmt.setString(1, selfStart);
				preparedStmt.setInt(2, helmetPrice);
				preparedStmt.setInt(3, vehicleId);
				preparedStmt.execute();
			}
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

	public static int deleteByMake(String make) {
		String query = "DELETE FROM vehicle WHERE make = '" + make + "'";
		Connection con = ConnectionUtil.getConnection();
		try {
			Statement stmt = con.createStatement();
			int numberOfRecordsDeleted;
			numberOfRecordsDeleted = stmt.executeUpdate(query);
			return numberOfRecordsDeleted;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}

	public static int deleteByModel(String model) {
		String query = "DELETE FROM vehicle WHERE model = '" + model + "'";
		Connection con = ConnectionUtil.getConnection();
		try {
			Statement stmt = con.createStatement();
			int numberOfrecordsDeleted;
			numberOfrecordsDeleted = stmt.executeUpdate(query);
			return numberOfrecordsDeleted;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}

	public static int deleteByMakeModel(String make, String model) {
		Connection con = ConnectionUtil.getConnection();
		
		String query = "DELETE FROM vehicle WHERE make = '" + make + "' AND "
				+ "model = '" + model + "'";
		
		try {
			Statement stmt = con.createStatement();
			int numberOfRecordsDeleted;
			numberOfRecordsDeleted = stmt.executeUpdate(query);
			return numberOfRecordsDeleted;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}

	public static List<Vehicle> searchByMakeAndModel(String make, String model) {
		String query = "SELECT * FROM vehicle WHERE make = '" + make + "' AND "
				+ "model = '" + model + "'";
		
		Statement stmt = null, stmt2 = null;
		ResultSet rsVehicle = null;
		ResultSet rsSpecific = null;
		String engineCC, fuelCapacity, mileage, selfStart = "", ac, powerSteering, accessoryKit;
		int price, roadTax, helmetPrice = 0;
		Connection con = ConnectionUtil.getConnection();
		List<Vehicle> vehiclesList = null;
		try {
			stmt = con.createStatement();
			stmt2 = con.createStatement();
			
			rsVehicle = stmt.executeQuery(query);
			
			vehiclesList = new ArrayList<Vehicle>();
			
			while(rsVehicle.next()) {
				model = rsVehicle.getString("model");
				engineCC = rsVehicle.getString("engine_cc");
				fuelCapacity = rsVehicle.getString("fuel_capacity");
				mileage = rsVehicle.getString("mileage");
				price = rsVehicle.getInt("price");
				roadTax = rsVehicle.getInt("road_tax");

				int vehicle_id = rsVehicle.getInt("vehicle_id");

				query = "SELECT * FROM car WHERE vehicle_id = " + vehicle_id;

				rsSpecific = stmt2.executeQuery(query);

				if(rsSpecific.next() == false) {
					query = "SELECT * FROM bike WHERE vehicle_id = " + vehicle_id;
					rsSpecific = stmt2.executeQuery(query);
					
					if(rsSpecific.next()) {
						selfStart = rsSpecific.getString("self_start");
						helmetPrice = rsSpecific.getInt("helmet_price");
					}
					vehiclesList.add(VehicleHelper.create(make, model, engineCC,
							fuelCapacity, mileage, price, roadTax,
							selfStart, helmetPrice));
				}
				else {
					ac = rsSpecific.getString("ac");
					powerSteering = rsSpecific.getString("power_steering");
					accessoryKit = rsSpecific.getString("accessory_kit");
					vehiclesList.add(VehicleHelper.create(make, model, engineCC,
							fuelCapacity, mileage, price, roadTax, ac,
							powerSteering, accessoryKit));
				}
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null)
					stmt.close();
				if(stmt2 != null)
					stmt2.close();
				if(rsSpecific != null)
					rsSpecific.close();
				if(rsVehicle != null)
					rsVehicle.close();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return vehiclesList;
	}

	public static int updateByMake(String make) {
		String query = "UPDATE vehicle SET price = price + 100000 WHERE "
				+ "make = '" + make + "'";
		
		Connection con = ConnectionUtil.getConnection();
		try {
			Statement stmt = con.createStatement();
			int numberOfrecordsUpdated;
			numberOfrecordsUpdated = stmt.executeUpdate(query);
			return numberOfrecordsUpdated;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}
}