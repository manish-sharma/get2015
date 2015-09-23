package com.vehicle.db;

/**This class forms the query to insert he data from the object into the respective database tables based on type 
 of instance of the object
 @author Shishir Pareek
 Date 22nd September 2015
 **/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vehicle.core.Bike;
import com.vehicle.core.Car;
import com.vehicle.core.Vehicle;

public class VehicleDbHelper {

	/**
	 * This function takes vehicle type object as argument and insert the data
	 * into the vehicle table field by extracting data from object and vehicle
	 * specific datab based on type of instance vehicle reference variable is
	 * holding
	 **/
	public static boolean insertIntoVehicle(Vehicle vehicle) {
		Connection con = null;
		PreparedStatement ps = null;
		int result;
		ConnectionUtil conUtil = new ConnectionUtil();// getting connection from
														// database
		con = conUtil.getConnection();
		String query = "INSERT INTO vehicle (vehicleId,make,model,enginecc,fuelCapacity,"
				+ "mileage,price,roadTax)" + "VALUES(?,?,?,?,?,?,?,?)";// preparing
																		// the
																		// query
																		// to
																		// insert
																		// data
																		// into
																		// table
		try {// try block starts
			ps = con.prepareStatement(query);// preparing query statement
			// setting the respective parameters in the query statement
			ps.setDouble(1, vehicle.getVehicleID());
			ps.setString(2, vehicle.getMake());
			ps.setString(3, vehicle.getModel());
			ps.setInt(4, vehicle.getEngineInCC());
			ps.setInt(5, vehicle.getFuelCapacity());
			ps.setDouble(6, vehicle.getMileage());
			ps.setDouble(7, vehicle.getPrice());
			ps.setDouble(8, vehicle.getRoadTax());
			result = ps.executeUpdate();// executing the query
			if (result != 0) {// if the result set is not empty
				if (vehicle instanceof Car) {// if vehicle holds instance of car
					insertIntoCar(vehicle);// call function to insert into the
											// car
					return true;
				} else {// otherwise it conatains instance of type bike
					insertIntoBike(vehicle);// call function to insert into bike
											// table
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* destroying all the objects and closing the connection */
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	/**
	 * This function insert the value into the car accepting the value from
	 * vehicle object
	 **/
	public static boolean insertIntoCar(Vehicle vehicle) {
		Connection con = null;
		PreparedStatement ps = null;
		boolean result;
		ConnectionUtil conUtil = new ConnectionUtil();// getting connection
		con = conUtil.getConnection();
		String query = "INSERT INTO Car (vehicleId, isACAvilabel, powersteering, accessorykit)"
				+ " VALUES (?, ?, ?, ?); ";

		try { // try block
			ps = con.prepareStatement(query);// preparing the query
			/* setting the respective values of the parameter in the query */
			ps.setDouble(1, vehicle.getVehicleID());
			ps.setBoolean(2, ((Car) vehicle).isAC());
			ps.setBoolean(3, ((Car) vehicle).isPowerSteering());
			ps.setString(4, ((Car) vehicle).getAccessoryKit());
			result = ps.execute();// executing the statement
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {// closing all the connection and destroying the objects
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	/**
	 * This function insert the value into the bike accepting the value from
	 * vehicle object
	 **/
	private static boolean insertIntoBike(Vehicle vehicle) {
		Connection con = null;
		PreparedStatement ps = null;
		boolean result;
		ConnectionUtil conUtil = new ConnectionUtil();// getting connection
		con = conUtil.getConnection();
		String query = "INSERT INTO Bike (`vehicleId`, `SelfStart`, `HelmetPrice`)"
				+ " VALUES (?, ?, ?);  ";
		try {// try block
			ps = con.prepareStatement(query);// preparing the query
			ps.setDouble(1, vehicle.getVehicleID());
			ps.setBoolean(2, ((Bike) vehicle).isSelfStart());
			ps.setDouble(3, ((Bike) vehicle).getHelmetPrice());
			result = ps.execute();// executing the statement
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {// closing all the connection and destroying the objects
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return false;
	}

}
