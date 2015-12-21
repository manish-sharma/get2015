package com.metacampus.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Exception.VehicleException;

import com.metacampus.db.ConnectionFactory;
import com.metacampus.model.Bike;
import com.metacampus.model.Car;
import com.metacampus.model.Vehicle;


public class VechileDBHelper {
	public static boolean insertIntoVehicle(Connection connection, Vehicle vehicle)
			throws VehicleException {

		PreparedStatement ps = null;
		int result;
		System.out.println("vechile object in insert table is " + vehicle);

		String query = "INSERT INTO vehicle (`make`, `model`, `engineInCC`, `fuelCapacity`,"
				+ " `mileage`, `price`, `roadTax` ,`createdBY`)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?); ";

		try {
			ps = connection.prepareStatement(query);
			ps.setString(1, vehicle.getMake());
			ps.setString(2, vehicle.getModel());
			ps.setInt(3, vehicle.getEngineInCC());
			ps.setInt(4, vehicle.getFuelCapacity());
			ps.setInt(5, vehicle.getMileage());
			ps.setFloat(6, vehicle.getPrice());
			ps.setFloat(7, vehicle.getRoadTax());
			ps.setString(8, vehicle.getCreatedBy());
			System.out.println("connection object is==" + connection);
			result = ps.executeUpdate();
			System.out.println("result set after insert==" + result);
			vehicle = getLastRow(connection, vehicle);
			System.out.println("vechile id is:===" + vehicle.getVehicleId());
			if (result != 0) {

				if (vehicle instanceof Car) {
					insertIntoCar(vehicle, connection);
					return true;
				} else {
					insertIntoBike(vehicle,connection);
					return true;
				}

			}

		} catch (SQLException e) {
		} finally {

			try {
				if (ps != null) {
					ps.close();
				}
				} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return false;
	}

	private static boolean insertIntoCar(Vehicle vehicle, Connection connection)
			throws VehicleException {

		PreparedStatement ps = null;
		int result;
		String query = "INSERT INTO Car (`vehicleId`, `ac`, `powerSteering`, `accessoryKit`)"
				+ " VALUES (?, ?, ?, ?); ";

		try {
			ps = connection.prepareStatement(query);
			ps.setInt(1, vehicle.getVehicleId());
			ps.setBoolean(2, ((Car) vehicle).isAC());
			ps.setBoolean(3, ((Car) vehicle).isPowerSteering());
			ps.setString(4, ((Car) vehicle).getAccessoryKit());
			result = ps.executeUpdate();
			System.out.println("execute car insert:=" + result);

			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	private static boolean insertIntoBike(Vehicle vehicle,Connection connection)
			throws VehicleException {
		PreparedStatement ps = null;
		boolean result;

	
		String query = "INSERT INTO Bike (`vehicleId`, `SelfStart`, `HelmetPrice`)"
				+ " VALUES (?, ?, ?);  ";

		try {
			ps = connection.prepareStatement(query);
			ps.setDouble(1, vehicle.getVehicleId());
			ps.setBoolean(2, ((Bike) vehicle).isSelfStart());
			ps.setInt(3, ((Bike) vehicle).getHelmetPrice());
			result = ps.execute();

			return result;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {

				if (ps != null) {
					ps.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return false;

	}

	private static Vehicle getLastRow(Connection connection, Vehicle vehicle) {
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;

	
		try {
			preparedStatement = connection
					.prepareStatement("select vehicleId from VEHICLE order by vehicleId desc limit 1");
			rs = preparedStatement.executeQuery();
			while (rs.next()) {
				vehicle.setVehicleId(rs.getInt("vehicleId"));
				System.out.println("vechileId is =" + vehicle.getVehicleId());
			}

		} catch (SQLException e) {
			System.out.println("Could not close prepared statement, ["
					+ e.getMessage() + "]");
		}
		return vehicle;
	}

	public List<Vehicle> searchVehicle(Connection connection, String query)
			throws VehicleException {

		List<Vehicle> vehicleList = new ArrayList<Vehicle>();

		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			System.out.println("resultset is==="+resultSet);
			Vehicle vehicle = null;
			while (resultSet.next()) {
				vehicle = new Car();
				vehicle.setVehicleId(resultSet.getInt("vehicleId"));
				vehicle.setMake(resultSet.getString("make"));
				vehicle.setModel(resultSet.getString("model"));
				vehicle.setEngineInCC(resultSet.getInt("engineInCC"));
				vehicle.setFuelCapacity(resultSet.getInt("fuelCapacity"));
				vehicle.setMileage(resultSet.getInt("mileage"));
				vehicle.setRoadTax(resultSet.getInt("roadTax"));
				vehicle.setPrice(resultSet.getInt("price"));
				System.out.println("get vehicle is"+vehicle);
				vehicleList.add(vehicle);
			}
			System.out.println("jlkhdf:=="+vehicleList);
			return vehicleList;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return vehicleList;
	}

public static  Vehicle getVehicleById(Connection connection,Vehicle vehicle)  {

	ResultSet rs = null;
	Car car = new Car();
	String query = "select * from vehicle v inner join car c on v.vehicleId=c.vehicleId where v.vehicleId=?";
	PreparedStatement preparedStatement = null;
	try {
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1,vehicle.getVehicleId());
		rs = preparedStatement.executeQuery();
		
		while (rs.next()) {

			car.setVehicleId(rs.getInt("vehicleId"));
			car.setMake(rs.getString("make"));
			car.setModel(rs.getString("model"));
			car.setEngineInCC(rs.getInt("engineInCC"));
			car.setFuelCapacity(rs.getInt("fuelCapacity"));
			car.setMileage(rs.getInt("mileage"));
			car.setRoadTax(rs.getInt("roadTax"));
			car.setPrice(rs.getInt("price"));
		    car.setAC(rs.getBoolean("ac"));
		    car.setPowerSteering(rs.getBoolean("powerSteering"));
		    car.setAccessoryKit(rs.getString("accessoryKit"));
		    
		}
		return car;

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	return null;

}
public static boolean updateVechile(Connection connection,Vehicle vehicle) throws VehicleException
{
	String query = "UPDATE VEHICLE SET Make = ?, Model = ?, engineInCC = ?,fuelCapacity = ?,mileage = ?,price = ?,roadTax = ?,createdBY = ?"
            + " WHERE vehicleId = ?";
	PreparedStatement ps = null;
	int result;
	try {
		ps = connection.prepareStatement(query);
		ps.setString(1, vehicle.getMake());
		ps.setString(2, vehicle.getModel());
		ps.setInt(3, vehicle.getEngineInCC());
		ps.setInt(4, vehicle.getFuelCapacity());
		ps.setInt(5, vehicle.getMileage());
		ps.setFloat(6, vehicle.getPrice());
		ps.setFloat(7, vehicle.getRoadTax());
		ps.setString(8, vehicle.getCreatedBy());
		ps.setInt(9, vehicle.getVehicleId());
		result = ps.executeUpdate();
		if (vehicle instanceof Car) {
			updateIntoCar(vehicle, connection);
			return true;
		} 
	}
	catch (SQLException e) {
	} finally {

		try {
			if (ps != null) {
				ps.close();
			}
			} catch (SQLException e) {
			e.printStackTrace();
		}
       }
	return false;
	
}
private static boolean updateIntoCar(Vehicle vehicle, Connection connection)
		throws VehicleException {

	PreparedStatement ps = null;
	int result;
	String query = "UPDATE CAR SET  ac= ? ,powerSteering = ?,accessoryKit = ?"
            + " WHERE vehicleId = ?";

	try {
		ps = connection.prepareStatement(query);
		ps.setBoolean(1, ((Car) vehicle).isAC());
		ps.setBoolean(2, ((Car) vehicle).isPowerSteering());
		ps.setString(3, ((Car) vehicle).getAccessoryKit());
		ps.setInt(4, vehicle.getVehicleId());
		result = ps.executeUpdate();
		return true;

	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;

}


}